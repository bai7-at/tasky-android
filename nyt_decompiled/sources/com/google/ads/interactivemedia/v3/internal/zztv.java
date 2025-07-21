package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
final class zztv {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zztf.zza;
            }
        } else {
            if (!(iterable instanceof zztu)) {
                return false;
            }
            comparator2 = ((zztu) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
