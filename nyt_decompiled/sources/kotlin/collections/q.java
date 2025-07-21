package kotlin.collections;

import defpackage.an3;
import defpackage.zq3;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class q extends p {
    public static List S(List list) {
        zq3.h(list, "<this>");
        return new z(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(List list, int i) {
        if (i >= 0 && i <= i.n(list)) {
            return i.n(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new an3(0, i.n(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(List list, int i) {
        return i.n(list) - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new an3(0, list.size()) + "].");
    }
}
