/**
 * To visualise the factory layout and its machines assembly line
 * for a cake company
 * @author TODO: Cheah Jia Huei
 */
import java.util.Scanner;
public class CakeInc {
	
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		Factory factory=new Factory();		
		CakeInc cakeInc=new CakeInc();
		Machine machine=new Machine();
		cakeInc.runCakeCompany(factory,machine,keyboard);
		// TODO: Implement this method.

	}
	public void runCakeCompany(Factory factory, Machine machine, Scanner keyboard){
		factory.readFactoryLayout(keyboard);
		factory.printRepresentation();
		machine.machineTypeToIngredient(factory);
		machine.printIngredient();
	}
	

}
