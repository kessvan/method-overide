class Trainer
{
String department="java";
int salary=10000;
String institute;
String name;
String pass;

public void training()
{
System.out.println(department+" "+salary);
}
public Trainer(String name,String pass,String institute)
{
this.name=name;
this.pass=pass;
this.institute=institute;
System.out.println(name+"  "+pass+"  "+institute);

}
}
