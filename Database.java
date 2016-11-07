import java.util.HashMap;
import java.util.Map.Entry;


public class Database {public static HashMap<String, Integer> movielist = new HashMap<String, Integer>();
static int kabaliTicketsNeeded = 0, kabaliTicketsReserved = 0;
static int dhoniTicketsNeeded = 0, dhoniTicketsReserved = 0;
static int shivajiTicketsNeeded = 0, shivajiTicketsReserved = 0;
static int kabalitickets = 100;
static int shivajitickets = 100;
static int dhonitickets = 100;

public void movieListCreation() {
// Movie list creation with initial ticket values
movielist.put("Kabali", kabalitickets);
movielist.put("shivaji", shivajitickets);
movielist.put("Dhoni", dhonitickets);

// For list display in the console
for (Entry<String, Integer> entry : movielist.entrySet()) {
System.out.println("Movie = " + entry.getKey() + "\t Tickets Available = " + entry.getValue());

}

}

public static void ticketsUpdation(long movieSerialNo, int ticketsRequired) {

if (movieSerialNo == 1) {
kabaliTicketsNeeded = kabaliTicketsNeeded + ticketsRequired;
kabaliTicketsReserved = kabaliTicketsNeeded;
if(kabaliTicketsNeeded <= 100 )
movielist.put("Kabali", kabalitickets - kabaliTicketsReserved);


}

if (movieSerialNo == 2) {
dhoniTicketsNeeded = dhoniTicketsNeeded + ticketsRequired;
dhoniTicketsReserved = dhoniTicketsNeeded;
if(dhoniTicketsNeeded <= 100 ) 
{movielist.put("Dhoni", dhonitickets - dhoniTicketsReserved);
}
}


if (movieSerialNo == 3) {
shivajiTicketsNeeded = shivajiTicketsNeeded + ticketsRequired;
shivajiTicketsReserved = shivajiTicketsNeeded;
if(shivajiTicketsNeeded <= 100 )
movielist.put("shivaji", shivajitickets - shivajiTicketsReserved);

}

for (Entry<String, Integer> entry : movielist.entrySet()) {
System.out.println("Movie = " + entry.getKey() + "\t Tickets Available = " + entry.getValue());

}

}


}