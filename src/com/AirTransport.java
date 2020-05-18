package com;

import javax.xml.crypto.Data;

public class AirTransport extends Transport{

    public AirTransport() {
    }

    public AirTransport(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
