package matrices.splashscreen;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import matrices.gui.MotherPane;

public class splashButtonPane extends JPanel {
	protected JButton rrefGo;
	
	private MotherPane mother;
	
	public splashButtonPane (MotherPane mo) {
		this.mother = mo;
		this.setLayout(new GridLayout(1,4));
		this.rrefGo = new JButton ("Enter Program");
		this.rrefGo.addActionListener(new splashButtonListener(mo));
		this.rrefGo.setActionCommand("rrefgo");
		this.add(rrefGo);

		
	}
	
}
