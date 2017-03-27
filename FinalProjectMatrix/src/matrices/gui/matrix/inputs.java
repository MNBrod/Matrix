package matrices.gui.matrix;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import matrices.gui.MotherPane;
import matrices.gui.matrix.shared.*;

public class inputs extends JPanel {
	private MotherPane mother;
	public rcInput rcInput;
	public matrixInput matrixInput;
	public matrixOutput matrixOutput;
	public double[][] valuesIN;
	public double[][] valuesOUT;
	public tree trunk;
	public JPanel f;

	public inputs (MotherPane mo) {
		this.setLayout(new BorderLayout());
		
		this.mother = mo;
		this.trunk = new tree(mo);
		this.rcInput = new rcInput(this.mother);
		this.matrixOutput = new matrixOutput(mo);
		this.matrixInput = new matrixInput(this.mother);
		this.add(rcInput, BorderLayout.SOUTH);
		this.valuesIN = new double[6][6];
		this.valuesOUT = new double[6][6];
		for (int a = 0; a < 6; a++) {
			  for(int b = 0; b < 6; b++) {
				  this.valuesOUT[a][b] = 100;
			  }
		}
		for (int a = 0; a < 6; a++) {
			  for(int b = 0; b < 6; b++) {
				  this.valuesIN[a][b] = 100;
			  }
		}
		
		this.f = new backg(mo);
		this.add(f);
	}
	public void addMD() {
		this.add(this.matrixInput, BorderLayout.CENTER);
		this.remove(f);
	}
	public double accessOUT (int c, int d) {
		return this.valuesOUT[c][d];
	}
}