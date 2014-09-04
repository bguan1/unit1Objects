
import javax.swing.JOptionPane;
import java.net.URL;
import javax.swing.ImageIcon;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
        "http://www.napervilletennis.com/s/cc_images/cache_4203727065.jpg");
        JOptionPane.showMessageDialog(null,"I'm fat","Title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}