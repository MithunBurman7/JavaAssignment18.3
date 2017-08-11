import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
    ArrayList<String> nameArrayList = new ArrayList<String>();
		
		nameArrayList.add("George");
		nameArrayList.add("Michal");
		nameArrayList.add("Siddharth");
		nameArrayList.add("anshuman");
		
		
		
		for (String nameName : nameArrayList) {
			System.out.println(" name = " + nameName);
		}
		int elementsInList = nameArrayList.size();
		System.out.println("\nSize of list = " + elementsInList);

		boolean retval = nameArrayList.contains("Siddharth");

		System.out.println("\nchecking element is present in ArrayList or not");
		if (retval == true) {
			System.out.println("element Siddharth present in ArrayList ");
		} else {
			System.out.println("element Siddharth  is not present in ArrayList");
		}
		
		String[] elementListasArray = nameArrayList.toArray(new String[elementsInList]);
		
		System.out.println(elementListasArray[0]);
		
		nameArrayList.set(3,"Aarti");
		
		System.out.println("ArrayList after replace:" + nameArrayList);

		}

	}
