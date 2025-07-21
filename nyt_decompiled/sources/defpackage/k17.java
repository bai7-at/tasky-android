package defpackage;

import com.nytimes.android.api.cms.Tag;
import java.util.Comparator;

/* loaded from: classes5.dex */
final class k17 implements Comparator {
    public static final k17 a = new k17();

    private k17() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        zq3.h(comparable, Tag.A);
        zq3.h(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return h25.a;
    }
}
