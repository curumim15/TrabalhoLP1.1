/**
 *
 * @author necad
 */
public class Petroleiro extends Navio {
    private float carga;

    /**
     * Construtor que recebe como parametro a matricula
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     * get do atributo privado carga
     * @return
     */
    public float getCarga() {
        return carga;
    }

    /**
     * set do atributo privado carga
     * @param carga
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
    
}
