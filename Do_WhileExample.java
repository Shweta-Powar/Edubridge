package demo;
import java.util.Scanner;

public class Do_WhileExample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char ch;
			String emailId=null,password=null,emailIdl=null,passwordl=null;
			do
			{
			System.out.println("1:register \n 2:login \n 3: exit");
			Scanner scanner =new Scanner(System.in);
			System.out.println("enter the option");
			int option;
			option=scanner.nextInt();// 1 2 3 
			switch(option)//int
			{
			case 1: System.out.println("enter the emailId & Password");
					emailId=scanner.next();
					password=scanner.next();
					break;
			case 2: System.out.println("enter the emailId & Password");
					emailIdl=scanner.next();
					passwordl=scanner.next();
					if(emailIdl.equals(emailId) && passwordl.equals(password))
					{
						System.out.println("Good,congratulations login success");
						char ch2;
						do {
						System.out.println("1:addCustomer \n 2: deleteCustomer \n 3:UpdateCustomer \n 4:exit");
						System.out.println("enter the option");
						int option2=scanner.nextInt();
						switch(option2)
						{
						case 1: System.out.println("Adding customer");
						break;
						case 2: System.out.println("Delete customer");
						break;
						case 3: System.out.println("Update customer");
						break;
						case 4: System.exit(0);
						default: System.out.println("valid option");
						}
						System.out.println("do you want to continue with options press y else press n");
						ch2=scanner.next().charAt(0);
					}while(ch2=='y'||ch2=='Y');
					}else
						System.out.println("Ooopsss something went wrong");
			break;
			case 3: System.exit(0);//terminates the program execution
			break;//control out of switch case, it doesnt stops the program
			default:System.out.println("Enter only 1 , 2, 3");
			break;
			}
				System.out.println("do you want to continue with App press y else press n");
				ch=scanner.next().charAt(0);
			}while(ch=='y'||ch=='Y');
		
		}

	}


