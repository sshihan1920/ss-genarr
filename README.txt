Syed Shihan 							Due Date: 2/21/21
LAB02 README						Thaddeus Pawlicki
Contact Information: sshihan@u.rochester.edu

Program Status/Algorithm Description:
The program I have created completes all of the tasks required for the project. In the following lines, I will describe each method in the program and explain how they work.
Print Array Non-Generic Method
public static void printArrayNonGen(Object [] array) 
Takes in an array of Object type as a parameter and uses a for loop to print out each element in the array 
Print Array Overloading Method(s)
public static void printArray(Integer/Double/String/Character [] array) 
Overloaded method that takes in an array of either Integer, Double, String, or Character type as a parameter and uses a for loop to print out each element in the array
Print Array Generic Method
public static <T> void printArrayGen(T[] anArray)
Takes in an array of any type as a parameter and uses a for loop to print out each element in the array
Maximum Finder Non-Generic Method
public static Comparable getMax(Comparable [] anArray)
Takes in an array of Comparable type as a parameter then uses an if loop nested in a for loop to find the max value of the elements within the array
Maximum Finder Generic Method
public static <T> Comparable  getMaxGen(T[] anArray)
Takes in an array of Comparable type as a parameter then uses an if loop nested in a for loop to find the max value of the elements within the array
Main Method
public static void main(String[] args)
Creates four different arrays of Integer, Double, Character, and String type with unique elements
Uses all of the print array methods listed above to print out all the arrays created in the previous bullet (intArray, doubArray, charArray, strArray)
Uses all of the maximum finder methods to print out the maximum values in each array
