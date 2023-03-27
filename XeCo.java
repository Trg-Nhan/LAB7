abstract class Xe{
	abstract void brake();

}
class XeTheThao extends Xe {
	@Override
	public void brake() {
		System.out.println("brake");
	}
}
class XeLeoNui extends Xe{
	@Override
	public void brake() {
		System.out.println("brake");
	}
}
public class XeCo{
   public static void main(String[] args) {
	   
	   XeTheThao xtt=new XeTheThao();
       xtt.brake();
       XeLeoNui xln=new XeLeoNui();
       xln.brake();

    }
}