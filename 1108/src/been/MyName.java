package been;

public class MyName
{
String objName;
public MyName(String name)
{
objName=name;
}
public void finalize() throws Throwable{
super.finalize();
System.out.println(objName+"이 소멸되었습니다.");
}

}
