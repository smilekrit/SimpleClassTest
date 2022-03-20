package space.leafpy;
public class Piece {
    String name;
    int posColumn;
    int posRow;

    void showInfo(){
        System.out.printf("Piece: %s \n Position: %d , %d \n", name, posColumn, posRow);
    }

}
