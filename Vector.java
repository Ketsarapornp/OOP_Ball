//â¨·ÂìÊÃéÒ§ÅÙ¡ºÍÅ (2)áºº Constructor 
//ºÍÅÇÔè§
public class Vector
{
double x,y; // *-*+*/***
	
	public Vector() //constructor...(constructor no any parameter input --> default constructor...initial value = 0) /*/*/*
	{
		x = 0;
		y = 0;
	}
	/*public Vector(double xx,double yy) //constructor...(constructor have parameter input) x != xx , y!= yy // First Way
	{
		x = xx;
		y = yy;
	}
	*/
	public Vector(double x,double y) //constructor...(constructor have parameter input) // Second Way do not want xx , yy /-/-/-
	{
		this.x = x; //*+*
		this.y = y; // this == object just be newed from class // this.y == y of object just be newed from class *-*+*/***
	} 
	public Vector add(Vector v) // this method can be called to anywhere since use public
	{
		Vector result = new Vector(); // new == build this object in memory
		result.x = this.x + v.x;//result.x = x + v.x;
		result.y = this.y + v.y;//result.y = y + v.y; // **+**
		return result;
	}
	
	public Vector sub(Vector v) // this method can be called to anywhere since use public
	{
		Vector result = new Vector(); // new == build this object in memory
		result.x = this.x - v.x;//result.x = x - v.x;
		result.y = this.y - v.y;//result.y = y - v.y; 
		return result;
	}
	
	public Vector mul(double m) // this method can be called to anywhere since use public
	{
		Vector result = new Vector(); // new == build this object in memory
		result.x = this.x*m;//result.x = x*m;
		result.y = this.y*m;//result.y = y*m; 
		return result;
	}
	
	public double dot(Vector v) // this method can be called to anywhere since use public
	{
		double result = this.x*v.x + this.y*v.y;
		return result;
	}
	
	public double size() // this method can be called to anywhere since use public
	{
		double result = Math.sqrt(x*x+y*y);
		return result;
	}
	
	public Vector unit() // this method can be called to anywhere since use public
	{
		double s = size();
		return new Vector(x/s,y/s); // Vector result = new Vector(x/s,y/s); return result;
	}
	
	// Use String Manual Pattern
	public String toString() // Method toString()
	{
		return "("+x+","+y+")";
	}
}
