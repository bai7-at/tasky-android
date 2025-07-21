package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class cn5 {
    public static final a Companion = new a(null);
    public static final int b = ts1.c;
    private static final cn5 c = new cn5(fb5.a.a());
    private final ts1 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cn5 a() {
            return cn5.c;
        }

        private a() {
        }
    }

    public cn5(ts1 ts1Var) {
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
        return (obj instanceof cn5) && zq3.c(this.a, ((cn5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "PageConfig(dividerConfig=" + this.a + ")";
    }
}
