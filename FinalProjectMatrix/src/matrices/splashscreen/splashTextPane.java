package matrices.splashscreen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import matrices.gui.MotherPane;

public class splashTextPane extends JPanel {
	JPanel panel_1;
	JPanel panel_5;
	JPanel panel_4;
	JPanel panel_3;
	JPanel panel_2;
	JLabel lblIndependanceTest;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_1;
	JLabel lblReducedRow;
	JLabel lblEchelonForm;
	JLabel lblTranspose;
	JLabel lblNewLabel;
	JTextArea rrefEx;
	JTextArea transEx;
	JTextArea determEx;
	JTextArea lineIndEx;
	private MotherPane mother;
	
	public splashTextPane(MotherPane mo){
		this.mother = mo;
		this.setLayout(new GridLayout (1,4));
		JLabel lblIndependanceTest = new JLabel("Independance Test");
		JLabel lblNewLabel_2 = new JLabel("Is Invertible Test");
		JLabel lblNewLabel_1 = new JLabel("Determinant,");
		JLabel lblReducedRow = new JLabel("Reduced Row");
		JLabel lblEchelonForm = new JLabel("Echelon Form");
		JLabel lblTranspose = new JLabel("Transpose");
		JLabel lblNewLabel = new JLabel("Linear");
		
		this.panel_2 = new JPanel();
		this.panel_2.setBorder(new EtchedBorder());
		this.panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.panel_2.add(lblNewLabel_1);
		this.panel_2.add(lblNewLabel_2);
		this.determEx = new JTextArea("Returns the determinant of the matrix. If determinant != 0 the matrix is invertible and otherwise it is singular(non-invertible).", 10, 15);
		this.determEx.setLineWrap(true);
		this.determEx.setBackground(new Color(240, 240, 240));
		this.determEx.setWrapStyleWord(true);
		this.determEx.setEditable(false);
		this.panel_2.add(determEx);
		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new EtchedBorder());
		this.panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.panel_3.add(lblNewLabel);
		this.panel_3.add(lblIndependanceTest);
		this.lineIndEx = new JTextArea("Checks if the columns of the matrix is L.IND. L.IND is defined as the matrix equation Ax=0 has only the trivial Solution.", 10, 15);
		this.lineIndEx.setLineWrap(true);
		this.lineIndEx.setBackground(new Color(240, 240, 240));
		this.lineIndEx.setWrapStyleWord(true);
		this.lineIndEx.setEditable(false);
		this.panel_3.add(lineIndEx);
		this.panel_4 = new JPanel();
		this.panel_4.setBorder(new EtchedBorder());
		this.panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.panel_4.add(lblTranspose);
		this.transEx = new JTextArea("Returns the transpose of the Matrix. Transpose of Matrix A :mxn is denoted by A^t and has dimension of nxm where A^t's rows are A's columns and its columns are A's rows.", 10, 15);
		this.transEx.setLineWrap(true);
		this.transEx.setBackground(new Color(240, 240, 240));
		this.transEx.setWrapStyleWord(true);
		this.transEx.setEditable(false);
		this.panel_4.add(transEx);
		this.panel_5 = new JPanel();
		this.panel_5.setBorder(new EtchedBorder());
		this.panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.panel_5.add(lblReducedRow);
		this.panel_5.add(lblEchelonForm);
		this.rrefEx = new JTextArea("Reduces the Matrix to its simplest form possible. If matrix corresponds to a system of equations, RREF form is the solution of the system.", 10, 15);
		this.rrefEx.setLineWrap(true);
		this.rrefEx.setBackground(new Color(240, 240, 240));
		this.rrefEx.setWrapStyleWord(true);
		this.rrefEx.setEditable(false);
		this.panel_5.add(rrefEx);
		this.add(panel_5);
		this.add(panel_4);
		this.add(panel_3);
		this.add(panel_2);
	}
}



//contentPane.add(panel_1, BorderLayout.CENTER);

