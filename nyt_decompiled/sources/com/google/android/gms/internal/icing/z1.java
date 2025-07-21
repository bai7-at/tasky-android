package com.google.android.gms.internal.icing;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class z1 {
    static final String[] a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map b = new HashMap(10);

    static {
        int i = 0;
        while (true) {
            String[] strArr = a;
            int length = strArr.length;
            if (i >= 10) {
                return;
            }
            b.put(strArr[i], Integer.valueOf(i));
            i++;
        }
    }

    public static String a(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = a;
        int length = strArr.length;
        if (i >= 10) {
            return null;
        }
        return strArr[i];
    }

    public static int b(String str) {
        Integer num = (Integer) b.get(str);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder(str.length() + 44);
        sb.append("[");
        sb.append(str);
        sb.append("] is not a valid global search section name");
        throw new IllegalArgumentException(sb.toString());
    }
}
