package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
        exercicio5();
    }


    //Desenvolva um programa para mostrar os primeiros n números pares,
    // sendo n um valor que o usuário irá inserir pelo console.
    // Lembre-se que um número é par quando divisível por 2.
    public static void exercicio1(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entre a quantidade de numeros");

        int n = Integer.parseInt(myObj.nextLine());

        for(int i = 0;i < n * 2; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
    // sendo n e m valores que o usuário irá inserir via console.
    // Lembre-se que um número a é divisível por b se a é divisível por b
    public static void exercicio2(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Entre a quantidade de numeros");
        int n = Integer.parseInt(myObj.nextLine());

        System.out.println("Entre o numero m");
        int m = Integer.parseInt(myObj.nextLine());

        for(int i = 0;i < n * m; i++){
            if (i % m == 0){
                System.out.println(i);
            }
        }

    }

    //Desenvolva um programa para informar se um um número n é primo ou não,
    // sendo n um valor que o usuário irá inserir pelo console.
    // Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
    public static void exercicio3(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Entre o numero que deseja saber se é primo");
        int n = Integer.parseInt(myObj.nextLine());

        boolean flag = false;


        for(int i = 2;i < (n/2) + 1; i++){
            if (n % i == 0){
                flag = true;
                System.out.println("O número " + n + " não é primo.");
            }
        }
        if (!flag){
            System.out.println("O número " + n + " é primo!!");
        }

    }

    //Desenvolva um programa para mostrar por console os primeiros n números primos,
    // sendo um valor que o usuário irá inserir pelo console.
    public static void exercicio4(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Entre a quantidade de numeros primos que deseja ver");
        int n = Integer.parseInt(myObj.nextLine());

        boolean flag;
        int quantidade_de_primos_encontradas = 0;
        int j = 2;

        while(n > quantidade_de_primos_encontradas){
            flag = false;
            for(int i = 2;i < (j/2) + 1; i++){
                if (j % i == 0){
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("O número " + j + " é primo!!");
                quantidade_de_primos_encontradas++;
            }
            j++;
        }
    }


        //Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos de m dígitos de d,
        // sendo n, m e d valores que o utilizador vai entrar pela consola.
        public static void exercicio5(){

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Entre a quantidade de numeros que deseja ver");
            int n = Integer.parseInt(myObj.nextLine());

            System.out.println("Entre a quantidade de digitos que o numero precisa ter");
            int m = Integer.parseInt(myObj.nextLine());

            System.out.println("Entre o digito que precisa ter");
            int d = Integer.parseInt(myObj.nextLine());

            boolean flag = false;
            int quantidade_numeros = 0;
            int j = 2;
            int quantidade_digitos = 0;

            while(n > quantidade_numeros){
                quantidade_digitos = 0;
                flag = false;
                for(int i = 2;i < (j/2) + 1; i++){
                    if (j % i == 0){
                        flag = true;
                    }
                }
                if (flag){
                    System.out.println("O número " + j + " é primo!!");
                    quantidade_numeros++;
                }
                j++;
            }
        }


}
