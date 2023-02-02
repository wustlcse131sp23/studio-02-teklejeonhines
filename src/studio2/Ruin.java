package studio2;

import java.util.*;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the start amount" );
		int startAmount = in.nextInt();
		System.out.println("Enter win chance");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit");
		int winLimit = in.nextInt();
		System.out.println("Enter simulation number");
		int totalSimulations = in.nextInt();
		int round = 0;
		int simulation = 0;
		int wins = 0;
		int loses = 0;
		while(simulation<totalSimulations) {
			simulation++;
			while ((startAmount>0 && startAmount<winLimit )|| startAmount<winLimit) {

				if (Math.random() < winChance) {
					startAmount = startAmount + 1;
				}
				else {
					startAmount = startAmount - 1;}
				round++;
			}
				if(startAmount == winLimit) {
					System.out.println("Simulation "+simulation+": "+round+" WIN");
					wins = wins +1;
					simulation++;}
				else if(startAmount == 0){
					System.out.println("Simulation "+simulation+": "+round+" LOSE");
					loses = loses + 1;
					}
				
			

		
		}
		}

}
