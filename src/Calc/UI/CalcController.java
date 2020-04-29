package Calc.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Calc.Function.Function;
import Calc.Parser.Parser;

public class CalcController implements ActionListener {

    private static final String ACT_ONE = "1";
	private static final String ACT_TWO = "2";
	private static final String ACT_THREE = "3";
	private static final String ACT_FOUR = "4";
	private static final String ACT_FIVE = "5";
	private static final String ACT_SIX = "6";
	private static final String ACT_SEVEN = "7";
	private static final String ACT_EIGHT = "8";
	private static final String ACT_NINE = "9";
	private static final String ACT_ZERO = "0";
	private static final String ACT_DOT = ".";
	private static final String ACT_LEFTBR = "(";
	private static final String ACT_RIGHTBR = ")";
	private static final String ACT_POWER = "^";
	private static final String ACT_DIVISION = "/";
	private static final String ACT_ADD = "+";
	private static final String ACT_SUB = "-";
	private static final String ACT_MULT = "*";
	private static final String ACT_RES = "RESULT";
	private static final String ACT_CLEAN = "CLEAN";


	private CalcUI ui;

	//button handler
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

	private JTextField txtFormula;


	public CalcController(CalcUI ui) {
		this.ui = ui;
		btnOne = ui.getBtnOne();
		btnTwo = ui.getBtnTwo();
		btnThree = ui.getBtnThree();
		btnFour = ui.getBtnFour();
		btnFive = ui.getBtnFive();
		btnSix = ui.getBtnSix();
		btnSeven = ui.getBtnSeven();
		btnEight = ui.getBtnEight();
		btnNine = ui.getBtnNine();
		btnZero = ui.getBtnZero();
		btnAddition = ui.getBtnAddition();
		btnMultiplication = ui.getBtnMultiplication();
		btnSubstraction = ui.getBtnSubstraction();
		btnDivision = ui.getBtnDivision();
		btnLeftBr = ui.getBtnLeftBr();
		btnRightBr = ui.getBtnRightBr();
		btnPower = ui.getBtnPower();
		btnDot = ui.getBtnDot();
		btnResult = ui.getBtnResult();
		btnDelete = ui.getBtnDelete();

		btnOne.setActionCommand(ACT_ONE);
		btnTwo.setActionCommand(ACT_TWO);
		btnThree.setActionCommand(ACT_THREE);
		btnFour.setActionCommand(ACT_FOUR);
		btnFive.setActionCommand(ACT_FIVE);
		btnSix.setActionCommand(ACT_SIX);
		btnSeven.setActionCommand(ACT_SEVEN);
		btnEight.setActionCommand(ACT_EIGHT);
		btnNine.setActionCommand(ACT_NINE);
		btnZero.setActionCommand(ACT_ZERO);
		btnDot.setActionCommand(ACT_DOT);
		btnPower.setActionCommand(ACT_POWER);
		btnDelete.setActionCommand(ACT_CLEAN);
		btnAddition.setActionCommand(ACT_ADD);
		btnDivision.setActionCommand(ACT_DIVISION);
		btnSubstraction.setActionCommand(ACT_SUB);
		btnResult.setActionCommand(ACT_RES);
		btnMultiplication.setActionCommand(ACT_MULT);
		btnLeftBr.setActionCommand(ACT_LEFTBR);
		btnRightBr.setActionCommand(ACT_RIGHTBR);

		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		btnEight.addActionListener(this);
		btnNine.addActionListener(this);
		btnZero.addActionListener(this);
		btnDot.addActionListener(this);
		btnPower.addActionListener(this);
		btnDelete.addActionListener(this);
		btnAddition.addActionListener(this);
		btnDivision.addActionListener(this);
		btnSubstraction.addActionListener(this);
		btnResult.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnLeftBr.addActionListener(this);
		btnRightBr.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent act) {
		String me = act.getActionCommand();
		switch (me) {
			case ACT_ONE:
			case ACT_EIGHT:
			case ACT_FIVE:
			case ACT_FOUR:
			case ACT_LEFTBR:
			case ACT_ADD:
			case ACT_DIVISION:
			case ACT_DOT:
			case ACT_MULT:
			case ACT_NINE:
			case ACT_POWER:
			case ACT_RIGHTBR:
			case ACT_SEVEN:
			case ACT_SIX:
			case ACT_SUB:
			case ACT_THREE:
			case ACT_TWO:
			case ACT_ZERO:
				ui.writeFormula(me);
				break;
			case ACT_RES:
				Function inputFunction = Parser.parse(ui.getFormula());

				try {
					ui.clearFormula();
					double value = inputFunction.evaluate();
					ui.writeFormula(String.valueOf(value));

				} catch (UnsupportedOperationException e) {
					System.err.println("ERROR: cannot count " + inputFunction.toString());
					return;
				} catch (ArithmeticException e) {
					System.err.println("WARNING: arithmetic exception ");
				}
				break;


			case ACT_CLEAN:
					ui.clearFormula();
				break;

		}
	}
}
