import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.*;
public class Circle extends JComponent {
private Board b;
// Board of 6 array lists (down) of array lists of 7 (across)
private boolean occupied;
// True: RED
// False: YELLOW
private boolean color;
//use coordinates of occupied pieces to use queen chess logic to check for 4 in a row
private int xNum; //x-coordinaters //y-coordinaters
private int yNum;

public Circle(boolean o, boolean color, int x, int y){
   
}


 public boolean getOccupied() {
    return occupied;
 }   
 
 public void setOccupied() {
 occupied=b;  
 }
 
 public boolean getColor(){
    return color;
 }
 public void setColor(boolean col){
    color = col;
 }
 public int getX(){
    return intX;
 }
 public void setX(){
    
 }
 public int getY(){
    return intY;
 }
 public void put(Piece p) {
    this.occupyingPiece = p;
}
}