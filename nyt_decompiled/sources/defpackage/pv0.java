package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class pv0 {
    public static final a Companion = new a(null);
    public static final int b = ts1.c;
    private static final pv0 c = new pv0(fb5.a.a());
    private final ts1 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pv0 a() {
            return pv0.c;
        }

        private a() {
        }
    }

    public pv0(ts1 ts1Var) {
        zq3.h(ts1Var, "dividerConfig");
        this.a = ts1Var;
    }

    public final ts1 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv0) && zq3.c(this.a, ((pv0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ContainerConfig(dividerConfig=" + this.a + ")";
    }
}
