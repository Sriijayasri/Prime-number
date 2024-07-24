import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner pc = new Scanner(System.in);
	    int a =pc.nextInt();
	    int count=0;
	    for(int i=2;i<=a/2;i++){
	    if(a%i==0)
	    count++;}
	    if(count==0)
		System.out.println("YES");
		else
		System.out.print("NO");
}
}