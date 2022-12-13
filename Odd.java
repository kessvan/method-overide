import java.util.Scanner;
class Odd{
public static void main(String[] args)
{
int i,no,a=0,b=1,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
no=sc.nextInt();
for(i=0;i<=no;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
