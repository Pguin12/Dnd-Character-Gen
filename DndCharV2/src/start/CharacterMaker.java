package start;


import javax.swing.JOptionPane;
/**import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File; **/


public class CharacterMaker {
	//Order of stats: Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma
	int[] Stats = new int[6];
	int[] statMods = new int[6];
	
	/* prof list: Acrobatics, Animal Handling, Arcana, Athletics, Deception, History, 
	 * Insight, Intimidation, Investigation, Medicine, Nature, Perception, 
	 * Performance, Persuasion, Religion, Sleight of hand, Stealth, Survival, and saving throws
	 */
	boolean[] profList = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,};

	int []profMod = new int[24];
	int level = 0;
	
	//race, class
	String stringInfo;	
	String name;
	String race;
	String ask;
	String fileName = "DndGenSave File.txt";
	String askStat;
	/**private File file;
    FileWriter writer = null;
    boolean checkFile = false;
    FileReader reader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(reader); **/
    public CharacterMaker() {
        
      /**  try {
            // Create the file
            file.createNewFile();

            // Check if the file is NOT empty
            if (file.length() != 0) {
            	checkFile = true;
            } else {
                // Write data to the file
                writer = new FileWriter(file);
            }

        } catch (IOException e) {
            // Handle the exception
            e.printStackTrace();
 
    } finally {
        
        if (checkFile = true) {
        	name = bufferedReader.readLine();
        }
        else if (checkFile = false) {
        	name = JOptionPane.showInputDialog("Name Your Class (Wizard, Fighter, or Rogue)");
    		name = name.toLowerCase();
    		writer.write(name);
        } **/
    	name = JOptionPane.showInputDialog("Name Your Class (Wizard, Fighter, or Rogue)");
		name = name.toLowerCase();
	    if (name.equalsIgnoreCase("wizard")) {
	    	// history
	    	profList[5] = true;
	    	//insight
	    	profList[6] = true;
	    }
	    
	    if (name.equalsIgnoreCase("fighter")) {
	    	profList[3] = true;
	    	profList[11] = true;

	    }
	    
	    if (name.equalsIgnoreCase("rogue")) {
	    	profList[6] = true;
	    	profList[15] = true;
	    }
	    
        
	    
	    //race
     /**   if (checkFile = true) {
        	race = bufferedReader.readLine();
        	ask = bufferedReader.readLine();
        }
        else if (checkFile = false) {
        	race = JOptionPane.showInputDialog("Name Your Race (Human, Elf, or Dwarf)");
    	   	race = race.toLowerCase();
    	   	writer.write("\n");
    	   	writer.write(race);
    		ask = JOptionPane.showInputDialog("Alternate (1) or Basic Rules (2)?"); 
        } **/
	    
    	race = JOptionPane.showInputDialog("Name Your Race (Human, Elf, or Dwarf)");
	   	race = race.toLowerCase();
		ask = JOptionPane.showInputDialog("Alternate (1) or Basic Rules (2)?"); 
		int numA = Integer.parseInt(ask);
		if (numA == 1) {
	      /**  if (checkFile = true) {
	        	askStat = bufferedReader.readLine();
	        }
	        else if (checkFile = false) {
				askStat= JOptionPane.showInputDialog("Stat #1 for +2 modifier?"); 
	    	   	writer.write("\n");
	    	   	writer.write(askStat);
	        } **/
			askStat= JOptionPane.showInputDialog("Stat #1 for +2 modifier?"); 
			if (askStat.equalsIgnoreCase("strength")||askStat.equalsIgnoreCase("str")); { 
				Stats[0] = Stats[0] + 2;
			} 	if (askStat.equalsIgnoreCase("dexterity")||askStat.equalsIgnoreCase("dex")); { 
				Stats[1] = Stats[1] + 2;
			} 	if (askStat.equalsIgnoreCase("constitution")||askStat.equalsIgnoreCase("con")); { 
				Stats[2] = Stats[2] + 2;
			}   if (askStat.equalsIgnoreCase("intelligence")||askStat.equalsIgnoreCase("int")); { 
				Stats[3] = Stats[3] + 2;
			}   if (askStat.equalsIgnoreCase("wisdom")||askStat.equalsIgnoreCase("wis")); { 
				Stats[4] = Stats[4] + 2;
			} if (askStat.equalsIgnoreCase("charisma")||askStat.equalsIgnoreCase("cha")); { 
				Stats[5] = Stats[5] + 2;
			}
	        /**if (checkFile = true) {
	        	askStat = bufferedReader.readLine();
	        }
	        else if (checkFile = false) {**/
				askStat = JOptionPane.showInputDialog("Stat #1 for +1 modifier?"); 
	    	   	//writer.write("\n");
	    	   	//writer.write(askStat); }
	        

			if (askStat.equalsIgnoreCase("strength")||askStat.equalsIgnoreCase("str")) { 
				Stats[0] = Stats[0] + 1;
			} 			
			if (askStat.equalsIgnoreCase("dexterity")||askStat.equalsIgnoreCase("dex")) { 
				Stats[1] = Stats[1] + 1;
			} 			
			if (askStat.equalsIgnoreCase("constitution")||askStat.equalsIgnoreCase("con")) { 
				Stats[2] = Stats[2] + 1;
			} 			
			if (askStat.equalsIgnoreCase("intelligence")||askStat.equalsIgnoreCase("int")) { 
				Stats[3] = Stats[3] + 1;
			} 			
			if (askStat.equalsIgnoreCase("wisdom")||askStat.equalsIgnoreCase("wis")) { 
				Stats[4] = Stats[4] + 1;
			} 			
			if (askStat.equalsIgnoreCase("charisma")||askStat.equalsIgnoreCase("cha")) { 
				Stats[5] = Stats[5] + 1;
			}

			
		}
		
		if (numA == 2) {
			switch (race) {
			case "human": 				
				Stats[0] = Stats[0] + 1;
				Stats[1] = Stats[1] + 1;										
				Stats[2] = Stats[2] + 1;										
				Stats[3] = Stats[3] + 1;										
				Stats[4] = Stats[4] + 1;		
				Stats[5] = Stats[5] + 1;
				break;
				
			case "elf":
				Stats[1] = Stats[1] + 1;
				
				String elfChoice = JOptionPane.showInputDialog("High Elf or Wood Elf?");
				if (elfChoice.equalsIgnoreCase("Wood") || elfChoice.equalsIgnoreCase("Wood Elf")) {
					Stats[4] = Stats[4] + 2;
				} 	if (elfChoice.equalsIgnoreCase("High") || elfChoice.equalsIgnoreCase("High Elf")) {
					Stats[4] = Stats[3] + 2;
					}
				break;
				
			case "dwarf":
				Stats[2] = Stats[2] + 2;
				break;

				}
			} 
		
	
		String temp1 = JOptionPane.showInputDialog("Enter Strength"); 
		Stats[0] = Stats[0] + Integer.parseInt(temp1);
		String temp2 = JOptionPane.showInputDialog("Dexterity"); 
		Stats[1] = Stats[1] + Integer.parseInt(temp2);
		String temp3 = JOptionPane.showInputDialog("Enter Constitution"); 
		Stats[2] = Stats[2] + Integer.parseInt(temp3);
		String temp4 = JOptionPane.showInputDialog("Enter Intelligence"); 
		Stats[3] = Stats[3] + Integer.parseInt(temp4);
		String temp5 = JOptionPane.showInputDialog("Enter Wisdom"); 
		Stats[4] = Stats[4] + Integer.parseInt(temp5);
		String temp6 = JOptionPane.showInputDialog("Enter Charisma"); 
		Stats[5] = Stats[5] + Integer.parseInt(temp6);
		
		//ensuring they all have a limit of 20
		
		for (int x = 0; x <6; x++) {
			if (Stats[x] > 20) {
				Stats[x] = 20;
			}
		}
		
		//sets all the modifiers for each Stat		
		for (int y = 0; y < 6; y++) {
			if (Stats[y] == 2 || Stats[y] == 3) {
				statMods[y] = -4;
			}
			if (Stats[y] == 4 || Stats[y] == 5) {
				statMods[y] = -3;
			}
			
			if (Stats[y] == 6 || Stats[y] == 7) {
				statMods[y] = -2;
			}
			
			if (Stats[y] == 8 || Stats[y] == 9) {
				statMods[y] = -1;
			}
			
			if (Stats[y] == 10 || Stats[y] == 11) {
				statMods[y] = 0;
			}
			if (Stats[y] == 12 || Stats[y] == 13) {
				statMods[y] = 1;
			}
			if (Stats[y] == 14 || Stats[y] == 15) {
				statMods[y] = 2;
			}
			if (Stats[y] == 16 || Stats[y] == 17) {
				statMods[y] = 3;
			}
			if (Stats[y] == 18 || Stats[y] == 19) {
				statMods[y] = 4;
			}
			if (Stats[y] == 20) {
				statMods[y] = 5;
			}
					}
		
		//Order of stats: Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma

		profMod[0] = statMods[1];  //Acrobatics
		profMod[1] = statMods[4];  //Animal Handling
		profMod[2] = statMods[3];  //Arcana
		profMod[3] = statMods[0];  //Athletics
		profMod[4] = statMods[5];  //Deception
		profMod[5] = statMods[3];  //History
		profMod[6] = statMods[4];  //Insight
		profMod[7] = statMods[5];  //Intimidation
		profMod[8] = statMods[3];  //Investigation
		profMod[9] = statMods[4];  //Medicine
		profMod[10] = statMods[3]; //Nature
		profMod[11] = statMods[4]; //Perception
		profMod[12] = statMods[5]; //Performance
		profMod[13] = statMods[5]; //Persuasion
		profMod[14] = statMods[4]; //Religion
		profMod[15] = statMods[1]; //Sleight of Hand
		profMod[16] = statMods[1]; //Stealth
		profMod[17] = statMods[4]; //Survival
		profMod[18] = statMods[0]; //Str Saving Throw
		profMod[19] = statMods[1]; //Dex Saving Throw
		profMod[20] = statMods[2]; //Con Saving Throw
		profMod[21] = statMods[3]; //Int Saving Throw
		profMod[22] = statMods[4]; //Wis Saving Throw
		profMod[23] = statMods[5]; //Cha Saving Throw
		//Class would carry its own attributes for profMods but using testing with prof in Perception, Stealth, and Survival 

		for (int i = 0; i < 16; i++) {
			if (profList[i] == true) {
				profMod[i] = profMod[i] + 2;
			}
			
			//testing
		}
				
		
		
	
}}

			
		



