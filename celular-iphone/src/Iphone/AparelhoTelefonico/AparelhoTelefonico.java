package Iphone.AparelhoTelefonico;

import java.util.Scanner;

public class AparelhoTelefonico {
    protected String ligar;
    protected String atender;
    protected String iniciarCorreioVoz;

    protected AparelhoTelefonico(){
        super();
    }

    @Override
    public String toString() {
        return "AparelhoTelefonico [ligar=" + ligar + ", atender=" + atender + ", iniciarCorreioVoz="
                + iniciarCorreioVoz + "]";
    }
    
    
    public String getligar(String numero){
        return ligar;
    }
    public String getatender(){
        return atender;
    }
    public String getiniciarCorreioVoz(){
        return iniciarCorreioVoz;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        System.out.println("Ligar telefone(digite o numero)");
        aparelho.ligar = scanner.next();
        System.out.println("Atender telefone tocando");
        System.out.println("Correio de voz iniciado");
        scanner.close();
               
        
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
             super.finalize();
    }

    




}


