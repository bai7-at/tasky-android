package io.embrace.android.embracesdk.utils;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class CollectionExtensionsKt {
    public static final <T> T at(List<? extends T> list, int i) {
        zq3.h(list, "$this$at");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final <T> T lockAndRun(Map<String, AtomicInteger> map, String str, qs2 qs2Var) {
        AtomicInteger atomicInteger;
        T t;
        zq3.h(map, "$this$lockAndRun");
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(qs2Var, "code");
        synchronized (map) {
            try {
                atomicInteger = map.get(str);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger(0);
                }
                if (map.get(str) == null) {
                    map.put(str, atomicInteger);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        atomicInteger.incrementAndGet();
        synchronized (atomicInteger) {
            try {
                t = (T) qs2Var.mo865invoke();
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    map.remove(str);
                }
            }
        }
        return t;
    }

    public static final <T> List<T> threadSafeTake(Collection<? extends T> collection, int i) {
        zq3.h(collection, "$this$threadSafeTake");
        if (i == 0) {
            return i.l();
        }
        ArrayList arrayList = new ArrayList(i);
        Collection<? extends T> collection2 = collection;
        Iterator<T> it2 = collection2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList.size() <= 1 ? i.P0(collection2, arrayList.size()) : arrayList;
    }
}
