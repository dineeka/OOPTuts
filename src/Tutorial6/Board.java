package Tutorial6;

import java.util.*;

class Board {
    int ar[][];
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i=0; i < n; i++)
            for (int j=0; j < n; j++)
                ar[i][j] = generator.nextInt(101);
    }
    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) // for every element in current row
                System.out.print(c + " ");
            System.out.println();
        }
    }
    public void findMaxInRow(int row){
        int max= 0;
        for (int j = 0; j < ar.length; j++) {
            if (ar[row][j] > max)
                max= ar[row][j];
        }
        System.out.println("maximum number in the row"+row +" is: " +max);
    }

    /**
     *
     * @param col
     */
    public void findMaxInColumn(int col){
        int max=0;
        for(int i=0; i<ar.length;i++){
            if (ar[i][col]> max){
                max= ar[i][col];
            }
        }
        System.out.println("maximum number in the col "+col +" is: " +max);
    }
    public void findMaxInDiagonal(){
        int max=0;
       for(int i=0;i< ar.length;i++){
           for(int j=0;j<ar.length;j++){
               if (ar[i][j]> max){
                   max= ar[i][j];
               }
           }
       }
        System.out.println("maximum number in all left to right diagonals is: " +max);
    }

    public void findDiagonal(){
        int max=0;
        for(int i=0;i< ar.length;i++){
            if(ar[i][i] > max) {
                max = ar[i][i];
            }
            if(ar[i][ar.length-(i+1)]> max){
                max= ar[i][ar.length-(i+1)];
            }
        }
        System.out.println("maximum number in all diagonals is: " +max);
    }
}
