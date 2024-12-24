/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistokul;
public class LinkedList implements List, java.lang.Cloneable, java.io.Serializable  {

  public LinkedList() {
    head = tail = null; 
    count = 0; 
  }
  
  public int size() {
    return count; 
  }
  
  public boolean isEmpty() {
    return (count == 0); 
  }

  public Object element(int i) {   
    assert i >= 0 && i < size();
    Node n = head; 
    for (int j = 0; n != null && j < i; j++) { 
      n = n.next;  
    }
    return n.item; 
  }

  public Object head() {
    assert !isEmpty();
    Object result = (head != null ? head.item : null); 
    assert result == element(0);
    return result; 
  }
  
  public Object last() {
    assert !isEmpty();
    Object result = (tail != null ? tail.item : null); 
    assert result == element(size() - 1);
    return result; 
  }

  public String toString() {
    StringBuffer s = new StringBuffer(); 
    int i = 0; 
    for (Node n = head; n != null; n = n.next, i++) {
      s.append("[" + i + "] = " + n.item + "\n"); 
    }
    return s.toString();
  }

  public boolean equals(Object other) {
    if (other != null && 
        other instanceof LinkedList) {
      LinkedList otherlist = (LinkedList) other;
      if (this.size() == otherlist.size()) {
        Node thisnode = this.head; 
        Node othernode = otherlist.head; 
        while (thisnode != null && othernode != null) {
          if (!thisnode.item.equals(othernode.item))
            return false; 
          thisnode = thisnode.next; 
          othernode = othernode.next; 
        }
        return true; 
      }
    }
    return false; 
  }

  public Object clone() 
    throws CloneNotSupportedException {
    LinkedList list = (LinkedList) super.clone(); 
    list.head = list.tail = null; 
    list.count = 0; 
    for (Node node = head; node != null; node = node.next) { 
      if (node.item != null) { 
	list.insertLast(node.item);
      }
    }
    return list; 
  }

  /**
   * Inserts a new element into the list at the i-th position.
   *
   * @pre  item != null && i >= 0 && i <= size()
   * @post size() == size()@pre + 1
   * @post @forall k : [0 .. size() - 1] @ 
   *         (k < i ==> element(k)@pre == element(k)) &&    
   *         (k == i ==> item@pre == element(k)) &&    
   *         (k > i ==> element(k - 1)@pre == element(k)
   */   
  public void insert(Object item, int i) {
    // assert the pre-condition 
    assert item != null && i >= 0 && i <= size();
    // assert the invaraint 
    assert _wellformed();

    // the object in pre-state, used in the post-conditions  
    int size_pre = size(); 
    LinkedList this_pre = null;
    try { 
      this_pre = (LinkedList) clone(); 
    } catch (CloneNotSupportedException e) {} 

    // begin insertion 
    if (i <= 0) {
      insertHead(item);
    } else if (i >= count) {
      insertLast(item);
    } else {
      // i > 0 && i < count; 
      Node n = head; 
      for (int j = 0; n != null && j < i - 1; j++) { 
        n = n.next;  
      }
      Node node = new Node(); 
      node.item = item; 
      node.next = n.next; 
      node.prev = n; 
      node.next.prev = node; 
      n.next = node; 
      count++; 
    }
    // end insertion 

    // assert the post-condition 
    int size_post = size(); 
    assert size_post == size_pre + 1; 

    // assert the post-condition
    // the quantified experssion is translated into a for-loop 
    boolean insertOK = true; 
    for (int k = 0; insertOK && k < size(); k++) { 
      if (k < i) { 
	insertOK = (this_pre.element(k) == element(k)); 
      } else if (k == i) { 
	insertOK = (item == element(k)); 
      } else { 
	insertOK = (this_pre.element(k - 1) == element(k)); 
      }
    }
    assert insertOK;

    // assert the invariant 
    assert _wellformed();
  }

  public void insertHead(Object item) {
    assert item != null; 
    assert _wellformed();
    Node node = new Node(); 
    node.item = item; 
    node.next = head; 
    node.prev = null; 
    if (head == null)
      tail = node;
    else 
      head.prev = node; 
    head = node; 
    count++; 
    assert _wellformed();
  }

  public void insertLast(Object item) {
    assert item != null; 
    assert _wellformed();
    Node node = new Node(); 
    node.item = item; 
    node.next = null; 
    node.prev = tail;
    if (tail != null) 
      tail.next = node; 
    else 
      head = tail = node; 
    tail = node; 
    count++; 
    assert _wellformed();
  }

  public Object remove(int i) {
    assert size() > 0;
    assert i >= 0 && i < size();
    assert _wellformed();
    Object result = null;  
    if (i <= 0) {
      result = removeHead(); 
    } else if (i >= count) {
      result = removeLast(); 
    } else {
      Node n = head; 
      for (int j = 0; n != null && j < i - 1; j++)
        n = n.next;  
      result = n.next.item; 
      n.next = n.next.next;
      n.next.prev = n; 
      count--; 
    }
    assert _wellformed();
    return result; 
  }
  
  public Object removeHead() {
    assert size() > 0;
    assert _wellformed();
    Object result = null; 
    if (head != null) {
      result = head; 
      head = head.next; 
      if (head != null)  
        head.prev = null; 
      else 
        tail = null; 
      count--;
    }
    assert _wellformed();
    return result; 
  }

  public Object removeLast() {
    assert size() > 0;
    assert _wellformed();
    Object result = null; 
    if (tail != null) {
      result = tail; 
      tail = tail.prev;
      if (tail != null)  
        tail.next = null; 
      else 
        head = null; 
      count--;
    }
    assert _wellformed();
    return result; 
  }

  protected Node head, tail; 
  protected int  count; 
   
  class Node {
    Object item; 
    Node   next; 
    Node   prev; 
  }

  /**
   * The invaraiant of the linked list implementation. 
   */
  protected boolean _wellformed() { 
    int n = 0; 
    for (Node p = head; p != null; p = p.next) { 
      n++; 
      if (p.prev != null) { 
	if (p.prev.next != p) return false;
      } else { 
	if (head != p) return false; 
      }
      if (p.next != null) { 
	if (p.next.prev != p) return false;
      } else { 
	if (tail != p) return false; 
      }
    }
    return n == count; 
  } 

}
