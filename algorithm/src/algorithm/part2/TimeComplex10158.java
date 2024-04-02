package algorithm.part2;

import java.util.Scanner;

/**
 * 개미 [10158]
 */
public class TimeComplex10158 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int P = scan.nextInt();
		int Q = scan.nextInt();
		int T = scan.nextInt();

		int timeX = T % (2 * W);
		int currentX = P;
		int deltaX = 1;
		while(timeX-- > 0) {
			if(currentX == 0) deltaX = 1;
			else if(currentX == W) deltaX = -1;
			currentX += deltaX;
		}
		
		int timeY = T % (2 * H);
		int currentY = Q;
		int deltaY = 1;
		while(timeY-- > 0) {
			if(currentY == 0) deltaY = 1;
			else if(currentY == H) deltaY = -1;
			currentY += deltaY;
		}
		
		System.out.println(currentX + " " + currentY);
	}

}
