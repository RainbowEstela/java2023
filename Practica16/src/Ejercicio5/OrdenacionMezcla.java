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
public class OrdenacionMezcla {
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
		
		q1.addAll(l1);
		q2.addAll(l2);
		
		while (q1.size() > 0 || q2.size() >0) {
			if (q1.size() == 0) {
				System.out.println("ok");
				mezcla.add(q2.poll());
			} else if (q2.size() == 0) {
				mezcla.add(q1.poll());
			} else {
				if (q1.peek() < q2.peek()) {
					mezcla.add(q1.poll());
				} else {
					mezcla.add(q2.poll());
				}
			}
		}
		
		
		
		return mezcla;
	}
	
}
