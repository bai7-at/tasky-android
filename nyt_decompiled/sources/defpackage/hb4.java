package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class hb4 extends fb4 implements km0 {
    public static final a e = new a(null);
    private static final hb4 f = new hb4(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public hb4(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof hb4) {
            if (!isEmpty() || !((hb4) obj).isEmpty()) {
                hb4 hb4Var = (hb4) obj;
                if (g() != hb4Var.g() || j() != hb4Var.j()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (g() ^ (g() >>> 32))) + (j() ^ (j() >>> 32)));
    }

    @Override // defpackage.km0
    public boolean isEmpty() {
        return g() > j();
    }

    @Override // defpackage.km0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long f() {
        return Long.valueOf(j());
    }

    @Override // defpackage.km0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long a() {
        return Long.valueOf(g());
    }

    public String toString() {
        return g() + ".." + j();
    }
}
