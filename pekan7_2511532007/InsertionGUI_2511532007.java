package pekan7_2511532007;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511532007 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int[] array_2007;
	private JLabel[] labelArray_2007;
	private JButton  stepButton_2007, resetButton_2007, setButton_2007;
	private JTextField inputField_2007;
	private JPanel panelArray_2007;
	private JTextArea stepArea_2007;
	
	private int i = 1, j;
	private boolean sorting_2007 = false;
	private int stepCount_2007 = 1;
	
	private JPanel contentPane_2007;
	;


	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511532007() {
	setTitle("Insertion Sort Langkah per Langkah");
	setSize(750, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new BorderLayout());
	
	//panel input
	JPanel inputPanel = new JPanel(new FlowLayout());
	inputField_2007 = new JTextField(30);
	setButton_2007 = new JButton("Set Array");
	inputPanel.add(new JLabel ("Masukkan angka (pisahkan dengan koma):"));
	inputPanel.add(inputField_2007);
	inputPanel.add(setButton_2007);
	
	//panel array visual
	panelArray_2007 = new JPanel();
	panelArray_2007.setLayout(new FlowLayout());
	
	//panel kontrol
	JPanel controlPanel = new JPanel();
	stepButton_2007 = new JButton ("langkah selanjutnya");
	resetButton_2007 = new JButton ("reset");
	stepButton_2007.setEnabled(false);
	controlPanel.add(stepButton_2007);
	controlPanel.add(resetButton_2007);
	
	// area teks untuk log langkah-langkah
	stepArea_2007 = new JTextArea(8, 60);
	stepArea_2007.setEditable(false);
	stepArea_2007.setFont(new Font("Monospaced", Font.PLAIN, 14));
	JScrollPane scrollPane = new JScrollPane (stepArea_2007);
	
	//tambahkan panel ke frame
	add(inputPanel, BorderLayout.NORTH);
	add(panelArray_2007, BorderLayout.CENTER);
	add(controlPanel, BorderLayout.SOUTH);
	add(scrollPane, BorderLayout.EAST);
	//event set array
	setButton_2007.addActionListener( e -> setArrayFromInput());
	//event langkah selanjutnya
	stepButton_2007.addActionListener ( e -> performStep());
	//event reset
	resetButton_2007.addActionListener( e -> reset());
	
	}
	
	private void setArrayFromInput() {
		String text = inputField_2007.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split(",");
		array_2007 = new int[parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array_2007 [k] = Integer.parseInt(parts[k].trim()); }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan"
						+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return; }
			i = 1; 
			stepCount_2007 = 1;
			sorting_2007 = true;
			stepButton_2007.setEnabled(true);
			stepArea_2007.setText("");
			panelArray_2007.removeAll();
			labelArray_2007 = new JLabel[array_2007.length];
			for (int k = 0; k < array_2007.length; k++) {
				labelArray_2007[k] = new JLabel (String.valueOf(array_2007[k]));
				labelArray_2007[k].setFont(new Font("Arial", Font.BOLD, 24));
				labelArray_2007[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray_2007[k].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray_2007.add(labelArray_2007[k]);
			}
			panelArray_2007.revalidate();
			panelArray_2007.repaint();
		}
	
		private void performStep() {
			if (i < array_2007.length && sorting_2007 ) {
				int key = array_2007[i];
				j = i - 1;
				StringBuilder stepLog = new StringBuilder();
				stepLog.append("Langkah ").append(key).append("\n");
				
				while (j >= 0 && array_2007 [j] > key) {
					array_2007 [ j + 1 ] = array_2007[j];
					j--;
				}
				array_2007 [j + 1 ] = key;
				
				updateLabels();
				stepLog.append("Hasil: ").append(arrayToString(array_2007)).append("\n\n");
				stepArea_2007.append(stepLog.toString());
				
				i++;
				stepCount_2007++;
				
				if (i == array_2007.length) {
					sorting_2007 = false;
					JOptionPane.showMessageDialog(this, "Sorting selesai!");
				}
			}
		}
		private void updateLabels() {
			for (int k = 0; k < array_2007.length; k++) {
				labelArray_2007[k].setText(String.valueOf(array_2007[k]));
			}
		}
		
		private void reset() {
			inputField_2007.setText("");
			panelArray_2007.removeAll();
			panelArray_2007.revalidate();
			panelArray_2007.repaint();
			stepButton_2007.setEnabled(false);
			i = 1;
			stepCount_2007 = 1;
		}
		
		private String arrayToString(int[] arr ) {
			StringBuilder sb = new StringBuilder();
			for (int k = 0; k < arr.length; k++ ) {
				sb.append(arr[k]);
				if (k < arr.length - 1) sb.append(", ");
			}
			return sb.toString();
		}
	}
	
	


