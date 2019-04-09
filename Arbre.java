
public class Arbre {
	private int value;
	private Arbre filsG, filsD;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Arbre getFilsG() {
		return filsG;
	}
	public void setFilsG(Arbre filsG) {
		this.filsG = filsG;
	}
	public Arbre getFilsD() {
		return filsD;
	}
	public void setFilsD(Arbre filsD) {
		this.filsD = filsD;
	}

	public Arbre(Arbre g, int value, Arbre d) {
		this.filsG = g;
		this.filsD = d;
		this.value = value;
	}
	
	
	public static Arbre Inserer(int x, Arbre a)
	{
		System.out.println(a.getValue());
		if(a.getValue() == 0)
		{
			return new Arbre(null,x,null);
		}
		if(x <= a.getValue())
		{
			a = Inserer(x,a.filsG);
		}
		else
		{
			a = Inserer(x,a.filsD);
		}
		return a;
	}
}
