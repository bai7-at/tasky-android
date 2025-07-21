package io.embrace.android.embracesdk.utils;

import defpackage.ss2;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class StreamUtilsKt {
    public static final <T> List<T> filter(Collection<? extends T> collection, ss2 ss2Var) {
        zq3.h(collection, "collection");
        zq3.h(ss2Var, "function");
        List X0 = i.X0(collection);
        ArrayList arrayList = new ArrayList();
        for (T t : X0) {
            if (((Boolean) ss2Var.invoke(t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> map(Collection<? extends T> collection, ss2 ss2Var) {
        zq3.h(collection, "collection");
        zq3.h(ss2Var, "function");
        List X0 = i.X0(collection);
        ArrayList arrayList = new ArrayList(i.w(X0, 10));
        Iterator<T> it2 = X0.iterator();
        while (it2.hasNext()) {
            arrayList.add(ss2Var.invoke(it2.next()));
        }
        return arrayList;
    }

    public static final <T> void stream(Collection<? extends T> collection, ss2 ss2Var) {
        zq3.h(collection, "collection");
        zq3.h(ss2Var, "function");
        Iterator<T> it2 = i.X0(collection).iterator();
        while (it2.hasNext()) {
            ss2Var.invoke(it2.next());
        }
    }
}
