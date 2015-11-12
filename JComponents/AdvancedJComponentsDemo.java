package JComponents;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Demonstrate the use of different Swing JComponents.
 *
 * @author fahslaj.
 *         Created Oct 27, 2013.
 */
public class AdvancedJComponentsDemo 
{
	/**
	 * Run the demonstration.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		addJSlider(frame);
		addJRadioButtons(frame);
		addJScrollPaneAndJTable(frame);
		addJToolBar(frame);
		addJMenuBar(frame);
		
		frame.setVisible(true);
	}
	
	private static void addJSlider(JFrame frame)
	{
		JSlider slid = new JSlider(1,5,3);
		slid.setPaintLabels(true);
		slid.setPaintTicks(true);
		slid.setMajorTickSpacing(1);
		frame.add(slid,BorderLayout.NORTH);
	}
	
	private static void addJRadioButtons(JFrame frame)
	{
		// used to determine which buttons are mutually exclusive
		ButtonGroup bg = new ButtonGroup(); 
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		
		for (int i = 0; i < 5; i++)
		{
			JRadioButton b = new JRadioButton(""+(i+1));
			
			bg.add(b);
			p.add(b);
		}
		frame.add(p,BorderLayout.EAST);
	}
	
	private static void addJScrollPaneAndJTable(JFrame frame)
	{
		JScrollPane jsp = new JScrollPane();
		int dim = 18;
		Object[][] labels = new Object[dim][dim];
		int j = 1;
		// create data
		for (int i = 0; i < dim; i++)
			for (int k = 0; k < dim; k++)
				labels[i][k] = j++;
		// create headers
		String[] headers = new String[dim];
		for (int i = 0; i < dim; i++)
			headers[i] = "Column "+(i-1);
		
		JTable table = new JTable(new DefaultTableModel(labels,headers));
		jsp.getViewport().add(table); // add table to JScrollPane
		jsp.setVisible(true);
		frame.add(jsp,BorderLayout.CENTER);
	}
	
	private static void addJToolBar(JFrame frame)
	{
		JToolBar jtb = new JToolBar();
		jtb.add(new JButton("First"));
		jtb.add(new JButton("Second"));
		jtb.add(new JButton("Third"));
		jtb.addSeparator();
		jtb.add(new JButton("Fourth"));
		jtb.add(new JButton("Fifth"));
		frame.add(jtb,BorderLayout.SOUTH);
	}
	
	private static void addJMenuBar(JFrame frame)
	{
		JMenuBar jmb = new JMenuBar();
		JMenu[] menus = new JMenu[3];
		
		/*
		 * This code creates three JMenus and adds 
		 * three JMenuItems to each, then adds each
		 * JMenu to the JMenuBar.
		 */
		for (int i = 1; i < 4; i++)
		{
			menus[i-1] = new JMenu("Menu "+i);
			for (int j = 1; j < 4; j++)
				menus[i-1].add(new JMenuItem(i+" MenuItem "+j));
			jmb.add(menus[i-1]);
		}
		
		frame.setJMenuBar(jmb);
	}
}
