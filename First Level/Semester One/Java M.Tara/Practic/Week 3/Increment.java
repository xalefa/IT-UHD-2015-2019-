class Increment{
public static void main (String args[])
{
int i=2;
int sum= 10*(++i);
System.out.println(sum);
int j=2;
sum= 10*(j++);
System.out.println(sum);

System.out.println(j);
sum=sum+j;
System.out.println(sum);

/*int j=4;
++j;

System.out.println(j);*/
}
}
