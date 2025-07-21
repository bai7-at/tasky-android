package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class nb8 {
    public static final a Companion = new a(null);
    private final String a;
    private final int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public nb8(String str, int i) {
        zq3.h(str, "period");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb8)) {
            return false;
        }
        nb8 nb8Var = (nb8) obj;
        return zq3.c(this.a, nb8Var.a) && this.b == nb8Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "SubscriptionPeriod(period=" + this.a + ", cycles=" + this.b + ")";
    }
}
