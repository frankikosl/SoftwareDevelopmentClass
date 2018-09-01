package at.jku.ssw.catcher.swing;

import at.jku.ssw.catcher.GameModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Swing component for displaying the aliens. 
 * 
 * @author Markus
 * @version 1.0
 * @since 1.0
 */
public class JCatcherField extends JComponent {
	
	/** The model for the alien game */
	private final GameModel model;

	/**
	 * Constructor initializing the model and registering the mouse listener. 
	 * 
	 * @param model the game model 
	 */
	public JCatcherField(GameModel model) {
		this.model = model;
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				model.forEach(alien -> alien.hit(x, y));
			}
		});
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setBackground(Color.WHITE);
		g2d.clearRect(0, 0, getWidth(), getHeight());
		model.forEach(alien -> alien.paint(g2d));
		g2d.setColor(Color.BLACK);
		g2d.drawString("Lives: " + model.getLives() + ", Score: " + model.getScore(), 10, 20);
	}
}
