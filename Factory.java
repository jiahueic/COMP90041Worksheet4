/**
 * Read in and print the layout of factory.
 * @author: Cheah Jia Huei
 */
 import java.util.Scanner;
public class Factory {
	
	// TODO: Implement this class.
	private int width;
	private int length;
	private String[][]layout;
	Factory(){
		this.width=0;
		this.length=0;
	}
	public void readFactoryLayout(Scanner keyboard){
		System.out.println("Enter a factory layout: ");
		// number of characters in the first row of layout input will
		//dictate the number of rows the layout the program should read in
		System.out.print("> ");
		String firstLine=keyboard.nextLine();
		layout=new String[firstLine.length()][firstLine.length()];	
		populateLayout(0,layout,firstLine);
		for(int i=0;i<layout.length-1;i++){
			System.out.print("> ");
			firstLine=keyboard.nextLine();
			populateLayout(i+1,layout,firstLine);
		}


	}
	// j signifies the number of row
	public void populateLayout(int j,String[][] layout,String firstLine){
		int count=-1;
		for(int i=0;i<firstLine.length();i++){
			String currentChar=Character.toString(firstLine.charAt(i));
			if(currentChar.equals("b")){
				count++;
				layout[j][count]="b";
			}
			else if(currentChar.equals("w")){
				count++;
				layout[j][count]="w";
			}
			else if (currentChar.equals("s")){
				count++;
				layout[j][count]="s";
			}
			else if (currentChar.equals("c")){
				count++;
				layout[j][count]="c";
			}
			else if(currentChar.equals(" ")){
				count++;
				layout[j][count]=" ";
			}
		}
	}
	
	public void printRepresentation(){
		System.out.println();
		System.out.println("+" + "-".repeat(this.layout.length) + "+");
		for(int i=0;i<this.layout.length;i++){
			System.out.print("|");
			for(int j=0;j<this.layout.length;j++){
				System.out.print(this.layout[i][j]);
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("+" + "-".repeat(this.layout.length) + "+");		
	}
	public String[][] getLayout(){
		return this.layout;
	}

}
