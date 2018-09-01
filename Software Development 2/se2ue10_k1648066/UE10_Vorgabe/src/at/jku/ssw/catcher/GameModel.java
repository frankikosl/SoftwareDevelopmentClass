package at.jku.ssw.catcher;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * The model for the alien game.
 * 
 * @author Markus
 * @version 1.0
 * @since 1.0
 */
public class GameModel implements Iterable<Alien> {

	/** Constant for the minimla number of aliens */
	private static final int MIN_ALIENS = 3;
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	/** The width of the game field */
	private final int width;
	/** The height of the game field */
	private final int height;
	/** The scores reached by the player */
	private int score;
	/** The lives of the player, initially 3 */ 
	private int lives = 3;
	/**
	 * Constructor initializing the width and the height of the game field. 
	 * 
	 * @param width the width of the game field
	 * @param height the height of the game field
	 */
	public GameModel(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * Progresses the game state by a step.
	 * @variable valuesToRemove ArrayList created to add the values which will be removed
	 * If i didn't use it, the iterator would give an exception as i would be removing entries
	 * of the list while iterating
	 * 
	 */
	public void update() {
		ArrayList<Alien> valuesToRemove = new ArrayList<Alien>();
		this.forEach(alien -> alien.update());
		this.forEach(alien -> {
			if(alien.isGone()) {
				valuesToRemove.add(alien);
				lives--;
			}
			if(alien.isCaptured()) {
				valuesToRemove.add(alien);
				score++;
			}
		});
		aliens.removeAll(valuesToRemove);
		if(aliens.size() < MIN_ALIENS) {
			aliens.add(FactorySingleton.ALIEN.create(width, height));
		}
	}

	/**
	 * Gets the currently reached score in this game. 
	 * 
	 * @return the currently reached score 
	 */
	public int getScore() {
		return score;
	}

	/** 
	 * Gets the remaining lives for the player. 
	 * 
	 * @return the remaining lives
	 */
	public int getLives() {
		return lives;
	}

	/**
	 * Tests if the game is over, i.e., if lives is zero. 
	 * 
	 * @return <code>true</code> if the number of lives is zero, <code>false</code> otherwise
	 */
	public boolean isGameOver() {
		return lives == 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Alien> iterator() {
		return aliens.iterator();
	}
}
