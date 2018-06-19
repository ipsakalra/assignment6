class Overload{

void printf()
{
System.out.println("null");
}


void printf(int s)
{
System.out.println(s);
}


void printf(float s)
{
System.out.println(s);
}

}


public class Overloading{
public static void main(String[] args){
Overload c=new Overload();
c.printf();
c.printf(5);
c.printf(9.7f);
}
}

