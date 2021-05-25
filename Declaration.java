class Declaration{
class Dog{
String name;
int age;
public Dog(String name,int age)
{
this.name=name;
this.age=age;
}
public void getName()
{
	System.out.println(name);
}
public void getAge()
{
	System.out.println(age);
}

}
public static void main(String[] args)
{
	Dog tuffy=new Dog("tuffy",5);
	tuffy.getName();
	tuffy.getAge();
}

}