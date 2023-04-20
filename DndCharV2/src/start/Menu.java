package start;

import javax.swing.JOptionPane;

public class Menu extends DamageCalc{
	public Menu() {
		boolean on = true;
		if (name.equalsIgnoreCase("wizard")) {
		while (on == true) {
		String input = JOptionPane.showInputDialog("Select Method \n1. Character Info \n2. Spell List \n3. Level Up \n4. Change Spell \n5. Roll Attack \n 6. Show Saving Throws \n7.Quit");
	    switch (input) {
	    case "1":
	    	super.showInfo();
	    	break;
	    case "2":
	    	super.spellList();
	    	break;
	    case "3":
	    	super.LevellingUp();
	    	super.levelSpell();
	    	break;
	    case "4": 
	    	super.changeSpell();
	    	break;
	    case "5":
	    	super.SpellAttack();
	    	break;
	    case "6":
	    	showStats();
	    	break;
	    case "7":
	    	 System.exit(0);
	    	break;
	    }

	} 
		} else {
			while (on == true) {
    		String input = JOptionPane.showInputDialog("Select Method \n1. Character Info \n2. Level Up \n3. Roll Attack \n 4. Show Stats\n 5. Show Saving Throws \n6. Quit");
    	    switch (input) {
    	    case "1":
    	    	super.showInfo();
    	    	break;
    	    case "2":
    	    	super.LevellingUp();
    	    	break;
    	    case "3":
    	    	super.Attack();
    	    	break;
    	    case "4": 
    	    	break;
    	    case "5":
    	    	showStats();
    	    	break;
    	    case "6":
    	    	 on = false;

		}
		
	}

}
	}
	
	public void showStats() {
		JOptionPane.showMessageDialog(null,"Saving Throws: \n Str: " + statMods[0] + "\n Dex: " + statMods[1]
				+ "\n Con:" + statMods[2] + "\n Int:" + statMods[3] + "\n Wis:" + statMods[4]
						+ "\n Cha:" + statMods[5]);	}
	
	}
