/*
 * The Wizard adapter class implements warrior class
 * it allows classes that inherit from the wizard class
 * to be able to be called and act as though they are warrior objects
 *
 *
 *
 * @author Luis Canales
 * @date 10/23/2019
 *
 */

package csce247.assignments.adaptor;

//Implements the Warrior interface
public class WizardAdapter implements Warrior {

	private Wizard wizard;

	/* Parameterized Constructor
	 * @param Wizard 
	 */
	public WizardAdapter(Wizard wizard) {
		this.wizard = wizard;

	}

	/*
	 * @param none
	 */
	public void attack() {
		wizard.performSpell();

	}

	/*
	 * @param none
	 */
	public void defend() {
		wizard.heal();

	}



}
