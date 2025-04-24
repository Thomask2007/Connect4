import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JFrame;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;



//both the game logic and also how we draw it
public class Board{

public Circle[][] board; 
    private JFrame frame;

    public Board(JFrame f) {
        frame = f;
         board = new Circle[6][7];
        for(int y =0; y<board.length;y++) {
            for(int x = 0;x<board[y].length;x++) {
                board[y][x]= new Circle(false,2,x,y);
            }
        }

        // setLayout(new GridLayout(6, 7, 0, 0));
   }

   public void placePiece(int x, int y, Circle[][] b) {
    b[y][x].setOccupied(true);
    isConnect4(b[y][x]);
   }
   private boolean isConnect4(Circle piece){
    int i = 1;
    while((piece.getColor() == board[piece.getY()+i][piece.getX()+i].getColor()) && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getY()][piece.getX()+i].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getY()-i][piece.getX()+i].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getY()-i][piece.getY()].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()-i][piece.getY()-i].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()+i][piece.getY()].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    i=1;
    while(piece.getColor() == board[piece.getX()+i][piece.getY()-i].getColor() && piece.getX() >= 0 && piece.getX() <= 7 && piece.getY() >= 0 && piece.getY() <= 6){
        if(i==4){
            return true;
        }
        i++;
    }
    return false;
   }
};