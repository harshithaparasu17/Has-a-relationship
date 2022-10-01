package p4;

import java.util.Scanner;



public class AccountMain {
	
	Account allAccounts[]=new Account[1234567];
	
	int noOfClients=0;
	
	Scanner sc=new Scanner(System.in);
	
	Scanner scStr=new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		AccountMain app=new AccountMain();
  
  
  while(true)
  {
	  
	  System.out.println("\n\n\n==================Welcome to your Account========================");
	  System.out.println("\n\n====================Kindly choose the Option of your choice==============\n\n");
	  System.out.println("1. Submit Clients Details:");
	  System.out.println("2. Display All Clients Details: ");
	  System.out.println("3. Display Client Contact Details:");
	  System.out.println("4. Display Client KYC Document Details ");
	  System.out.println("5. Display Client Balance: ");
	  System.out.println("6. Perform Deposit Operations:");
	  System.out.println("7. Perform WithDrawal Operations: ");
	  System.out.println("8. Change Client Mobile Number: ");
	  System.out.println("9. Change Client EmailId: ");
	  System.out.println("0. Exit from the System: ");	  
	  
	 

		System.out.println("Enter the option of your choice(0-9) :- ");

		switch (app.sc.nextInt()) {

		case 1:
			app.submitUserDetails();
			break;
			
		case 2:
			app.printUserAllDetails();
			break;
			
		case 3:
			app.printUserContactDetails();
			break;
			
		case 4:
			app.printUserKYCDocumentDetails();
			break;
			
		case 5:
			app.printBalance();
			break;
			
		case 6:
			app.doDepositOperation();
			break;
			
		case 7:
			app.doWithdrawalOperation();
			break;
			
		case 8:
			app.changeMobileNumber();
			break;
			
		case 9:
			app.changeEmailId();
			break;
			

		default:
			System.out.println("Exit ");
			System.exit(0);
		}//end of switch

	}//end of while

}//end of main
	  
	  
	  
	  
	  public void submitUserDetails() 
	
	  {
		  
		  System.out.println(" Enter the Client Name:");
		  String userName=scStr.nextLine();
		  System.out.println("Please provide the Client Password: ");
		  String accPass=scStr.nextLine();
		  System.out.println("Enter the Client Account Number:");
		  long accNumber=sc.nextInt();
		  System.out.println("Enter the Initial Balance: \n");
		  int balance=sc.nextInt();
		  System.out.println(" Please provide the Pan Details: ");
		  String panNo=scStr.nextLine();
		  System.out.println(" Please provide the Document Type: ");
		  String docType=scStr.nextLine();
		  System.out.println("Please Provide your Aadhar Number:");
		  long aadharNo=sc.nextInt();
		  System.out.println("Enter the Document Number: ");
		  String docNo=scStr.nextLine();
		  System.out.println("Enter the Mobile Number: ");
		  long mobNo=sc.nextInt();
		  System.out.println("Enter the personal MailId: ");
		  String mailId=scStr.nextLine();
		  System.out.println("Enter the House Number: ");
		  String houseNo=scStr.nextLine();
		  System.out.println("Enter the Locality name: ");
		  String locName=scStr.nextLine();
		  System.out.println("Enter the City Name: ");
		  String cityName=scStr.nextLine();
		  System.out.println("Enter the Pincode: ");
		  long pincode=sc.nextInt();
		  System.out.println("Enter the State name: ");
		  String stateName=scStr.nextLine();
		  System.out.println("Enter the Country Name: ");
		  String countryName=scStr.nextLine();
		 
		  
		  
		  KYCVerification kycVerification=new KYCVerification() {
		};
		  ContactDetails contactDetails=new ContactDetails() {
		};
		  Account a=new Account();
		  a.setContactDetails(contactDetails);
		  
		  a.setKycdetails(kycVerification);
		  allAccounts[noOfClients++]=a;
		  System.out.println(" "+a);
		  System.out.println(" Created in List. ");
	  }
	  
	  public void doDepositOperation() {
	}
	  {
		  System.out.println(" Enter the deposit amount:");
int amount=sc.nextInt();
System.out.println("Enter the Account number: ");
int searchAccNumber=sc.nextInt();
Account account=null;
boolean foundAccount=false;

for(int i = 0;i< noOfClients ;i++)
	{
		Account a = allAccounts[i];
		if(a.getAccountNumber() == searchAccNumber)
		{
		    account = a;
			foundAccount= true;
		}
	}
		if(foundAccount)
		{
		account.setBalance(account.getBalance()+amount);
		}
	System.out.println("The amount has been deposited");
	System.out.println("Account Number=================Balance");
	System.out.println(account.getAccountNumber()+" ----------------------- "+account.getBalance());

	  }

	  public void doWithdrawalOperation() {
	}
	  {
		  System.out.println("=================Withdrawal Money=======================");
			
			System.out.println("Enter the Account Number:");
			int accNumber=sc.nextInt();
			System.out.println("Enter the Amount to withdraw from your Account:");
			int amt=sc.nextInt();
			System.out.println("Please confirm the entered Amount:\n"+amt);
			Account account=null;
			boolean foundAccount=false;
			
			for(int i = 0;i< noOfClients ;i++)
				{
					Account a = allAccounts[i];
					if(a.getAccountNumber() == accNumber)
					{
					    account = a;
						foundAccount= true;
					}
				}
					if(foundAccount)
					{
					account.setBalance(account.getBalance()-amt);
					}
				System.out.println("The amount has been deducted");
				System.out.println("Account Number==================Balance");
				System.out.println(account.getAccountNumber()+" -------------------- "+account.getBalance());
				
	  }
	  public void printUserAllDetails() 
	
	  {
		  Account a=new Account(); 
		  System.out.print("\n"+a.getAccountNumber()+"\t");
			System.out.print(a.getUserName()+"\t");
			System.out.print(a.getBalance()+"\t");
		
			System.out.println(a.getContactDetails()+"\n");
			System.out.println(a.getKycdetails());
			
			System.out.println("\n---------------------------------------------\n");

	  }
	  public void printUserContactDetails() 
	
	  {
		  System.out.println("Enter the account NUmber: ");
		  long searchAccNo=sc.nextInt();
		  Account a=new Account();
		  System.out.println(a.getContactDetails());
		  
		  
	  }
	  public void printUserKYCDocumentDetails() 
	
	  {
		  System.out.println("Enter the account NUmber: ");
		  long searchAccNo=sc.nextInt();
		  Account a=new Account();
		  System.out.println(a.getKycdetails());
		  
		  
	  }
	  public void printBalance() 
	
	  {
		  System.out.println("Enter the account NUmber: ");
		  long searchAccNo=sc.nextInt();
		  Account a=new Account();
		  System.out.println(a.getBalance());
		  
	  }
	  public void changeMobileNumber() 
	
	  {
		  System.out.println("Enter the account NUmber: ");
		  long searchAccNo=sc.nextInt();
		  Account a=new Account();
		  long previousMobNo=a.getContactDetails().getMobileNumber();
		  System.out.println(previousMobNo);
		  System.out.println("enter the new mobile number:");
		  long mobNo=sc.nextInt();
		  a.getContactDetails().setMobileNumber(mobNo);
		  
	  }
	  public void changeEmailId() {
	}
	  {
		  System.out.println("Enter the account NUmber: ");
		  long searchAccNo=sc.nextInt();
		  Account a=new Account();
		  String previousmailId =a.getContactDetails().getEmailId();
		  System.out.println(previousmailId);
		  System.out.println("enter the new Mail Id:");
		  String mailId=scStr.nextLine();
		  a.getContactDetails().setEmailId(mailId);
	  }
  



}


























































	


