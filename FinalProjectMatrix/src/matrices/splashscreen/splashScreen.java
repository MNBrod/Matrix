package matrices.splashscreen;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import matrices.gui.MotherPane;

public class splashScreen extends JPanel {
	private MotherPane mother;
	private splashButtonPane buttonPane;
	private splashTextPane textPane;
	
	public splashScreen (MotherPane mo) {
		this.setLayout(new BorderLayout());
		this.mother = mo;
		this.textPane = new splashTextPane(this.mother);
		this.buttonPane = new splashButtonPane(this.mother);
		this.buttonPane = new splashButtonPane(mo);
		this.add(buttonPane, BorderLayout.SOUTH);
		this.add(textPane, BorderLayout.CENTER);
		
	}
}
