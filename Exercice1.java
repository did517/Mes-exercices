import java.util.Scanner;
public class Exercice1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        // on declare le nombres de variables
        int [] numbers = new int[5];
        // on donne l'instruction a l'utilsisateur
        System.out.println("Enter 5 numbers :");
        // ici on donne l'instruction a l'ordinateur
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Numbers"+(i +1)+":");
            numbers [i] =scanner.nextInt();
            
        }
    System.out.println("\n les nombres saisis sont :");
             for (int i = 0; i<numbers.length;i++){
                System.out.println("Numbers" + (i + 1) + ":"+ numbers[i]);
             }
        numbers [1]=scanner.nextInt();
        scanner.close();
    }
                
            

    
}