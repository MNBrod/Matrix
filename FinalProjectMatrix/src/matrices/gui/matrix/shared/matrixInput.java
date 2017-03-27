package matrices.gui.matrix.shared;
import javax.swing.*;
import javax.swing.JPanel;
import matrices.gui.MotherPane;
import java.awt.GridLayout;

public class matrixInput extends JPanel {
 protected MotherPane mother;
 protected JTextField[][] aText = new JTextField[6][6];
 
 
 public matrixInput(MotherPane mo) {
  this.mother = mo;
  
  }
 
 public void setUp(int rows, int cols) {
	 setLayout(new GridLayout(rows, cols));
	  for (int c = 0; c < rows; c++) {
		  for(int i = 0; i < cols; i++) {
			  this.aText[c][i] = new JTextField(2);
			  this.add(aText[c][i]);
			  this.aText[c][i].setOpaque(false);
			  
		  }
	  }
	  this.mother.inputs.remove(this.mother.inputs.f);
 }
 public void setValuesIN(int rows, int cols) {
	
	 for (int c = 0; c < rows; c++) {
		  for(int i = 0; i < cols; i++) {
			  double d = Double.parseDouble(aText[c][i].getText());
			 
			  this.mother.inputs.valuesIN[c][i] = d;
			 
		  }
	 	}
 	}
 public void reset (int rows, int cols) {
	 for (int c = 0; c < rows; c++) {
		  for(int i = 0; i < cols; i++) {
			  aText[c][i].setText("");
		  }
	 }
	 
 }
 
 }
