package com.Dlau;

/**
 * Created by Daniel on 29/08/2017.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
