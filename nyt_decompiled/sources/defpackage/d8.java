package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class d8 {
    public static final a Companion = new a(null);
    public static final int a = 0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d8 a(z7 z7Var) {
            if (z7Var != null) {
                d8 dVar = z7Var instanceof h02 ? c.b : new d(z7Var);
                if (dVar != null) {
                    return dVar;
                }
            }
            return b.b;
        }

        private a() {
        }
    }

    public static final class b extends d8 {
        public static final b b = new b();
        public static final int c = 0;

        private b() {
            super(null);
        }
    }

    public static final class c extends d8 {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends d8 {
        private final z7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z7 z7Var) {
            super(null);
            zq3.h(z7Var, "adView");
            this.b = z7Var;
        }

        public final z7 a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.b, ((d) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Visible(adView=" + this.b + ")";
        }
    }

    public /* synthetic */ d8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d8() {
    }
}
