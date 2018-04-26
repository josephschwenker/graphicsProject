/*
 * @author Joseph Schwenker
 * This file creates the main UI.
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI extends JFrame {

	private JPanel contentPane;
	private JTextField palindrome;
	private JTextField forwards;
	private JTextField number;
	private JTextField power;
	private JTextField numberOfDiamondStars;
	private JTextField numberOfStars;
	private JTextField decimalNumber;
	private JTextField base;
	static JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUI() {
		setTitle("Recursion Problems");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumberOfStars = new JLabel("Number of Stars:");
		lblNumberOfStars.setBounds(107, 17, 96, 16);
		lblNumberOfStars.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNumberOfStars);
		
		numberOfStars = new JTextField();
		numberOfStars.setBounds(215, 15, 269, 20);
		numberOfStars.setColumns(10);
		contentPane.add(numberOfStars);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.setBounds(496, 12, 86, 26);
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem1.stars(
						Integer.parseInt( numberOfStars.getText() )
					) +
					"\n"
				);
			}
		});
		contentPane.add(btnGenerate);
		
		JLabel lbldiamondNumberOf = new JLabel("(Diamond) Number of Stars:");
		lbldiamondNumberOf.setBounds(5, 50, 198, 16);
		lbldiamondNumberOf.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbldiamondNumberOf);
		
		numberOfDiamondStars = new JTextField();
		numberOfDiamondStars.setBounds(215, 48, 269, 20);
		numberOfDiamondStars.setColumns(10);
		contentPane.add(numberOfDiamondStars);
		
		JButton button = new JButton("Generate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem2.stars(
						1,
						Integer.parseInt( numberOfDiamondStars.getText() )
					) +
					"\n"
				);
			}
		});
		button.setBounds(496, 45, 86, 26);
		contentPane.add(button);
		
		JLabel lblIsPalindrome = new JLabel("Is Palindrome:");
		lblIsPalindrome.setBounds(5, 83, 198, 16);
		lblIsPalindrome.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblIsPalindrome);
		
		palindrome = new JTextField();
		palindrome.setBounds(215, 81, 269, 20);
		palindrome.setColumns(10);
		contentPane.add(palindrome);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem6.isPalindrome( palindrome.getText() ) +	"\n"
				);
			}
		});
		btnCheck.setBounds(496, 78, 86, 26);
		contentPane.add(btnCheck);
		
		JLabel lblBackwards = new JLabel("Backwards:");
		lblBackwards.setBounds(5, 116, 198, 16);
		lblBackwards.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblBackwards);
		
		forwards = new JTextField();
		forwards.setBounds(215, 114, 269, 20);
		forwards.setColumns(10);
		contentPane.add(forwards);
		
		JButton btnFlip = new JButton("Flip");
		btnFlip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem7.backwards( forwards.getText() ) +	"\n"
				);
			}
		});
		btnFlip.setBounds(496, 111, 86, 26);
		contentPane.add(btnFlip);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setBounds(155, 146, 48, 16);
		lblNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNumber);
		
		number = new JTextField();
		number.setBounds(215, 144, 269, 20);
		number.setColumns(10);
		contentPane.add(number);
		
		JLabel lblPower = new JLabel("Power:");
		lblPower.setBounds(163, 173, 40, 16);
		lblPower.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblPower);
		
		power = new JTextField();
		power.setBounds(215, 171, 269, 20);
		power.setColumns(10);
		contentPane.add(power);
		
		JButton btnRaise = new JButton("Raise");
		btnRaise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem9.power(
						Integer.parseInt( number.getText() ),
						Integer.parseInt( power.getText() )
					) +	
					"\n"
				);
			}
		});
		btnRaise.setBounds(496, 144, 86, 47);
		contentPane.add(btnRaise);
		
		JLabel lblNumber_1 = new JLabel("Decimal Number:");
		lblNumber_1.setBounds(5, 200, 198, 16);
		lblNumber_1.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNumber_1);
		
		decimalNumber = new JTextField();
		decimalNumber.setBounds(215, 198, 269, 20);
		decimalNumber.setColumns(10);
		contentPane.add(decimalNumber);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setBounds(5, 227, 198, 16);
		lblBase.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblBase);
		
		base = new JTextField();
		base.setBounds(215, 225, 269, 20);
		base.setColumns(10);
		contentPane.add(base);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append(
					Problem14.convertToBase(
						Integer.parseInt( decimalNumber.getText() ),
						Integer.parseInt( base.getText() )
					) +	
					"\n"
				);
			}
		});
		btnConvert.setBounds(496, 198, 86, 47);
		contentPane.add(btnConvert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 252, 577, 144);
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(textArea);
	}
}
