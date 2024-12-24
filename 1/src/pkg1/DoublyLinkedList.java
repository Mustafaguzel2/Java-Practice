/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Metodlar

    // Listeye film ekleme
    public void addMovie(Movie movie) {
        Node newNode = new Node(movie);
        
        // Liste boş ise
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // Yeni film ilk film olacaksa
        else if (movie.getYear() < head.getMovie().getYear() ||
                (movie.getYear() == head.getMovie().getYear() && movie.getTitle().compareTo(head.getMovie().getTitle()) < 0)) {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        // Yeni film sona eklenecekse
        else if (movie.getYear() > tail.getMovie().getYear() ||
                (movie.getYear() == tail.getMovie().getYear() && movie.getTitle().compareTo(tail.getMovie().getTitle()) > 0)) {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        // Yeni film araya eklenecekse
        else {
            Node current = head;
            
            while (current.getNext() != null &&
                    (movie.getYear() > current.getMovie().getYear() ||
                            (movie.getYear() == current.getMovie().getYear() && movie.getTitle().compareTo(current.getMovie().getTitle()) > 0))) {
                current = current.getNext();
            }
            
            newNode.setNext(current);
            newNode.setPrevious(current.getPrevious());
            current.getPrevious().setNext(newNode);
            current.setPrevious(newNode);
        }
    }

    // Belirli bir filmi silme
    public void deleteMovie(String movieName) {
        Node current = head;

        while (current != null) {
            if (current.getMovie().getTitle().equals(movieName)) {
                Node previous = current.getPrevious();
                Node next = current.getNext();

                if (previous != null)
                    previous.setNext(next);
                else
                    head = next;

                if (next != null)
                    next.setPrevious(previous);
                else
                    tail = previous;

                break;
            }

            current = current.getNext();
        }
    }

    // Listeyi baştan yazdırma
    public void printFromHead() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getMovie());
            current = current.getNext();
        }
    }

    // Listeyi sondan yazdırma
    public void printFromTail() {
        Node current = tail;

        while (current != null) {
            System.out.println(current.getMovie());
            current = current.getPrevious();
        }
    }

    // 2000 yılından önceki filmleri yazdırma
    public void printMoviesBeforeYear(int year) {
        Node current = head;

        while (current != null) {
            if (current.getMovie().getYear() < year) {
                System.out.println(current.getMovie());
            }
            current = current.getNext();
        }
    }

    // Liste içeriğini dosyaya yazma
    public void saveToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);

            Node current = head;

            while (current != null) {
                writer.write(current.getMovie().toString() + "\n");
                current = current.getNext();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}