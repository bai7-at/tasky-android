package kotlin.collections;

import defpackage.zq3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class j {
    public static List a(List list) {
        zq3.h(list, "builder");
        return ((ListBuilder) list).x();
    }

    public static final Object[] b(Object[] objArr, boolean z) {
        zq3.h(objArr, "<this>");
        if (z && zq3.c(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        zq3.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new ListBuilder(0, 1, null);
    }

    public static List d(int i) {
        return new ListBuilder(i);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        zq3.g(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List f(Iterable iterable) {
        zq3.h(iterable, "<this>");
        List Z0 = CollectionsKt___CollectionsKt.Z0(iterable);
        Collections.shuffle(Z0);
        return Z0;
    }

    public static Object[] g(int i, Object[] objArr) {
        zq3.h(objArr, "array");
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }
}
