public class LockerPuzzel {
   public static void main(String [] args){
    boolean [] lockers = new boolean[100];
    // pour chaque etudiant
    for (int student = 1; student <= 100; student++){
        // pour chaque casiers 
        for( int locker = student; locker<=100; locker+=student){
            lockers[locker-1]=!lockers[locker-1];
        }
    }System.out.println("The lockers open are the lockers number :");
    for (int i = 0;i<100; i++){
        if (lockers[i]){
            System.out.println( (i+1) + "");
        }
    }
   } 
}
