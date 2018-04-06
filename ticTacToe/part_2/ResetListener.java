import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class ResetListener implements ActionListener{

  public ResetListener(){
  }

  //resets all static attributes for the game
  public void actionPerformed(ActionEvent e){
    GameListener.resetPlay();
    GameListener.state = 0;
    GameListener.moves = 0;
    TicTacToe.win.setText("...");
    TicTacToe.player.setText("Begin Game: Player 1 Turn");

    for(int i = 0; i < TicTacToe.buttons.length; i++){
      for(int j = 0; j < TicTacToe.buttons[i].length; j++){
        TicTacToe.buttons[i][j].setText("");
      }
    }
  }
}
