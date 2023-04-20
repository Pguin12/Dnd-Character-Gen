package start;

import java.util.Random;
import javax.swing.JOptionPane;

public class DamageCalc extends SpellManager {
	int damage;
	Random rand = new Random();
public DamageCalc () {

}

	public void Attack() {
		int rollAttack = rand.nextInt(20) + 1;
		if (rollAttack == 1 || rollAttack == 20 ) {
		} else {
			rollAttack = rollAttack + profMod[1];
			}
		
	//calc damage
	int Option = JOptionPane.showConfirmDialog(null, "You hit a" + rollAttack + "!" + "Does it hit?", null, JOptionPane.YES_NO_OPTION);
	if (Option == JOptionPane.YES_OPTION) {
	boolean x = true;
	while (x==true) {
		String type = JOptionPane.showInputDialog("What type of weapon? \n d4, d6, d8, 10");
		if (type.equals("d4") || type.equals("4")) {
		    damage = rand.nextInt(4) + 1;
		    x = false;
		} else if (type.equals("d6") || type.equals("6")) {
		    damage = rand.nextInt(6) + 1;
		    x = false;
		} else if (type.equals("d8") || type.equals("8")) {
		    damage = rand.nextInt(8) + 1;
		    x = false;
		} else if (type.equals("d10") || type.equals("10")) {
		    damage = rand.nextInt(10) + 1;
		    x = false;
		} else if (type.equals("d12") || type.equals("12")) {
		    damage = rand.nextInt(12) + 1;
		    x = false;
		} else {
		    JOptionPane.showMessageDialog(null, "Please try again");
		    continue;
		}
		
		
		JOptionPane.showMessageDialog(null, "You rolled:" + damage);
	}
	
	if (x == false) {
		
	}

	}}
	
		
	
	public void SpellAttack() {
		int rollAttack = rand.nextInt(20) + 1;
		if (rollAttack == 1 || rollAttack == 20 ) {
		} else {
			rollAttack = rollAttack + statMods[3] + 2;
			}
		
	//calc damage
	int Option = JOptionPane.showConfirmDialog(null, "You hit a " + rollAttack + "!" + "Does it hit?", null, JOptionPane.YES_NO_OPTION);
	if (Option == JOptionPane.YES_OPTION) {
	boolean x = true;
	while (x==true) {
		String type = JOptionPane.showInputDialog("What type of spell? \n d4, d6, d8, 10 \n (type Show for types of spell damage");
		String roll = JOptionPane.showInputDialog("How many times?");
		int num = Integer.parseInt(roll);
		if (type.equals("d4") || type.equals("4")) {
		    for (int i = 0; i < num; i++) {
		        damage += rand.nextInt(4) + 1;
		    }
		    x = false;
		} else if (type.equals("d6") || type.equals("6")) {
		    for (int i = 0; i < num; i++) {
		        damage += rand.nextInt(6) + 1;
		    }
		    x = false;
		} else if (type.equals("d8") || type.equals("8")) {
		    for (int i = 0; i < num; i++) {
		        damage += rand.nextInt(8) + 1;
		    }
		    x = false;
		} else if (type.equals("d10") || type.equals("10")) {
		    for (int i = 0; i < num; i++) {
		        damage += rand.nextInt(10) + 1;
		    }
		    x = false;
		} else if (type.equals("d12") || type.equals("12")) {
		    for (int i = 0; i < num; i++) {
		        damage += rand.nextInt(12) + 1;
		    }
		    x = false;
		} else if (type.equalsIgnoreCase("show")) {
		    JOptionPane.showMessageDialog(null, "Acid Splash: 1d6" +
		            "\nFire Bolt: 1d10"
		            + "\nRay of Frost: 1d8"
		            + "\nShocking Grasp: 1d8"
		            + "\nBurning Hands: 3d6"
		            + "\nMagic Missile: 1d4 + 1 (each dart)"
		            + "\nShatter: 3d8"
		            + "\nFireball: 8d6"
		            + "\nLightning Bolt: 8d6");
		} else {
		    JOptionPane.showMessageDialog(null, "Please try again");
		    continue;
		}
	}
	JOptionPane.showMessageDialog(null, "You rolled:" + damage);
	}}
	
}

