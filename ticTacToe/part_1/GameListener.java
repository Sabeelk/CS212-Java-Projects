import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class GameListener implements ActionListener{
  private int numClicks = 0;
  public static int state = 0;  //1 or 0 depending on Player turn
  //cannot have the same values in iniital array for winCheck
  public static int[][] play = {{2,3,4}, {5,6,7}, {8,9,10}};
  private int row;
  private int column;
  public static int moves = 0;  //keep track of moves made for a draw

  public GameListener(){
  }

  //ActionListener will control all button presses
  public void actionPerformed(ActionEvent e){
    //returns state to 0(x) or 1(o) and state increments
    state %= 2;
    //assigns button source to e
    JButton btn = (JButton)e.getSource();
    //obtain array index of each button from TicTacToe
    column = ((Integer)(btn.getClientProperty("column")));
    row = ((Integer)(btn.getClientProperty("row")));

    //sets button depending on turn
    //adds move to the play array
    //check for win after every move
    //sets draw if 9 moves have been played with no winner
    if(state == 0) {
      btn.setText("X");
      TicTacToe.player.setText("Player 2 Turn");
      play[column][row] = 0;
      if(winCheck() == true) TicTacToe.win.setText("Player 1 Wins!. Reset");
      if(moves == 8) TicTacToe.win.setText("There is a Draw!. Reset");
    }
    if(state == 1){
      btn.setText("O");
      TicTacToe.player.setText("Player 1 Turn");
      play[column][row] = 1;
      if(winCheck() == true) TicTacToe.win.setText("Player 2 Wins!. Reset");
      if(moves == 8) TicTacToe.win.setText("There is a Draw!. Reset");
    }
    state++;
    moves++;
  }

  //will check for win condition, called in actionlistener above after every click
  public boolean winCheck(){
    int c;
    //Check all columns:
    for(int i = 0; i < 3; i++) {
        c = play[i][0];
        if (c == play[i][1] && c == play[i][2])
            return true;
    }
    //Check all rows:
    for(int i = 0; i < 3; i++) {
        c = play[0][i];
        if (c == play[1][i] && c == play[2][i])
            return true;
    }
    //Check diagonals
    c = play[1][1];
    if (c == play[0][2] && c == play[2][0] ) return true;
    if (c == play[0][0] && c == play[2][2] ) return true;
    return false;
  }

  //resets the array when the ResetListener is called
  public static void resetPlay(){
    int c = 2;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        play[i][j] = c;
        c++;
      }
    }
  }
}
