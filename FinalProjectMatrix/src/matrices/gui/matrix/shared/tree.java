package matrices.gui.matrix.shared;

import javax.swing.*;

import matrices.gui.MotherPane;

import java.awt.*;

public class tree extends JPanel {
	protected MotherPane mother;
	protected matrixOutput treeMatrixOutput;
	protected matrixInput treeMatrixInput;
	public static boolean dino;
	public tree (MotherPane mo) {
		this.mother = mo;
		this.setLayout(null);
		}
	public void setUpIn() {
		this.treeMatrixInput = this.mother.inputs.matrixInput;
		//this.treeMatrixInput.setBounds(10, 10, 200, 200);
		//this.add(treeMatrixInput);
		this.repaint();
	}
	public void setUpOut() {
		this.treeMatrixOutput = this.mother.outputs.matrixOutput;
		this.treeMatrixOutput.setBounds(10, 10, 100, 200);
		this.add(treeMatrixOutput);
		this.repaint();
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.mother.image, 0, 0, null);
		if (!dino) {
			g.drawImage(this.mother.rex, 0, 0, null);
		} else if (dino) {
			g.drawImage(this.mother.bront, 0, 0, null);
		}
		g.setFont(new Font("TimesRoman", Font.PLAIN, this.mother.inputs.rcInput.numRows * 35)); 
		g.drawString("[", this.mother.inputs.getWidth()/2 - 20*this.mother.inputs.rcInput.numCols/2 - this.mother.inputs.rcInput.numCols * 10, this.mother.inputs.getHeight()/2 - 20*this.mother.inputs.rcInput.numRows/2 + this.mother.inputs.rcInput.numRows * 18);
		g.drawString("]", this.mother.inputs.getWidth()/2 + 20*this.mother.inputs.rcInput.numCols/2 + this.mother.inputs.rcInput.numCols / 3, this.mother.inputs.getHeight()/2 - 20*this.mother.inputs.rcInput.numRows/2 + this.mother.inputs.rcInput.numRows * 18);
	}
	
}