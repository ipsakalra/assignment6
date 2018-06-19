class Override{
String breed;
String colour;
void speak()
{
System.out.println("moo");
}
public static void main(String[] args){
Override objectA=new Override();
Sheep objectB=new Sheep();
Giraffs objectC=new Giraffs();
 
objectA.speak();
objectB.speak();
objectC.speak();
}
}
class Sheep extends Override{
String breed;
String colour;
void speak()
{
System.out.println("baa");
}
}
class Giraffs extends Override{
String breed;
String colour;
void speak()
{
System.out.println("bleat");
}
}

