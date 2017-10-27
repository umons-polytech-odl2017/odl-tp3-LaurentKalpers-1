package Exercise1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exerciceform {
	private JPanel panel1;
	private JRadioButton rectangle;
	private JRadioButton Circle;
	private JPanel panel2;

	/*public Exerciceform() {
		rectangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}*/
	/*public Exerciceform() {
		rectangle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Panel(new Drawable[] {
					new ConvexPolygon(new Point[]{
						new Point(1, 1),
						new Point(100, 1),
						new Point(100, 100),
						new Point(1, 100)
					})
				});

			}
		});
	}*/



	public static void main(String[] args) {
		JFrame frame = new JFrame("Exerciceform");
		frame.setContentPane(new Exerciceform().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		panel2=new SubPanel();
	}
}


