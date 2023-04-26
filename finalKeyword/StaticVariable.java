package ai.stha.youtube.finalKeyword;

public class StaticVariable {
int a = 1;
int b = 2;
static int c = 4;
// static makes variable global
public static void main(String[] args) {
StaticVariable vari = new StaticVariable()	;

System.out.println(vari.a);
System.out.println(vari.b);
System.out.println(c);

//here value of c can be called directly without using the instance initiation
}
}
