package com;

import javax.xml.crypto.Data;

public class LandTransport extends Transport{

    public LandTransport() {
    }

    public LandTransport(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
