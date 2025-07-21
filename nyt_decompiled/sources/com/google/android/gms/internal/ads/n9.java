package com.google.android.gms.internal.ads;

import defpackage.uge;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class n9 {
    public static Object a(Iterable iterable, Object obj) {
        ha haVar = new ha((ia) iterable);
        return haVar.hasNext() ? haVar.next() : obj;
    }

    public static boolean b(Iterable iterable, uge ugeVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            ugeVar.getClass();
            return d((List) iterable, ugeVar);
        }
        Iterator it2 = iterable.iterator();
        ugeVar.getClass();
        boolean z = false;
        while (it2.hasNext()) {
            if (ugeVar.zza(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    private static void c(List list, uge ugeVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ugeVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean d(List list, uge ugeVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!ugeVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        c(list, ugeVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        c(list, ugeVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
