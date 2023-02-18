import javax.swing.*;



// Java Swing
// //hittps://beginnersbook.com/2015/07/java-swing-tutorial/

public class GUI {

    public static void main(String[] args) {

        JPanel panel = new JPanel(); // this is the layout panel which is invisible where the shit happens

        JFrame frame = new JFrame();  // this is the window
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80 ,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80 ,25);
        panel.add(passwordLabel);


        JTextField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50,165,25);
        panel.add(passwordText);

        JButton button =  new JButton("Login");
        button.setBounds(10,80, 80,25);
        panel.add(button);


        frame.setVisible(true);



    }
}