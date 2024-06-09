package collectionFramework;
import  java.util.LinkedList;
public class ConvertCase {
public static void main(String[] args) {
	LinkedList<String> str= new LinkedList<>();
	str.add("apple");
	str.add("banana");
	str.add("cherry");
	str.add("dates");
	str.add("guava");
	str.add("papaya");
	str.add("grapes");
	str.add("mango");
	str.add("orange");
	str.add("pineapple");
	for(int i=0;i<str.size();i++) {
		String temp= str.get(i).toUpperCase();
		System.out.println(temp);
	}
}
}
