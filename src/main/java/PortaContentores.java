
/**
 *
 * @author necad
 */
public class PortaContentores extends Navio {
    
    private int noContentores;
    
    /**
     * Construtor que recebe como parametro a matricula
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     * get do atributo privado NoContentores
     * @return
     */
    public int getNoContentores() {
        return noContentores;
    }

    /**
     * set do atributo privado NoContentores
     * @param noContentores
     */
    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
    
    
}
