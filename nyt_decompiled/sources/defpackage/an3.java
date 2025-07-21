package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class an3 extends ym3 implements km0 {
    public static final a e = new a(null);
    private static final an3 f = new an3(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final an3 a() {
            return an3.f;
        }

        private a() {
        }
    }

    public an3(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.ym3
    public boolean equals(Object obj) {
        if (obj instanceof an3) {
            if (!isEmpty() || !((an3) obj).isEmpty()) {
                an3 an3Var = (an3) obj;
                if (g() != an3Var.g() || j() != an3Var.j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ym3
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return j() + (g() * 31);
    }

    @Override // defpackage.ym3, defpackage.km0
    public boolean isEmpty() {
        return g() > j();
    }

    public boolean q(int i) {
        return g() <= i && i <= j();
    }

    @Override // defpackage.km0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer f() {
        return Integer.valueOf(j());
    }

    @Override // defpackage.ym3
    public String toString() {
        return g() + ".." + j();
    }

    @Override // defpackage.km0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return Integer.valueOf(g());
    }
}
