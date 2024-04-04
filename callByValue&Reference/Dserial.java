import java.io.*;
class DeSerialization implements Serializable
{
private String name;
private String email;
private int age;
private String address;
DeSerialization(String name,String email,int age,String address)
{
this.name=name;
this.email=email;
this.age=age;
this.address=address;
}
public String getname()
{
return name;
}
public String getemail()
{
return email;
}
public int getage()
{
return age;
}
public String getaddress()
{
return address;
}
public void setname(String name)
{
this.name=name;
}
public void setemail(String email)
{
this.email=email;
}
public void setage(int age)
{
this.age=age;
}
public void setaddress(String address)
{
this.address=address;
}
}
public class Dserial
{
public static void main(String []args)
{
try
{
FileInputStream i= new FileInputStream("obj.txt");
ObjectInputStream o=new ObjectInputStream(i);
Serialization stu=(Serialization)o.readObject();
System.out.println(stu.getname());
System.out.println(stu.getage());
System.out.println(stu.getemail());
System.out.println(stu.getaddress());
}
catch (IOException  e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
catch (ClassNotFoundException  e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}
}
}
