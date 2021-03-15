/**
 *
 * @author necad
 */
public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     *  Construtor da classe navio que recebe como parametro a matricula
     * @param matricula
     */
    public Navio(String matricula) {
        this.matricula = matricula;
    }

    /**
     * get do atributo privado matricula
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * get do atributo privado nome
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * get do atributo privado comprimento
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * set do atributo privado nome que recebe como atributo uma string nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *set do atributo privado comprimento que recebe como atributo uma float comprimento
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    
}
