/*
 * The Wizard interface ensures all classes that use this interface must have the 
 * methods performSpell and heal.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/21/2019
 * 	
 */
package csce247.assignments.adaptor;

public interface Wizard {
	public void performSpell();
	public void heal();
}
