import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Demonstrate the use of Images on JComponents, specifically a JButton.
 *
 * @author mayja1.
 *         Created Oct 27, 2013.
 */
public class ImageDemo extends JFrame{
	JButton image;

	
	/**
	 * Create a new JFrame with a specified image.
	 */
	public ImageDemo(){
		this.setSize(new Dimension(1000, 1000));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Image Demo");
		this.image= new JButton();
		  JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & PNG Images", "jpg", "png");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(this);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getName());
		    }
		  
		    //DONE Create an image from the file you selected and add it as an ImageIcon to the JButton
		    image.setIcon(new ImageIcon(chooser.getSelectedFile().getAbsolutePath()));
		    this.add(this.image);
		    this.setVisible(true);
	}

	/**
	 * Run the program by creating an ImageDemo frame
	 *
	 * @param args
	 */
	public static void main(String[] args){
		JFrame frame= new ImageDemo();
	}
}


