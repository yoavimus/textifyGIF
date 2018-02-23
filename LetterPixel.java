
public class LetterPixel implements Comparable
{
	private String Letter;
	
	private int Brightness;
	
	private boolean isBold;
	
	public LetterPixel(String Letter, int Brightness ,boolean isBold)
	{
		//should check if letter is of length=1 , -1<brightness<256
		this.Letter= Letter;
		this.Brightness = Brightness;
		this.isBold = isBold;
	}
	
	public int getBrightness()
	{
		return this.Brightness;
	}
	
	public String getLetter()
	{
		return this.Letter;
	}
	
	public boolean getBold()
	{
		return this.isBold;
	}
	
	public void setBold(boolean isBold)
	{
		this.isBold=isBold;
	}
	
	public void setLetter(String letter)
	{
		this.Letter=letter;
	}
	
	public void setBrightness(int brightness)
	{
		this.Brightness=0;
		
		if (brightness<256 && brightness>-1)
		{
		this.Brightness=brightness;
		}
		
	}
	
	@Override
	public int compareTo (Object compared)  // x.compareTo(y)==0 does not mean x equals y
	{
		int tocompare = ((LetterPixel)compared).getBrightness();
		return this.Brightness - tocompare;
	}

	
	public String ToString()
	{	
		
		String bold = this.isBold ? "bold" : "regular";
		
		return this.Letter+bold+"-   "+String.valueOf(this.Brightness);
	}

}
