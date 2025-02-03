package com.collection.list.vector;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;


public class N_5_VectorClassMethodsExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();
        // 1. addElement(E obj) - Adds an element to the end of the Vector.
        vector.addElement("Apple");
        // Adds "Apple" to the Vector.

        // 2. capacity() - Returns the current capacity of the Vector.
        int capacity = vector.capacity();
        System.out.println("Capacity: " + capacity);
        // Returns the capacity (default is 10).

        // 3. copyInto(Object[] anArray) - Copies elements into an array.
        String[] array = new String[vector.size()];
        vector.copyInto(array);
        System.out.println("Copied Array: " + Arrays.toString(array));
        // Copies Vector elements into the array.

        // 4. elementAt(int index) - Returns the element at the specified index.
        if (vector.size() > 0) {
            String element = vector.elementAt(0);
            System.out.println("Element at index 0: " + element);
            // Returns the element at index 0.
        }

        // 5. elements() - Returns an enumeration of the elements.
        Enumeration<String> enumeration = vector.elements();
        System.out.print("Elements: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();
        // Provides an enumeration to iterate over elements.

        // 6. ensureCapacity(int minCapacity) - Increases the capacity if necessary.
        vector.ensureCapacity(20);
        System.out.println("New Capacity: " + vector.capacity());
        // Ensures the Vector can hold at least 20 elements.

        // 7. firstElement() - Returns the first element of the Vector.
        if (!vector.isEmpty()) {
            String firstElement = vector.firstElement();
            System.out.println("First Element: " + firstElement);
            // Returns the first element.
        }

        // 8. insertElementAt(E obj, int index) - Inserts an element at the specified index.
        vector.insertElementAt("Banana", 1);
        System.out.println("After inserting 'Banana' at index 1: " + vector);
        // Inserts "Banana" at index 1.

        // 9. lastElement() - Returns the last element of the Vector.
        if (!vector.isEmpty()) {
            String lastElement = vector.lastElement();
            System.out.println("Last Element: " + lastElement);
            // Returns the last element.
        }

        // 10. removeAllElements() - Removes all elements from the Vector.
        vector.removeAllElements();
        System.out.println("After removing all elements: " + vector);
        // Clears the Vector.

        // 11. removeElement(Object obj) - Removes the first occurrence of the element.
        boolean isRemoved = vector.removeElement("Apple");
        System.out.println("Is 'Apple' removed? " + isRemoved);
        // Removes "Apple" if present.

        // 12. removeElementAt(int index) - Removes the element at the specified index.
        if (vector.size() > 0) {
            vector.removeElementAt(0);
            System.out.println("After removing element at index 0: " + vector);
            // Removes the element at index 0.
        } else {
            System.out.println("Cannot remove element: Vector is empty.");
        }

        // 13. setElementAt(E obj, int index) - Sets the element at the specified index.
        if (vector.size() > 0) {
            vector.setElementAt("Cherry", 0);
            System.out.println("After setting element at index 0: " + vector);
            // Sets the element at index 0 to "Cherry".
        } else {
            System.out.println("Cannot set element: Vector is empty.");
        }

        // 14. setSize(int newSize) - Sets the size of the Vector.
        vector.setSize(5);
        System.out.println("After setting size to 5: " + vector);
        // Sets the size of the Vector to 5.

        // 15. trimToSize() - Trims the capacity to the current size.
        vector.trimToSize();
        System.out.println("Capacity after trimming: " + vector.capacity());
        // Reduces the capacity to match the size.

        // Print the final Vector
        System.out.println("Final Vector: " + vector);
    }
}

