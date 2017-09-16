abstract class Shape{
	abstract void noofsides();
}
class Triangle extends Shape{
	void noofsides(int a){
		System.out.println(" In triangle,The no. of sides"+ a);
	}
}
class Hexagon extends Shape
{
   void noofsides(int a){
		System.out.println(" In Hexagon,The no. of sides"+ a);
	}
}
class Trapezoid extends Shape{
void noofsides(int a){
	System.out.println("In Trapezoid,The no. of sides"+ a);
}
}
public class demo {
	public static void main(String args[])
	{
		Triangle t= new Triangle();
		t.noofsides(3);
		Hexagon h = new Hexagon();
		h.noofsides(6);
		Trapezoid tr= new Trapezoid();
		tr.noofsides(4);
		}

}
