/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulacionam;

import com.slabs.SLabsTimer;
import com.slabs.TriggerListener;
import com.slabs.modulation.analog.AM;
import com.slabs.sinks.FFTScope;
import com.slabs.sinks.Scope;
import com.slabs.sources.PulseTrain;
import com.slabs.sources.SawTooth;
import com.slabs.sources.SineWave;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

public class AModulation01 implements TriggerListener {
  AM modulator;
  
  SineWave sine;
  
  SawTooth sawtooth;
  
  PulseTrain pulses;
  
  Scope scope;
  
  FFTScope analizer;
  
  SLabsTimer timer;
  
  ControlPanel controlPanel;
  
  public AModulation01() {
    this.modulator = new AM(1.0D, 10.0D, 0.0D, 0.8D);
    this.sine = new SineWave();
    this.sawtooth = new SawTooth();
    this.pulses = new PulseTrain();
    this.scope = new Scope();
    this.scope.setVoltsDivision(1.0D);
    this.scope.setTimeDivision(0.5D);
    this.scope.setCurveColor(0, Color.BLUE);
    this.scope.setCurveOffset(0, 2.0D);
    this.scope.setCurveOffset(1, -2.0D);
    this.analizer = new FFTScope();
    this.analizer.setFs(100.0D);
    this.analizer.setFFTLength(512);
    this.analizer.setCurveColor(0, Color.BLUE);
    this.timer = new SLabsTimer(this, 10L);
    PlaybackBar toolBar = new PlaybackBar(this.timer);
    this.controlPanel = new ControlPanel(this.modulator, this.sine, this.sawtooth, this.pulses);
    JTabbedPane tabbedPane = new JTabbedPane();
    JPanel panelScope = new JPanel();
    panelScope.setLayout(new FlowLayout());
    panelScope.add((Component)this.scope);
    tabbedPane.addTab("Scope", panelScope);
    JPanel panelFFT = new JPanel();
    panelFFT.setLayout(new FlowLayout());
    panelFFT.add((Component)this.analizer);
    tabbedPane.addTab("FFT", panelFFT);
    JFrame view = new JFrame("AM");
    view.getContentPane().setLayout(new BorderLayout());
    view.getContentPane().add(toolBar, "North");
    view.getContentPane().add(this.controlPanel, "West");
    view.getContentPane().add(tabbedPane, "Center");
    view.pack();
    view.setDefaultCloseOperation(3);
    view.setVisible(true);
  }
  
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException classNotFoundException) {}
    AModulation01 app = new AModulation01();
  }
  
  public void step(int triggerID, double... values) {
    double x;
    int signal = this.controlPanel.getSignal();
    double t = values[0];
    if (signal == 0) {
      x = this.sine.output(t);
    } else if (signal == 1) {
      x = this.sawtooth.output(t);
    } else {
      x = this.pulses.output(t);
    } 
    double xc = this.modulator.output(t, x);
    this.scope.add(0, t, x);
    this.scope.add(1, t, xc);
    this.analizer.add(0, x);
    this.analizer.add(1, xc);
  }
}
