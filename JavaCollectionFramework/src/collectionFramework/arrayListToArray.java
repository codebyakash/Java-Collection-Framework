package collectionFramework;
import java.util.ArrayList;
public class arrayListToArray {
public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
    System.out.println("ArrayList = "+al);
	int arr[] = new int[al.size()];
	for(int i=0; i<al.size();i++) {
		arr[i] = al.get(i);
	}
	System.out.print("Array = {");
	for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]);
		if(i!=arr.length-1) {
		System.out.print(", ");}
	}
	System.out.println("}");
}
}
