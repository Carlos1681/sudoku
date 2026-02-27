package br.com.dio.ui.custom.frame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	public MainFrame(final Dimension dimension, final JPanel mainPanel) {
        super("Sudoku");
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(mainPanel);

    }

}
