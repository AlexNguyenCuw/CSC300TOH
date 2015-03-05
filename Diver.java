
public class Diver 
{
	public static void main(String[] args) 
	{
		Tower t = new Tower();
		t.addDisc(new Disc(2));
		t.addDisc(new Disc(1));
		t.addDisc(new Disc(0));
		t.display();
		System.out.println("***********");
		t.removeDisc();
		t.display();
		//System.out.println(t.removeDisc());
		//System.out.println(t.removeDisc());
	}
}
