import java.io.*;
class Serialization implements Serializable
{
private String name;
private String email;
private int age;
private String address;
Serialization(String name,String email,int age,String address)
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
class Serial 
{
public static void main(String []args)
{
try{
Serialization  s=new Serialization("fahar","fahar@gmail",24,"kolhapur");
FileOutputStream f=new FileOutputStream("obj.txt");
ObjectOutputStream oos=new ObjectOutputStream(f);
oos.writeObject(s);
oos.close();
oos.close();
System.out.println("object is started");
}
catch(IOException e)
{
System.out.println(e.getMessage());
e.printStackTrace();
}

}

}