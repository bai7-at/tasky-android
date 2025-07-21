package com.zendesk.logger;

import defpackage.r48;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
abstract class a {
    static String a(String str) {
        return r48.d(str) ? "Zendesk" : str.length() > 23 ? str.substring(0, 23) : str;
    }

    static char b(int i) {
        if (i == 2) {
            return 'V';
        }
        if (i == 3) {
            return 'D';
        }
        if (i == 5) {
            return 'W';
        }
        if (i != 6) {
            return i != 7 ? 'I' : 'A';
        }
        return 'E';
    }

    static List c(String str, int i) {
        int min;
        ArrayList arrayList = new ArrayList();
        if (i < 1) {
            if (r48.b(str)) {
                arrayList.add(str);
                return arrayList;
            }
            arrayList.add("");
            return arrayList;
        }
        if (!r48.b(str)) {
            arrayList.add("");
            return arrayList;
        }
        if (str.length() < i) {
            arrayList.add(str);
            return arrayList;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str.indexOf(r48.b, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + i);
                arrayList.add(str.substring(i2, min));
                if (min >= indexOf) {
                    break;
                }
                i2 = min;
            }
            i2 = min + 1;
        }
        return arrayList;
    }
}
