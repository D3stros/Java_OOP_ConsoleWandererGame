
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
	
	// Rotation Right
	public void rotateRight(Field field) {
		if(counter == 0) {
			counter = 1;
		} else if(counter == 1) {
			counter = 2;
		} else if(counter == 2) {
			counter = 3;
		} else if(counter == 3) {
			counter = 0;
		} else {
			System.out.println("Error during rotation right");
		}
		
		field.getField()[currentRow][currentColumn] = playerSign[counter];
		field.printField();
	}
	
	// Rotation Left
	public void rotateLeft(Field field) {
		if(counter == 0) {
			counter = 3;
		} else if(counter == 1) {
			counter = 0;
		} else if(counter == 2) {
			counter = 1;
		} else if(counter == 3) {
			counter = 2;
		} else {
			System.out.println("Error during rotation left");
		}
		
		field.getField()[currentRow][currentColumn] = playerSign[counter];
		field.printField();
	}
	

}
