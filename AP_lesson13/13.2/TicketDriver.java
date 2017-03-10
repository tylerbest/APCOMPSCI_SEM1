public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket WA = new walkup();
		Ticket AD = new Advance(20);
		StudentAdvance ST = new StudentAdvance(30);
		System.out.println(WA + "\n");
		System.out.println(AD + "\n");
		System.out.println(ST + "\n");
	}
}
