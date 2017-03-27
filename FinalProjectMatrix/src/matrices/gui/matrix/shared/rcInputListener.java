package matrices.gui.matrix.shared;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import math.MatrixCalculations;
import matrices.gui.MotherPane;

public class rcInputListener  implements ActionListener  {
	protected MotherPane mother;
	public int height, width;
	protected tree tree;
	
	public rcInputListener (MotherPane mo) {

		this.mother = mo;
		
		this.tree = new tree(this.mother);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("createMatrixInp")) {
			
			this.mother.inputs.rcInput.rows.setEditable(false);
			this.mother.inputs.rcInput.col.setEditable(false);
			this.mother.inputs.rcInput.setRC();
			 
			this.height =this.mother.inputs.getHeight();
			this.width = this.mother.inputs.getWidth();
			this.mother.inputs.matrixInput.setUp(this.mother.inputs.rcInput.numRows, this.mother.inputs.rcInput.numCols);
			
			this.mother.setBounds(0, 0, 750, 301);
			
			this.mother.inputs.trunk.add(this.mother.inputs.matrixInput, BorderLayout.CENTER);
			
			this.mother.X = width/2 - 25*this.mother.inputs.rcInput.numCols/2;
			this.mother.Y = height/2 - 25*this.mother.inputs.rcInput.numRows/2;
			this.mother.inputs.matrixInput.setBounds(width/2 - 25*this.mother.inputs.rcInput.numCols/2, height/2 - 25*this.mother.inputs.rcInput.numRows/2 , this.mother.inputs.rcInput.numCols*25 , this.mother.inputs.rcInput.numRows*25);
			
			
			this.mother.inputs.trunk.setUpIn();
			this.mother.inputs.rcInput.remove(this.mother.inputs.f);
			this.mother.inputs.add(this.mother.inputs.trunk);
			//
			
			this.mother.inputs.rcInput.add(this.mother.inputs.rcInput.calculaterref, BorderLayout.EAST);
			this.mother.inputs.rcInput.add(this.mother.inputs.rcInput.calculatetrans, BorderLayout.EAST);
			this.mother.inputs.rcInput.remove(this.mother.inputs.rcInput.go);
			this.mother.outputs.trunk.repaint();
			
			
		
			
			
			
		} else if (e.getActionCommand().equals("calculaterref")) {
			this.mother.inputs.trunk.dino = true;
			this.mother.inputs.trunk.repaint();
			//System.out.println("rref button fired");
			this.mother.inputs.matrixInput.setValuesIN(this.mother.inputs.rcInput.numRows, this.mother.inputs.rcInput.numCols);
			//System.out.println("rrefsetValuesIN " + "rows: "+ this.mother.inputs.rcInput.numRows + " cols: " + this.mother.inputs.rcInput.numCols );
			for (int c = 0; c < this.mother.inputs.rcInput.numRows; c++) {
				for(int i = 0; i <this.mother.inputs.rcInput.numCols; i++) {
					
				}
			}
			//System.out.println("after for loop");
			double[][] vls = this.mother.inputs.valuesIN;
			
			this.mother.inputs.valuesOUT = MatrixCalculations.rrefFinal(this.mother.inputs.valuesIN);
			this.mother.inputs.matrixOutput.displayMatrix();
			
			
			
			
			
		} else if (e.getActionCommand().equals("calculatetrans")) {
			
			this.mother.inputs.trunk.dino = true;
			this.mother.inputs.trunk.repaint();
			this.mother.inputs.matrixInput.setValuesIN(this.mother.inputs.rcInput.numRows, this.mother.inputs.rcInput.numCols);
			
			for (int c = 0; c < this.mother.inputs.rcInput.numRows; c++) {
				for(int i = 0; i <this.mother.inputs.rcInput.numCols; i++) {
				
				}
			}
			
			double[][] vls = this.mother.inputs.valuesIN;
			
			this.mother.inputs.valuesOUT = MatrixCalculations.transFinal(this.mother.inputs.valuesIN);
			this.mother.inputs.matrixOutput.displayMatrix();
			
		}

	}

}
