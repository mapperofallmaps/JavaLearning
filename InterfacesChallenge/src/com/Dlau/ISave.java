package com.Dlau;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 30/08/2017.
 */
public interface ISave {
    List<String> write();
    void read(List<String> savedValues);

}
