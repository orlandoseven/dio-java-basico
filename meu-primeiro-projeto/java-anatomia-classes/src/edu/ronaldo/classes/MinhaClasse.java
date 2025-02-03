package edu.ronaldo.classes;
public class MinhaClasse {
   public static void main(String [] args){
    System.out.println("Olá turma,sejam bem vindos!");

    //final String BR = "Brasil";
    String primeiroNome = "Ronaldo";
    String segundoNome = "Nascimento";

    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

    System.out.println(nomeCompleto);

   }
   public static String nomeCompleto(String primeiroNome,String segundoNome){
      return primeiroNome.concat(" ").concat(segundoNome);
   }
}
