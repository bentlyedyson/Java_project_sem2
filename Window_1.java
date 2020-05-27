import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_1 extends JFrame {

	static String username1;// this will be the first username of the first window
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Screen_1 = new JTextArea();
		Screen_1.setBounds(10, 47, 351, 262);
		contentPane.add(Screen_1);
		
		Chat_1 = new JTextArea();
		Chat_1.setBounds(10, 330, 255, 44);
		contentPane.add(Chat_1);
		
		Send_1 = new JButton("Send");
		Send_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for sending 
				//This below code is get the text in the field in which we send our message and put it in a String
				// if empty, the program will not do anything 
				// if not empty, the code will run, we append the text to our screen and pass the text in to the other window, and set our text field to clear once we done sending 
				String s = Chat_1.getText();
				if(s.equals("")) {
					return;
				}
				Screen_1.append(username1 + ": " + s + "\n");
				Window_2.Send_Text();
				Chat_1.setText("" );
			}
		});
		Send_1.setBounds(275, 332, 86, 42);
		contentPane.add(Send_1);
		
		Label_1 = new JLabel("Chat window for: " + username1);
		Label_1.setBounds(10, 10, 255, 30);
		contentPane.add(Label_1);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen_1.setText("");
			}
		});
		Clear.setBounds(274, 15, 86, 21);
		contentPane.add(Clear);
	}

	public static void Send_Text() { 
		String s = Window_2.Chat_2.getText(); //when user type something in the Window_2 Screen, it will display later in Window_1
		if(s.equals("")) { // check if the s is empty, the program will do nothing
			return;
		}// but if, this will adds or append to the other window if it detect texts
		Screen_1.append(Window_2.username2 + ":" + s + "\n" ) ;
	}
	
	private javax.swing.JLabel Label_1;
	private static javax.swing.JTextArea Screen_1;
	private javax.swing.JButton Send_1;
	public static javax.swing.JTextArea Chat_1;
	
	
}
