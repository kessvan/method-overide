class SQLTrainer extends Trainer
{
public SQLTrainer(int age,String name,String pass,String institute)
{
super(name,pass,institute);

}

public static void main(String []args)
{

SQLTrainer ram= new SQLTrainer(1,"trainer kumar","cse","payilagam");
ram.training();
}
}
