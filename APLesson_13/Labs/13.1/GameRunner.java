public class GameRunner
{
	public static void main(String[]args)
	{
		PlayStation ps4 = new PlayStation("ps4");
		System.out.println(ps4);
		
		XBox xbox360 = new XBox("xbox360");
		System.out.println(xbox360);
		
		PC Windows = new PC("Windows");
		System.out.println(Windows);
	}
}