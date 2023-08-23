import javax.swing.JOptionPane;

public class box {
    public static void main(String[] args) {
        String Fahrenheit = JOptionPane.showInputDialog("Fahrenheit");

        double Fahrenheit1 = Double.parseDouble(Fahrenheit);
        double Celsius = (5.0/9.0) * (Fahrenheit1 - 32);

        JOptionPane.showMessageDialog(null, "Celsius = " + String.format("%.2f", Celsius), "Celsius", JOptionPane.WARNING_MESSAGE);


        
}
}
