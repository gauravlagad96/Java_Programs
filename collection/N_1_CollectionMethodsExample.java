package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class N_1_CollectionMethodsExample {
    public static void main(String[] args) {
        
        // Creating a collection (ArrayList in this case)
        Collection<String> collection = new ArrayList<>();
        
        // 1. add(E e)
        // Adds the specified element to the collection.
        collection.add("Apple");
        collection.add("Banana");
        
        // 2. addAll(Collection<? extends E> c)
        // Adds all elements from the specified collection to the current collection.
        Collection<String> anotherCollection = new ArrayList<>();
        anotherCollection.add("Orange");
        anotherCollection.add("Grapes");
        collection.addAll(anotherCollection);
        
        // 3. clear()
        // Removes all elements from the collection.
        // collection.clear(); // Uncomment to clear the collection
        
        // 4. contains(Object o)
        // Checks if the specified element exists in the collection.
        boolean containsApple = collection.contains("Apple"); // returns true if "Apple" is found
        System.out.println("Contains Apple: " + containsApple);
        
        // 5. containsAll(Collection<?> c)
        // Checks if the current collection contains all elements of the specified collection.
        boolean containsAllFruits = collection.containsAll(anotherCollection); // checks if all fruits in anotherCollection are in collection
        System.out.println("Contains all fruits: " + containsAllFruits);
        
        // 6. isEmpty()
        // Checks if the collection is empty.
        boolean isEmpty = collection.isEmpty(); // returns false since the collection is not empty
        System.out.println("Is collection empty: " + isEmpty);
        
        // 7. iterator()
        // Returns an iterator for the collection to iterate over its elements.
        System.out.print("Elements in collection: ");
        collection.iterator().forEachRemaining(element -> System.out.print(element + " "));
        
        // 8. remove(Object o)
        // Removes a single occurrence of the specified element from the collection.
        collection.remove("Banana"); // Removes "Banana" from the collection
        
        // 9. removeAll(Collection<?> c)
        // Removes all elements from the collection that are contained in the specified collection.
        collection.removeAll(anotherCollection); // Removes all elements of anotherCollection from collection
        
        // 10. retainAll(Collection<?> c)
        // Retains only the elements that are present in the specified collection.
        collection.retainAll(anotherCollection); // Keeps only elements in collection that are in anotherCollection
        
        // 11. size()
        // Returns the number of elements in the collection.
        int size = collection.size(); // Gets the number of elements in the collection
        System.out.println("\nSize of collection: " + size);
        
        // 12. toArray()
        // Returns an array containing all elements of the collection.
        Object[] array = collection.toArray();
        System.out.print("Collection as array: ");
        for (Object item : array) {
            System.out.print(item + " ");
        }
        
        // 13. toArray(T[] a)
        // Returns an array containing all elements of the collection, with the runtime type of the returned array being the same as that of the specified array.
        String[] stringArray = collection.toArray(new String[0]);
        System.out.println("\nCollection as array of Strings: " + String.join(", ", stringArray));
    }
    
}



// * The Collection interface in Java declares 13 unique methods (excluding inherited ones from Iterable).
// * These methods provide fundamental operations for working with collections.
// *
// * List of methods:
// * -------------------------------------------
// * ✔ int size()                  - Returns the number of elements in the collection.
// * ✔ boolean isEmpty()           - Checks if the collection is empty.
// * ✔ boolean contains(Object o)  - Verifies if the collection contains a specific element.
// * ✔ Object[] toArray()          - Converts the collection into an array.
// * ✔ <T> T[] toArray(T[] a)      - Converts the collection into a typed array.
// * ✔ boolean add(E e)            - Adds an element to the collection.
// * ✔ boolean remove(Object o)    - Removes a specific element from the collection.
// * ✔ boolean containsAll(Collection<?> c) - Checks if all elements of a given collection
//      exist in this collection.
// * ✔ boolean addAll(Collection<? extends E> c) - Adds all elements of another collection.
// * ✔ boolean removeAll(Collection<?> c) - Removes all elements present in another collection.
// * ✔ boolean retainAll(Collection<?> c) - Retains only elements that exist in another collection.
// * ✔ void clear()                - Removes all elements from the collection.
// * ✔ boolean equals(Object o)     - Compares the collection with another object for equality.
// * ✔ int hashCode()              - Returns the hash code for the collection.
// * ✔ default Spliterator<E> spliterator() - Creates a Spliterator for parallel 
//      processing (introduced in Java 8).
// * 
// * Note: The iterator() method is inherited from Iterable and is not counted here.
// 
