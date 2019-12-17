package chess;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ChessDriver
{
	
	public static void main(String[] args)
    {
        Runnable r = new Runnable()
        {
            @Override
            public void run() {
                Board cb = new Board();
                JFrame f = new JFrame("ChessChamp");
                f.add(cb.getGui());
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setLocationByPlatform(true);
                f.pack();
                f.setMinimumSize(f.getSize());
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
