package chess;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
 
public class Board 
{
	private static Pieces[][] pieces = {
			{new Rook(0,0,false),new Knight(1,0,false),new Bishop(2,0,false),new Queen(3,0,false),
				new King(4,0,false),new Bishop(5,0,false),new Knight(6,0,false),new Rook(7,0,false)},
			{new Pawn(0,1,false),new Pawn(1,1,false),new Pawn(2,1,false),new Pawn(3,1,false),
					new Pawn(4,1,false),new Pawn(5,1,false),new Pawn(6,1,false),new Pawn(7,1,false)},
			{new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces()},
			{new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces()},
			{new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces()},
			{new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces(),new Pieces()},
			{new Pawn(0,6,true),new Pawn(1,6,true),new Pawn(2,6,true),new Pawn(3,6,true),
				new Pawn(4,6,true),new Pawn(5,6,true),new Pawn(6,6,true),new Pawn(7,6,true)},
			{new Rook(0,7,true),new Knight(1,7,true),new Bishop(2,7,true),new Queen(3,7,true),
					new King(4,7,true),new Bishop(5,7,true),new Knight(6,7,true),new Rook(7,7,true)}
		};
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		Scanner sc1 = new Scanner(System.in);
		while(true) 
		{
			for (int i = 0; i < pieces.length+1; i++) {
				for (int j = 0; j < pieces.length+1; j++) {
					if(i==0) 
					{
						if(j==0)
						{
							System.out.print(" \t");
						}
						else
						{							
							System.out.print(j-1+" ");
						}
					}
					else 
					{
						if(j==0)
						{
							System.out.print(i-1 + "\t");
						}
						else 
						{
							System.out.print(pieces[i-1][j-1].getClassChar()+" "); 
						}
					}
				}
				System.out.println();
			}
			System.out.println("Enter the Piece postion of the Piece you want to move! (int x, int y)");
			b = sc1.nextInt();
			a = sc1.nextInt();
			System.out.println("Enter the new Piece postion of the Piece you want to move!");
			d = sc1.nextInt();
			c = sc1.nextInt();
			if(pieces[a][b].isValidMove(new int[] {d,c})&&pieces[a][b].compareTo(pieces[c][d])!=1) 
			{
				pieces[c][d] = pieces[a][b];
				pieces[a][b] = new Pieces();
				pieces[c][d].setPos(new int[] {d,c});
			}
		}
	}
}
 
