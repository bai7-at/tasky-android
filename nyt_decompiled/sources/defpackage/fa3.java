package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class fa3 implements l34 {
    public static final int c = ts1.c;
    private final ts1 a;
    private final String b;

    public fa3(ts1 ts1Var, String str) {
        zq3.h(ts1Var, "config");
        this.a = ts1Var;
        this.b = str;
    }

    @Override // defpackage.l34
    public String a() {
        return this.b;
    }

    public final ts1 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa3)) {
            return false;
        }
        fa3 fa3Var = (fa3) obj;
        return zq3.c(this.a, fa3Var.a) && zq3.c(this.b, fa3Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HorizontalDividerLevel(config=" + this.a + ", testTag=" + this.b + ")";
    }

    public /* synthetic */ fa3(ts1 ts1Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ts1Var, (i & 2) != 0 ? null : str);
    }
}
