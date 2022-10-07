package sample;
import java.util.*;

public class Maintain {
	static List<Customer_DataBase> detail=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	static loadCashToAtm n1=new loadCashToAtm();
	public static void main(String[] args) {
		customerdetails();
		n1.upadate_cash(20, 100, 100);
		int choice;
		do {
			System.out.println("-------------CustomerDetails&AtmProcess-------------");
			System.out.println("1)Load Cash to ATM");
			System.out.println("2)Atm Balance");
			System.out.println("3)Customer Details");
			System.out.println("4)ATM Operations");
			System.out.println("Enter Choices to do Reqired Operation");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			    loadcash();
				break;
			case 2:
				displayatmdenomenation();
				break;
			case 3:
				displaydetails();
				break;
	 		case 4:
	 			Handle_Atm_Process();
	 			break;
	 		case 5:
	 		   break;
	 		 default:
	 			 System.out.println("Enter correct choice");
	 			 
	 			 break;
			}
		}while(choice!=5);
		
	}

   static void Handle_Atm_Process() {
	   Handle_Atm_Process ob=new Handle_Atm_Process(); 
	}
	static void loadcash() {
		System.out.println("----------Load to Cash---------");
	    System.out.println("Enter note count->");
	    System.out.println("Enter count_2000");
	    int _2000=sc.nextInt();
	    System.out.println("Enter count_500");
	    int _500=sc.nextInt();
	    System.out.println("Enter count_100");
	    int _100=sc.nextInt();
	    n1.upadate_cash(_2000,_500,_100);
	    displayatmdenomenation();
	}
	static void customerdetails() {
		Customer_DataBase c1=new Customer_DataBase(101,"Suresh",2343,25234);
		Customer_DataBase c2=new Customer_DataBase(102,"Ganesh",5432,34123);
		Customer_DataBase c3=new Customer_DataBase(103,"Magesh",7854,26100);
		Customer_DataBase c4=new Customer_DataBase(104,"Naresh",2345,80000);
		Customer_DataBase c5=new Customer_DataBase(105,"Harish",1907,103400);
        detail.addAll(Arrays.asList(c1,c2,c3,c4,c5));
	}
    static void displaydetails() {
    	System.out.println("------------------------Customer Details-----------------------");
		System.out.println("---------------------------------------------------------------");  
		System.out.printf("%8s %20s %12s %16s", "Acc No", "Account Holder", "Pin Number", "Account Balance");  
		System.out.println();  
		System.out.println("---------------------------------------------------------------");   
		for(Customer_DataBase customerdeatail: detail)  
		{  
		System.out.format("%7s %14s %14s %16s",customerdeatail.getAccNo(), customerdeatail.getAhName(), customerdeatail.getsPin(), customerdeatail.getBalance());  
		System.out.println();  
		}  
		System.out.println("----------------------------------------------------------------");
		System.out.print("\n");
	}
    static void displayatmdenomenation() {
    	System.out.println("------------------Atm Balance-------------------");
		System.out.println("---------------------------------------------");  
		System.out.printf("%8s %12s %12s ", "Denomination", "Number", "Value");  
		System.out.println();  
		System.out.println("---------------------------------------------");  
		System.out.format("%7s %16s %12s ","2000", n1.getCount_2000(),n1.getTotal_2000());
		System.out.println();
		System.out.format("%7s %16s %12s ","500", n1.getCount_500(),n1.getTotal_500());  
		System.out.println();
		System.out.format("%7s %16s %12s ","100", n1.getCount_100(),n1.getTotal_100()); 
		System.out.println();
		System.out.println("---------------------------------------------- ");  
		System.out.print("\n");
    }
	
}
