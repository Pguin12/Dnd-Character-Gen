package start;

import javax.swing.JOptionPane;

public class LevelManager extends CharacterMaker {
	int Level;
	
	public LevelManager () {
		//try {
			Level = 1;
		//} catch (IOException e) {}
	}
	
	
	public void LevellingUp () {
		if (Level != 6) {
		Level = Level + 1;
		switch (Level) {
		case 1:
			if (name.equals("wizard")) {
				stringInfo = "You're a wizard who can cast spells";
			}
			if (name.equals("fighter")) {
				stringInfo = "you are known to be able to be a jack of all trades fighter";
			}
			if (name.equals("rogue")) {
				stringInfo = "you have the ability of Sneak Attack and is a master of stealth and thievery";
			}
			break;
		case 2:
			//wizard
			if (name.equals("wizard")) {
				String subclass = JOptionPane.showInputDialog("Enter Subclass (Necromancy, or Illusion)");
				if (subclass == "Necromancy") {
					stringInfo = stringInfo + "Necromancy: raise the dead";
				} if (subclass == "Illusion") {
					stringInfo = stringInfo + "Illusion: cast illusions and manipulate objects";
				}
			}
			break;
		case 3:
			if (name.equals("fighter")) {
				//fighter subclass
				stringInfo = stringInfo + "Champion: Focuses on the development of raw power "
						+ "\n Weapon attacks score a critical hit on a roll of 19 or 20";
			}
			if (name.equals("rogue")) {
			stringInfo = "Thief: Hone your skills in the larcenous arts. \n At 3rd level you can use the bonus action "
					+ "granted by Cunning Action to make a Dexterity Check, "
					+ "use your thieves' tools to disarm a trap or open a lock, or take the Use an Object Action";
			}
			break;
	}}
		
		else {
			JOptionPane.showMessageDialog(null,"Max Level!");
		}
		}
	
	public void showInfo() {
		//show class, race, and level
		String s1 = name.substring(0,1).toUpperCase() + name.substring(1);
		String s2 = race.substring(0,1).toUpperCase() + race.substring(1);
	    JOptionPane.showMessageDialog(null, "Class: " + s1 + "\nRace: " + s2 + "\nLevel: " + Level
	    		+ "\n" + stringInfo);
	}
	


	
}
