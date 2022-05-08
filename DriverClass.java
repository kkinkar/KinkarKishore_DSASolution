package com.gl.driver;

import java.util.ArrayList;
import java.util.Scanner;

import com.gl.Services.DistinctFloor;
import com.gl.Services.Floors;

public class DriverClass {
public static void main(String[] args) {
		
		int totalFloors ;
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building");
		totalFloors = sc.nextInt();
		ArrayList<Floors> list = new ArrayList<Floors>(totalFloors);
		
		for(int i =0; i < totalFloors; i++) 
		{
			System.out.println("Enter the floor size on the given day :" +(i+1));		
			Floors f = new Floors();
			f.size = sc.nextInt();
			f.day = i+1;		
			list.add(i,f);		
		}
		DistinctFloor df = new DistinctFloor();
		df.sortFloor(list);
		sc.close();

	}

}
