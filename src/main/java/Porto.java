
/**
 *
 * @author necad
 */
public class Porto {
    
    private int ctNavios;
    private int noMaxNavios;
    private Navio[] navios;

    /**
     * Contrutor que recebe como parametro o numero maximo de navios
     * @param noMaxNavios
     */
    public Porto(int noMaxNavios) {
        this.noMaxNavios = noMaxNavios;
        navios = new Navio[noMaxNavios];
        ctNavios = 0;
    }

    /**
     * get do atributo privado navios
     * @return
     */
    public Navio[] getNavios() {
        return navios;
    }

    /**
     * get do atributo privado NoMaxNavios
     * @return
     */
    public int getNoMaxNavios() {
        return noMaxNavios;
    }

    /**
     * Método de adicionar um navio , ele ve se a capacidade maxima de total de navios é igual ao numero maximo de navios no porto se o for 
     * ele imprime uma mensagem que o numero maximo foi atingido senao ele verifica se a matricula já existe, se existir ele imprime o aviso
     * ao utilizador que ja existe senao adicina o navio ao porto
     * @param n
     */
    public void novoNavio(Navio n){
        if(ctNavios == noMaxNavios) {
            System.out.println("No máximo de navios (" + noMaxNavios + ") atingido!");
            return;
        }
            
        boolean enc = false;
        for(int i=0;i<ctNavios;i++){
            if(n.getMatricula().equals(navios[i].getMatricula())) {
                enc = true;
                System.out.println("Matrcula existente: " + n.getMatricula());
            }
        }
        if (!enc) {
            navios[ctNavios] = n;
            ctNavios++;
        } 
    }
    
    /**
     * get do atributo privado CapacidadeTotal
     * @return
     */
    public float getCapacidadeTotal(){
        float total = 0;
        for(int i=0; i<ctNavios; i++){
            if( navios[i] instanceof Petroleiro)
                total += ((Petroleiro) navios[i]).getCarga();
            if( navios[i] instanceof PortaContentores)
                total += ((PortaContentores) navios[i]).getNoContentores() * 10;
        }
        return total;
    }
    
    /**
     * Método main 
     * @param args
     */
    public static void main(String[] args) {
        Porto porto = new Porto(10);
        Petroleiro petro1 = new Petroleiro("1234"); petro1.setCarga(200);
        PortaContentores pConta1 = new PortaContentores("2345"); pConta1.setNoContentores(50);
        PortaContentores pConta2 = new PortaContentores("3456"); pConta2.setNoContentores(20);
        Navio n = new Navio("0123");
        Petroleiro petro2 = new Petroleiro("1234"); petro2.setCarga(200);
        
        porto.novoNavio(petro1);
        porto.novoNavio(petro2);
        porto.novoNavio(pConta1);
        porto.novoNavio(pConta2);
        porto.novoNavio(n);
        
        System.out.println("Capacidade total = " + porto.getCapacidadeTotal() + " toneladas.");
    }
}
