package chess;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;


public class Board implements ActionListener
{
	public static Peices[] pieces = {
		new Rook(0,0,false),//0
		new Rook(7,0,false),//1
		new Rook(0,7,true),//2
		new Rook(7,7,true),//3
		new Bishop(2,0,false),//4
		new Bishop(5,0,false),//5
		new Bishop(2,7,true),//6
		new Bishop(5,7,true),//7
		new Knight(1,0,false),//8
		new Knight(6,0,false),//9
		new Knight(1,7,true),//10
		new Knight(6,7,true),//11
		new King(3,0,false),//12
		new King(3,7,true),//13
		new Queen(4,0,false),//14
		new Queen(4,7,true),//15
		new Pawn(0,1,false),//16
		new Pawn(1,1,false),//17
		new Pawn(2,1,false),//18
		new Pawn(3,1,false),//19
		new Pawn(4,1,false),//20
		new Pawn(5,1,false),//21
		new Pawn(6,1,false),//22
		new Pawn(7,1,false),//23
		new Pawn(0,6,true),//24
		new Pawn(1,6,true),//25
		new Pawn(2,6,true),//26
		new Pawn(3,6,true),//27
		new Pawn(4,6,true),//28
		new Pawn(5,6,true),//29
		new Pawn(6,6,true),//30
		new Pawn(7,6,true)//31
	};
	int sX = 0;
	int sY = 0;
	boolean click1 = false;
    private final JPanel gui = new JPanel(new BorderLayout(3, 3));
    private JButton[][] chessBoardSquares = new JButton[8][8];
    private JPanel chessBoard;
    int i1 = 0;
    int j1 = 0;
    Board() 
    {
        initializeGui();
    }
    public final void initializeGui() {
        chessBoard = new JPanel(new GridLayout(0, 9));
        chessBoard.setBorder(new LineBorder(Color.BLACK));
        gui.add(chessBoard);
        Insets buttonMargin = new Insets(0,0,0,0);
        for (int i = 0; i < chessBoardSquares.length; i++)
        {
            for (int j = 0; j < chessBoardSquares.length; j++)
            {
                JButton b = new JButton();
                b.setMargin(buttonMargin);
                i1 = i;
                j1 = j;
                ImageIcon icon = new ImageIcon(new BufferedImage(30, 30,BufferedImage.TYPE_INT_BGR));
                b.addActionListener(this);
                for (int k = 0; k < pieces.length; k++ ){
                	 if(pieces[k].getPos()[0]==j&&pieces[k].getPos()[1]==i)  {
                		 if(pieces[k].getClass()!=Peices.class)  {
                			 b.setIcon(icon);                        	                			 
                		 }
                     }
				}
                if ((j % 2 == 1 && i % 2 == 1)||(j % 2 == 0 && i % 2 == 0))
                {
                    b.setBackground(Color.WHITE);
                } 
                else 
                {
                    b.setBackground(Color.BLACK);
                }
                chessBoardSquares[j][i] = b;
            }
        }
        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++)
            {
                switch (j)
                {
                    case 0:
                        chessBoard.add(new JLabel("" ,SwingConstants.CENTER));
                    default:
                        chessBoard.add(chessBoardSquares[j][i]);
                }
            
         }
        }
    }
    public final JComponent getChessBoard()
    {
        return chessBoard;
    }

    public final JComponent getGui()
    {
        return gui;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!click1)
		{
			click1 = !click1;
			sX=j1;
			sY=i1;
		}
		else
		{
			 for (int k = 0; k < pieces.length; k++ ){
            	 if(pieces[k].getPos()[0]==sX&&pieces[k].getPos()[1]==sY)  {
            		pieces[k].setPos(new int[] {j1, i1});                        	                			 
                 }
			}
		}
		pieces[0].setPos(new int[] {7,7});
		
	}
}
