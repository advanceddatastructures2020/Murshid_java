public class stringMan{
public static void main(String args[]){
String greeting= "hello";
System.out.println(greeting);
String txt2 = "lshbdflHWDLFwhfuhwEUSkCBKHBFHBWJ";
System.out.println("Length of the string is : "+txt2.length());
String txt="hello world";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
String txt1="please locate 'locate' ";
System.out.println(txt1.indexOf("locate"));
String firstName="john";
String lastName="doe";
System.out.println(firstName + " "+ lastName);
String firstNamee = "jon";
String lastNamee= "doe";
System.out.println(firstNamee.concat(lastNamee));
String x="10";
String y="20";
String z=x+y;
System.out.println(z);

String a = "RockStar";
System.out.println(a.charAt(5));
System.out.println(a.compareTo("rockstar"));
System.out.println(a.compareToIgnoreCase("ROCKSTAR"));
System.out.println(a.replace("Rock","New"));
}
}