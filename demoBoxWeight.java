class box
{
double width,height,depth;
box(box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}

box(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}

box()
{
width=-1;
height=-1;
depth=-1;
}

box(double len)
{
width=height=depth=len;
}

double volume()
{
return width*height*depth;
}
}

class boxWeight extends box
{
double weight;
boxWeight(double w,double h,double d,double m)
{
width=w;
height=h;
depth=d;
weight=m;
}
}
class demoBoxWeight
{
public static void main(String args[])
{
boxWeight mybox1= new boxWeight(10,20,15,34.3);
boxWeight mybox2= new boxWeight(2,3,4,0.076);
double vol;
vol=mybox1.volume();
System.out.println("vol of mybox1 =  "+vol);
  
System.out.println("wt of mybox1 = "+mybox1.weight);

vol=mybox2.volume();
  
System.out.println("vol of mybox2 = "+vol);
  
System.out.println("wt of mybox2 = "+mybox2.weight);
}
}























