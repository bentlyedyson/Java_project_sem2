import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField Name_2;
	private JTextField Name_1;

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
		
		JButton Join_Button = new JButton("Join Chat");
		Join_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateRoom();
			}
		});
		Join_Button.setBounds(187, 186, 85, 31);
		contentPane.add(Join_Button);
		
		Name_2 = new JTextField();
		Name_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateRoom();
			}
		});
		Name_2.setBounds(101, 141, 246, 26);
		contentPane.add(Name_2);
		Name_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Username");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(102, 48, 170, 19);
		contentPane.add(lblNewLabel);
		
		Name_1 = new JTextField();
		Name_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateRoom();
			}
		});
		Name_1.setColumns(10);
		Name_1.setBounds(100, 77, 246, 26);
		contentPane.add(Name_1);
		
		JLabel lblndUsername = new JLabel("2nd Username");
		lblndUsername.setFont(new Font("Arial", Font.BOLD, 20));
		lblndUsername.setBounds(101, 113, 170, 19);
		contentPane.add(lblndUsername);
	}

	private void CreateRoom() {
		String p1,p2;
		
		p1 = Name_1.getText();
		p2 = Name_2.getText();
		
		if(p1.equals("") || p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please enter a valid username!");
		}
		Window_1.username1 = Name_1.getText();
		Window_2.username2 = Name_2.getText();
		Chat_Room.CreateRoom();
		}
}
