package at.jku.ssw.battleship.model;
import java.awt.*;
import java.util.EventListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public interface GameListener extends EventListener {
	void gameChanged(GameEvent event);
}
