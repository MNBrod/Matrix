package matrices.splashscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import matrices.gui.MotherPane;

public class splashButtonListener implements ActionListener{
	protected MotherPane mother;
	public splashButtonListener (MotherPane mo) {
		this.mother = mo;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("rrefgo")) {
			this.mother.toRref();
			
		}
	}
}
