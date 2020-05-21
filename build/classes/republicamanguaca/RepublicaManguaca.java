/*
Contas mensais república manguaça
 */
package republicamanguaca;

//import java.util.Scanner;
    
    //Pegar Teclado
    //Scanner n = new Scanner(System.in);
    //String teste=n.nextLine();
    //System.out.println(teste);
    

class RepublicaManguaca{
    public static void main(String[]args){
        Morador m[]=new Morador[5];
        m[0]=new Morador("Cesar",205f,26.8f);
        m[1]=new Morador("João",162f,0f);
        m[2]=new Morador ("Jean",162f,0f);
        m[3]=new Morador ("Lucca",162f,0f);
        m[4]=new Morador ("Raul",255f,0f);
        Contas c1=new Contas(78.27f,204.61f,320f);
        c1.setCompras(m[1].getGastos()+m[2].getGastos()+m[4].getGastos()+m[0].getGastos()+m[3].getGastos());
        for (int i=0; i<5;i++){
            m[i].setAluguel(m[i].getQuarto()+c1.calcularContas()-m[i].getGastos());
        }
        c1.statusContas();
        System.out.println("---Moradores---");
        for(int i=0;i<5;i++){
            System.out.print(m[i].getNome()+" ");
            System.out.println(m[i].getAluguel());
        }
        
    }
}











































