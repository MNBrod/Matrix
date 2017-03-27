package matrices.gui.matrix.shared;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import math.MatrixCalculations;
import matrices.gui.MotherPane;

public class info extends JPanel{
	protected MotherPane mother;

	public JLabel discrim, lineInd, invert; 
	protected JPanel p1, p2, p3;
	public info (MotherPane mo) {
		this.mother = mo;
		this.setLayout(new GridLayout(0,3));
		this.p1 = new JPanel();
		this.p1.setLayout(new FlowLayout());
		this.p2 = new JPanel();
		this.p2.setLayout(new FlowLayout());
		this.p3 = new JPanel();
		this.p3.setLayout(new FlowLayout());
		this.discrim = new JLabel(" " + "The Determinant is: " +Double.toString(MatrixCalculations.Determinant(this.mother.inputs.valuesIN)) + " ");
		
		this.lineInd = new JLabel(" " +  "This matrix is Linearly Independant: " + MatrixCalculations.LINDEPENDENCE(this.mother.inputs.valuesIN)+ " ");
	
		this.invert = new JLabel(" " +  "This matrix is Invertible: " + MatrixCalculations.ISINVERTIBLE(this.mother.inputs.valuesIN)+ " ");
		
		this.p1.add(discrim);
		
		this.p2.add(lineInd);
		
		this.p3.add(invert);
		this.add(p1);
		this.add(p2);
		this.add(p3);
	}
}
