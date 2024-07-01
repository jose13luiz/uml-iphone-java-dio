package Iphone.NavegadorInternet;

import java.util.Scanner;

import Iphone.AparelhoTelefonico.AparelhoTelefonico;

public class NavegadorInternet extends AparelhoTelefonico{
    protected String exibirPagina;
    protected String adicionarNovaAba;
    protected String atualizarPagina;
    protected static NavegadorInternet  instancia = new NavegadorInternet();

    protected NavegadorInternet(){
        super();
    }
    @Override
    public String toString() {
        return "NavegadorInternet [exibirPagina=" + exibirPagina + ", adicionarNovaAba=" + adicionarNovaAba
                + ", atualizarPagina=" + atualizarPagina + "]";
    }
    
    public String getexibirPagina(String url){
        return exibirPagina;
    }
public String getadicionarNovaAba(){
        return adicionarNovaAba;
    }
    public String getatualizarPagina(){
        return atualizarPagina;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        NavegadorInternet instancia = new NavegadorInternet();
        System.out.println("Exibir Página");
        instancia.exibirPagina = scanner.next();
        System.out.println("Adicionar Aba");
        instancia.adicionarNovaAba = scanner.next();
        System.out.println("Atualizar Pagina");
        instancia.atualizarPagina = scanner.next();
        scanner.close();
        
    }

}
