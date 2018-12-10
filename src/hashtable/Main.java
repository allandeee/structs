package hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void linear () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");

        System.out.println("After removes: ");
        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }

    public static void chaining () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
//
//        ht.remove("Doe");
//        ht.remove("Jones");
//
//        System.out.println("After removes: ");
//        ht.printHashtable();
//
//        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }

    public static void jdkHashmap () {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hm = new HashMap<String, Employee>();
        hm.put("Jones", janeJones);
        hm.put("Doe", johnDoe);
        hm.put("Smith", marySmith);
        hm.putIfAbsent("Doe", mikeWilson);


        System.out.println("Contains key Doe: " + hm.containsKey("Doe"));
        System.out.println("Contains employee janeJones: " + hm.containsValue(janeJones));
        System.out.println("Get Smith: " + hm.get("Smith"));

        System.out.println("Iterator print:");
        Iterator<Employee> iter = hm.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Removing " + hm.remove("Jones"));

        System.out.println("Lambda print:");
        hm.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v));

    }

    public static void main (String[] args) {
//        linear();
//        chaining();
        jdkHashmap();
    }

}
