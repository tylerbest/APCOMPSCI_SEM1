public class gpacalc
{
	public static void main(String[]args)
	
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Math:");
		String math = keyboard.nextInt();
		System.out.println("English:");
		int eng = keyboard.nextInt();
		System.out.println("Science:");
		int sci = keyboard.nextIn();
		System.out.println("Elective:");
		int ele = keyboard.nextInt();
		System.out.println("Social Science:");
		int ss = keyboard.nextInt();
		System.out.println("Elective:");
		int elec = keyboard.nextInt();
		System.out.println("History:");
		int hist = keyboard.nextInt();
		
		double gPoints = calcPoints(sci) + calcPoints(math) + calcPoints(eng) + calcPoints(ele) + calcPoints)(elec) + calcPoints(hist) + calcPoints(ss)
		double gpa = gPoints/7;
		System.out.println("Your GPA is" + gpa);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
	}

}

	