package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i74 {
    public static final a b = new a(null);
    private final ou5 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i74 a() {
            return qu5.a().b().c(0);
        }

        private a() {
        }
    }

    public i74(ou5 ou5Var) {
        this.a = ou5Var;
    }

    public final ou5 a() {
        return this.a;
    }

    public final String b() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i74)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return zq3.c(b(), ((i74) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    public i74(String str) {
        this(qu5.a().a(str));
    }
}
