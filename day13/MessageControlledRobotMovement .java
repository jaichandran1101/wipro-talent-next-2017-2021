import java.io.*;
import  java.util.*;
class MessageControlledRobotMovement 
{
	 public String moveRobot(int input1,int input2,String input3,String input4)
	 {
		int x = input1;
		int x = input2;
		String currentPos = input3;
		String msg = input4;
		int a = Integer.parseInt(currentPos.split("-")[0]);
		int b = Integer.parseInt(currentPos.split("-")[1]);
		String d = currentPos.split("-")[2]; 
		String[] str = msg.split(" "); 
		StringBuilder output = new StringBuilder();
		System.out.println(Arrays.toString(str));
		System.out.println("Curr: " + a + b + d);
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(instructions[i] + ":: ");
			if (str[i].equals("M")) 
			{
				if (d.equals("E") && (a + 1 > X )) 
				{
					output.append("-ER");
					break;
				} 
				if (d.equals("W") && (a - 1 < 0 )) {
					output.append("-ER");
					break;
				} 
				if (d.equals("N") && (b + 1 > Y )) {
					output.append("-ER");
					break;
				} 
				if (d.equals("S") && (b - 1 < 0 )) {
					output.append("-ER");
					break;
				}

				if (d.equals("E")) 
				{
					a++;
				}
				else if (d.equals("W")) 
				{
					a--;
				}
				else if (d.equals("N")) 
				{
					b++;
				}
				else if (d.equals("S")) 
				{
					b--;
				} 
				else 
				{
					if (d.equals("E") && str[i].equals("L"))
				    	{
						d = "N";
					}
					else if (d.equals("E") && str[i].equals("R"))
					{
						d = "S";
					}
					else if (d.equals("W") && str[i].equals("L"))
					{
						d = "S";
					}
					else if (d.equals("W") && str[i].equals("R"))
					{
						d = "N";
					}
					else if (d.equals("N") && str[i].equals("L"))
					{
						d = "W";
					else if (d.equals("N") && str[i].equals("R"))
					{
						d = "E";
					}
					else if (d.equals("S") && str[i].equals("L"))
					{
						d = "E";
					}
					else if (d.equals("S") && str[i].equals("R"))
					{
						d = "W";
					}
					output.delete(0, output.length());
					output.append(currX + "-" + currY + "-" + currD);
					System.out.println(output);
				}
				return output.toString();
			}
		}
}