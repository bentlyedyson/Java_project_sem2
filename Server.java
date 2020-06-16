import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {
	
	// 
	private JPanel contentPane;
	private JTextField win1;
	private JTextField win2;
	private JTextField name1;
	private JTextField name2;
	private JLabel lblNewLabel;
	private JLabel lblndUsername;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
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
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		 
		});
		name1.setBounds(110, 51, 229, 34);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
			//creation of the room
		});
		name2.setColumns(10);
		name2.setBounds(110, 128, 229, 34);
		contentPane.add(name2);
		
		JButton btnNewButton = new JButton("JOIN CHAT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
			
		});
		btnNewButton.setBounds(173, 198, 110, 33);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("1st username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(110, 22, 229, 23);
		contentPane.add(lblNewLabel);
		
		lblndUsername = new JLabel("2nd username");
		lblndUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblndUsername.setBounds(110, 95, 229, 23);
		contentPane.add(lblndUsername);
	}

	//
	private void createRoom() {
		String p1,p2; // this 2 String act as our username 
		p1 = name1.getText();
		p2 = name2.getText();
		// get the text according to the field in design page
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter a valid username	");
			return;
		// if either of them equals to empty, we ran into a problem and the program
		// returns ( does nothing ) before that the messageDialog will say the messages above
		}
		
		Window_1.username1 = name1.getText();
		Window_2.username2 = name2.getText();
		ChatRoom.createRoom();
	}
}

