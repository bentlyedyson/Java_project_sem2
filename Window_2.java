import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_2 extends JFrame {
	
	static String username2;// this will be the second username of the first window
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
	private javax.swing.JLabel Label_2;
	private static javax.swing.JTextArea Screen_2;
	private javax.swing.JButton Send_2;
	public static javax.swing.JTextArea Chat_2;
	
	public Window_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label_2 = new JLabel("Chat window for: " + username2);
		Label_2.setBounds(10, 10, 255, 30);
		contentPane.add(Label_2);
		
		Chat_2 =new JTextArea();
		Chat_2.setBounds(10, 330, 255, 44);
		contentPane.add(Chat_2);
		
		Send_2 = new JButton("Send");
		Send_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = Chat_2.getText();
				if(s.equals("")) {
					return;
				}
				Screen_2.append(username2 + ": " + s + "\n");
				Window_1.Send_Text();
				Chat_2.setText("");
			}
		});
		
		Send_2.setBounds(275, 332, 86, 42);
		contentPane.add(Send_2);
		
		Screen_2 = new JTextArea();
		Screen_2.setBounds(10, 47, 351, 262);
		contentPane.add(Screen_2);
	
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen_2.setText("");
			}
		});
		Clear.setBounds(276, 6, 85, 21);
		contentPane.add(Clear);
	}
	
	public static void Send_Text() { 
		String s = Window_1.Chat_1.getText(); //when user type something in the Window_1 Screen, it will display later in Window_2
		if(s.equals("")) { // check if the s is empty, the program will do nothing
			return;
		}// but if, this will add or append to the other window if it detect texts
		Screen_2.append(Window_1.username1 + ":" + s + "\n" ) ;
	}
	

}
