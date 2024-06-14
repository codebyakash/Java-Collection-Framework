package collectionFramework;
import java.util.Stack;
public class maxEltInStact {
public static void main(String[] args) {
Stack<Integer> st= new Stack<>();
st.push(25);
st.push(15);
st.push(30);
st.push(51);
st.push(41);
System.out.println(st);
for(int i=0;i<st.size();i++) {
	for(int j=0;j<st.size()-1;j++) {
		int temp;
		if(st.get(j)>st.get(j+1)) {
			temp=st.get(j);
			st.set(j, st.get(j+1));
			st.set(j+1, temp);
		}
	}
}
System.out.println(st);
System.out.println("Maximum value = "+ st.pop());
}
}
