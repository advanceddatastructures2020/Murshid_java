import java.util.Scanner;
public class matrix{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int p,q,m,n,i,j;
int ar1[][]=new int[10][10],ar2[][]=new int[10][10],ar3[][]=new int[10][10];
System.out.println("enter size of row and column of first matrix : ");
p=sc.nextInt();
q=sc.nextInt();
System.out.println("enter size of row and column of second matrix : ");
m=sc.nextInt();
n=sc.nextInt();

System.out.println("enter first matrix : ");
for(i=0;i<p;i++)
for(j=0;j<q;j++)
ar1[i][j]=sc.nextInt();

System.out.println("enter second matrix : ");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
ar2[i][j]=sc.nextInt();

if(p==m && q==n){
for(i=0;i<m;i++)
for(j=0;j<n;j++)
ar3[i][j]=ar1[i][j]+ar2[i][j];
}

System.out.println("added matrix : ");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
System.out.print(ar3[i][j]+" ");
}
System.out.printf("%n");
}


}
}