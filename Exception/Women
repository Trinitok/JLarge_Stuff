import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author kellymr1
 *
 */
public class Exceptions {
	
	private static JFrame woman;

	/**
	 * @param args
	 * @throws IOException
	 *             if the image does not exist
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
			//  Set up the frame and components
			woman = new JFrame("Female Stereotype");
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			

			if (!(new File("C:\\Users\\kellymr1\\Pictures\\Girls-FullHD-29.jpg")
					.exists())) {
				throw new WomanException("She ran out on you");
			}

			// get the image if it exists
			BufferedImage image = ImageIO.read(new File(
					"C:\\Users\\kellymr1\\Pictures\\Girls-FullHD-29.jpg"));
			ImageIcon icon = new ImageIcon(image);
			JLabel lbl = new JLabel();
			lbl.setIcon(icon);
			panel.add(lbl, BorderLayout.NORTH);
			woman.add(panel);
			woman.setVisible(true);
			woman.pack();

			woman.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

			// handle memory leak issue
			woman.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					JFrame frame = (JFrame) e.getSource();

					int result = JOptionPane
							.showConfirmDialog(
									frame,
									"Are you sure you want to tell her to leave?",
									"Defeat", JOptionPane.YES_NO_OPTION);

					if (result == JOptionPane.YES_OPTION) {
						frame.dispose();
						System.gc();
						System.out.println("X has been clicked");
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						try {
							throw new WomanException();
						} catch (WomanException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "Don't worry.  You will get over her eventually");
						}
					}
				}
			});

		}

		catch (IOException e) {

		}

		catch (WomanException e) {
			
			
		}
		finally{
			
			JOptionPane.showMessageDialog(null, "Babe, I don't want to make you sandwhiches anymore");
		}

	}

}
