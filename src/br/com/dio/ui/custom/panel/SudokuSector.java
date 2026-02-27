package br.com.dio.ui.custom.panel;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import br.com.dio.ui.custom.input.NumberText;

import java.awt.Dimension;
import java.util.List;

public class SudokuSector extends JPanel {
	
	public SudokuSector(final List<NumberText> textFields) {
        var dimension = new Dimension(170, 170);
        this.setPreferredSize(dimension);
        this.setSize(dimension);
        this.setBorder(new LineBorder(Color.BLACK, 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);
        }

}
