package Dieciseisavo;

// Fig. 12.44: DemoGridLayout.java
// MarcoGridLayout test.
import javax.swing.JFrame;

public class DemoGrid {
    public static void main(String[] args) {
        FrameGridLayout frameGridLayout = new FrameGridLayout();
        frameGridLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGridLayout.setSize(300, 200);
        frameGridLayout.setVisible(true);
    }
} // end of DemoGridLayout class