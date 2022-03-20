package space.leafpy;

public class Program {
    public static void main(String[] args) {
        Piece pawn = new Piece();

        pawn.showInfo();
        // output:
        //Piece: null
        // Position: 0 , 0
        pawn.name = "pawn_A2";
        pawn.posColumn = 0;
        pawn.posRow = 1;
        pawn.showInfo();
        // output:
        //Piece: pawn_A2
        // Position: 0 , 1
    }
}
