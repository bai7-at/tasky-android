package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzts {
    static int zza(Set set) {
        Iterator it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
