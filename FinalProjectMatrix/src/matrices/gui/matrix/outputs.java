package matrices.gui.matrix;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import matrices.gui.MotherPane;
import matrices.gui.matrix.shared.*;

public class outputs extends JPanel {
	
	protected MotherPane mother;
	public matrixOutput matrixOutput;
	public tree trunk;
	public info info;
	
	public outputs (MotherPane mo) {
		this.mother = mo;
		this.trunk = new tree(mo);
		this.info = new info(mo);
		this.setLayout(new BorderLayout());
		this.matrixOutput = new matrixOutput(mo);
		this.add(trunk, BorderLayout.CENTER);
		this.add(info, BorderLayout.SOUTH);
	}

}
