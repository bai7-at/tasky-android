package defpackage;

import defpackage.jr8;

/* loaded from: classes.dex */
public final class f85 implements jr8 {
    private final sr8 a;
    private final xg3 b;

    public static final class a implements jr8.a {
        @Override // jr8.a
        public jr8 a(sr8 sr8Var, xg3 xg3Var) {
            return new f85(sr8Var, xg3Var);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public f85(sr8 sr8Var, xg3 xg3Var) {
        this.a = sr8Var;
        this.b = xg3Var;
    }

    @Override // defpackage.jr8
    public void a() {
        xg3 xg3Var = this.b;
        if (xg3Var instanceof cc8) {
            this.a.a(((cc8) xg3Var).a());
        } else if (xg3Var instanceof a32) {
            this.a.c(xg3Var.a());
        }
    }
}
