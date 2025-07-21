package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class b3 {
    static int a(Set set) {
        Iterator it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
