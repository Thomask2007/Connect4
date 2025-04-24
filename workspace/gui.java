import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import java.awt.Color;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


import javax.swing.JTextArea;


public class gui {
	private JFrame frame;
	private JPanel up;
	private JPanel down;
	private int y0;
	private int y1;
	private int y2;
	private int y3;
	private int y4;
	private int y5;
	private int y6;
	private JLabel white;
	private JLabel yellowCircle;
	private JLabel redCircle;
	private Socket socket;
    private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private InetAddress host;

	public gui(){
	// get the localhost IP address, if server is running on some other IP, you need
		// to use that
		
		try {
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Socket socket = null;

		ObjectInputStream ois = null;

		// establish socket connection to server
		try {
			socket = new Socket(host.getHostName(), 9876);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// write to socket using ObjectOutputStream
		
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sending request to Socket Server");

		// read the server response message

		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setLayout(new FlowLayout());

		JPanel up = new JPanel(new FlowLayout());
		up.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		up.setPreferredSize(new Dimension(1400, 101));

		GridLayout grid = new GridLayout(6,7);
		JPanel down = new JPanel();
		down.setLayout(grid);
		down.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
		down.setPreferredSize(new Dimension(1400, 616));
		down.setSize(new Dimension(1400, 616));


		//JTextArea text = new JTextArea("", 100, 100);
		//JTextField textbox = new JTextField("Type Here");
		//textbox.setPreferredSize(new Dimension(100, 100));
		// textbox.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {

		// 		try {
		// 			oos.writeObject(textbox.getText());
		// 			System.out.println(textbox.getText());
		// 		} catch (IOException e1) {
		// 			// TODO Auto-generated catch block
		// 			e1.printStackTrace();
		// 		}

		// 	}
		// });
		
		
		//Setting all the parts of 6 x 7 grid layout of down to white image spaces (blanks)

		ImageIcon whiteImage = new ImageIcon("white.png");
		for(int i = 0 ; i < 6; i++){
			for(int j =0; j<7; j++){
				JLabel white = new JLabel(whiteImage);
				white.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 2));
				down.add(white, i, j);
			}
		}

		//making the redImage component to add to temp double array Circle [][]
		ImageIcon redImage = new ImageIcon("redCircle1.png");
		JLabel redCircle = new JLabel(redImage);
		redCircle.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

		//making the yellowImage component to add to temp double array Circle [][]
		ImageIcon yellowImage = new ImageIcon("yellowcircle3.jpeg");
		JLabel yellowCircle = new JLabel(yellowImage);
		yellowCircle.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
			
		

		
			//making the buttons
		
		    int y1=0;
			JButton button1 = new JButton("Go Column 1");
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.WHITE);
			// can add hgap (horizontal gap) between buttons to align properly with columns
			button1.setPreferredSize(new Dimension(175,50));
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int x=0;
					try {
						oos.writeObject(x);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				//send to server "button 1"
				}
			});
			int y2=0;
			JButton button2 = new JButton("Go Column 2");
			button2.setBackground(Color.BLUE);
			button2.setForeground(Color.WHITE);
			button2.setPreferredSize(new Dimension(175, 50));
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				int x=1;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});
			int y3=0;
			JButton button3 = new JButton("Go Column 3");
			button3.setBackground(Color.BLUE);
			button3.setForeground(Color.WHITE);
			button3.setPreferredSize(new Dimension(175, 50));
			button3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
               int x=2;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});
			int y4=0;
			JButton button4 = new JButton("Go Column 4");
			button4.setBackground(Color.BLUE);
			button4.setForeground(Color.WHITE);
			button4.setPreferredSize(new Dimension(175, 50));
			button4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
              int x=3;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});
			int y5=0;
			JButton button5 = new JButton("Go Column 5");
			button5.setBackground(Color.BLUE);
			button5.setForeground(Color.WHITE);
			button5.setPreferredSize(new Dimension(175, 50));
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
             int x=4;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});
			int y6=0;
			JButton button6 = new JButton("Go Column 6");
			button6.setBackground(Color.BLUE);
			button6.setForeground(Color.WHITE);
			button6.setPreferredSize(new Dimension(175, 50));
			button6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
             int x=5;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});
			int y7=0;
			JButton button7 = new JButton("Go Column 7");
			button7.setBackground(Color.BLUE);
			button7.setForeground(Color.WHITE);
			button7.setPreferredSize(new Dimension(175, 50));
			button7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
            int x=6;
                try {
					oos.writeObject(x);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//send to server "button 1"
				}
			});

		up.add(button1);
		up.add(button2);
		up.add(button3);
		up.add(button4);
		up.add(button5);
		up.add(button6);
		up.add(button7);
        frame.add(up);
		frame.add(down);
		frame.validate();
		frame.setVisible(true);
		
		ListeningThread t = new ListeningThread(socket,ois,frame);
		t.start();


		up.setVisible(true);
		down.setVisible(true);	}



    public static void main(String[] args)
			throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
				new gui();
		}

	private static class ListeningThread extends Thread {
		private Socket client;
		private ObjectInputStream is;
		JFrame f;

		ListeningThread(Socket socket, ObjectInputStream ois, JFrame frame) {
			is = ois;
			client = socket;
			f=frame;
		}

		public void run() {
    	  while(true) {
	            try {
	            	Circle[][] input=(Circle[][])is.readObject();
	            	//your code to send messages goes here.
	            	if(input !=null) {

						//parse input and draw what it said onto the screen
						//loop through the input double array
						for(int i = 0 ; i < 6; i++){
							for(int j =0; j<7; j++){
									//if occupied get color and place piece
									//player 1 is red
									//player 2 is yellow
									// [x][y].getColor then set it to the JLabel to corresponding image
								
							}
						}

	            		down.repaint();

	            	} 
	            }
	            catch (Exception e){
	                System.out.println("Error on connection with: " 
	                         + ": " + e);
	            }
            }
    	
    }
    }
}