package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TableTop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		int anz = Integer.parseInt(sc.nextLine());
		double kosten = (anz - 4) * 9.99 + 27.49;
		kosten /= anz;
		System.out.println(df.format(kosten));
	}
}