 import java.util.Scanner;
public class Game {
    public static void main(String  [] args){
        Scanner scanner = new Scanner(System.in);
        // creer la grille 3*3 remplies avec des espaces
        String[][] board = new String[3][3];
        for (int i = 0; i <3; i++){
            for (int j = 0; j <3;j++){
             board[i][j]="";
            }
        }
        String currentPlayer ="X"; // le joueur qui commence 
        int moves= 0; // nombre de coups jouE
        // Boucles de jeu (max 9 tours)
        while(moves<9){
            afficherBoard(board); //afficher la grilleint 
            int row, col;
            while (true){
                System.out.print("Joueur" + currentPlayer +",entrez la ligne (0-2) :");
              row=scanner.nextInt();
                System.out.print("Joueur" + currentPlayer + ",entrez la collonn (0-2) :");
                col =scanner.nextInt();

                // Vérifier si la case est vide
                if (row >= 0 && row <3 && col >= 0 && col <3 && board[row][col].equals(" ")) {
                    board[row][col] = currentPlayer;
                    break; // sortir de la boucle si coup valide
                } else {
                    System.out.println("Case occupée, réessayez !");
                }
            }

            moves++; // on a joué un coup

            // Alterner joueur
            currentPlayer = currentPlayer.equals("X") ? "O" : "X";
        }

        // 3. Fin du jeu
        afficherBoard(board);
        System.out.println("Fin du jeu, toutes les cases sont remplies !");
        scanner.close();
    }

    // Méthode pour afficher la grille
    public static void afficherBoard(String[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
            
