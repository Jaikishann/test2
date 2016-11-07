import java.util.Scanner;


public class Controller {public void userInterface() {
//@SuppressWarnings("resource")

Scanner scan = new Scanner(System.in);
int ticketsRequired=0;
long movieSerialNo=0;
int h=5;
int y=99;
try{
System.out.println("Enter the movie serialno you want to book");
movieSerialNo = scan.nextInt();
}
catch(Exception e){
System.out.println("please enter proper serialno.");
}
if (movieSerialNo == 1 || movieSerialNo == 2 || movieSerialNo == 3) {

System.out.println("Enter your Name ");
String name = scan.next();
int f = 0;
do {

if (f >= 1)
System.out.println("check the availablity ");

try{
System.out.println("Enter No. tickets you want");

ticketsRequired = scan.nextInt();
}
catch(Exception e){
System.out.println("pls enter proper tickets");
userInterface();
}
++f;
} while (ticketsRequired >= (100 - Database.kabaliTicketsReserved) && ticketsRequired >= (100 - Database.dhoniTicketsReserved) && ticketsRequired >= (100 - Database.shivajiTicketsReserved));
// if()
if (ticketsRequired <= (100 - Database.kabaliTicketsReserved) || ticketsRequired <= (100 - Database.dhoniTicketsReserved) || ticketsRequired <= (100 - Database.shivajiTicketsReserved))
//if((Database.sum <= n2)||(Database.sum1 <= n2)||(Database.sum2 <= n2))
{Database.ticketsUpdation(movieSerialNo, ticketsRequired);

}
if((Database.kabaliTicketsNeeded <= 100) && (Database.dhoniTicketsNeeded <= 100 )&& (Database.shivajiTicketsNeeded <= 100 ) ){
System.out
.println("Hi "+name+"\n***************************\n* YOUR TICKETS ARE BOOKED *\n***************************\n");
}else
System.out.println("Pls enter the valid tickets");

// String value = (String) Database.movielist.get(key)

}

//	//else {
//	System.out.println("please enter proper value");
//	userInterface();
//	}

System.out.println("You like to continue yes/no");
String s = scan.next();

if (s.equals("yes")) {
userInterface();
} else {
System.out.println("Thanks for Booking :)");
}
}

}