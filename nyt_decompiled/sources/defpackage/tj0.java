package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class tj0 extends rj0 implements km0 {
    public static final a e = new a(null);
    private static final tj0 f = new tj0(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public tj0(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof tj0) {
            if (!isEmpty() || !((tj0) obj).isEmpty()) {
                tj0 tj0Var = (tj0) obj;
                if (g() != tj0Var.g() || j() != tj0Var.j()) {
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
        return j() + (g() * 31);
    }

    @Override // defpackage.km0
    public boolean isEmpty() {
        return zq3.j(g(), j()) > 0;
    }

    public boolean o(char c) {
        return zq3.j(g(), c) <= 0 && zq3.j(c, j()) <= 0;
    }

    @Override // defpackage.km0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Character f() {
        return Character.valueOf(j());
    }

    @Override // defpackage.km0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Character a() {
        return Character.valueOf(g());
    }

    public String toString() {
        return g() + ".." + j();
    }
}
