/**
 * 
 */
package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author usuario1daw
 *
 */
public class OrdenacionMezcla<Integer> {
	Queue<Integer> q1;
	Queue<Integer> q2;
	
	/**
	 * Constructor
	 */
	public OrdenacionMezcla() {
		super();
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	
	public ArrayList<Integer> ordenacion(List<Integer> l1, List<Integer> l2) {
		ArrayList<Integer> mezcla = new ArrayList<>();
		int int1 =0;
		int int2 =0;
		
		
		q1.addAll(l1);
		q2.addAll(l2);
		
		while (q1.size() > 0 || q2.size() >0) {
			if (q1.size() == 0) {
				System.out.println("ok");
				mezcla.add(q2.poll());
			} else if (q2.size() == 0) {
				mezcla.add(q1.poll());
			} else {
				int1 = (int) q1.peek();
				int2 = (int) q2.peek();
				if (int1 < int2) {
					mezcla.add(q1.poll());
				} else {
					mezcla.add(q2.poll());
				}
			}
		}
		
		
		
		return mezcla;
	}
	
}
