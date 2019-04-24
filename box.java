class Box
{
    private int length,breadth,height;
    public void setDimension(int l,int b,int h)
    {
        length=l;
        breadth=b;
         height=h;
    }
    public void getDimension()
    {
       System.out.println("length is"+length);
       System.out.println("breadth is"+breadth);
        System.out.println("height is"+height);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Box b1=new Box();
	    b1.setDimension(5,6,7);
	    b1.getDimension();
	    
	    
	}
}
