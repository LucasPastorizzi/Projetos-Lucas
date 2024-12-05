import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
       
        Notas n = new Notas();
        JFrame pag = new JFrame("CALCULAR NOTAS / MÉDIA FINAL");
        pag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pag.setVisible(true);
        pag.setBounds(0, 0, 400, 800);
        
        

    }
}
