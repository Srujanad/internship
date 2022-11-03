import java.io.*;
import java.util.*;
interface rectangle
{
public void arearect(int width,int height);
}
interface triangle
{
public void areatri(double base,double height);
}
class mul implements rectangle,triangle
{
public void arearect(int width,int height)
{
int area=width*height;
System.out.println("area of rectangle is"+area);
}
public void areatri(double base,double height)
{
double area=0.5*base*height;
System.out.println("area of triangle"+area);
}
}
class mulin
{
public static void main(String []args) throws java.io.IOException
{
mul in=new mul();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int b,h;
double be,he;
System.out.println("enter width and height of rectangle");
b=Integer.parseInt(br.readLine());
h=Integer.parseInt(br.readLine());
in.arearect(b,h);
System.out.println("enter base and height");
be=Double.parseDouble(br.readLine());
he=Double.parseDouble(br.readLine());
in.areatri(be,he);
}
}