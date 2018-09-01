package at.jku.ssw.battleship.model;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.*;
public interface FieldListener extends EventListener{
	void fieldChanged(FieldEvent event);
}
