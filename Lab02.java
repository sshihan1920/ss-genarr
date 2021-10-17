public class Lab2 {

/*Print Array Non-Generic Method*/
	public static void printArrayNonGen(Object [] array) {		
		System.out.print("{");
		for (int x = 0; x < array.length; ++x) {
			System.out.print(array[x] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
/*Print Array Overloading Method(s)*/	
	public static void printArray(Integer [] array) {
		System.out.print("{");
		for (int x = 0; x < array.length; ++x) {
			System.out.print(array[x] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
	public static void printArray(Double [] array) {
		System.out.print("{");
		for (int x = 0; x < array.length; ++x) {
			System.out.print(array[x] + ", ");
		}
		System.out.print("}");
		System.out.println();	
	}
	
	public static void printArray(Character [] array) {
		System.out.print("{");
		for (int x = 0; x < array.length; ++x) {
			System.out.print(array[x] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
	public static void printArray(String [] array) {
		System.out.print("{");
		for (int x = 0; x < array.length; ++x) {
			System.out.print(array[x] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
	
/*Print Array Generic Method*/
	public static <T> void printArrayGen(T[] anArray) {
		System.out.print("{");
		for (T x : anArray) {
		      System.out.print(x + ", ");
		}
			System.out.print("}");
		    System.out.println();
		 }
	
	
/*Maximum Finder Non-Generic Method*/	
	public static Comparable getMax(Comparable [] anArray) {
		Comparable max = anArray[0];
		
		for (int x = 0; x < anArray.length - 1; ++x) {
			if (anArray[x + 1].compareTo(anArray[x]) > 0) {
				max = anArray[x + 1];
			}
		} 
		System.out.println(max);
		return max;
	}
	
/*Maximum Finder Generic Method*/	
	public static <T extends Comparable<T>> T getMaxGen(T[] anArray) {
		T max = anArray[0];
		
	        for (int x = 0; x < anArray.length - 1; ++x) {
	            if (anArray[x + 1].compareTo(anArray[x]) > 0) {
	                max = anArray[x + 1];
	            }
	        }
	        System.out.println(max);
	        return max;
	}
	

/*Main Method*/
	public static void main(String[] args) {		
		Integer [] intArray = {1, 2, 3, 4, 5 };
		Double [] doubArray = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H','E','L', 'L', 'O' };
		String [] strArray = {"once", "upon", "a", "time" };
		
		printArray(intArray);
		printArray(doubArray);
		printArray(charArray);
		printArray(strArray);	
		
		printArrayNonGen(intArray);
		printArrayNonGen(doubArray);
		printArrayNonGen(charArray);
		printArrayNonGen(strArray);	
		
		printArrayGen(intArray);
		printArrayGen(doubArray);
		printArrayGen(charArray);
		printArrayGen(strArray);	
		
		getMax(intArray);
		getMax(doubArray);
		getMax(charArray);
		getMax(strArray);
		
		getMaxGen(intArray);
		getMaxGen(doubArray);
		getMaxGen(charArray);
		getMaxGen(strArray);
	}
	
}
