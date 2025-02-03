package com.collection.list;

import java.util.List;
import java.util.ArrayList;

public class N_1_ListMethodsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 1. void add(int index, E element)
        // Inserts the specified element at the specified position in this list.
        list.add(0, "First");
        list.add(1, "Second");
        
        // 2. boolean addAll(int index, Collection<? extends E> c)
        // Inserts all elements of the specified collection into this list at the specified position.
        List<String> newList = new ArrayList<>();
        newList.add("Third");
        newList.add("Fourth");
        list.addAll(2, newList);
        
        // 3. E get(int index)
        // Returns the element at the specified position in this list.
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
        
        // 4. int indexOf(Object o)
        // Returns the index of the first occurrence of the specified element in this list, or -1 if not found.
        int index = list.indexOf("Third");
        System.out.println("Index of 'Third': " + index);
        
        // 5. int lastIndexOf(Object o)
        // Returns the index of the last occurrence of the specified element, or -1 if not found.
        list.add("First"); // Adding duplicate to test lastIndexOf
        int lastIndex = list.lastIndexOf("First");
        System.out.println("Last index of 'First': " + lastIndex);
        
        // 6. ListIterator<E> listIterator()
        // Returns a list iterator over the elements in this list in proper sequence.
        var listIterator = list.listIterator();
        System.out.print("List using listIterator: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        
        // 7. ListIterator<E> listIterator(int index)
        // Returns a list iterator starting from the specified index.
        var listIteratorFromIndex = list.listIterator(2);
        System.out.print("List from index 2 using listIterator: ");
        while (listIteratorFromIndex.hasNext()) {
            System.out.print(listIteratorFromIndex.next() + " ");
        }
        System.out.println();
        
        // 8. E remove(int index)
        // Removes the element at the specified position and returns it.
        String removedElement = list.remove(2);
        System.out.println("Removed element: " + removedElement);
        
        // 9. E set(int index, E element)
        // Replaces the element at the specified position with the given element.
        list.set(1, "Updated Second");
        System.out.println("Updated list: " + list);
        
        // 10. List<E> subList(int fromIndex, int toIndex)
        // Returns a view of the portion of this list between the specified indices.
        List<String> subList = list.subList(1, 3);
        System.out.println("SubList from index 1 to 3: " + subList);
    }
    
}
