package p;
abstract class A{
	public void m() {
		f();
	}
	public abstract void f();
}
class B extends A{
	///@Override
	public void f(){
	}
}