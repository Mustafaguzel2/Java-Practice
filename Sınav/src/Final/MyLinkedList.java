
package Final;

import java.util.Stack;


public class MyLinkedList {
  public MyLinkedList() {
    head = tail = null;
}
  private Node head, tail;
  class Node {
    String item;
    Node   next;
    Node   prev;
    }
  public void addtoStart(String str) {
        Node newNode = new Node();
        newNode.item = str;
        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }

        head = newNode;
    }

    public String getElement(int i) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == i) {
                return current.item;
            }
            current = current.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index bulunamadı!");
    }

    public Node removeHead() {
        if (head == null) {
            throw new NullPointerException("Liste boş.");
        }

        Node removedNode = head;
        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }

        return removedNode;
    }

    public Node removeLast() {
        if (tail == null) {
            throw new NullPointerException("Liste boş.");
        }

        Node removedNode = tail;
        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        return removedNode;
    }
    public Node remove(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Index bulunamadı!");
        }

        if (i == 0) {
            return removeHead();
        }

        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == i) {
                Node removedNode = current;
                current.prev.next = current.next;

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                return removedNode;
            }
            current = current.next;
            count++;
        }

        throw new IndexOutOfBoundsException("Index bulunamadı!");
    }

    public void printOut() {
        Node current = head;

        while (current != null) {
            System.out.print(current.item + ", ");
            current = current.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addtoStart("Eleman 5");
        list.addtoStart("Eleman 4");
        list.addtoStart("Eleman 3");
        list.addtoStart("Eleman 2");
        list.addtoStart("Eleman 1");

        System.out.println("Silmeden önce: ");
        list.printOut();

        Node removedNode = list.remove(2);
        System.out.println("Silinen eleman: " + removedNode.item);

        System.out.println("Sildikten sonra: ");
        list.printOut();

        // Stack kullanarak listeyi ters yazdırma
        Stack<String> stack = new Stack<>();

        Node current = list.head;
        while (current != null) {
            stack.push(current.item);
            current = current.next;
        }

        System.out.println("Tersten sıralanmış liste: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + ", ");
        }
    }
}
