package examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class L_QuoteOptionsPanel extends JPanel
{
	private JLabel	quote;
	private JRadioButton	comedy, philosophy, carpentry;
	private String			comedyQuote, philosophyQuote, carpentryQuote;

	public L_QuoteOptionsPanel()
	{
		comedyQuote = "Take my wife, please.";
		philosophyQuote = "I think, therefore I am.";
		carpentryQuote = "Measure twice. Cut once.";

		quote = new JLabel("Please make a selection");
		quote.setFont(new Font("Helvetica", Font.BOLD, 24));

		comedy = new JRadioButton("Comedy");
		comedy.setBackground(Color.green);
		philosophy = new JRadioButton("Philosophy");
		philosophy.setBackground(Color.green);
		carpentry = new JRadioButton("Carpentry");
		carpentry.setBackground(Color.green);

		ButtonGroup group = new ButtonGroup();
		group.add(comedy);
		group.add(philosophy);
		group.add(carpentry);

		QuoteListener listener = new QuoteListener();
		comedy.addActionListener(listener);
		philosophy.addActionListener(listener);
		carpentry.addActionListener(listener);

		add(quote);
		add(comedy);
		add(philosophy);
		add(carpentry);

		setBackground(Color.green);
		setPreferredSize(new Dimension(300, 100));
	}

	private class QuoteListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();
			if (source == comedy)
				quote.setText(comedyQuote);
			else if (source == philosophy)
				quote.setText(philosophyQuote);
			else
				quote.setText(carpentryQuote);
		}
	}
}
