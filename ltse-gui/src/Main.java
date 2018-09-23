
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * @author lgtneto
 * @company VeriTeS UFRGS
 * @version 1.0
 */
public class Main {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        MainPanel ltseGui = new MainPanel();
        try {
            URL resource = ltseGui.getClass().getResource("icon.png");
            BufferedImage image = ImageIO.read(resource);
            ltseGui.setIconImage(image);  
        } catch (IOException e) {
            e.printStackTrace();
        }      
        ltseGui.setTitle("LTS Extractor");
        ltseGui.setResizable(false); // fixed size
        ltseGui.setVisible(true);
    }   
}
