package defpackage;

import defpackage.oq1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class au7 {
    public static final a c = new a(null);
    public static final au7 d;
    private final oq1 a;
    private final oq1 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        oq1.b bVar = oq1.b.a;
        d = new au7(bVar, bVar);
    }

    public au7(oq1 oq1Var, oq1 oq1Var2) {
        this.a = oq1Var;
        this.b = oq1Var2;
    }

    public final oq1 a() {
        return this.a;
    }

    public final oq1 b() {
        return this.b;
    }

    public final oq1 c() {
        return this.b;
    }

    public final oq1 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au7)) {
            return false;
        }
        au7 au7Var = (au7) obj;
        return zq3.c(this.a, au7Var.a) && zq3.c(this.b, au7Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
