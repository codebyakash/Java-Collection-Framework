package collectionFramework;

import java.util.LinkedList;

public class swap {
	public static void main(String[] args) {
		LinkedList<Integer> lnk = new LinkedList<>();
		int a19 = 0;
		int b55 = 0;
		lnk.add(5);
		lnk.add(19);
		lnk.add(27);
		lnk.add(89);
		lnk.add(55);
		lnk.add(99);
		System.out.println("I swapped this two numbers 19 and 55");
		System.out.println("Before Swaping: "+lnk);
//	i want swap this two number 55 and 19
		for (int i = 0; i < lnk.size(); i++) {
			if ((lnk.get(i) == 55) || lnk.get(i) == 19) {
				if (lnk.get(i) == 19) {
					a19 = i;
				} else {
					b55 = i;
				}
			}
		}
		int temp= lnk.get(a19);
		lnk.set(a19, lnk.get(b55));
		lnk.set(b55, temp);
		System.out.println("After Swaping: "+lnk);
		
	}
}