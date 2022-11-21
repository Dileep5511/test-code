import java.util.*;
public class Main2
{
    public static int countLastChar(String str1,String str2){
        int count=0;
        char ch=str2.charAt(str2.length()-1);
        int i=0;
        while(i<str1.length()){
            if(str1.charAt(i)==ch){
                count++;
            }
            i++;
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
		System.out.println(countLastChar(str1,str2));
	}
}
