package se.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ex4();
    }

    public static void ex1() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // add
        numbers.add(100);
        numbers.add(201);
        numbers.add(303);
        System.out.println("ArrayList: " + numbers);

        // get
        System.out.println("Accessing element number index '1': " + numbers.get(1));

        // Iterator
        System.out.println("* Iterator: ");
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            Integer number = numberIterator.next();
            System.out.println(number);
            if (number % 2 == 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);

        // for loop
        System.out.println("* For loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }


        // ex 3:
        public static void ex3(){
            List<String> euCars = new ArrayList<>();
            euCars.add("Volvo");
            euCars.add("VW");
            euCars.add("Volvo");
            System.out.println("* euCar: " + euCars);

            List<String> usCar = new ArrayList<>();
            usCar.add("Tesla");
            System.out.println("* usCar: " + usCar);

            //addALl
            euCars.addAll(usCar);
            System.out.println("* addALl: "+ euCars);
            usCar.addAll(0,euCars);
            System.out.println("* addAll with index: "+ usCar);

            System.out.print("* For loop: ");
            for (String car:euCars){
                System.out.print(" " + car);
            }

            // lastIndexOf:
            System.out.println();
            System.out.println("* Last index of Mercedes: " + euCars.lastIndexOf("Mercedes"));
            System.out.println("* Last index of Volvo: " + euCars.lastIndexOf("Volvo"));
            System.out.println("* Last index of VW: " + euCars.lastIndexOf("VW"));
    }

    public static void ex4(){
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("D");
        originalList.add("B");
        originalList.add("A");
        originalList.add("C");
        originalList.add("a");

        // original & reference
        ArrayList<String> referenceToOriginalList = originalList;
        System.out.println("OriginalList: " + originalList);
        System.out.println("OriginalList Size: " + originalList.size());
        System.out.println("ReferenceList: " + referenceToOriginalList);
        System.out.println("ReferenceList Size: " + referenceToOriginalList.size());
        System.out.println("Remove from originalList index 1: " + originalList.remove(1));
        System.out.println("OriginalList Size: " + originalList.size());
        System.out.println("ReferenceList Size: " + referenceToOriginalList.size());

        // clone
        ArrayList<String> cloneList = (ArrayList<String>) originalList.clone();
        originalList.remove(0);
        System.out.println(originalList);
        System.out.println(cloneList);




    }
}