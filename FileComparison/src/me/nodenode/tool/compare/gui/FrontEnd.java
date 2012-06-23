package me.nodenode.tool.compare.gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class FrontEnd extends JFrame {

	public FileSelectorPanel filePanel = new FileSelectorPanel();
	
	public FrontEnd() {
		super("main");
	}
	public void entryPoint() {
		Container content = getContentPane();

		
		setJMenuBar(menuBar());
		
		content.add(panelDivider());
		
		
		setSize(new Dimension(410, 510));
		setVisible(true);
	}
	
	
	private JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();

		JMenu file = new JMenu("File");
		bar.add(file);
		JMenu edit = new JMenu("Edit");
		bar.add(edit);
		JMenu help = new JMenu("Help");
		bar.add(help);

		return bar;
	}
	
	private JPanel panelDivider() {
		JPanel mainPanel = new JPanel();
		
		//Middle Panel
		JPanel middlePanel = new JPanel();
		middlePanel.add(new JButton(" COMPARE "));
		mainPanel.add(middlePanel);
		
		
		//End Panel
		JPanel endPanel = new JPanel();
		mainPanel.add(filePanel.fileChooser());
	
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS)); 
		return mainPanel;
	}
	
}
