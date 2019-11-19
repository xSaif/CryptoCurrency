package CryptoData;

import Crypto.CryptoCurrency;
import CryptoGUI.CryptoFrame;

public abstract class MiscCurrency implements CryptoCurrency,Runnable {
    protected String currencyName = null;
    protected double currencyValue = 0.0;
    protected double currencyLastChange = 0.0;
    protected CryptoFrame mainFrame;
}