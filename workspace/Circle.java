import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.*;
public class Circle extends JComponent {
private Board b;
// Board of 6 array lists (down) of array lists of 7 (across)
private boolean occupied;
// 0: RED
// 1: YELLOW
// 2: BLANK
private int color;
//use coordinates of occupied pieces to use queen chess logic to check for 4 in a row
private int xNum; //x-coordinaters //y-coordinaters
private int yNum;

public Circle(boolean o, int col, int x, int y){
   boolean occupied= o;
   int color = col;
   boolean xNum = x;
   boolean yNum = y;
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
    return xNum;
 }
 public void setX(int x){
    xNum=x;
 }
 public int getY(){
    return yNum;
 }
 public void setY(int y){
    yNum=y;
 }
 public void put(Piece p) {
    this.occupyingPiece = p;
}
}