package jgraphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class GrafikKullanımı extends JPanel{

    public GrafikKullanımı() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        
        g.drawRect(100, 10, 30, 40);
        g.fillRect(200, 100, 30, 40);
        
        g.setColor(Color.BLUE);
        g.drawOval(300, 200, 60, 40);
        g.fillOval(400, 200, 40, 40);
        
        g.setColor(Color.YELLOW);
        g.drawLine(500, 500, 200, 200);
    }
    
}
