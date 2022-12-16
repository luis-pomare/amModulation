package modulacionam;

import com.slabs.modulation.analog.AM;
import com.slabs.sources.PulseTrain;
import com.slabs.sources.SawTooth;
import com.slabs.sources.SineWave;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class VentanaPrincipal extends JPanel {
  AM modulator;
  
  SineWave sine;
  
  SawTooth sawtooth;
  
  PulseTrain pulses;
  
  private JComboBox jComboSignal;
  
  private JLabel jLabel1;
  
  private JLabel jLabel10;
  
  private JLabel jLabel11;
  
  private JLabel jLabel12;
  
  private JLabel jLabel2;
  
  private JLabel jLabel3;
  
  private JLabel jLabel4;
  
  private JLabel jLabel5;
  
  private JLabel jLabel6;
  
  private JLabel jLabel7;
  
  private JLabel jLabel8;
  
  private JLabel jLabel9;
  
  private JPanel jPanel1;
  
  private JPanel jPanel2;
  
  private JPanel jPanel3;
  
  private JPanel jPanel4;
  
  private JTabbedPane jTabbedPane1;
  
  private JTextField jTextAc;
  
  private JTextField jTextFc;
  
  private JTextField jTextM;
  
  private JTextField jTextPulsesA;
  
  private JTextField jTextPulsesTau;
  
  private JTextField jTextPulsesTo;
  
  private JTextField jTextSawA;
  
  private JTextField jTextSawTo;
  
  private JTextField jTextSineA;
  
  private JTextField jTextSineFo;
  
  private JTextField jTextSinePhase;
  
  public VentanaPrincipal(AM modulator, SineWave sine, SawTooth sawtooth, PulseTrain pulses) {
    this.modulator = modulator;
    this.sine = sine;
    this.sawtooth = sawtooth;
    this.pulses = pulses;
    initComponents();
  }
  
  private void initComponents() {
    this.jTabbedPane1 = new JTabbedPane();
    this.jPanel1 = new JPanel();
    this.jTextM = new JTextField();
    this.jTextAc = new JTextField();
    this.jTextFc = new JTextField();
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.jComboSignal = new JComboBox();
    this.jLabel4 = new JLabel();
    this.jPanel2 = new JPanel();
    this.jTextSineA = new JTextField();
    this.jTextSineFo = new JTextField();
    this.jTextSinePhase = new JTextField();
    this.jLabel5 = new JLabel();
    this.jLabel6 = new JLabel();
    this.jLabel7 = new JLabel();
    this.jPanel3 = new JPanel();
    this.jTextSawA = new JTextField();
    this.jTextSawTo = new JTextField();
    this.jLabel8 = new JLabel();
    this.jLabel9 = new JLabel();
    this.jPanel4 = new JPanel();
    this.jTextPulsesA = new JTextField();
    this.jTextPulsesTo = new JTextField();
    this.jTextPulsesTau = new JTextField();
    this.jLabel10 = new JLabel();
    this.jLabel11 = new JLabel();
    this.jLabel12 = new JLabel();
    setLayout(new BorderLayout());
    this.jTabbedPane1.setBorder(BorderFactory.createTitledBorder("Configuracion"));
    this.jTextM.setHorizontalAlignment(11);
    this.jTextM.setText(Double.toString(this.modulator.getModulationIndex()));
    this.jTextM.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setM(evt);
          }
        });
    this.jTextAc.setHorizontalAlignment(11);
    this.jTextAc.setText(Double.toString(this.modulator.getAmplitud()));
    this.jTextAc.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setAc(evt);
          }
        });
    this.jTextFc.setHorizontalAlignment(11);
    this.jTextFc.setText(Double.toString(this.modulator.getFrequency()));
    this.jTextFc.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setFc(evt);
          }
        });
    this.jLabel1.setText("m:");
    this.jLabel2.setText("Ac:");
    this.jLabel3.setText("Fc:");
    this.jComboSignal.setModel(new DefaultComboBoxModel<>(new String[] { "Sine wave", "Sawtooth", "Pulse train" }));
    this.jLabel4.setText("x(t)=");
    GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
    this.jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(jPanel1Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
          .addContainerGap(21, 32767)
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel2, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel3, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel4, GroupLayout.Alignment.TRAILING))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(this.jComboSignal, 0, 110, 32767)
            .addComponent(this.jTextM, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jTextAc, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jTextFc, GroupLayout.Alignment.TRAILING))
          .addContainerGap()));
    jPanel1Layout.setVerticalGroup(jPanel1Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextM, -2, -1, -2)
            .addComponent(this.jLabel1))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextAc, -2, -1, -2)
            .addComponent(this.jLabel2))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextFc, -2, -1, -2)
            .addComponent(this.jLabel3))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jComboSignal, -2, -1, -2)
            .addComponent(this.jLabel4))
          .addContainerGap(60, 32767)));
    this.jTabbedPane1.addTab("", this.jPanel1);
    this.jTextSineA.setHorizontalAlignment(4);
    this.jTextSineA.setText(Double.toString(this.sine.getAmplitude()));
    this.jTextSineA.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setSineA(evt);
          }
        });
    this.jTextSineFo.setHorizontalAlignment(4);
    this.jTextSineFo.setText(Double.toString(this.sine.getFrequency()));
    this.jTextSineFo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setSineFo(evt);
          }
        });
    this.jTextSinePhase.setHorizontalAlignment(4);
    this.jTextSinePhase.setText(Double.toString(this.sine.getPhase()));
    this.jTextSinePhase.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setSinePhase(evt);
          }
        });
    this.jLabel5.setText("A:");
    this.jLabel6.setText("fo:");
    this.jLabel7.setText("phase:");
    GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
    this.jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(jPanel2Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap(9, 32767)
          .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.jLabel5, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel6, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel7, GroupLayout.Alignment.TRAILING))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(this.jTextSineA, -1, 110, 32767)
            .addComponent(this.jTextSineFo)
            .addComponent(this.jTextSinePhase))
          .addContainerGap()));
    jPanel2Layout.setVerticalGroup(jPanel2Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextSineA, -2, -1, -2)
            .addComponent(this.jLabel5))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextSineFo, -2, -1, -2)
            .addComponent(this.jLabel6))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextSinePhase, -2, -1, -2)
            .addComponent(this.jLabel7))
          .addContainerGap(91, 32767)));
    this.jTextSawA.setHorizontalAlignment(4);
    this.jTextSawA.setText(Double.toString(this.sawtooth.getAmplitude()));
    this.jTextSawA.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setSawA(evt);
          }
        });
    this.jTextSawTo.setHorizontalAlignment(4);
    this.jTextSawTo.setText(Double.toString(this.sawtooth.getPeriod()));
    this.jTextSawTo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setSawTo(evt);
          }
        });
    this.jLabel8.setText("A:");
    this.jLabel9.setText("To:");
    GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
    this.jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(jPanel3Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
          .addGap(0, 39, 32767)
          .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.jLabel8, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel9, GroupLayout.Alignment.TRAILING))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(this.jTextSawA, -1, 110, 32767)
            .addComponent(this.jTextSawTo))));
    jPanel3Layout.setVerticalGroup(jPanel3Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextSawA, -2, -1, -2)
            .addComponent(this.jLabel8))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextSawTo, -2, -1, -2)
            .addComponent(this.jLabel9))
          .addContainerGap(124, 32767)));
    this.jTextPulsesA.setHorizontalAlignment(4);
    this.jTextPulsesA.setText(Double.toString(this.pulses.getAmplitude()));
    this.jTextPulsesA.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setPulsesA(evt);
          }
        });
    this.jTextPulsesTo.setHorizontalAlignment(4);
    this.jTextPulsesTo.setText(Double.toString(this.pulses.getPeriod()));
    this.jTextPulsesTo.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setPulsesTo(evt);
          }
        });
    this.jTextPulsesTau.setHorizontalAlignment(4);
    this.jTextPulsesTau.setText(Double.toString(this.pulses.getTau()));
    this.jTextPulsesTau.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent evt) {
            VentanaPrincipal.this.setPulsesTau(evt);
          }
        });
    this.jLabel10.setText("A:");
    this.jLabel11.setText("To:");
    this.jLabel12.setText("tau:");
    GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
    this.jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(jPanel4Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
          .addContainerGap(33, 32767)
          .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(this.jLabel10, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel11, GroupLayout.Alignment.TRAILING)
            .addComponent(this.jLabel12, GroupLayout.Alignment.TRAILING))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
            .addComponent(this.jTextPulsesA, -1, 110, 32767)
            .addComponent(this.jTextPulsesTo)
            .addComponent(this.jTextPulsesTau))));
    jPanel4Layout.setVerticalGroup(jPanel4Layout
        .createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextPulsesA, -2, -1, -2)
            .addComponent(this.jLabel10))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextPulsesTo, -2, -1, -2)
            .addComponent(this.jLabel11))
          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(this.jTextPulsesTau, -2, -1, -2)
            .addComponent(this.jLabel12))
          .addContainerGap(91, 32767)));
    add(this.jTabbedPane1, "Center");
  }
  
  private void setM(ActionEvent evt) {
    this.modulator.setModulationIndex(Double.parseDouble(this.jTextM.getText()));
  }
  
  private void setAc(ActionEvent evt) {
    this.modulator.setAmplitud(Double.parseDouble(this.jTextAc.getText()));
  }
  
  private void setFc(ActionEvent evt) {
    this.modulator.setFrequency(Double.parseDouble(this.jTextFc.getText()));
  }
  
  private void setSineA(ActionEvent evt) {
    this.sine.setAmplitude(Double.parseDouble(this.jTextSineA.getText()));
  }
  
  private void setSineFo(ActionEvent evt) {
    this.sine.setFrequency(Double.parseDouble(this.jTextSineFo.getText()));
  }
  
  private void setSinePhase(ActionEvent evt) {
    this.sine.setPhase(Double.parseDouble(this.jTextSinePhase.getText()));
  }
  
  private void setSawA(ActionEvent evt) {
    this.sawtooth.setAmplitude(Double.parseDouble(this.jTextSawA.getText()));
  }
  
  private void setSawTo(ActionEvent evt) {
    this.sawtooth.setPeriod(Double.parseDouble(this.jTextSawTo.getText()));
  }
  
  private void setPulsesA(ActionEvent evt) {
    this.pulses.setAmplitude(Double.parseDouble(this.jTextPulsesA.getText()));
  }
  
  private void setPulsesTo(ActionEvent evt) {
    double period = Double.parseDouble(this.jTextPulsesTo.getText());
    if (period > this.pulses.getTau()) {
      this.pulses.setPeriod(period);
    } else {
      this.jTextPulsesTo.setText(Double.toString(this.pulses.getPeriod()));
    } 
  }
  
  private void setPulsesTau(ActionEvent evt) {
    double tau = Double.parseDouble(this.jTextPulsesTau.getText());
    if (tau < this.pulses.getPeriod()) {
      this.pulses.setTau(tau);
    } else {
      this.jTextPulsesTau.setText(Double.toString(this.pulses.getTau()));
    } 
  }
  
  public int getSignal() {
    return this.jComboSignal.getSelectedIndex();
  }
}
