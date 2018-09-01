package at.jku.ssw.battleship.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JLabel;

import at.jku.ssw.battleship.model.Field;
import at.jku.ssw.battleship.model.Game;
import at.jku.ssw.battleship.model.GameEvent;
import at.jku.ssw.battleship.model.GameListener;
import at.jku.ssw.battleship.model.State;

public class JBattleShipField extends JComponent {
	private final Game game;
    private Rectangle selectedCell = null;
	public JBattleShipField(Field field) {
	    this.game = new Game(field);
	    addMouseListener(drawGameListener);
	    game.getField().addFieldListener(event -> repaint());
	  }
	  @Override
	  protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          int w=getWidth();
          int h=getHeight();
          Graphics2D g2d = (Graphics2D) g;

          g2d.setPaint(Color.BLUE);
          g2d.fill(new Rectangle2D.Double(0, 0, w, h));
          g2d.setColor(Color.WHITE);
          g2d.setStroke(new BasicStroke(3));
          for (int row = 0; row < 5; row++) {
              for (int col = 0; col < 5; col++) {
                  int x = (w / 5) * col;
                  int y = (h / 5) * row;
                  if (game.getField().field[row][col] == State.MISS) {
                	  g2d.draw(new Ellipse2D.Double(x + 5, y + 5, w/5 - 10, h/5 - 10));
                  }
                  if (game.getField().field[row][col] == State.HIT) {
                	  g2d.draw(new Line2D.Double(x, y, x + w/5, y + h/5 ));
                	  g2d.draw(new Line2D.Double(x, y + h/5, x + w/5, y));
                  }
                  
              }
          }
          g2d.setPaint(Color.BLACK);
          g2d.setStroke(new BasicStroke(4));
          g2d.draw(new Line2D.Double(0, h/5, w, h/5));
          g2d.draw(new Line2D.Double(0, h*2/5, w, h*2/5));
          g2d.draw(new Line2D.Double(0, h*3/5, w, h*3/5));
          g2d.draw(new Line2D.Double(0, h*4/5, w, h*4/5));
          g2d.draw(new Line2D.Double(w/5, 0, w/5, h));
          g2d.draw(new Line2D.Double(w*2/5, 0, w*2/5, h));
          g2d.draw(new Line2D.Double(w*3/5, 0, w*3/5, h));
          g2d.draw(new Line2D.Double(w*4/5, 0, w*4/5, h));
	  }
	
	  private final MouseListener drawGameListener = new MouseAdapter() {
		    int w, h;
		    @Override
		    public void mousePressed(MouseEvent e) {
		      int w = getWidth();
	          int h = getHeight();
	            selectedCell = null;
	            for (int col = 0; col < 5 && selectedCell == null; col++) {
	                for (int row = 0; row < 5; row++) {
	                    int x = (w / 5) * col;
	                    int y = (h / 5) * row;
	                    Rectangle cell = new Rectangle(x, y, w / 5, h / 5);
	                    if (cell.contains(e.getPoint())) {
	                    	game.fireAt(row, col);
	                    	game.fireEventGame(game);
	                        selectedCell = cell;
	                        game.getField().fireEventField(game.getField());
	                        break;
	                    }
	                }
	            }
		    }
	};

	public Game getGame() {
		return game;
	}
}
