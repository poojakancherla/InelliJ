package com.company;

import java.util.Scanner;

public class Main
{


    class Game
    {
        Piece [][] board;
        // Constructor creates an empty board
        Game()
        {
            board = new Piece[8][8];
        }
    }


    class Position
    {
        int row;
        int column;
        // Constructor using row and column values
        Position(int r, int c)
        {
            this.row = r;
            this.column = c;
        }
    }


    class Piece extends Position
    {
        Position position;
        boolean isValidMove(Position newPosition)
        {

            if(position.row>0 && position.column>0
                    && position.row<8 && position.column<8)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


//    class Rock extends Piece{
//        boolean isValidMove(Position newPosition){
//            if(newPosition.column == this.column || newPosition.row == this.row){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//    }

    class Valid extends Piece
    {
        Position testPosition = new Position(3,10);
        boolean x = isValidMove(testPosition);
        if(x == "true")
        {
            System.out.println("Yes, I can move there.");
        }
        else
        {
            System.out.println("Nope, cannot!");
        }
    }


    public static void main(String[] args)
    {
        Valid();
    }

    }




