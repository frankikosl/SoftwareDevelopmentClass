package at.jku.ssw.battleship.model;

import java.util.EventObject;

public class GameEvent extends EventObject {
	private final Game game;
	public GameEvent(Object source, Game game) {
		super(source);
		this.game = game;
		// TODO Auto-generated constructor stub
	}
	public Game getGame() {
		return game;
	}


}
