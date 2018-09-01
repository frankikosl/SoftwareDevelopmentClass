package at.jku.ssw.catcher;

import at.jku.ssw.catcher.swing.JCatcherField;

import javax.swing.*;
/**
* This class is the main for running the game
* @author Francisco Litvay
*/
public class Main {
	private static final int WIDTH = 800, HEIGHT = 600;
	private static final int UPDATE_DELAY_MS = 50;
	/**
	 * Initializes the model and the frame and then calls the startGame method
	 */
	public static void main(String[] args) {
		GameModel model = new GameModel(WIDTH, HEIGHT);
		JFrame frame = createGameFrame(new JCatcherField(model));
		startGame(model, frame);
	}
	/**
	 * Creates the JFrame on which the visual representation of the game 
	 * will take place.
	 * 
	 * @param content The component on which to initialize the frame
	 * @return the field ready to be used
	 */
	private static JFrame createGameFrame(JComponent content) {
		JFrame field = new JFrame("Catcher");
		field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		field.setSize(WIDTH, HEIGHT);
		field.setResizable(false);
		field.setContentPane(content);
		return field;
	}
	/**
	 * Runs the logical part of the game and connects it to its visual representation
	 * 
	 * @param model the logical model of the game
	 * @param field the visual representation of the game
	 */
	private static void startGame(GameModel model, JFrame field) {
		Timer timer = new Timer(UPDATE_DELAY_MS, e -> {
			model.update();
			field.repaint();
			if (model.isGameOver()) {
				((Timer) e.getSource()).stop();
			}
		});
		field.setVisible(true);
		timer.start();
	}
}
