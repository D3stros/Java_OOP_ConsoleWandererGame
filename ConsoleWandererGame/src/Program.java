
public class Program {

	public static void main(String[] args) {
		Field fieldGame = new Field();
		fieldGame.buildField();
		
		Player player1 = new Player(fieldGame);
		fieldGame.printField();
		
		player1.rotateLeft(fieldGame);
		player1.goForward(fieldGame);
		player1.goForward(fieldGame);
		player1.goForward(fieldGame);


	}

}
