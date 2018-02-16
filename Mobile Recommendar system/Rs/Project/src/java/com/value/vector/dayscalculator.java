package com.value.vector;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class dayscalculator {

    public int dayscalc(Date date_testDate) {
        int days = 0;
        java.util.Date date = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dd_present = null;

        String d_present = df.format(date);
        try {
            dd_present = df.parse(d_present);
        } catch (ParseException ex) {
        }
        days =(int) ((dd_present.getTime() - (date_testDate.getTime())) / (24 * 60 * 60 * 1000));
        return days;
    }
}
