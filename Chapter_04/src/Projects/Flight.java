package Projects;

public class Flight {
	
	private String  airline;
	private String  origin;
	private String  destination;
	private long  flightNum;

	public Flight (String airline_i, long flightNum_i, String origin_i, String destination_i) //CONSTRUCTOR
	   {
		airline = airline_i;
		flightNum = flightNum_i; 
		origin = origin_i;
		destination = destination_i;
	   }
	
// GET FUNCTIONS
	public void getAirline ()
	   {
	      System.out.println(airline);
	   }
	public void getFlightnum ()
	   {
	      System.out.println(flightNum);
	   }
	public void getOrigin ()
	   {
	      System.out.println(origin);
	   }
	public void getDestination ()
	   {
	      System.out.println(destination);
	   }
	
//	SET FUNCTIONS
	public void setAirline (String airline_i)
	   {
		airline = airline_i;
	   }
	public void setFlightnum (long flightNum_i)
	   {
		flightNum = flightNum_i; 
	   }
	public void setOrigin (String origin_i)
	   {
		origin = origin_i;
	   }
	public void setDestination (String destination_i)
	   {
		destination = destination_i;
	   }
	

}
