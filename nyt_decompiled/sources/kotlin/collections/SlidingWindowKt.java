package kotlin.collections;

import defpackage.l02;
import defpackage.zq3;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class SlidingWindowKt {
    public static final void a(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final Iterator b(Iterator it2, int i, int i2, boolean z, boolean z2) {
        zq3.h(it2, "iterator");
        return !it2.hasNext() ? l02.a : kotlin.sequences.d.a(new SlidingWindowKt$windowedIterator$1(i, i2, it2, z2, z, null));
    }
}
