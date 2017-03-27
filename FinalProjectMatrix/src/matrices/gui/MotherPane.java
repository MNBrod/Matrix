package matrices.gui;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import matrices.gui.matrix.*;
//import matrices.gui.matrix.shared.outputTree;
import matrices.splashscreen.*;

public class MotherPane extends JFrame{
	public  BufferedImage image, stego, bront, rex = null;
	
	public JPanel contentPane;
	public  splashScreen splash;
	public  inputs inputs;
	public outputs outputs;
	public int X , Y;

	public  CardLayout cl;
	
	public  MotherPane () {
		
		super("Matrix Calculator");
		try {
		this.image = ImageIO.read(new File("Capture.PNG"));
		this.stego = ImageIO.read(new File( "babe.png"));
		this.bront = ImageIO.read(new File( "babe2.png"));
		this.rex = ImageIO.read(new File("babe3.png"));
		}
		catch (IOException e) {
			System.out.println("not found");
		}
		this.setLayout(new BorderLayout());
		this.setBackground(Color.BLUE);
		this.cl = new CardLayout();
		this.splash = new splashScreen(this);
		
		this.inputs = new inputs(this);
		this.outputs = new outputs(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, 750, 300);
		this.setResizable(false);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setContentPane(contentPane);
		contentPane.setLayout(cl);
		contentPane.add(splash, "splash screen");
		contentPane.add(inputs, "rref screen");
		contentPane.add(outputs, "output screen");
		
		cl.show(contentPane, "splash screen");
		
	}
	public void toRref() {
		this.cl.show(contentPane, "rref screen");
	}
	public void toSplash() {
		this.cl.show(contentPane, "splash screen");
	}
	public void toOut() {
		this.cl.show(contentPane, "output screen");
	
	}
}
