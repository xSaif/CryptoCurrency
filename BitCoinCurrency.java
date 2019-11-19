package CryptoData;

import org.json.JSONObject;

import CryptoGUI.CryptoFrame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BitCoinCurrency extends MiscCurrency{

    public BitCoinCurrency(CryptoFrame frame){
        this.mainFrame = frame;
    }


    @Override
    public void setCurrencyName(String name) {
        this.currencyName = name;
    }

    @Override
    public String getCurrencyName() {
        return this.currencyName;
    }

    @Override
    public void setCurrencyValue(double value) {
        this.currencyValue = value;
    }

    @Override
    public double getCurrencyValue() {
        return this.currencyValue;
    }

    @Override
    public void setCurrencyLastChange(double value) {
        this.currencyLastChange = value;
    }

    @Override
    public double getCurrencyLastChange() {
        return this.currencyLastChange;
    }

    @Override
    public void run() {
        try {
            setCurrencyName("BitCoin");

            while (true) {
                Thread.sleep(2500);
                URL url = new URL("https://api.bitaps.com/market/v1/ticker/btcusd");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;

                StringBuilder sb = new StringBuilder();
                while ((inputLine = reader.readLine()) != null)
                    sb.append(inputLine);

                JSONObject object = new JSONObject(sb.toString());
                setCurrencyValue(Double.parseDouble(object.getJSONObject("data").get("last").toString()));
                setCurrencyLastChange(Double.parseDouble(object.getJSONObject("data").get("last_change").toString()));

                mainFrame.setCryptoName1(getCurrencyName());
                mainFrame.setCryptoValue1(getCurrencyValue());
                mainFrame.setCryptoLastChange1(getCurrencyLastChange());
            }
        } catch (IOException | InterruptedException e) {
                e.printStackTrace();
        }
    }
}
