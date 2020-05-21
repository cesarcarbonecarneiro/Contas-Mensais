package republicamanguaca;

/**
 *
 * @author cesar
 */
    final class Morador {
    
    //atributos
    private String nome;
    private float aluguel=0;
    private float gastos;
    private float quarto;
    
    //construtor
    public Morador (String n,float q,float g){
        this.setGastos(g);
        this.setNome(n);
        this.setQuarto(q);
        
    }
    
    //getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAluguel() {
        return aluguel;
    }

    public void setAluguel(float aluguel) {
        this.aluguel = aluguel;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public float getQuarto() {
        return quarto;
    }

    public void setQuarto(float quarto) {
        this.quarto = quarto;
    }
    
    
    
}





























