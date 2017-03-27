package matrices.gui.matrix.shared;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import matrices.gui.MotherPane;

public class matrixOutput extends JPanel {
	public JTextField[][] outputArray ;
	protected MotherPane mother;
	
	

	public matrixOutput (MotherPane mo) {
		this.mother = mo;
		this.outputArray = new JTextField[6][6];
		this.setSize(500, 600);
		

	}
	public void displayMatrix() {
		int rows = this.mother.inputs.rcInput.numRows;
		int cols = this.mother.inputs.rcInput.numCols;
			
		
		
		  for (int a = 0; a < rows; a++) {
		
			  for(int b = 0; b < cols; b++) {
				
				  this.mother.outputs.matrixOutput.setLayout(new GridLayout(rows, cols));
				
				 
				  
				  this.outputArray[a][b] = new JTextField("");
				  double d = this.mother.inputs.accessOUT(a, b);
				  JTextField hold = new JTextField(Double.toString(d));
				  this.outputArray[a][b] = hold;
				  this.outputArray[a][b].setEditable(false);
				  this.outputArray[a][b].setBackground(new Color(240, 240, 240));
				
				  this.mother.outputs.matrixOutput.add(this.mother.inputs.matrixOutput.outputArray[a][b]);
				
				 
				  this.mother.outputs.trunk.setUpOut();
				  // \/ \/ \/ \/
				  this.mother.outputs.trunk.treeMatrixOutput.setBounds(this.mother.X, this.mother.Y, this.mother.inputs.rcInput.numCols*25 , this.mother.inputs.rcInput.numRows*25);
				  
			  } 
		  }
		  //this.mother.outputTree.out();
		  this.mother.toOut();
		  
	}
	
}