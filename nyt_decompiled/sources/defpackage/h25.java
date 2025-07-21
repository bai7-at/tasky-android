package defpackage;

import com.nytimes.android.api.cms.Tag;
import java.util.Comparator;

/* loaded from: classes5.dex */
final class h25 implements Comparator {
    public static final h25 a = new h25();

    private h25() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        zq3.h(comparable, Tag.A);
        zq3.h(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return k17.a;
    }
}
