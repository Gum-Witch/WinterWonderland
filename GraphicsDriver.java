import javax.swing.JFrame;

public class GraphicsDriver extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsDriver()
    {
        super("Graphics Driver");

        setSize(WIDTH,HEIGHT);

        getContentPane().add(new WinterWonderland());

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String args[] )
    {
        GraphicsDriver run = new GraphicsDriver();
    }
}
