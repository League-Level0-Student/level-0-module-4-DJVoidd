package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class FailureLevelCalculator {
public static void main(String[] args) {
	String failure = JOptionPane.showInputDialog("Input your grade");
	double failurint = Double.parseDouble(failure);
	if (failurint >= 61 && failurint <= 70) {
		JOptionPane.showMessageDialog(null, "You barely passed");
	}
		if (failurint <= 60) {
			JOptionPane.showMessageDialog(null, "You failed");
		}
			if (failurint >= 71 && failurint <= 80) {
				JOptionPane.showMessageDialog(null, "That's average");	
			}
			if (failurint >= 81 && failurint <= 90) {
				JOptionPane.showMessageDialog(null, "That's pretty good!");	
			}
				if (failurint >= 91 && failurint <= 99) {
					JOptionPane.showMessageDialog(null, "Impressive!");
				}
					if (failurint == 100) {
						JOptionPane.showMessageDialog(null, "Go you!");	
					}
						if (failurint >= 101) {
							JOptionPane.showMessageDialog(null, "...");	
						}
}
}
