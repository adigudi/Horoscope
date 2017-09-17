import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What is your Zodiac Sign?");
		if(sign.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "You've got charm, smarts, and the element of surprise going for you all year long!");
		}
		else if(sign.equalsIgnoreCase("Taurus")) {
	    	JOptionPane.showMessageDialog(null, "This year, focus on your own well-being above all else.");
	    }
	    else if(sign.equalsIgnoreCase("Gemini")) {
	    	JOptionPane.showMessageDialog(null, "You'll have endless ideas and insights but it may be hard to activate them on your own.");
	    }
	    else if(sign.equalsIgnoreCase("Cancer")) {
	    	JOptionPane.showMessageDialog(null, "2017 can be a highwater year full of major achievements, crucial decisions and changes for you, Cancer.");
	    }
	    	else if(sign.equalsIgnoreCase("Leo")) {
	    	JOptionPane.showMessageDialog(null, "This is a year on fire, pouring energy into your work, career, and creativity sectors.");
	    }
	    	else if(sign.equalsIgnoreCase("Virgo")) {
	    	JOptionPane.showMessageDialog(null, "Thoughts and ideas to move you ahead will be abundant and achievable all year.");
	    }
	    	else if(sign.equalsIgnoreCase("Libra")) {
	    	JOptionPane.showMessageDialog(null,"Have a persistent vision, help and be helpful, and you should have a magnificent year!");
	    }
	    	else if(sign.equalsIgnoreCase("Scorpio")) {
	    	JOptionPane.showMessageDialog(null,"Keep an eye out for lucky opportunities and be ready to pounce. ");
	    }
	    	else if(sign.equalsIgnoreCase("Sagittarius")) {
	    JOptionPane.showMessageDialog(null,"This year, you can do just about anything.");
        }
	    	else if(sign.equalsIgnoreCase("Capricorn")) {
    	    JOptionPane.showMessageDialog(null,"It's your year to charge ahead, make bold changes for progress, success, and achieve greater respect in the world.");
        }
	    	else if(sign.equalsIgnoreCase("Aquarius")) {
    	    JOptionPane.showMessageDialog(null,"Hard work and success are there, too, but your greatest progress may be made internally rather than externally.");
        }
	    	else if(sign.equalsIgnoreCase("Pisces")) {
    	    JOptionPane.showMessageDialog(null,"Take the time to distinguish between what's real and what's illusion and you'll safely navigate any and all situations.");
        }
        else {
        	JOptionPane.showMessageDialog(null, "That is not a Zodiac Sign!");
        }
        
}
	}
