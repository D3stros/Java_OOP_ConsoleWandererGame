
public class Player {
	
	private char[] playerSign;
	private int currentRow;
	private int currentColumn;
	private int counter;
	
	Player(Field field) {
		playerSign = new char[4];
		playerSign[0] = '^';
		playerSign[1] = '>';
		playerSign[2] = 'v';
		playerSign[3] = '<';
		currentRow = 3;
		currentColumn = 3;
		counter = 0;
		field.getField()[currentRow][currentColumn] = playerSign[counter];
	}
	

}
