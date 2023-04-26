package ai.stha.youtube.Abstraction;
//multiple inheritance using interface
public class Frankenstein implements One,Two,Three{
public int Height() {
int h = 7;
System.out.println(h);
return h;
}
public void Structure() {	
	System.out.println("HUmongous");
}

public void Strength() {
	System.out.println("Very POwerful");
}


public static void main(String[] args) {
	Frankenstein fk = new Frankenstein();
	fk.Height();
	fk.Strength();
	fk.Structure();
	
}
}
