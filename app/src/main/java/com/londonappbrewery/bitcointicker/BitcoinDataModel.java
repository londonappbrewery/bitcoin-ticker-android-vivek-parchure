package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mPriceText;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoindata = new BitcoinDataModel();
            bitcoindata.mPriceText = jsonObject.getString("ask");
            return bitcoindata;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getPriceText() {
        return mPriceText;
    }
}
