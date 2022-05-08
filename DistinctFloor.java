package com.gl.Services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DistinctFloor {
	
	public void sortFloor(ArrayList<Floors> list) {

		Queue<Floors> queue = new LinkedList<Floors>();

		
		addElementToQueue(queue, list);

		int position = 0;
		while (!queue.isEmpty()) {
			Floors f = queue.poll();

			int floorDay = f.day;
			if (floorDay < position) {
				System.out.print(f.size + ",");
			} 
			
			else if (floorDay > position) {
				int j;
				for (j = position; j < floorDay; j++) {
					System.out.println();
					System.out.println("day " + (j + 1) + ":");
				}
				
				System.out.print(f.size + ",");
				position = j;
			}
		}

	}

	
	public void addElementToQueue(Queue<Floors> queue, ArrayList<Floors> list) {
		
		ArrayList<Floors> tmp_List = new ArrayList<Floors>(list.size());
		
		tmp_List.addAll(list);
		while (!tmp_List.isEmpty()) {
			int max = 0;
			Floors maxFloor = new Floors();
			int index = 0;
			for (int i = 0; i < tmp_List.size(); i++) {
				Floors var = tmp_List.get(i);
				if (var.size > max) {
					index = i;
					max = var.size;
					maxFloor.day = var.day;
					maxFloor.size = var.size;

				}
			}
			queue.add(maxFloor);
			tmp_List.remove(index);
		}
	}

}
