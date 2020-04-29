package Calc.UI;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalcUI extends JFrame {
	
	private static final long serialVersionUID = 5888598103960137807L;
	
	private static final int SPACING = 10;
	private static final int GRID_WIDTH = 800;
	private static final int GRID_HEIGHT = 600;
	
	private JTextField txtFormula;

	private JButton btnOne;
	private JButton btnTwo;
	private JButton btnThree;
	private JButton btnFour;
	private JButton btnFive;
	private JButton btnSix;
	private JButton btnSeven;
	private JButton btnEight;
	private JButton btnNine;
	private JButton btnZero;
	private JButton btnDot;
	private JButton btnPower;
	private JButton btnDelete;
	private JButton btnAddition;
	private JButton btnDivision;
	private JButton btnSubstraction;
	private JButton btnResult;
	private JButton btnMultiplication;
	private JButton btnLeftBr;
	private JButton btnRightBr;


	public CalcUI() {
		JPanel pnlContent = new JPanel();
		pnlContent.setLayout(new BoxLayout(pnlContent, BoxLayout.X_AXIS));
		pnlContent.setBorder(BorderFactory.createEmptyBorder(SPACING, SPACING, SPACING, SPACING));

		JPanel pnlCtrl = new JPanel();
		pnlCtrl.setLayout(new BoxLayout(pnlCtrl, BoxLayout.Y_AXIS));
		pnlCtrl.setBorder(BorderFactory.createEmptyBorder(0, SPACING, 0, 0));
		
		JPanel pnlFormula = new JPanel();
		pnlFormula.setLayout(new BoxLayout(pnlFormula, BoxLayout.X_AXIS));
		txtFormula = new JTextField(30);
		txtFormula.setMaximumSize(txtFormula.getPreferredSize());
		pnlFormula.add(txtFormula);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setLayout(new GridLayout(4,5));

        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        btnDot = new JButton(".");
        btnPower = new JButton("^");
        btnDelete= new JButton("C");
        btnAddition = new JButton("+");
        btnDivision = new JButton("/");
        btnSubstraction = new JButton("-");
        btnMultiplication = new JButton("*");
        btnResult = new JButton("=");
        btnLeftBr = new JButton("(");
        btnRightBr = new JButton(")");


		pnlButtons.add(btnSeven);
		pnlButtons.add(btnEight);
		pnlButtons.add(btnNine);
		pnlButtons.add(btnDelete);
		pnlButtons.add(btnResult);
		pnlButtons.add(btnFour);
		pnlButtons.add(btnFive);
		pnlButtons.add(btnSix);
		pnlButtons.add(btnMultiplication);
		pnlButtons.add(btnDivision);
		pnlButtons.add(btnOne);
		pnlButtons.add(btnTwo);
		pnlButtons.add(btnThree);
		pnlButtons.add(btnAddition);
		pnlButtons.add(btnSubstraction);
		pnlButtons.add(btnZero);
		pnlButtons.add(btnDot);
		pnlButtons.add(btnPower);
		pnlButtons.add(btnLeftBr);
		pnlButtons.add(btnRightBr);

		pnlCtrl.add(pnlFormula);
		pnlCtrl.add(Box.createRigidArea(new Dimension(SPACING, SPACING)));
		pnlCtrl.add(pnlButtons);
		
		pnlContent.add(pnlCtrl);
		setContentPane(pnlContent);
		
		setTitle("Calculator");
		pack();
		setResizable(false);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public String getFormula() {
		return txtFormula.getText();
	}

	public void writeFormula(String me) {txtFormula.setText(txtFormula.getText()+ me);}
	
	public void clearFormula() {
		txtFormula.setText("");
	}
	
	public JButton getBtnResult() {
		return btnResult;
	}

	public JButton getBtnOne() {
		return btnOne;
	}
	public JButton getBtnTwo() {
		return btnTwo;
	}
	public JButton getBtnThree() {
		return btnThree;
	}
	public JButton getBtnFour() {
		return btnFour;
	}
	public JButton getBtnFive() {
		return btnFive;
	}
	public JButton getBtnSix() {
		return btnSix;
	}
	public JButton getBtnSeven() {
		return btnSeven;
	}
	public JButton getBtnEight() {
		return btnEight;
	}
	public JButton getBtnNine() {
		return btnNine;
	}
	public JButton getBtnZero() {
		return btnZero;
	}
	public JButton getBtnSubstraction() {
		return btnSubstraction;
	}
	public JButton getBtnAddition() {
		return btnAddition;
	}
	public JButton getBtnMultiplication() {
		return btnMultiplication;
	}
	public JButton getBtnDot() {
		return btnDot;
	}
	public JButton getBtnDelete() {
		return btnDelete;
	}
	public JButton getBtnDivision() {
		return btnDivision;
	}
	public JButton getBtnRightBr() {
		return btnRightBr;
	}
	public JButton getBtnLeftBr() {
		return btnLeftBr;
	}
	public JButton getBtnPower() { return btnPower; }
}
