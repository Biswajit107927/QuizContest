package com.fst;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class Quiz {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextPane textPane;
	private JRadioButton a;
	private JRadioButton c;
	private JRadioButton b;
	private JRadioButton d;
	JButton submit;
	question q;
	boolean flag = false;
	private int currentQuestionNumber = 1;
	String answer;
	int score = 0;

	Queue<question> tobeasked = new LinkedList<question>();
	private JTextField textField_4;
	private JButton btnNewButton;
	private String log="Full ";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(175, 175, 530, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textPane = new JTextPane();
		textPane.setBounds(35, 118, 420, 50);
		frame.getContentPane().add(textPane);

		a = new JRadioButton("a");
		a.setBounds(42, 195, 44, 23);
		frame.getContentPane().add(a);

		c = new JRadioButton("c");
		c.setBounds(244, 193, 44, 23);
		frame.getContentPane().add(c);

		b = new JRadioButton("b");
		b.setBounds(39, 232, 44, 16);
		frame.getContentPane().add(b);

		d = new JRadioButton("d");
		d.setBounds(244, 223, 44, 23);
		frame.getContentPane().add(d);

		textField = new JTextField();
		textField.setBounds(83, 194, 156, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(83, 227, 156, 26);
		frame.getContentPane().add(textField_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(287, 192, 156, 26);
		frame.getContentPane().add(textField_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(287, 222, 156, 26);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("Name");
		textField_4.setForeground(Color.RED);
		textField_4.setBounds(35, 74, 117, 22);
		frame.getContentPane().add(textField_4);

		JButton btnNext = new JButton("next");
		btnNext.setBounds(297, 268, 117, 29);
		frame.getContentPane().add(btnNext);

		submit = new JButton("submit");
		submit.setBounds(35, 268, 117, 29);
		frame.getContentPane().add(submit);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(a);
		bgroup.add(b);
		bgroup.add(c);
		bgroup.add(d);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "EASY", "MEDIUM", "HARD" }));
		comboBox.setBounds(197, 73, 91, 27);
		frame.getContentPane().add(comboBox);
		

		btnNewButton = new JButton("Start");
		btnNewButton.setBounds(326, 72, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("                     WELCOME TO QUIZ CONTEST");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(83, 18, 372, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("copyright@FST");
		lblNewLabel_1.setBounds(430, 331, 94, 16);
		frame.getContentPane().add(lblNewLabel_1);

		question ques[] = new question[11];

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				log=log+ "Name : " +textField_4.getText() + "\n" ;

				System.out.println(comboBox.getSelectedIndex());

				if (Integer.valueOf(comboBox.getSelectedIndex()).equals(0)) {
					
					

					ques[1] = new question("Who invented Telescope?", "Madam Curie", "Alexander Graham Bell",
							"Albert Einstein", "galileo", "d");

					ques[2] = new question("which is the capital of india?", "Mumbai", "Delhi", "Chennai",
							"Bhubaneswar", "b");

					ques[3] = new question("Who is the priminister of India?", "Narendra Modi", "Amit Sah",
							"Naveen Pattnaik", "Rajnath Singh", "a");

					ques[4] = new question("What is the name of 1st super computer of India ?", "Param", "Vikram",
							"Tejas", "Prithvi", "a");

					ques[5] = new question("How many meters are there in 1 KM?", " 10", "100", "1000", "12", "c");

					ques[6] = new question("Who is the writer of the book - My experiment with truth ?", "Nehru",
							"M K Gandhi", "V. Savarkar", "R. Tagore", "b");

					ques[7] = new question("Who invented Java?", "Jeff Bezos", " J Gosling", "Vivek Randive",
							"Lary Page", "b");

					ques[8] = new question("Which is the oldest book of india?", "Maha Bharat", "Rig Ved", "Ramayan",
							"Yajurved", "b");

					ques[9] = new question("Who killed Mahisasur ?", "Mata kali", "Tara Devi", "Maa Gauri", "Maa Durga",
							"d");

					ques[10] = new question("What is the smallest double digit prime number?", "11", "23", "73", "17",
							"a");

					tobeasked.add(ques[1]);
					tobeasked.add(ques[2]);
					tobeasked.add(ques[3]);
					tobeasked.add(ques[4]);
					tobeasked.add(ques[5]);
					tobeasked.add(ques[6]);
					tobeasked.add(ques[7]);
					tobeasked.add(ques[8]);
					tobeasked.add(ques[9]);
					tobeasked.add(ques[10]);

					load_question();
				}

				if (Integer.valueOf(comboBox.getSelectedIndex()).equals(1)) {
					

					ques[1] = new question("Who is the inventor of the refrigerator?", "Madam Curie",
							"Alexander Graham Bell", "Albert Einstein", "William Cullen", "d");

					ques[2] = new question("Garampani sanctuary is located in which state?", "Sikkim", "Gujarat",
							"Assam", "Nagaland", "c");

					ques[3] = new question("who has written the book -  A desert kingdom ?", " Naveen Pattnaik",
							"Pawan Chimling", "Manoj Das", "William Wordsworth", "A");

					ques[4] = new question("Who is known as Rashmirathi in mahabharat?", "Karn", "Arjun", "Krishna",
							"Duryodhan", "A");

					ques[5] = new question("How many seats AAP won in recent delhi election ?", "60", "61", "62", "63",
							"c");

					ques[6] = new question("Which state is known as gods own country?", "Odisha", "Telengana",
							"Maharastra", "Kerala", "d");

					ques[7] = new question("Which is not a female hormon ?", "Oxytosin", "Estrogen", "Progesteron",
							"Testosteron", "d");

					ques[8] = new question("What is the scientific name of corona virus?", "H1N1", "COVID 19",
							"rubella", "EBOV", "b");

					ques[9] = new question("What is the formula to calculate area of a circle ?", "pi * r * r",
							" pi*r*h", "2*r*r", ".5*r**r*pi", "a");

					ques[10] = new question("Who is known as nepoliean of India?", " Samudra Gupta", "Ashok",
							" Kharvela", "Chandragupta Maurya", "a");

					tobeasked.add(ques[1]);
					tobeasked.add(ques[2]);
					tobeasked.add(ques[3]);
					tobeasked.add(ques[4]);
					tobeasked.add(ques[5]);
					tobeasked.add(ques[6]);
					tobeasked.add(ques[7]);
					tobeasked.add(ques[8]);
					tobeasked.add(ques[9]);
					tobeasked.add(ques[10]);
					load_question();
				}

				if (Integer.valueOf(comboBox.getSelectedIndex()).equals(2)) {
					

					ques[1] = new question("Who is also known as Devbrat in mahabharat ?", " Arjun", "Bhishma",
							"Abhimanyu", " Shantanu ", "b");

					ques[2] = new question(" Which counry was not in Axix power during 2nd world war ?", "Italy",
							"Germany", "Japan", "England", "d");

					ques[3] = new question("Who started : Doctrine of lapse law : in India ?", "Delhousie", "Maculey",
							"Waren Hastings", "Hugh Rose", "A");

					ques[4] = new question("Which elecronics device is a bidirectional switch ?", "Diac", "triac",
							"BJT", "diode", "b");

					ques[5] = new question("Who is the 1st law minister of India?", " J N Neheru", " Sardar Patel",
							"B. R. Ambedkar", " Ravishankar Prashad", "c");

					ques[6] = new question("Sriharikota is located in which Indian state ?", "Odisha", "AP",
							"Telengana", "Karnataka", "b");

					ques[7] = new question("Deficiency of which vitamin cause deley in blood clotting?", "K", "B", "A",
							"C", "a");

					ques[8] = new question("Who is known as Bhumiputra of Indonesia ?", "Biju Patnaik", "V V Giri",
							"Sanjiv Reddy", "J. Nair", "A");

					ques[9] = new question("Which is the 1st movie of Amitab Bachan?", "Sholey", "Mard", "Deewar",
							"Saat Hindustani", "d");

					ques[10] = new question("Which acid is found in curd?", "citric", "Formic", "Hidrocloric", "lactic",
							"d");

					tobeasked.add(ques[1]);
					tobeasked.add(ques[2]);
					tobeasked.add(ques[3]);
					tobeasked.add(ques[4]);
					tobeasked.add(ques[5]);
					tobeasked.add(ques[6]);
					tobeasked.add(ques[7]);
					tobeasked.add(ques[8]);
					tobeasked.add(ques[9]);
					tobeasked.add(ques[10]);

					load_question();
				}

				btnNewButton.setEnabled(false);
			}
		});

		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("submit pressed");
				

				if (a.isSelected()) {
					System.out.println(" a is selected ");
					ques[currentQuestionNumber].setUserAnswer("a");
					flag = true;

				}

				else if (b.isSelected()) {
					System.out.println(" b is selected ");
					ques[currentQuestionNumber].setUserAnswer("b");
					flag = true;

				}

				else if (c.isSelected()) {
					System.out.println(" c is selected ");
					ques[currentQuestionNumber].setUserAnswer("c");
					flag = true;

				}

				else if (d.isSelected()) {
					System.out.println("d is selected ");
					ques[currentQuestionNumber].setUserAnswer("d");
					flag = true;

				} else {
					JFrame f = new JFrame();
					JOptionPane.showMessageDialog(f, "please select an option");
				}

			}

		});

		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (flag == true) {

					if (!tobeasked.isEmpty()) {

						bgroup.clearSelection();
						currentQuestionNumber++;
						load_question();

					} else {

						System.out.println("exam finished");
						btnNext.setEnabled(false);
						submit.setEnabled(false);

						for (int i = 1; i < 11; i++) {							
							
							log= log +  ques[i].getQuestion() + "\n"  ;
							
							System.out.println(ques[i].getQuestion() + "\n");
							
							log= log +  "\t a. " + ques[i].getOption1() + "  " + "\t c. " + ques[i].getOption3()  ;
							
							System.out
									.println("\t a. " + ques[i].getOption1() + "  " + "\t c. " + ques[i].getOption3());
							
							log= log + "\t b. " + ques[i].getOption2() + "  " + "\t d. " + ques[i].getOption4() + "\n";
							
							System.out.println(
									"\t b. " + ques[i].getOption2() + "  " + "\t d. " + ques[i].getOption4() + "\n");
							
							log=log + "\n" + "correct answer " + ques[i].getCorrectoption() ;
							

							System.out.println("\n" + "correct answer " + ques[i].getCorrectoption());
							
							log=log + "\n" + "You answered " + ques[i].getUserAnswer() + "\n" ; 
							
							System.out.println("You answered " + ques[i].getUserAnswer());

							answer = ques[i].getUserAnswer();
							if (answer.equalsIgnoreCase(ques[i].correctoption)) {
			
								System.out.println("Correct answer");
								score++;
							} else
								System.out.println("Wrong Answer");

						}
						
                       log = log + "\n\n" +  "Your score is : " + score * 5 + "/50";
                        
						System.out.println("Your score " + score * 5);
						
						JTextArea textArea = new JTextArea(30, 100 );
					      textArea.setText(log);
					      textArea.setEditable(false);
					      JScrollPane scrollPane = new JScrollPane(textArea);
					      JOptionPane.showMessageDialog(frame, scrollPane);
						
						/*JFrame f = new JFrame();
						JOptionPane.showMessageDialog(f, log);*/
						

					}

					flag = false;

				} else {
					JFrame f = new JFrame();
					JOptionPane.showMessageDialog(f, "Submit your answer");
				}

			}
		});

	}

	public void load_question() {

		q = tobeasked.poll();

		textPane.setText(q.question);
		textField.setText(q.option1);
		textField_1.setText(q.option3);
		textField_2.setText(q.option2);
		textField_3.setText(q.option4);

	}
}
