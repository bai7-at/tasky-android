package kotlin.collections;

import defpackage.an3;
import defpackage.tp0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class k extends j {
    public static ArrayList h(Object... objArr) {
        zq3.h(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new b(objArr, true));
    }

    public static final Collection i(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return new b(objArr, false);
    }

    public static final int j(List list, Comparable comparable, int i, int i2) {
        zq3.h(list, "<this>");
        t(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int d = tp0.d((Comparable) list.get(i4), comparable);
            if (d < 0) {
                i = i4 + 1;
            } else {
                if (d <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int k(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return j(list, comparable, i, i2);
    }

    public static List l() {
        return EmptyList.a;
    }

    public static an3 m(Collection collection) {
        zq3.h(collection, "<this>");
        return new an3(0, collection.size() - 1);
    }

    public static int n(List list) {
        zq3.h(list, "<this>");
        return list.size() - 1;
    }

    public static List o(Object... objArr) {
        zq3.h(objArr, "elements");
        return objArr.length > 0 ? d.e(objArr) : i.l();
    }

    public static List p(Object obj) {
        return obj != null ? i.e(obj) : i.l();
    }

    public static List q(Object... objArr) {
        zq3.h(objArr, "elements");
        return d.Y(objArr);
    }

    public static List r(Object... objArr) {
        zq3.h(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new b(objArr, true));
    }

    public static final List s(List list) {
        zq3.h(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : i.e(list.get(0)) : i.l();
    }

    private static final void t(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static void u() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void v() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
