package app;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        
        int idade = scan.nextInt();

        switch(idade){
            case 16: System.out.println("Idade insufiente para se alistar! ");
            break;
            case 17: System.out.println("Falta um ano para se alistar! ");
            break;
            case 18: System.out.println("Já pode se alistar! ");
            break;
            case 19: System.out.println("Você passou um ano do praso de se alistar! ");
            break;
            default: System.out.println("Para alistamento você tem que ser maior de 18 anos! ");
        }

    }
}