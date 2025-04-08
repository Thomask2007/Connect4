import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

public class Board{
    private final Circle[][] board;
    private Jframe frame;
   public Board(Jframe f) {
    frame = f;
    board = new Circle[6][7];
    for(int y =0; y<board.length;y++) {
        for(int x = 0;x<board[y].length;x++) {
            board[y][x]= new Circle(false,2,x,y);
        }
    }
//    setLayout(new GridLayout(6, 7, 0, 0));
   }

   public placePiece(int x, int y, board b) {
    b[y][x].setOccupied(true);
    b[y][x].hasWon();
   }
   private boolean isConnect4(Circle piece){
    int i = 1;
    while(piece.getColor() == board[piece.getX()+i][piece.getY()+i]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()][piece.getY()+i]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()-i][piece.getY()+i]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()-i][piece.getY()]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()-i][piece.getY()-i]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()+i][piece.getY()]){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()+i][piece.getY()-i]){
        if(i==4){
            return true;
        }
        i++;
    }
   }
};