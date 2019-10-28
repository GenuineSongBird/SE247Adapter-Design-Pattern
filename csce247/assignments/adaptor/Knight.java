/**
 * Knight class which inherits Warrior. Thus, must have attack() and defend()
 * @author Nick Bautista
 * @date 10/17/19
 *
 */
package csce247.assignments.adaptor;

public class Knight implements Warrior {
	/**
	 * Prints attacking line
	 */
	public void attack() {
		System.out.println("Attacking: I'm bringing you down!");
	}
	/**
	 * Prints defending line
	 */
	public void defend() {
		System.out.println("Defending: We must protect the castle");
	}
}
