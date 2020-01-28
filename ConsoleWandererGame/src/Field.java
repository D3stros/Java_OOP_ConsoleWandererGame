
public class Field {

	private char[][] field;
	
	Field() {
		field = new char[10][10];
	}
	
	
	public char[][] getField() {
		return field;
	}

	public void setField(char[][] field) {
		this.field = field;
	}
	
	public void buildField() {
		//#Left and Right
		for(int i=0; i<field.length; i++) {
			field[i][0] ='#';
			field[i][9] ='#';
			
			for(int t = 1; t<(field.length -1); t++) {
				field[i][t] = ' ';
			}
		}
		
		//#BorderTop
		for(int i=0; i < field[0].length; i++) {
			if(i > 0 && i < field[0].length -1) {
				field[0][i] = '#';
			}
		}
		
		//#BorderBottom
		for(int i=0; i < field[9].length; i++) {
			if(i > 0 && i < field[9].length -1) {
				field[9][i] = '#';
			}
		}
	}
	
	// Print on Console
	public void printField() {
		for(int i = 0; i<field.length; i++) {
			for(int j= 0; j<field[i].length; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
	}
	
}
