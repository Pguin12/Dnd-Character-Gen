package start;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class SpellManager extends LevelManager  {
	ArrayList<String> wspellsCantrips = new ArrayList<String>();
	ArrayList<String> wspellsFirst = new ArrayList<String>();
	ArrayList<String> wspellsSecond = new ArrayList<String>();
	ArrayList<String> wspellsThird = new ArrayList<String>();
	ArrayList<String> wspellsFourth = new ArrayList<String>();

//select which spells to choose
	String[] Cantrips = {"acid splash","dancing lights", "fire bolt", "light", "mage hand", "minor illusion", "poison spray", "prestidigation", "ray of frost", "shocking grasp"};
	String[] firstLevel = {"burning hands","charm person","comprehend languages","detect magic","disguise self","identify","mage armor", "magic missile","shield","silent image","sleep","thunderwave"};
	String[] secondLevel = {"arcane lock","blur","darkness","flaming sphere","hold person","invisibility","knock","levitate","magic weapon","misty step","shatter","spider climb","suggestion","web"};
	String[] thirdLevel = {"Counterspell","Dispel Magic","Fireball","Fly","Haste","Lightning Bolt","Major Image","Proection from Enemy"};
	boolean confirm = false;
	int maxSpellLevel = 1;
	String 	spellListCantrips;
	String spellListFirst;
	String spellListSecond = "";
	
	
	
	public SpellManager () {
		// if character levels up, check to see if it has a level in Wizard, if not, it does nothing 
		if (name.equalsIgnoreCase("wizard")) {
			confirm = true;			
	            for (int j = 0; j < 3; j++) {
	                int y = j + 1;
	                String input;
	                boolean foundMatch = false;
	                while (foundMatch == false) {
	                	input = JOptionPane.showInputDialog(null, "Enter Cantrip Spell #" + y + "\nSpells: "
	                			+ "Acid Splash, Dancing Lights, Fire Bolt, Light, Mage Hand, Minor Illusion, "
	                			+ "\n Poison Spray. Prestidigation, Ray of Frost, Shocking Grasp");
	                    for (int i = 0; i < Cantrips.length; i++) {
	                        String str = Cantrips[i];
	                        if (str.equals(input.toLowerCase())) {
	                            wspellsCantrips.add(str);
	                            foundMatch = true;
	                            break;
	                        }
	                    }
	                    if (foundMatch == false) {
	                        System.out.println("error, try again please");
	                    }

	                }
	            }
	            Collections.sort(wspellsCantrips);
	            // Second for loop for first level spells (3 spells)
	            for (int k = 0; k < 2; k++) {
	                int y = k + 1;
	                boolean foundMatch = false;
	                String input;
	                while (foundMatch == false) {
	                    input = JOptionPane.showInputDialog(null, "Enter 1st Level Spell #" + y 
	                			+ "\nSpells: Burning Hands, Charm Person, Comrephend Languages, Detect Magic,"
	                			+ "\nDisguise Self, Identify, Mage Armor, Magic Missile, Shield, Silent Image, Sleep, Thunderwave");
	                	 for (int i = 0; i < firstLevel.length; i++) {
	                        String str = firstLevel[i];
	                        if (str.equals(input.toLowerCase())) {
	                            wspellsFirst.add(str);
	                            foundMatch = true;
	                            break;
	                        }
	                    }
	                    if (foundMatch == false) {
	                        System.out.println("error, try again please");
	                    }
	                }
	            }
	            Collections.sort(wspellsFirst);

	    		spellListCantrips = "Cantrips \n";
	    		for (int i = 0; i < wspellsCantrips.size(); i++) {
	    			spellListCantrips = spellListCantrips + wspellsCantrips.get(i) + "\n";
	    		}
	    		spellListFirst =  "\n  First Level: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListFirst = spellListFirst + wspellsFirst.get(i)+ "\n";
	    		}

	        }
	    }
	
	
	public void levelSpell() {
		if (confirm == true) {
			boolean foundMatch = false;
            String input;
			switch (Level) {
			//3 cantrips 3 first
			case 2:
                while (foundMatch == false) {
                    input = JOptionPane.showInputDialog(null, "Enter 1st Level Spell #3 " 
                    		+ "\nSpells: Burning Hands, Charm Person, Comrephend Languages, Detect Magic, "
                    		+ "\nDisguise Self, Identify, Mage Armor, Magic Missile, Shield, Silent Image, Sleep, Thunderwave");
                    for (int i = 0; i < firstLevel.length; i++) {
                        String str = firstLevel[i];
                        if (str.equals(input.toLowerCase())) {
                            wspellsFirst.add(str);
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == false) {
                    	JOptionPane.showMessageDialog(null, "error, try again please");
                    }}
	            Collections.sort(wspellsFirst);
	    		spellListFirst =  "\n  First Level: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListFirst = spellListFirst + wspellsFirst.get(i)+ "\n";
	    		}

	                        break;
	                        
			case 3:
				//3 cantrip, 4 first, 2 2nd
                while (foundMatch == false) {
                    input = JOptionPane.showInputDialog(null, "Enter 1st Level Spell #4"
                    		+ "\nSpells: Burning Hands, Charm Person, Comrephend Languages, Detect Magic, "
                    		+ "\nDisguise Self, Identify, Mage Armor, Magic Missile, Shield, Silent Image, Sleep, Thunderwave\");");
    
                    		for (int i = 0; i < firstLevel.length; i++) {
                        String str = firstLevel[i];
                        if (str.equals(input.toLowerCase())) {
                            wspellsFirst.add(str);
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == false) {
                        System.out.println("error, try again please");
                    }}
	            Collections.sort(wspellsFirst);
	    		spellListFirst =  "\n  First Level: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListFirst = spellListFirst + wspellsFirst.get(i)+ "\n";
	    		}

	            for (int k = 0; k < 2; k++) {
	                int y = k + 1;
	                foundMatch = false;
	                while (foundMatch == false) {
	                    input = JOptionPane.showInputDialog(null, "Enter 2nd Level Spell #" + y 
	                    		+ "\nSpells: Arcane Lock, Blur, Darkness, Flaming Sphere, Hold Person, "
	                    		+ "\nInvisibility, Knock, Levitate, Magic Weapon, Misty Step, Shatter, Spider Climb, Suggestion, Web");

	                    for (int i = 0; i < secondLevel.length; i++) {
	                        if (secondLevel[i].equals(input.toLowerCase())) {
	                            wspellsSecond.add(secondLevel[i]);
	                            foundMatch = true;
	                            break;
	                        }
	                    }
	                    if (foundMatch == false) {
	                        System.out.println("error, try again please");
	                        }}}
	            Collections.sort(wspellsSecond);
	    		spellListFirst =  "\n  Second: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListSecond = spellListSecond + wspellsFirst.get(i)+ "\n";
	    		}

				break;
				
			case 4:
				//4 cantrips, 4 1st, 3 2nd
	                foundMatch = false;
	                while (foundMatch == false) {
	                    input = JOptionPane.showInputDialog(null, "Enter Cantrip Spell #4 "
	                    		+ "\nSpells: Arcane Lock, Blur, Darkness, Flaming Sphere, Hold Person, "
	                    		+ "\nInvisibility, Knock, Levitate, Magic Weapon, Misty Step, Shatter, Spider Climb, Suggestion, Web");
	                    for (int i = 0; i < Cantrips.length; i++) {
	                        if (secondLevel[i].equals(input.toLowerCase())) {
	                            wspellsSecond.add(secondLevel[i]);
	                            foundMatch = true;
	                            break;
	                        }
	                    }
	                    if (foundMatch == false) {
	                        System.out.println("error, try again please");
	                        }}
		            Collections.sort(wspellsCantrips);
		    		spellListCantrips = "Cantrips \n";
		    		for (int i = 0; i < wspellsCantrips.size(); i++) {
		    			spellListCantrips = spellListCantrips + wspellsCantrips.get(i) + "\n";
		    		}


	                while (foundMatch == false) {
	                    input = JOptionPane.showInputDialog(null, "Enter 2nd Level Spell #3 "
	                    		+ "\nSpells: Arcane Lock, Blur, Darkness, Flaming Sphere, Hold Person, "
	                    		+ "\nInvisibility, Knock, Levitate, Magic Weapon, Misty Step, Shatter, Spider Climb, Suggestion, Web");
	                    for (int i = 0; i < secondLevel.length; i++) {
	                        if (secondLevel[i].equals(input.toLowerCase())) {
	                            wspellsSecond.add(secondLevel[i]);
	                            foundMatch = true;
	                            break;
	                        }
	                    }
	                    if (foundMatch == false) {
	                        System.out.println("error, try again please");
	                        }}
		            Collections.sort(wspellsSecond);
		    		spellListFirst =  "\n  Second: \n";
		    		for (int i = 0; i < wspellsFirst.size(); i++) {
		    			spellListSecond = spellListSecond + wspellsFirst.get(i)+ "\n";
		    		}


				break;
		}
			}
	}



	
    public void changeSpell() {
        String spellLevel = JOptionPane.showInputDialog(null, "Choose spell level to replace (cantrip, first, second, third, fourth, fifth):");
        spellLevel = spellLevel.toLowerCase();
        String spellToReplace;
        int toReplace;
        boolean foundMatch = false;
        String input;

        switch (spellLevel) {
            case "cantrip":
        		String spellList = "Cantrips \n";
        		for (int i = 0; i < wspellsCantrips.size(); i++) {
        			spellList = spellList + wspellsCantrips.get(i) + "\n";
        		}
                spellToReplace = JOptionPane.showInputDialog(null, "Which spell would you like to replace?" + spellList);
                toReplace = wspellsCantrips.indexOf(spellToReplace);
                while (toReplace == -1) {
                    spellToReplace = JOptionPane.showInputDialog(null, "That spell does not exist. Please choose a spell to replace:");
                    toReplace = wspellsCantrips.indexOf(spellToReplace);
                }
                foundMatch = false;
                while (foundMatch == false) {
                    input = JOptionPane.showInputDialog(null, "Enter Spell");
                    for (int i = 0; i < Cantrips.length; i++) {
                        String str = Cantrips[i];
                        if (str.equals(input.toLowerCase())) {
                            wspellsCantrips.set(i, str);
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == false) {
                 	   JOptionPane.showMessageDialog(null, "Inputted something wrong, please try again");
                    }

                
                }
	            Collections.sort(wspellsCantrips);
	    		spellListCantrips = "Cantrips \n";
	    		for (int i = 0; i < wspellsCantrips.size(); i++) {
	    			spellListCantrips = spellListCantrips + wspellsCantrips.get(i) + "\n";
	    		}

                break;
                
                
            case "first":
                spellToReplace = JOptionPane.showInputDialog(null, "Which spell would you like to replace?");
                toReplace = wspellsFirst.indexOf(spellToReplace);
                while (toReplace == -1) {
                    spellToReplace = JOptionPane.showInputDialog(null, "That spell does not exist. Please choose a spell to replace:");
                    toReplace = wspellsFirst.indexOf(spellToReplace);
                }
                foundMatch = false;
                while (foundMatch == false) {
                    input = JOptionPane.showInputDialog(null, "Enter Spell");
                    for (int i = 0; i < firstLevel.length; i++) {
                        String str = firstLevel[i];
                        if (input.equals(str)) {
                            wspellsFirst.set(i, str);
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == false) {
                 	   JOptionPane.showMessageDialog(null, "Inputted something wrong, please try again");
                    }
                }
                
                
	            Collections.sort(wspellsFirst);
	    		spellListFirst =  "\n  First Level: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListFirst = spellListFirst + wspellsFirst.get(i)+ "\n";
	    		}

                break;
                
                
            case "second":
                spellToReplace = JOptionPane.showInputDialog(null, "Which spell would you like to replace?");
                toReplace = wspellsFirst.indexOf(spellToReplace);
                while (toReplace == -1) {
                    spellToReplace = JOptionPane.showInputDialog(null, "That spell doesn't exist. Try Again.");
                    toReplace = wspellsFirst.indexOf(spellToReplace);
                }
                while (foundMatch == false) {
                    input = JOptionPane.showInputDialog(null, "Enter Spell");
                    for (int i = 0; i < secondLevel.length; i++) {
                        String str = secondLevel[i];
                        if (str.equals(input.toLowerCase())) {
                            wspellsSecond.set(i, str);
                            foundMatch = true;
                            break;
                        }
                    }
                    if (foundMatch == false) {
                 	   JOptionPane.showMessageDialog(null, "Inputted something wrong, please try again");
                    }

                
                }
	            Collections.sort(wspellsSecond);
	    		spellListFirst =  "\n  Second: \n";
	    		for (int i = 0; i < wspellsFirst.size(); i++) {
	    			spellListSecond = spellListSecond + wspellsFirst.get(i)+ "\n";
	    		}

                break;
               default:
            	   JOptionPane.showMessageDialog(null, "Inputted something wrong, please try again");
            	   break;
        }
    }
    public void spellList() {
    	if (!name.equals("wizard")) {
    		JOptionPane.showMessageDialog(null, "You aren't a wizard!");
    	} else {
    		String spellList = spellListCantrips + spellListFirst + spellListSecond;
    		JOptionPane.showMessageDialog(null, spellList);


    	}
    }
    
    
    }
