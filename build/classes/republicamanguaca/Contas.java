/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package republicamanguaca;

/**
 *
 * @author cesar
 */
    final public class Contas implements Controlador {
    //atributos
    private float agua;
    private float internet=127.09f;
    private float luz;
    private float suely;
    private float iptu=74.75f;
    private float compras=0;
    
    //construtor 
    public Contas(float a,float l,float s){
        this.setAgua(a);
        this.setLuz(l);
        this.setSuely(s);
     
    }
    
    //getters

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getInternet() {
        return internet;
    }

    public void setInternet(float internet) {
        this.internet = internet;
    }

    public float getLuz() {
        return luz;
    }

    public void setLuz(float luz) {
        this.luz = luz;
    }

    public float getSuely() {
        return suely;
    }

    public void setSuely(float suely) {
        this.suely = suely;
    }

    public float getIptu() {
        return iptu;
    }

    public void setIptu(float iptu) {
        this.iptu = iptu;
    }

    public float getCompras() {
        return compras;
    }

    public void setCompras(float compras) {
        this.compras = compras;
    }
    
    
    //métodos

    /**
     *
     * @return
     */
    @Override
    public float calcularContas(){
        float valor=((this.getAgua()+this.getCompras()+this.getInternet()+this.getIptu()+this.getLuz()+this.getSuely())/5);
        return valor;
    }
    
    /**
     *
     */
    @Override
    public void statusContas(){
        System.out.println("---República Manguaça---");
        System.out.println("Contas: ");
        System.out.println("Água: "+this.getAgua());
        System.out.println("Energia: "+this.getLuz());
        System.out.println("Internet: "+this.getInternet());
        System.out.println("IPTU: "+this.getIptu());
        System.out.println("Suely: "+this.getSuely());
        System.out.println("Compras: "+this.getCompras());
    }

   

}
