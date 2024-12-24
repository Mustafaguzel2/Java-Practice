// Kaynak kodlar içinde yer alan Maze.java, Command pattern
// kulanýlarak yazýlmýþ son versiyondur. Konuyu daha sade
// anlatabilmek için kitapta Sayfa 475 ve 476 'daki
// MazeBoard kodlarýna karþýlýk gelen bu dosya hazýrlanmýþtýr.
// Dosya isminin Maze2.java olmasý, dizindeki esas
// Maze.java ile karýþmamasý içindir.


package maze; 

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Maze implements Cloneable { 

  public Object clone() throws CloneNotSupportedException { 
    return super.clone();
  }

  public void addRoom(Room room) { 
    if (room != null) { 
      rooms.add(room); 
    }
  }

  public Room findRoom(int roomNumber) { 
    for (int i = 0; i < rooms.size(); i++) { 
      Room room = (Room) rooms.get(i);
      if (roomNumber == room.getRoomNumber()) { 
	return room; 
      }
    }
    return null;
  }

  public void setCurrentRoom(int roomNumber) { 
    Room room = findRoom(roomNumber);
    setCurrentRoom(room);
  }

  public void setCurrentRoom(Room room) {     
    if (room != curRoom) { 
      if (curRoom != null) { 
	curRoom.setInRoom(false);
      }
      if (room != null) {       
	room.setInRoom(true);
	curRoom = room;
      }
      if (view != null) { 
	view.repaint();
      }
    }
  }

  public Room getCurrentRoom() {
    return curRoom; 
  }
  
  
  public void draw(Graphics g) { 
  // Draw the maze board on the view component
  }

      
  protected List rooms = new ArrayList(); 
  protected Room curRoom = null; 
  protected Component view; 
  
}
