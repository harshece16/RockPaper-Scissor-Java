import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RPSFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final Component RPSFrame = null;
	private JPanel contentPane;
	private JTextField txtHowToPlay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPSFrame frame = new RPSFrame();
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
	public RPSFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 403);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Game");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Play Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = RPS.startGame() ; 
				JTextArea textArea = new JTextArea(52, 50);
			    textArea.setText(x);
			    textArea.setEditable(false);
			    JScrollPane scrollPane = new JScrollPane(textArea);
			    JOptionPane.showMessageDialog(RPSFrame, scrollPane);
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JTextPane txtpnRockPaperScissors = new JTextPane();
		txtpnRockPaperScissors.setEditable(false);
		txtpnRockPaperScissors.setBackground(Color.LIGHT_GRAY);
		txtpnRockPaperScissors.setFont(new Font("Sylfaen", Font.BOLD, 30));
		txtpnRockPaperScissors.setText("Rock Paper Scissors - 4 Players");
		contentPane.add(txtpnRockPaperScissors, BorderLayout.NORTH);
		
		JTextArea txtrRules = 	new JTextArea();
		txtrRules.setEditable(false);
		txtrRules.setFont(new Font("Bell MT", Font.PLAIN, 20));
		txtrRules.setWrapStyleWord(true);
		txtrRules.setBackground(new Color(153, 255, 102));
		String text = "Golden Rule\nPaper Beats Rock \nRock Beats Scissors \nScissors Beats Paper" ; 
		txtrRules.setText(text);
		contentPane.add(txtrRules, BorderLayout.WEST);
		
		JTextArea txtHowToPlay = 	new JTextArea();
		txtHowToPlay.setFont(new Font("Bell MT", Font.PLAIN, 20));
		txtHowToPlay.setBackground(new Color(51, 153, 0));
		txtHowToPlay.setEditable(false);
		txtHowToPlay.setWrapStyleWord(true);
		String text2 = "Rules \n Paper Beats Rock \n Rock Beats Scissors \n Scissors Beats Paper" ; 
		
		txtHowToPlay.setText("Instructions To Play\n" + 
				"1) It will be a 4 player game.\r\n" + 
				"2) Each Player would get Rock,Paper or scissors randomly.\r\n" + 
				"3) Choose your number from 1 to 4 \r\n" +
				"4) It is repeated 50 times.\r\n" + 
				"5) The total results is calculated in the end");
		contentPane.add(txtHowToPlay, BorderLayout.CENTER);
	}

}
