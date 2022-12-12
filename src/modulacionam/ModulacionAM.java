package modulacionam;
import com.slabs.SLabsTimer;
import com.slabs.TriggerListener;
import com.slabs.modulation.analog.AM;
import com.slabs.sinks.FFTScope;
import com.slabs.sinks.Scope;
import com.slabs.sources.PulseTrain;
import com.slabs.sources.SawTooth;
import com.slabs.sources.SineWave;
public class ModulacionAM {
    public static void main(String[] args) {
        ventanaPrincipal modulador = new ventanaPrincipal();
        modulador.setVisible(true);
    }
}
