package com.chartbeat.androidsdk;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class StringUtils {
    StringUtils() {
    }

    static String collectionToCommaString(Collection<String> collection) {
        if (collection == null || collection.size() == 0) {
            return null;
        }
        Iterator<String> it2 = collection.iterator();
        int i = 0;
        String str = "";
        while (it2.hasNext()) {
            String str2 = str + it2.next().replaceAll(",", "");
            i++;
            if (i != collection.size()) {
                str = str2 + ",";
            } else {
                str = str2;
            }
        }
        return str;
    }
}
