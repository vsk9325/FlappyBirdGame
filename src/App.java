import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardheight = 640;
        int boardWidth = 360;

        JFrame frame = new JFrame();
        frame.setSize(boardWidth, boardheight);
        // frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}
