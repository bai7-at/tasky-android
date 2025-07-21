package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class r6a {
    private static final Comparator c = new Comparator() { // from class: p6a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((r6a) obj).a.b, ((r6a) obj2).a.b);
            return compare;
        }
    };
    private final s6a a;
    private final int b;

    /* synthetic */ r6a(s6a s6aVar, int i, q6a q6aVar) {
        this.a = s6aVar;
        this.b = i;
    }
}
