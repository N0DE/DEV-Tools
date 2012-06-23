package me.nodenode.tool.compare.gui;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileSelectorPanel {
	
	JFileChooser fileChoserOne = new JFileChooser();
	JFileChooser fileChoserSec = new JFileChooser();

	public JPanel fileChooser() {
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("Select First File"));
		panel.add(fileChoserOne);

		panel.add(new JLabel("Select Second File"));
		panel.add(fileChoserSec);
		
		return panel;
	}
	
	
	public File getPathOfFirstFile() {
		return fileChoserOne.getSelectedFile();
	}
	
	public File getPathOfSecFile() {
		return fileChoserSec.getSelectedFile();
	}
	
}
