import java.net.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class ServerSide {

	private ArrayList<ConnectionHandler> connections = new ArrayList();      // For communication with the connecting program.
	private static int id=1;
	public ServerSide() {
		ServerSocket listener;  // Listens for incoming connections.
        

        /* Accept and process connections forever, or until some error occurs. */

        try {
            listener = new ServerSocket(LISTENING_PORT);
            System.out.println("Listening on port " + LISTENING_PORT);
            while (true) {
                  // Accept next connection request and handle it.
            	 Socket s = listener.accept();
            	 ConnectionHandler handler = new ConnectionHandler(s,id);
            	 id++;
            	 handler.start();
            	connections.add(handler);
                
            	
            }
        }
        catch (Exception e) {
            System.out.println("Sorry, the server has shut down.");
            System.out.println("Error:  " + e);
            return;
        }

    }  // end main()


    /**
     *  Defines a thread that handles the connection with one
     *  client.
     */
    private class ConnectionHandler extends Thread {
        private Socket client;
        private ObjectOutputStream oos;
        private ObjectInputStream is;
        private int userID;
        ConnectionHandler(Socket socket, int id) {
            client = socket;
            userID = id;
            try {
				oos = new ObjectOutputStream(socket.getOutputStream());
				System.out.println("outputsteram serverside good to go");
				is = new ObjectInputStream(socket.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        public void send(Circle[][] input) {
        	try {
				oos.writeObject(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        public void run() {
            int y0 =0;
			int y1 =0;
			int y2 =0;
			int y3 =0;
			int y4 =0;
			int y5 =0;
			int y6 =0;
			
			
			//temp double array Circle[][]
            Circle[][] board = new Circle[6][7]; 

            while(client.isConnected()) {
	            try {
	            	int input=(int)is.readObject();
	            	//your code to send messages goes here.
	            	
	            		for(ConnectionHandler handler: connections) {
							//compute the move
							//use game logic
							//input is the x location
							if(input ==0) {
								board[input][y0].setOccupied(true);
								if((id%2)==1){
									board[input][y0].setColor(0);
								}
								else {
                                    board[input][y0].setColor(1);
								}
								y0++;	
							}
							if(input ==1) {
								board[input][y1].setOccupied(true);
								if((id%2)==1){
									board[input][y1].setColor(0);
								}
								else {
                                    board[input][y1].setColor(1);
								}
								y1++;	
							}
							if(input ==2) {
								board[input][y2].setOccupied(true);
								if((id%2)==1){
									board[input][y2].setColor(0);
								}
								else {
                                    board[input][y2].setColor(1);
								}
								y2++;	
							}
							if(input ==3) {
								board[input][y3].setOccupied(true);
								if((id%2)==1){
									board[input][y3].setColor(0);
								}
								else {
                                    board[input][y3].setColor(1);
								}
								y3++;	
							}
							if(input ==4) {
								board[input][y4].setOccupied(true);
								if((id%2)==1){
									board[input][y4].setColor(0);
								}
								else {
                                    board[input][y4].setColor(1);
								}
								y4++;	
							}
							if(input ==5) {
								board[input][y5].setOccupied(true);
								if((id%2)==1){
									board[input][y5].setColor(0);
								}
								else {
                                    board[input][y5].setColor(1);
								}
								y5++;	
							}
							if(input ==6) {
								board[input][y6].setOccupied(true);
								if((id%2)==1){
									board[input][y6].setColor(0);
								}
								else {
                                    board[input][y6].setColor(1);
								}
								y6++;	
							}
							

	            			synchronized(handler) {
								//1: check if move is legal
								//2: send an updated temp board
	            				handler.send(board);
	            			}
	            		}
	            	}
	            		
	            	
	            		
	            
	            catch (Exception e){
	                System.out.println("Error on connection with: " 
	                         + ": " + e);
				}
            }
            connections.remove(client);
            try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

    public static final int LISTENING_PORT = 9876;

   
    
 public static void main(String[] args) {
    	ServerSide server = new ServerSide();
        Socket s = new Socket();
        
    }
}