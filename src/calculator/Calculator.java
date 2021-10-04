/* Boudarel Lucie 
Ginzburg Jeanne
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author jeann
 */
public class Calculator { // nom de l'algorithme

    
    // * @param args the command line arguments
 
     
    public static void main(String[] args) {
          // *Déclaration variables 
    int operateur; 
    Scanner sc; 
    sc=new Scanner (System.in); // initialisation de la fonction scanner
    int operand1;
    int operand2;
    int resultat;
   
        //Utilisaton du programme
    
    System.out.println("Please enter the operator :\n 1) Add \n 2) Substract \n 3) multiply \n 4) divide \n 5) modulo" ); // affichage du menu
    operateur = sc.nextInt(); // entrer dans la catégorie voulu
    
    if (operateur >= 6 || operateur <=0) { // verification que la categorie demandée existe 
     System.out.println("Erreur! /n choisir un chiffre entre 1 et 5"); // affichage d'une erreur car catégorie inexistante
     System.out.println("Please enter the operator :\n 1) Add \n 2) Substract \n 3) multiply \n 4) divide \n 5) modulo" ); // ré-affichage du menu 
       operateur = sc.nextInt();  } 
    
    System.out.println("Quelle est votre première valeur"); // demande de la première variable
    operand1 = sc.nextInt(); // operateur prend la première variable
    System.out.println("Quelle est votre deuxième valeur"); 
    operand2 = sc.nextInt();
    
    switch(operateur){ // boucle permettant d'arriver à la catégorie voulu
        case 1 -> {
            resultat=operand1+operand2; // opération d'addition
            System.out.println("le resultat est "+resultat); // afichage du resulat
            }
        case 2 -> {
            resultat=operand1-operand2; // opération de soustraction
            System.out.println("le resultat est "+resultat);
        }
        case 3 -> {
            resultat=operand1*operand2; // opération de multiplication
            System.out.println("le resultat est "+resultat);
        }
        case 4 -> {
            resultat=operand1/operand2; // opération de division
            System.out.println("le resultat est "+resultat);
        }
        case 5 -> {
            resultat=operand1%operand2; // opération de modulo
            System.out.println("le resultat est "+resultat);
        }
    }
    System.exit(0); //permet d'interrompre le déroulement du programme en cas d'erreur de saisie par exemple
}
}

