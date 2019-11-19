package Crypto;

public interface CryptoCurrency{

    // set and get the currency name
    void setCurrencyName(String name);
    String getCurrencyName();

    // set and get the currency current value
    void setCurrencyValue(double value);
    double getCurrencyValue();

    // set and get the currency last change value
    void setCurrencyLastChange(double value);
    double getCurrencyLastChange();
}
