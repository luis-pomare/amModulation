package modulacionam;
import com.slabs.SLabsTimer;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Controles extends JPanel {
  SLabsTimer timer;
  
  private JButton jButtonPause;
  
  private JButton jButtonPlay;
  
  private JButton jButtonStop;
  
  public Controles(SLabsTimer timer) {
    initComponents();
    this.timer = timer;
  }
  
  private void initComponents() {
    this.jButtonPlay = new JButton();
    this.jButtonStop = new JButton();
    this.jButtonPause = new JButton();
    setLayout(new FlowLayout(0));
    this.jButtonPlay.setText("Play");
    this.jButtonPlay.addActionListener(Controles.this::play);
    add(this.jButtonPlay);
    this.jButtonStop.setText("Stop");
    this.jButtonStop.setEnabled(false);
    this.jButtonStop.addActionListener(Controles.this::stop);
    add(this.jButtonStop);
    this.jButtonPause.setText("Pause");
    this.jButtonPause.setEnabled(false);
    this.jButtonPause.addActionListener(Controles.this::pause);
    add(this.jButtonPause);
  }
  
  private void play(ActionEvent evt) {
    this.timer.start();
    this.jButtonPlay.setEnabled(false);
    this.jButtonStop.setEnabled(true);
    this.jButtonPause.setEnabled(true);
  }
  
  private void stop(ActionEvent evt) {
    this.timer.stop();
    this.jButtonPlay.setEnabled(true);
    this.jButtonStop.setEnabled(false);
    this.jButtonPause.setEnabled(false);
  }
  
  private void pause(ActionEvent evt) {
    this.timer.pause();
    this.jButtonPlay.setEnabled(true);
    this.jButtonStop.setEnabled(false);
    this.jButtonPause.setEnabled(false);
  }
}
