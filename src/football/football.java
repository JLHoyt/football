package football;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class football 
{

	public static void main(String[] args) 
	{
		//String yes = "yes"; //May not need. Continues program
		//String no = "no"; //May not need. Exits the program
		boolean play = true; //If false, exits program
		//String pass = "pass"; //For if you're passing. May not need
		//String run = "run"; // For if you're running. May not need
		String choosePlay = null; //Will be changed to pass or run
		int score = 0; //Sets score at 0
		int down = 1; //Controls what down it is. If it goes < 4, turnover
		int yardLine = 50; //Each game starts on the 50 yard line
		int toGo = 10; //Start off with 10 yards to go for 1st. If 0 or less (since 0 yards would be a 1st), 10 yards from there
		String yesNo = null; //May not be needed
		
		//Passes and runs for the random to choose from.
		int [] playOut = new int[27];
		playOut[0] = (1);
		playOut[1] = (2);
		playOut[2] = (3);
		playOut[3] = (4);
		playOut[4] = (5);
		playOut[5] = (6);
		playOut[6] = (7);
		playOut[7] = (8);
		playOut[8] = (9);
		playOut[9] = (10);
		playOut[10] = (11);
		playOut[11] = (12);
		playOut[12] = (13);
		playOut[13]	= (14);
		playOut[14] = (15);
		playOut[15] = (16);
		playOut[16]	= (0);
		playOut[17] = (-1);
		playOut[18] = (-2);
		playOut[19] = (-3);
		playOut[20] = (-4);
		playOut[21] = (-5);
		playOut[22] = (-6);
		playOut[23] = (-7);
		playOut[24] = (-8);
		playOut[25] = (-9);
		playOut[26] = (-10);
		
		do
			{
				while(down < 5 & toGo > 0)
				{
					//Choose run or pass, then lowers it
					Scanner input = new Scanner(System.in);
					System.out.println("Please select run or pass: ");
					choosePlay = input.nextLine();
					String playLow = choosePlay.toLowerCase();
		
					//Checks for incorrect input
					if (!playLow.equals("pass")&!playLow.equals("run"))
					{
						System.out.println("");
						System.out.println("Incorrect input. Choose pass or run");
						continue;
					}
					
					//If the input equals pass...
					if (playLow.equals("pass"))
					{
						Random rand = new Random();
						int[] playOutp = Arrays.copyOfRange(playOut, 0, 26);// take out!
						int playOutcome = playOutp[rand.nextInt(playOutp.length)];//take out!
						toGo = toGo + (playOutcome * -1);
						down++;
						yardLine = yardLine + (playOutcome * -1);
						
						//Sets to toGo to 10 yards and down to 1st if toGo is less than 0
						if (toGo <= 0)
						{
							toGo = 10;
							down = 1;
						}
						
						//Prints Touchdown and displays the score if yardLine is less/equal to 0
						if (yardLine <= 0)
						{						
							score = 7;
							System.out.println("TOUCHDOWN!!!!!!!!!!!!!!");
							System.out.println("The score is " + score + " to 0");
							break;
						}
						
						//These display different messages depending on the playOutcome
						if (playOutcome < 0 & playLow.equals("pass"))
							System.out.println("SACKED!!!!");
						
						if (playOutcome > 0 & playOutcome < 4 & playLow.equals("pass"))
							System.out.println("Short throw");
						
						if (playOutcome > 5 & playOutcome < 10 & playLow.equals("pass"))
							System.out.println("Medium Throw");
							
						if (playOutcome > 10 & playLow.equals("pass"))
							System.out.println("Big gain!");
						
						//get rid of else?
						
						//Used until I can figure out how to make it if you get negative yards from the 50 to make it 45 for instance
						if (yardLine > 50 & down < 4)
						{
							System.out.println("The ball is on the offenses' side of the field");
						}
							//Plays
							if (down == 1)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 1st down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
							}
						
							if (down == 2)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 2nd down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}
						else
							if (down == 3)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 3rd down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}
						else
							if (down == 4)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 4th down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}

					}
					
				else
					
					//If the input equals run...
					if (playLow.equals("run"))
					{
						Random rand1 = new Random();
						int[] playOutr = Arrays.copyOfRange(playOut, 0, 21);
						int playOutcome = playOutr[rand1.nextInt(playOutr.length)];
						toGo = toGo + (playOutcome * -1);
						down++;
						yardLine = yardLine + (playOutcome * -1);
						
						//Sets to toGo to 10 yards and down to 1st if toGo is less than 0
						if (toGo <= 0)
						{
							toGo = 10;
							down = 1;
						}
						
						//Prints Touchdown and displays the score if yardLine is less/equal to 0
						if (yardLine <= 0)
						{						
							score = 7;
							System.out.println("TOUCHDOWN!!!!!!!!!!!!!!");
							System.out.println("The score is " + score + " to 0");
							break;
						}
						
						//These display different messages depending on the playOutcome
						if (playOutcome < 0 & playLow.equals("run"))
							System.out.println("Stopped in the backfield");
						
						if (playOutcome == 0 & playLow.equals("run"))
							System.out.println("Stuffed at the line of scrimmage");
						
						if (playOutcome > 0 & playOutcome < 4 & playLow.equals("run"))
							System.out.println("Short run");
						
						if (playOutcome > 5 & playOutcome < 10 & playLow.equals("run"))
							System.out.println("Medium run");
							
						if (playOutcome > 10 & playLow.equals("run"))
							System.out.println("Big run!");
						
						//Used until I can figure out how to make it if you get negative yards from the 50 to make it 45 for instance
						if (yardLine > 50 & down < 4)
						{
							System.out.println("The ball is on the offenses' side of the field");
						}
							//Plays
							if (down == 1)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 1st down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
							}
					
							if (down == 2)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 2nd down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}
						else
							if (down == 3)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 3rd down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}
						else
							if (down == 4)
							{
								System.out.println("The play went for " + playOutcome + " yards");
								System.out.println("");
								System.out.println("It's 4th down");
								System.out.println("" + toGo + " yards to go");
								System.out.println("Ball is on the " + yardLine + " yard line.");
								continue;
							}
							
					}
					
				}

					//Asks if you want to play again
					System.out.println("Turnover on downs!");
					System.out.println("Would you like to play again? Enter yes or no: ");
					Scanner input1 = new Scanner(System.in);
					yesNo = input1.nextLine();
					
					//Checks play again condition
					if (yesNo.equalsIgnoreCase("no"))
					{
						play = false;
					}
					else if (!yesNo.equalsIgnoreCase("yes")&!yesNo.equalsIgnoreCase("no"))
					{
						System.out.println("Invalid input. Exiting program.");
						System.exit(0);
					}
					else if (yesNo.equalsIgnoreCase("yes"))
					{
						down = 1;
						toGo = 10;
						yardLine = 50;
						continue;
					}
		
			}
			while (play);
		
	}

}
