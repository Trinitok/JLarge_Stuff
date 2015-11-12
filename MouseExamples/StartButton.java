import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * TODO Put here a description of what this class does.
 *
 * @author kellymr1.
 *         Created Sep 7, 2013.
 */
public class StartButton extends JButton implements ActionListener {
	
	private static final Color DEFAULT_COLOR = Color.GREEN;
	private AnimatedPanel squarePanel;
	private boolean hasBeenPressed;
	
	/**
	 * TODO Put here a description of what this constructor does.
	 *
	 * @param title
	 * @param panel
	 */
	public StartButton(String title, AnimatedPanel panel) {
		super(title);
		
		this.squarePanel = panel;
		this.hasBeenPressed = false;
		
		this.setBackground(StartButton.DEFAULT_COLOR);
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// Create a new thread for the panel and start it running, all in one shot
		(new Thread(this.squarePanel)).start();
		
		this.hasBeenPressed = true;
	}
	
	/**
	 * TODO Put here a description of what this method does.
	 *
	 * @return whether it has been preesed
	 */
	public boolean hasBeenPressed() {
		return this.hasBeenPressed;
	}
}
