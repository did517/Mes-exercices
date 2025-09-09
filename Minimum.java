import java.util.Scanner;
  public class Minimum {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        double [] numbers =new double [10];
        System.out.println("Enter ten numbers");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Number" + (i + 1) +":");
            numbers[i] = scanner.nextDouble();
        }
        double minimum = min(numbers);
        System.out.println("The minimum number is" + minimum);
        scanner.close();
    }
    public static double min(double [] array){
        double minValue = array[0];
        for(int i = 1; i < array.length ; i++){
            if(array [i] <minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
    
}
