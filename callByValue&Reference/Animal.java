class Animal{
int dog;
public static void main(String [] args)
{
System.out.println("start main");
Animal obj = new Animal();
int a=10;
changeValue(a);
System.out.println(a);

}
public static void changeValue(int  c)
{
c=30;
}

}