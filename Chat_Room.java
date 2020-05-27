
public class Chat_Room {
	
	static Window_1 win1;
	static Window_2 win2;
	static Server server;
	
	public Chat_Room() {
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	
	public static void CreateRoom() {
		win1 = new Window_1();
		win2 = new Window_2();
		win1.setLocation(500,200);
		win2.setLocation(900, 200);
		win1.setVisible(true);
		win2.setVisible(true);
		server.setVisible(false);
		}
	public static void main(String[] args) {
		Chat_Room ChatRoom = new Chat_Room();
	}
}
