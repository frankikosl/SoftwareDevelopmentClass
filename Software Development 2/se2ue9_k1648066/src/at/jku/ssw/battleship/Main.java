package at.jku.ssw.battleship;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import at.jku.ssw.battleship.model.Game;
import at.jku.ssw.battleship.view.JBattleShipField;

public class Main {
  public static void main(String[] args) {
	SwingUtilities.invokeLater(Main::initialize);
  }
  private static void initialize() {
	    JBattleShipField battleShip = new JBattleShipField(Game.createRandomPlayingField(5, 8));
	    JFrame frame = new JFrame();

	    //i decided to put an icon to the game to make it cooler
	    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
	    frame.setSize(800, 600);
	    frame.setLayout(new BorderLayout());
	    frame.add(battleShip, BorderLayout.CENTER);
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    // add a JLabel that says Welcome
	    JLabel label = new JLabel("Remaining Ships: 8");
	    battleShip.getGame().addGameListener(e -> {
	    	label.setText("Remaining Ships: " + e.getGame().getShipCount());
        });
	    frame.add(label, BorderLayout.NORTH);
	    frame.setTitle("BattleShip");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
  }
}
