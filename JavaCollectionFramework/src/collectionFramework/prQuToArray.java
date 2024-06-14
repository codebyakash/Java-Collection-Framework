package collectionFramework;

import java.util.PriorityQueue;

public class prQuToArray {
public static void main(String[] args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.add(19);
	pq.add(21);
	pq.add(31);
	pq.add(38);
	pq.add(45);
	pq.add(56);
	pq.add(65);
	pq.add(71);
	int arr[] = new int[pq.size()];
	PriorityQueue<Integer> temp= new PriorityQueue<>(pq);
	int index = 0;
	while(index<pq.size()) {
		arr[index]= temp.poll();
		index++;
	}
	 System.out.println("Elements in the array:");
     for (int element : arr) {
         System.out.print(element + " ");
}
}
}