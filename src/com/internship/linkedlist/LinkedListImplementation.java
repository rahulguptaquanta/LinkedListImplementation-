package com.internship.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListImplementation {
    private static final LinkedList<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n=== LinkedList Queue Implementation ===");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display queue");
                System.out.println("4. Peek");
                System.out.println("5. Check if queue is empty");
                System.out.println("6. Display queue size");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");

                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        enqueue(scanner);
                        break;
                    case "2":
                        dequeue();
                        break;
                    case "3":
                        displayQueue();
                        break;
                    case "4":
                        peek();
                        break;
                    case "5":
                        System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
                        break;
                    case "6":
                        System.out.println("Queue size: " + queue.size());
                        break;
                    case "7":
                        running = false;
                        System.out.println("Program closed.");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose from 1 to 7.");
                }
            }
        }
    }

    private static void enqueue(Scanner scanner) {
        System.out.print("Enter an element: ");
        String value = scanner.nextLine().trim();

        if (value.isEmpty()) {
            System.out.println("Element cannot be empty.");
            return;
        }

        queue.addLast(value);
        System.out.println("Element added to the queue.");
    }

    private static void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Nothing to remove.");
            return;
        }

        String value = queue.removeFirst();
        System.out.println("Removed element: " + value);
    }

    private static void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");
        for (String value : queue) {
            System.out.println(value);
        }
    }

    private static void peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Front element: " + queue.getFirst());
    }
}
