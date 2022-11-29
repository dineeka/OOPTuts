package Tutorial6;

public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(3);
        board1.print();
        board1.findMaxInRow(2);
        board1.findMaxInColumn(1);
        board1.findMaxInDiagonal();
        board1.findDiagonal();
    }
}
