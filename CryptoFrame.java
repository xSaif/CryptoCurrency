package CryptoGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

public class CryptoFrame extends JFrame {
    private String cryptoName[] = new String[2];
    private double cryptoValue[] = new double[2];
    private double cryptoLastChange[] = new double[2];

    private JLabel cryptoLabelName[];
    private JLabel cryptoLabelValue[];
    private JLabel cryptoLabelLastChange[];

    public CryptoFrame(){
        cryptoLabelName = new JLabel[2];
        for(int i = 0 ; i < cryptoLabelName.length ; i++)
            cryptoLabelName[i] = new JLabel();
        cryptoLabelValue = new JLabel[2];
        for(int i = 0 ; i < cryptoLabelValue.length ; i++)
            cryptoLabelValue[i] = new JLabel();
        cryptoLabelLastChange = new JLabel[2];
        for(int i = 0 ; i < cryptoLabelLastChange.length ; i++)
            cryptoLabelLastChange[i] = new JLabel();

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("Cryptocurrency"));
        panel.add(new JLabel("Current value"));
        panel.add(new JLabel("Last Change"));

        // Bitcoin details
        panel.add(cryptoLabelName[0]);
        panel.add(cryptoLabelValue[0]);
        panel.add(cryptoLabelLastChange[0]);

        // Ethereum details

        panel.add(cryptoLabelName[1]);
        panel.add(cryptoLabelValue[1]);
        panel.add(cryptoLabelLastChange[1]);

        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CryptoCurrency");
        this.setSize(600,600);
        this.setVisible(true);
    }

    public void setCryptoName1(String cryptoName){
        this.cryptoName[0] = cryptoName;
        this.cryptoLabelName[0].setText(cryptoName);
    }

    public String getCryptoName1(){
        return this.cryptoName[0];
    }

    public void setCryptoName2(String cryptoName){
        this.cryptoName[1] = cryptoName;
        this.cryptoLabelName[1].setText(cryptoName);
    }

    public String getCryptoName2(){
        return this.cryptoName[1];
    }

    public void setCryptoValue1(double cryptoValue){
        this.cryptoValue[0] = cryptoValue;
        this.cryptoLabelValue[0].setText(String.valueOf(cryptoValue));
    }

    public double getCryptoValue1(){
        return this.cryptoValue[0];
    }

    public void setCryptoValue2(double cryptoValue){
        this.cryptoValue[1] = cryptoValue;
        this.cryptoLabelValue[1].setText(String.valueOf(cryptoValue));
    }

    public double getCryptoValue2(){
        return this.cryptoValue[1];
    }

    public void setCryptoLastChange1(double cryptoLastChange){
        this.cryptoLastChange[0] = cryptoLastChange;
        this.cryptoLabelLastChange[0].setText(String.valueOf(cryptoLastChange));
    }

    public double getCryptoLastChange1(){
        return this.cryptoLastChange[0];
    }

    public void setCryptoLastChange2(double cryptoLastChange){
        this.cryptoLastChange[1] = cryptoLastChange;
        this.cryptoLabelLastChange[1].setText(String.valueOf(cryptoLastChange));
    }

    public double getCryptoLastChange2(){
        return this.cryptoLastChange[1];
    }
}
