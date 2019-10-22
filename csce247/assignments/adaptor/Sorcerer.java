/*
 * The sorcerer class implements the wizard interface in the adaptor design pattern
 * This class can output two text-bases messages
 * to simulate a character-interaction.
 * 
 * @author	Tyson J. Medlin		
 * @date 10/21/2019
 * 	
 */
package csce247.assignments.adaptor;
//Implements the Wizard interface
public class Sorcerer implements Wizard {
	/* Outputs text to indicate an imaginary action.
	 * @param none
	 */
	public void performSpell() {
		System.out.println("Casting Spell: I put a spell on you, and now you're gone");
	}
	/* Outputs text to indicate an imaginary action.
	 * @param none
	 */
	public void heal() {
		System.out.println("Healing: You should all feel healthy again");
	}
}