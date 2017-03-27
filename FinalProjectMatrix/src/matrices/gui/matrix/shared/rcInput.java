package matrices.gui.matrix.shared;
import java.awt.FlowLayout;

import javax.swing.*;

import matrices.gui.MotherPane;

public class rcInput extends JPanel {
 protected MotherPane mother;
 public JTextField rows = new JTextField(10);
 public JTextField col = new JTextField(10);
 protected JLabel rowsL = new JLabel("Rows: ");
 protected JLabel colL = new JLabel("Columns: ");
 protected  int numRows, numCols = 0;
 protected JButton go;
 protected JButton calculaterref;
 protected JButton calculatetrans;
 
 
 public rcInput (MotherPane mo) {
  this.mother = mo;
  this.setLayout(new FlowLayout());
  this.rows = new JTextField(10);
  this.col = new JTextField(10);
  this.add(rowsL);
  this.add(rows);
  this.add(colL);
  this.add(col);
  this.go = new JButton("Create Input");
  this.calculaterref = new JButton("RREF");
  this.calculaterref.addActionListener(new rcInputListener(mo));
  this.calculaterref.setActionCommand("calculaterref");
  this.calculatetrans = new JButton("Transpose");
  this.calculatetrans.addActionListener(new rcInputListener(mo));
  this.calculatetrans.setActionCommand("calculatetrans");
  this.go.addActionListener(new rcInputListener(mo));
  this.go.setActionCommand("createMatrixInp");
  this.add(go);
  
 }
 public void setRC() {
	 int rw1, cl1 = 0;
	 String rws = this.rows.getText();
	 String cls = this.col.getText();
	 rw1 = Integer.parseInt(rws);
	 cl1 = Integer.parseInt(cls);
	 if (cl1 > 6) {
		 this.col.setText("Bad Input");
	 } else if ( rw1 > 6) {
			 this.rows.setText("Bad Input");
	 } else {
		 numRows = rw1;
		 numCols = cl1;
	 }
	  }

}
