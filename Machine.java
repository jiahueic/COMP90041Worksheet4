/**
 * Write a comment describing your class here.
 * @author : Cheah Jia Huei
 */
 import java.util.ArrayList;
import java.util.Collections;
public class Machine {
	ArrayList<String> ingredient;
	Machine(){
		this.ingredient=new ArrayList<String>();
	}
	public void machineTypeToIngredient(Factory factory){
		String[][]layout=factory.getLayout();
		for(int i=0;i<layout.length;i++){
			for(int j=0;j<layout.length;j++){
				if(layout[i][j].equals("b")){
					ingredient.add("chocolate sponge base");
				}
				else if(layout[i][j].equals("w")){
					ingredient.add("whipped cream");
				}
				else if(layout[i][j].equals("s")){
					ingredient.add("chocolate shavings");
				}
				else if(layout[i][j].equals("c")){
					ingredient.add("cherries");
				}
			}
		}
		Collections.sort(ingredient);
		this.ingredient=ingredient;
	}

	public void printIngredient(){
		System.out.println();
		for(String element:ingredient){
			System.out.println(element);
		}
	}
}
		
	
