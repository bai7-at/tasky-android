package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class q9 {
    static Object a(Iterator it2) {
        if (!it2.hasNext()) {
            return null;
        }
        Object next = it2.next();
        it2.remove();
        return next;
    }

    static void b(Iterator it2) {
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    public static boolean c(Collection collection, Iterator it2) {
        boolean z = false;
        while (it2.hasNext()) {
            z |= collection.add(it2.next());
        }
        return z;
    }
}
