package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class FailureLevelCalculator {
public static void main(String[] args) {
	String failure = JOptionPane.showInputDialog("Input your grade");
	double failurint = Double.parseDouble(failure);
	if (failurint >= 61 && failurint <= 70) {
		JOptionPane.showMessageDialog(null, "You barely passed");
		if (failurint <= 60) {
			JOptionPane.showMessageDialog(null, "You failed bozo");
			if (failurint >= 71 && failurint <= 80) {
				
			}
		}
	}
}
}
