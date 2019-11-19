package Main;

import CryptoData.BitCoinCurrency;
import CryptoData.EthereumCurrency;

import CryptoGUI.CryptoFrame;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    	ProcessBuilder process = new ProcessBuilder();

    }

    public void run(){
    	CryptoFrame frame = new CryptoFrame();

        BitCoinCurrency BitCoin = new BitCoinCurrency(frame);
        Thread bitCoinThread = new Thread(BitCoin);

        EthereumCurrency Ethereum = new EthereumCurrency(frame);
        Thread ethereumThread = new Thread(Ethereum);

        bitCoinThread.start();
        ethereumThread.start();

    }
}
