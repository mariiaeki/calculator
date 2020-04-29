package Calc;

import Calc.UI.CalcController;
import Calc.UI.CalcUI;

import javax.swing.SwingUtilities;

public class Calc {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalcUI ui = new CalcUI();
                new CalcController(ui);
            }
        });
    }

}