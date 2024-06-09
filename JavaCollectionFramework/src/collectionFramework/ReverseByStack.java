package collectionFramework;
import java.util.ArrayList;
import java.util.Stack;
public class ReverseByStack {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	ArrayList<String> al1=new ArrayList<>();
	Stack<Character> st= new Stack<>();
	al.add("Akash");
	al.add("Vikas saini");
	al.add("Manish singhaniya");
	al.add("Sohit jaiswal");
	for(String str:al) {
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		String temp="";
		for(int i=0;i<str.length();i++) {
			temp+=st.pop();
		}
		al1.add(temp);
	}
	System.out.println("Original String: "+al);
	System.out.println("Reverse String: "+al1);
}
}
