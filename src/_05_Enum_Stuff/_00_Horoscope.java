package _05_Enum_Stuff;

import java.util.Random;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscope(Zodiac.SCORPIO);
	}
	
	static void horoscope(Zodiac e) {
		switch(e) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You might encounter some rather disturbing opinions or emotions from a friend, neighbor, or relative, Aries.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "Some gossip about a friend could reach you today, Taurus, and it might seem a bit shocking at first.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Today you might find that others are turning to you for advice today and you are honored to be in such a position, Gemini.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Today you might take up some form of esoteric study, such as astrology, numerology, or alchemy that seems incomprehensible to you at first, Cancer.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "A friend might be in such a dour mood that you wonder if this is the same person you know and love, Leo.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "A friend or romantic partner might need your advice, Virgo, and want to discuss a few things that you don't really understand.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Today you might read a book on exercise or nutrition that seems a bit unsettling, Libra.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Memories and emotions welling up from the past might excite your creative impulses today, Scorpio.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "A subject you're researching, perhaps for a class or workshop, might prove more difficult than you expected, Sagittarius.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "A housemate or family member may offer to help you with some chores around the house, Capricorn, but you may well sense that their heart just isn't in it.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Filling out forms regarding your finances could be a real drag for you today, Aquarius.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "A contract of some kind might require your careful consideration today, Pisces.");
			break;
		}
		}
	}
}
