package day14_multi_branch_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 3;

        if(selection == 1){
            System.out.println("Hello, thank you for call");
        }
        else if(selection == 2){
            System.out.println("Hola, gracias para llamar");
        }
        else if(selection == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkur ederiz");
        }
        else if(selection == 4){
            System.out.println("privet, Russian");
        }
        else if(selection == 5){
            System.out.println("Merci, pour votre appel");
        }
        else{
            System.out.println("Lets talk java and english , hello");
        }

        // 2. way
        Scanner input = new Scanner (System.in);
        System.out.println("Enter 1 to 5 number");
        int selection1 = input.nextInt();
        if(selection1 == 1){
            System.out.println("Hello, thank you for call");
        }
        else if(selection1 == 2){
            System.out.println("Hola, gracias para llamar");
        }
        else if(selection1 == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkur ederiz");
        }
        else if(selection1 == 4){
            System.out.println("privet, Russian");
        }
        else if(selection1 == 5){
            System.out.println("Merci, pour votre appel");
        }
        else{
            System.out.println("Lets talk java and english , hello");
        }

    }
}
