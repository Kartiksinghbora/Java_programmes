//cvv 123
//password 1234

import java.util.Scanner;
import java.lang.Thread;

class ATM
{
private int pin;
private int bal_left;
public ATM()				//constructor
{
pin=1234;
bal_left=100_000;
}
int p,amt,ch,r,at,cb;
Scanner s=new Scanner(System.in);

public void cashWithdrawl()    		//method define
{
System.out.println("Enter 4 digit pin");
p=s.nextInt();
if(p!=pin)
{
return;
}
else
{
System.out.println("1. Saving Account\t\t2. Current Account");
ch=s.nextInt();
switch(ch)
{
case 1 : 	System.out.println("Enter the amount");     	//saving account
		amt=s.nextInt();
		if(amt>bal_left)
		{
			System.out.println("You don't have enough balance");
			System.out.println("Want to check Balance : press : y for Yes and n for No");
			cb=s.next().charAt(0);
			if(cb=='n')
			{	
				return;
			}
			else if(cb=='y')
			{
				System.out.println("Balance is : "+bal_left);
			}
			else
			{		
				System.out.println("wrong choice");
			}
		}

		else
		{
			System.out.println("Printed Receipt : press : y for Yes and n for No");
			r=s.next().charAt(0);
			if(r=='n')
			{
				System.out.println("Collect your cash");
			}
			else if(r=='y')
			{
				System.out.println("Collect your cash");
				System.out.println("take your receipt");
			}
			else
			System.out.println("Wrong choice");
		} 		// close else
			break;

case 2 : 	System.out.println("Enter the amount");     	//for current account
		amt=s.nextInt();
		System.out.println("Printed Receipt : press : y for Yes and n for No");
		r=s.next().charAt(0);
		if(r=='n')
		{
			System.out.println("Collect your cash");
		}
		else if(r=='y')
		{
			System.out.println("Collect your cash");
			System.out.println("take your receipt");
		}
		else
			System.out.println("Wrong choice");
	
		break;
	}			//close switch

//System.out.println("Another Transaction : press : y for Yes and n for No");
//at=s.nextInt();


} //close else
} //close method cashwithdrawl



public void balanceEnquiry()	//method define
{   
	System.out.println("Enter 4 digit pin");
	p=s.nextInt();
	if(p!=pin)
	{
		return;
	}
	else
	{
		System.out.println(" Bank name : Punjab National Bank\n Name : Mr/Mrs. xyz\n Available Balance : "+bal_left);
	}
}  //method close balanceEnquiry


public void  miniStatement()
{
System.out.println("1. Saving Account\t\t2. Current Account");
ch=s.nextInt();
switch(ch)
{
case 1 :	System.out.println("Enter 4 digit pin");
		p=s.nextInt();
		if(p!=pin)	
		{
			return;
		}
		else
		{
			System.out.println("Would you like a receipt : press : y for Yes and n for No");
			r=s.next().charAt(0);
			if(r=='n')
			{
				System.out.println(" Bank name : Punjab National Bank\n Name : Mr/Mrs. xyz\n Last Transaction : 2023/02/25\n Available Balance : "+bal_left);
			}
			else if(r=='y')
			{
				System.out.println("Take your Receipt");
			}
			else
			{
				System.out.println("Wrong choice");
				return;
			}
		}
		break;

case 2 :	System.out.println("Enter 4 digit pin");
		p=s.nextInt();
		if(p!=pin)	
		{
			return;
		}
		else
		{
			System.out.println("Would you like a receipt : press : y for Yes and n for No");
			r=s.next().charAt(0);
			if(r=='n')
			{
				System.out.println(" Bank name : Punjab National Bank\n Name : Mr/Mrs. xyz\n Last Transaction : 2023/02/25\n Last Transaction Amount : 850_000\n Available Balance : "+bal_left);
			}
			else if(r=='y')
			{
				System.out.println("Take your Receipt");
			}
			else
			{
				System.out.println("Wrong choice");
				return;
			}
		}
}  //close switch
}  // closing of miniStatement


public void createPin()
{
String otpnum,otp,p1,p2,mb;
System.out.println("Enter your 10 digit mobile number");
mb=s.next();
otp=mb.substring(mb.length()-6);

System.out.println("OTP sent in your mobile number\nEnter OTP");
otpnum=s.next();

if(otpnum.equals(otp))
{

	System.out.println("Enter a new PIN");
	p1=s.next();
	System.out.println("Re-Enter a new PIN");
	p2=s.next();

	if(p1.equals(p2))
	{
		System.out.println("Created Successfully");
	}
	else 
	{
		System.out.println("PIN not match!");
		return;
	}
}

else
{
	System.out.println("OTP not match!");
	return;
}

}  //closing of createPin


public void billPayments()  //method define
{
int ca,am;
String pn;
System.out.println("\n1. Electricity Bill\n2. Water Bill\n3. Mobile Bill");
System.out.println("Enter your choice");
ch=s.nextInt();

	switch(ch)
	{
		case 1 :  	System.out.println("\t===TATA POWER-DDL===");
				System.out.println("Enter CA number");
				ca=s.nextInt();
				System.out.println("\nCA number : "+ca);
				System.out.println("Billed Units : 350");
				System.out.println("Invoice number : 98765432");
				System.out.println("Issue Date : 11/05/2023");
				System.out.println("Due Date : 25/05/2023");
				System.out.println("No. Of Days : 33");
				System.out.println("Customer Name : mr/mrs. xyz");
				System.out.println("Pay Amount : 450.00");

				System.out.println("Enter 4 digit pin");
				p=s.nextInt();
				if(p!=pin)	
				{
					return;
				}
				else
				{
					System.out.println("Enter amount");
					am=s.nextInt();
					System.out.println("Successfully Done\n");
					System.out.println("If in any case, you mistakenly entered a wrong amount. then go to the bank immediately");
				}
		break;


		case 2 : 	System.out.println("\t===DELHI JAL BOARD==="); 
				System.out.println("Enter CA number");
				ca=s.nextInt();
				System.out.println("\nCA number : "+ca);
				System.out.println("Billed Units : 290");
				System.out.println("Invoice number : 98765432");
				System.out.println("Issue Date : 11/05/2023");
				System.out.println("Due Date : 22/05/2023");
				System.out.println("No. Of Days : 30");
				System.out.println("Customer Name : mr/mrs. xyz");
				System.out.println("Pay Amount : 200.00");

				System.out.println("Enter 4 digit pin");
				p=s.nextInt();
				if(p!=pin)
				{
					return;
				}	
				else
				{
					System.out.println("Enter amount");
					am=s.nextInt();
					System.out.println("Successfully Done\n");
					System.out.println("If in any case, you mistakenly entered a wrong amount. then go to the bank immediately");
				}
		break;


		case 3 : 	System.out.println("\t===MOBILE POSTPAID BILL==="); 
				System.out.println("Enter Phone number");
				pn=s.next();
				System.out.println("\nPhone number : "+pn);
				System.out.println("Invoice number : 98765432");
				System.out.println("Issue Date : 11/05/2023");
				System.out.println("Due Date : 22/05/2023");
				System.out.println("No. Of Days : 30");
				System.out.println("Customer Name : mr/mrs. xyz");
				System.out.println("Pay Amount : 580.00");

				System.out.println("Enter 4 digit pin");
				p=s.nextInt();
				if(p!=pin)
				{
					return;
				}
				else
				{
					System.out.println("Enter amount");
					am=s.nextInt();
					System.out.println("Successfully Done\n");
					System.out.println("If in any case, you mistakenly entered a wrong amount. then go to the bank immediately");
				}
		break;

	}// close switch
}// closing of billPayments


public void transfer()
{
String bb,an;
System.out.println("Enter the Beneficiary Bank ");
bb=s.nextLine();
System.out.println("Enter the Beneficiary Account Number ");
an=s.next();
System.out.println("Enter 4 digit pin");
p=s.nextInt();
	if(p!=pin)
		return;
else
{
System.out.println("Enter the amount ");
amt=s.nextInt();
if(amt>bal_left)
		{
			System.out.println("You don't have enough balance");
			System.out.println("Want to check Balance : press : y for Yes and n for No");
			cb=s.next().charAt(0);
			if(cb=='n')
			{	
				return;
			}
			else if(cb=='y')
			{
				System.out.println("Balance is : "+bal_left);
			}
			else
			{		
				System.out.println("wrong choice");
			}
		}
	
		
	else
		System.out.println("Successfully Transferd\n\nIf in any case, a problem occurs. Go to the bank immediately");
}//else close

}  //closing transfer method
	
}//close of class


