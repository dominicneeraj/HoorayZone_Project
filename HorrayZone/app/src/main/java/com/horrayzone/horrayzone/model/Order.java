package com.horrayzone.horrayzone.model;

import com.google.gson.annotations.SerializedName;

public class Order {
    private static final String TAG = "Order";

    public enum Status {
        APPROVED("Approved"),
        CANCELED("Canceled"),
        PENDING("Pending");

        String name;

        Status(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Status fromName(String name) {
            for (Status value : values()) {
                if (value.getName().equals(name)) {
                    return value;
                }
            }
            return null;
        }
    }

    @SerializedName("productId")
    private String serverId;

    @SerializedName("reference")
    private String reference;

    @SerializedName("date")
    private String date;

    @SerializedName("quantity")
    private int quantity;

    @SerializedName("subtotal")
    private String subtotal;

    @SerializedName("shippingPrice")
    private String shippingPrice;

    @SerializedName("tax")
    private String tax;

    @SerializedName("status")
    private String status;

    public long getServerId() {
        return Long.parseLong(serverId);
    }

    public String getReference() {
        return reference;
    }

    public String getDate() {



        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public String getShippingPrice() {
        return shippingPrice;
    }

    public String getTax() {
        return tax;
    }

    public Status getStatus() {
        return Status.fromName(status);
    }

    public String getRawStatus() {
        return status;
    }
}
