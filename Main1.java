import java.util.*;
public class Main1
{
    public static int Solve(int n){
        int status=0;
        if(n<0){
            status=1;
            n=(-1)*n;
        }
        String str="";
        while(n>0){
            int rem=n%3;
            str=rem+str;
            n=n/3;
        }
        int out=Integer.parseInt(str);
        if(status==1){
            out=(-1)*out;
        }
        return out;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		System.out.println(Solve(n));
	}
}
