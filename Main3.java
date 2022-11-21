import java.util.*;
public class Main3
{
    public static int nthSeries(ArrayList<Integer> arr,int n){
       String str="";
       while(n>0){
           int rem=n%7;
           str=arr.get(rem)+str;
           n=n/7;
       }
       return Integer.parseInt(str);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> arr=new ArrayList<>();
	    arr.add(0);
	    arr.add(1);
	    arr.add(2);
	    arr.add(5);
	    arr.add(6);
	    arr.add(8);
	    arr.add(9);
	    int n=sc.nextInt();
	    System.out.println(nthSeries(arr,n));
	    
	}
}
