package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DBConnection connect = new DBConnection();
                new LogInInterface();
            }
        });
    }
}
