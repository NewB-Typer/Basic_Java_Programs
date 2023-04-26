package ai.stha.youtube.Abstraction;
// abstract keyword is compulsory
public abstract class AbstractC {
 public abstract void method1();
 abstract void method2();
 
 //normal method inside of an abstract class can be defined, but abstract method cannot be defined.
 public void methodDef() {
	 System.out.println(" This method is defined already");
 }
}
//Abstract class is special type of class
// >> object cannot be instantiated in same file ,therefore child class is needed

