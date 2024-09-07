package telran.array.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.array.utils.OddEvenComparator;

class ArrayTests {
	Integer[] arrNum;

	@BeforeEach
	void setUp() throws Exception {
		arrNum = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3 };
	}

	@Test
	void testOddEvenSort() {
		System.out.println("Before sorting");

		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(arrNum[i] + " ");
		}

		Comparator<Integer> comp = (o1, o2) -> {
			if (o1 % 2 == 0 && o2 % 2 != 0) {
				return -1;
			} else if (o1 % 2 != 0 && o2 % 2 == 0) {
				return 1;
			} else if (o1 % 2 == 0 && o2 % 2 == 0) {
				if (o1 > o2) {
					return 1;

				} else if (o1 < o2) {
					return -1;
				} else {
					return 0;
				}

			} else {
				if (o1 > o2) {
					return -1;

				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}

			}
		};

		OddEvenComparator.bubbleSort(arrNum, comp);

		Integer[] expected = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };

		assertArrayEquals(expected, arrNum);

		System.out.println("\nAfter sorting");

		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(arrNum[i] + " ");
		}

	}

}
