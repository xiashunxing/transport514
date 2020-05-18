package com;

import javax.xml.crypto.Data;

public class MaritimeMeansOfTransport extends Transport {
    public MaritimeMeansOfTransport() {
    }

    public MaritimeMeansOfTransport(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        super(ownerShip, GPSPosition, price, id, dataOfPurchase);
    }
}
