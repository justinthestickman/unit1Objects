import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://img2.wikia.nocookie.net/__cb20110201043740/cybernations/images/7/73/Trollface.png");
        JOptionPane.showMessageDialog(null, "Trollolololol", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}