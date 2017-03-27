package matrices.gui.matrix.shared;

import java.awt.Graphics;

import javax.swing.JPanel;

import matrices.gui.MotherPane;

public class backg extends JPanel{
	public MotherPane mother;
	public backg (MotherPane mo) {
		this.mother = mo;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.mother.image, 0, 0, null);
		g.drawImage(this.mother.stego, 0, 0, null);
		
	}
}
