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


public class ModulacionAM implements TriggerListener {
    public static void main(String[] args) {
        try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException classNotFoundException) {}
    ModulacionAM app = new ModulacionAM();
    }
    AM modulator;
  
  SineWave sine;
  
  SawTooth sawtooth;
  
  PulseTrain pulses;
  
  Scope scope;
  
  FFTScope analizer;
  
  SLabsTimer timer;
  
  VentanaPrincipal controlPanel;
  
  public ModulacionAM() {
    this.modulator = new AM(1.0D, 10.0D, 0.0D, 0.8D);
    this.sine = new SineWave();
    this.sawtooth = new SawTooth();
    this.pulses = new PulseTrain();
    this.scope = new Scope();
    this.scope.setVoltsDivision(1.0D);
    this.scope.setTimeDivision(0.5D);
    this.scope.setCurveColor(0, Color.red);
    this.scope.setCurveOffset(0, 2.0D);
    this.scope.setCurveOffset(1, -2.0D);
    this.analizer = new FFTScope();
    this.analizer.setFs(100.0D);
    this.analizer.setFFTLength(512);
    this.analizer.setCurveColor(0, Color.BLUE);
    this.timer = new SLabsTimer(this, 10L);
    Controles toolBar = new Controles(this.timer);
    this.controlPanel = new VentanaPrincipal(this.modulator, this.sine, this.sawtooth, this.pulses);
    JTabbedPane tabbedPane = new JTabbedPane();
    JPanel panelScope = new JPanel();
    panelScope.setLayout(new FlowLayout());
    panelScope.add((Component)this.scope);
    tabbedPane.addTab("Modulacion AM", panelScope);
    JPanel panelFFT = new JPanel();
    panelFFT.setLayout(new FlowLayout());
    panelFFT.add((Component)this.analizer);
    JFrame view = new JFrame("AM");
    view.getContentPane().setLayout(new BorderLayout());
    view.getContentPane().add(toolBar, "North");
    view.getContentPane().add(this.controlPanel, "West");
    view.getContentPane().add(tabbedPane, "Center");
    view.pack();
    view.setDefaultCloseOperation(3);
    view.setVisible(true);
  }
  
    /**
     *
     * @param triggerID
     * @param values
     */
    @Override
    public void step(int triggerID, double... values) {
    double x;
    int signal = this.controlPanel.getSignal();
    double t = values[0];
    x = switch (signal) {
            case 0 -> this.sine.output(t);
            case 1 -> this.sawtooth.output(t);
            default -> this.pulses.output(t);
        };
    double xc = this.modulator.output(t, x);
    this.scope.add(0, t, x);
    this.scope.add(1, t, xc);
    this.analizer.add(0, x);
    this.analizer.add(1, xc);
  }
    
}