class ATMtransaction{
protected int cvv;
public ATMtransaction()   	//constructor
{
	cvv=123;
}
Scanner sc=new Scanner(System.in);
int ch,lang,cv;
ATM z = new ATM();		//ATM class object declare  
public void cvvChecking()  	//method define
{
	System.out.println("Enter your cvv number");
	cv=sc.nextInt();
	if(cv!=cvv)
		return;

	else
	{
		System.out.println("Select a Language :  1. English\t\t2. Hindi");
		System.out.println("Enter language");
		lang=sc.nextInt();

		switch(lang)
		{
			case 1 : 	System.out.println("\n1. Cash Withdrawl\n2. Balance Enquiry\n3. Mini Statement\n4. Create A Pin\n5. Bill Payments\n6. Transfer");
					System.out.println("Enter choice");
					ch=sc.nextInt();

					switch(ch)
					{
						case 1 : z.cashWithdrawl();
								break;
				
						case 2 : z.balanceEnquiry();
								break;
				
						case 3 : z.miniStatement();
								break;
				
						case 4 : z.createPin();
								break;

						case 5 : z.billPayments();
								break;

						case 6 : z.transfer();
								break;

					}
			break;

			case 2 : 	System.out.println("English wants to know your location..!");
					/*System.out.println("\n1. Cash Withdrawl\n2. Balance Enquiry\n3. Mini Statement\n4. Create A Pin\n5. Bill Payments\n6. Transfer");
					System.out.println("Enter choice");
					ch=sc.nextInt();

					switch(ch)
					{
						case 1 : z.cashWithdrawl();
								break;
				
						case 2 : z.balanceEnquiry();
								break;
				
						case 3 : z.miniStatement();
								break;
				
						case 4 : z.createPin();
								break;

						case 5 : z.billPayments();
								break;

						case 6 : z.transfer();
								break;

					}*/
			break;
		}	// closing of lang switch

	} //close else 
} //closing of method cvvChecking


	public static void main(String ar[])
	{
		System.out.println("\n\t\t\t=====BANK=====\n");
		ATMtransaction at=new ATMtransaction();
		at.cvvChecking();
	} //close main


} //close class ATM






