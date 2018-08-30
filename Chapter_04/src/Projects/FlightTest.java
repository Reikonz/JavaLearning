package Projects;

public class FlightTest {

	public static void main(String[] args) {
		
		Flight flt1 = new Flight("Delta", 123123, "Los Angeles", "Frankfort"); //initialize class
		
		//get information
		flt1.getAirline();
		flt1.getFlightnum();
		flt1.getOrigin();
		flt1.getDestination();
		
		//set information
		flt1.setAirline("Spirit");
		flt1.setFlightnum(214123);
		flt1.setOrigin("Detroit");
		flt1.setDestination("Savannah");
		System.out.println("");
		
		//get information
		flt1.getAirline();
		flt1.getFlightnum();
		flt1.getOrigin();
		flt1.getDestination();

	}

}
