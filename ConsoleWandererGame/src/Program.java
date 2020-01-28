import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Field fieldGame = new Field();
		fieldGame.buildField();
		
		Player player1 = new Player(fieldGame);
		fieldGame.printField();
		
		String decision;
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(temp == 0) {
			System.out.println("Please do something (g= go forward, l = left turn, r = right turn, q = quit program");
			decision = sc.next();
			
			switch(decision) {
			case "g": player1.goForward(fieldGame);break;
			case "l": player1.rotateLeft(fieldGame);break;
			case "r": player1.rotateRight(fieldGame);break;
			case"q": temp = 1; System.out.println("The program was stopped");break;
			default: System.out.println("You entered a wrong input");break;
			}
		}
	}
}
