package com.appsflyer.internal;

import com.chartbeat.androidsdk.QueryKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class AFa1sSDK {

    enum AFa1wSDK {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    enum AFa1xSDK {
        NONE,
        FIRST,
        ALL
    }

    enum AFa1ySDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        String AFInAppEventType;

        AFa1ySDK(String str) {
            this.AFInAppEventType = str;
        }
    }

    AFa1sSDK() {
    }

    private static List<BigDecimal> values(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f2 = (Float) arrayList.get(1);
        Float f3 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f.toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f2.toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f3.toString())));
        return arrayList2;
    }

    final Map AFInAppEventType(List<Map<String, Object>> list) {
        AFa1xSDK aFa1xSDK;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            boolean z = map.get("sVS") != null;
            AFa1xSDK aFa1xSDK2 = (z && (map.get("sVE") != null)) ? AFa1xSDK.ALL : z ? AFa1xSDK.FIRST : AFa1xSDK.NONE;
            if (aFa1xSDK2 == AFa1xSDK.NONE) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("er", "na");
                return hashMap3;
            }
            Integer num = (Integer) map.get("sT");
            String str = (String) map.get("sN");
            if (str != null) {
                hashMap2.put(QueryKeys.IS_NEW_USER, str);
            } else {
                hashMap2.put(QueryKeys.IS_NEW_USER, "uk");
            }
            AFa1wSDK aFa1wSDK = AFa1wSDK.values()[num.intValue()];
            ArrayList arrayList2 = new ArrayList(values(map.get("sVS")));
            if (aFa1xSDK2 == AFa1xSDK.ALL) {
                arrayList2.addAll(values(map.get("sVE")));
            }
            if (aFa1wSDK == AFa1wSDK.MAGNETOMETER) {
                ArrayList arrayList3 = new ArrayList();
                aFa1xSDK = aFa1xSDK2;
                BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                DecimalFormat decimalFormat = new DecimalFormat("##.#");
                RoundingMode roundingMode = RoundingMode.DOWN;
                decimalFormat.setRoundingMode(roundingMode);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                BigDecimal bigDecimal = (BigDecimal) arrayList2.get(2);
                DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                decimalFormat2.setRoundingMode(roundingMode);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format(bigDecimal))));
                ArrayList arrayList4 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                    DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                    decimalFormat3.setRoundingMode(roundingMode);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                    BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                    decimalFormat4.setRoundingMode(roundingMode);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                }
                arrayList = new ArrayList();
                arrayList.add(arrayList3);
                arrayList.add(arrayList4);
            } else {
                aFa1xSDK = aFa1xSDK2;
                ArrayList arrayList5 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                    DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    decimalFormat5.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                    BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                    DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                    decimalFormat6.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                    BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                    decimalFormat7.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                }
                ArrayList arrayList6 = new ArrayList();
                BigDecimal bigDecimal2 = (BigDecimal) arrayList2.get(0);
                DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                decimalFormat8.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format(bigDecimal2))));
                BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(1);
                DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                decimalFormat9.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format(bigDecimal3))));
                BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(2);
                DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                decimalFormat10.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format(bigDecimal4))));
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(arrayList6);
                arrayList7.add(arrayList5);
                arrayList = arrayList7;
            }
            hashMap2.put(QueryKeys.INTERNAL_REFERRER, arrayList);
            hashMap.put(AFa1ySDK.values()[num.intValue()].AFInAppEventType, hashMap2);
            if (aFa1xSDK == AFa1xSDK.FIRST) {
                hashMap.put("er", "no_svs");
            }
        }
        return hashMap;
    }
}
