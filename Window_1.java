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
	static String username1;

	private javax.swing.JLabel label1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1;
	public static javax.swing.JTextArea text1;
	
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
		
		display1 = new JTextArea();
		display1.setBounds(10, 44, 351, 279);
		contentPane.add(display1);
		
		text1 = new JTextArea();
		text1.setBounds(10, 333, 277, 41);
		contentPane.add(text1);
		
		send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String s = text1.getText();
					if(s.equals("")) {
						return;
					}
					display1.append(username1 + ": " + s + "\n");
					Window_2.sendText();
					text1.setText("");
					}

		});
		send1.setBounds(297, 335, 64, 39);
		contentPane.add(send1);
		
		label1 = new JLabel("Chat window for:" + username1 );
		label1.setBounds(10, 10, 262, 24);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(276, 13, 85, 21);
		contentPane.add(clear);
	}

	// s is messages 
	public static void sendText() {
		String s = Window_2.text2.getText();
		if(s.equals("")) {
			return;
		}
		display1.append(Window_2.username2 + ": " + s + "\n");
		}
}
