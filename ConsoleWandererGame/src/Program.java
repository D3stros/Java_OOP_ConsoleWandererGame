
public class Program {

	public static void main(String[] args) {
		Field fieldGame = new Field();
		fieldGame.buildField();
		fieldGame.printField();
		
		Player player1 = new Player(fieldGame);
		fieldGame.printField();

	}

}
