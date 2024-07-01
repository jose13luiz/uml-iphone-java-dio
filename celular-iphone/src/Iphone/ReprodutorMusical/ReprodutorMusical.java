package Iphone.ReprodutorMusical;

import java.util.Scanner;

import Iphone.NavegadorInternet.NavegadorInternet;

public class ReprodutorMusical extends NavegadorInternet{
    protected String musica;
    protected String radio;
    protected String aparelhomusical;

    @Override
    public String toString() {
        return "ReprodutorMusical [musica=" + musica + ", radio=" + radio + ", aparelhomusical=" + aparelhomusical
                + "]";
    }

    protected ReprodutorMusical(){
        super();
    }
    
    public String gettocar(){
        return musica;
    }
    public String getpausar(){
        return radio;
    }
    public String getselecionarMusica(String musica){
        return aparelhomusical;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ReprodutorMusical instancia = new ReprodutorMusical();
        System.out.println("Selecione a musica");
        instancia.musica = scanner.next();
        System.out.println("musica tocar");
        System.out.println("Aparelho Musical");
        System.out.println("radio pausar" );
        instancia.getpausar();
        scanner.close();
        

        
    }
}
