package com.google.android.gms.internal.ads;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class t8 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
