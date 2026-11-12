package shopList;

import java.util.*;


public class Main {

	public static void main(String[] args) {

		List<String> arrlist = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		int chooseNumber = 0;

		boolean flag = true;

		while (flag) {
			System.out.println("     Shopping List Menu \n" + " 1.Add item \n" + " 2.View item \n" + " 3.Remove item \n"
					+ " 4.Exit");

			System.out.print("Choose an option (1-4) :");
			chooseNumber = scanner.nextInt();
			scanner.nextLine();

			System.out.println("You choose " + chooseNumber);

			switch (chooseNumber) {
			case 1:

				System.out.println("Add item to ArrayList :");
				String addItem = scanner.nextLine();

				arrlist.add(addItem);
				
				System.out.println(addItem+" is succefully add in the ArrayList");

				break;

			case 2:
				System.out.print("View item in list :");
				
				for(String i : arrlist) {
					
					System.out.println(i);
				}
				break;

			case 3:
				
				System.out.println("Enter item to remove :");
				
				String removeItem=scanner.nextLine();
				
				if(arrlist.remove(removeItem)) {
					
					System.out.println(removeItem+" was removed.");
					
				}else {
					
					System.out.println(removeItem+" not found.");
					
				}
				
			
				
				break;

			case 4:
				System.out
						.println("You exit the shopping program list.Thank you for your supporting. Have a nice day.");

				flag = false;
				 break;
				 
				 
			case 5:
				
				if(arrlist.isEmpty()) {
					
					System.out.println("No item to clear.");
					
					break;
					
				}
				
				arrlist.clear();
				
				System.out.println("All item was cleared.");
				
				break;
				
			default:
				System.out.println("Invalid number . Please choose within 1 and 4 ");

			}

		}
	}

}
