class ActorSivakumar extends Actor
{

static String address="coinbatore";
int age=10;
String name="ggg";

public String speak(String language)
{

System.out.println("speaking "+language);
return language;

}

public ActorSivakumar(int age,String name)
{
  this.age=age;
  this.name=name;
 // System.out.println(age+"  "+name);

}
public static void main(String []args)
{
   ActorSivakumar ac = new ActorSivakumar(65, "Audi car");
  // Actor ac = new ActorSivakumar(65, "Audi car");
   System.out.println(ac.makeUpRequired+" "+ac.address);
 System.out.println(ac.age+"  "+ac.name);
//ac.speak("Tamil");
   ac.act();
   ac.dance();
   ac.sing();

/*as.speaking();
as.act();
as.dance();
as.sing();*/
System.out.println(ActorSivakumar.address);
}
}
