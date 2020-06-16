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

public class Window_2 extends JFrame {
	static String username2;
	//variable 
	private javax.swing.JLabel label2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_2 frame = new Window_2();
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
	//constructor
	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display2 = new JTextArea();
		display2.setBounds(10, 44, 351, 279);
		contentPane.add(display2);
		
		text2 = new JTextArea();
		text2.setBounds(10, 333, 277, 41);
		contentPane.add(text2);
		
		send2 = new JButton("SEND");
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")) {
					return;
				}
				display2.append(username2 + ": " + s + "\n");
				Window_1.sendText();
				text2.setText("");
				}
	// this function above get the text from the field where we type and put it in a String
	// if it's empty, the program does nothing 
	// if not empty, the code runs, append the text in our own display and then pass the text to the window_2
	// set text1 to empty, so the messages box is clear when we send it 
		});
		send2.setBounds(297, 335, 64, 39);
		contentPane.add(send2);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		// this above code is to set the text in the text box to be cleared when it's pressed
		clear.setBounds(276, 13, 85, 21);
		contentPane.add(clear);
		
		label2 = new JLabel("Chat window for: " + username2);
		label2.setBounds(10, 10, 261, 24);
		contentPane.add(label2);
	}

	public static void sendText() {
		String s = Window_1.text1.getText(); // this code makes new String and get the text from Window_2, when you type something in the Window_2 text area, it will display what it written there
		if(s.equals("")) {//if it is empty or nothing, it returns means doesn't do anything, if not empty
			return;
		}
		display2.append(Window_1.username1 + ": " + s + "\n");//append or add the text to other window 
		}
}
