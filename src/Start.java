import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.border.EtchedBorder;

public class Start extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setMinimumSize(new Dimension(1020, 725));
		setTitle("Personal Review System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 100, 100));
		Insets buttonMargin = new Insets(20, 20, 20, 20);
		
		//welcome label
		JLabel lblWelcome = new JLabel();
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon welcomeIcon = new ImageIcon("Images/Welcome.png");
		lblWelcome.setIcon(welcomeIcon);
		
		contentPane.add(lblWelcome);		
		
		//create new review button & action
		JButton btnNewReview = new JButton();
		btnNewReview.setMargin(buttonMargin);
		btnNewReview.setBorderPainted(false);
		btnNewReview.setFocusPainted(false);
		btnNewReview.setContentAreaFilled(false);
		ImageIcon newReviewIcon = new ImageIcon("Images/NewReview.png");
		btnNewReview.setIcon(newReviewIcon);
		contentPane.add(btnNewReview);
		btnNewReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();   //to close start page when opening new review page
					NewReview newReview = new NewReview();
					newReview.setVisible(true);
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});

		
		//view old reviews button & action
		JButton btnViewReviews = new JButton();
		btnViewReviews.setMargin(buttonMargin);
		btnViewReviews.setBorderPainted(false);
		btnViewReviews.setFocusPainted(false);
		btnViewReviews.setContentAreaFilled(false);
		ImageIcon viewReviewsIcon = new ImageIcon("Images/ViewReviews.png");
		btnViewReviews.setIcon(viewReviewsIcon);
		contentPane.add(btnViewReviews);
		btnViewReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}

}
