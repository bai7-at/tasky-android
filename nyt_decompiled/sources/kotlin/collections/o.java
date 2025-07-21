package kotlin.collections;

import defpackage.zq3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class o extends n {
    public static void A(List list, Comparator comparator) {
        zq3.h(list, "<this>");
        zq3.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void z(List list) {
        zq3.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
