import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();
    JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                                      panel, panel2);
    //array that holds the button object of the game
    public static JButton[][] buttons = new JButton[3][3];
    public static JButton player = new JButton("Begin Game: Player 1 Turn");
    public static JButton win = new JButton("...");
    private JButton reset = new JButton("Press to Reset");
    private final int WINDOW_WIDTH = 700; // Window width in pixels
    private final int WINDOW_HEIGHT = 400; //Window height in pixels

    public TicTacToe(){
        //intiilizing layout for panel1
        panel.setLayout(new GridLayout(3,4,5,5));
        panel2.setLayout(new GridLayout(3,4,5,5));
        setTitle("Tic Tac Toe");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        setVisible(true);

        //initialize the JsplitPane attributes
        add(split);
        split.setDividerLocation(400);
		    split.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		    split.setVisible(true);
    }

    private void buildPanel(){
      //add the buttons to the 2nd panel
      reset.addActionListener(new ResetListener());
      panel2.add(player);
      panel2.add(win);
      panel2.add(reset);

      //add the game buttons of the first panel
      for(int i = 0; i < buttons.length; i++){
        for(int j = 0; j < buttons[i].length; j++){
          buttons[i][j] = new JButton();
          buttons[i][j].addActionListener(new GameListener());
          //Sets Font
          buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 50));
          //allows the array indices to be stored for use in the GameListener
          buttons[i][j].putClientProperty("column", i);
          buttons[i][j].putClientProperty("row", j);
          panel.add(buttons[i][j]);
        }
      }
    }
}
