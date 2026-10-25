package com.internship.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLinkedList Queue");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter item: ");
                    String item = scanner.nextLine();
                    if (item.trim().isEmpty()) {
                        System.out.println("Item cannot be empty.");
                    } else {
                        queue.offer(item);
                        System.out.println("Enqueued: " + item);
                    }
                    break;
                case "2":
                    String removed = queue.poll();
                    if (removed == null) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Dequeued: " + removed);
                    }
                    break;
                case "3":
                    String front = queue.peek();
                    if (front == null) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Front item: " + front);
                    }
                    break;
                case "4":
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue (front to rear): " + queue);
                    }
                    break;
                case "5":
                    System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
                    break;
                case "6":
                    scanner.close();
                    System.out.println("Program ended.");
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1-6.");
            }
        }
    }
}
