package telran.array.utils;

import java.util.Comparator;

public class OddEvenComparator {
	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (comparator.compare(arr[j], arr[j+1]) >0 ) {
					T num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;

				}
			}
		}
	}



}
