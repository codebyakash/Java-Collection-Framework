package collectionFramework;

import java.util.LinkedList;

public class removeFstLstElmt {
public static void main(String[] args) {
	LinkedList<Integer> lnk = new LinkedList<>();
	lnk.push(5);
	lnk.push(15);
	lnk.push(51);
	lnk.push(61);
	lnk.push(89);
	lnk.push(99);
	System.out.println(lnk);
   System.out.println("Removed First Value = "+lnk.remove(0)+" ✅");
   System.out.println("Removed Last Value = "+lnk.remove(lnk.size()-1)+" ✅");
}
}