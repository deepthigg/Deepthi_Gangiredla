public abstract class Console extends GameSystem
{
	public abstract String getController();
	
	public Console()
	{
		super();
	}
	public Console(String p)
	{
		super(p);
	}
	
	public String toString()
    {
        return "Platform: " +super.getPlatform( )+ 
               "\nSerial # " + super.getSerialNo()+
               "\nController: " + getController();
			   
	}
	
}