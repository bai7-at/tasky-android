package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class el5 {

    public static final class a extends el5 {
        private final ip5 a;

        public a(ip5 ip5Var) {
            super(null);
            this.a = ip5Var;
        }

        public final ip5 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends el5 {
        private final kt6 a;

        public b(kt6 kt6Var) {
            super(null);
            this.a = kt6Var;
        }

        public final kt6 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class c extends el5 {
        private final a37 a;
        private final ip5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(a37 a37Var) {
            super(0 == true ? 1 : 0);
            boolean f;
            ip5 ip5Var = null;
            this.a = a37Var;
            f = fl5.f(a37Var);
            if (!f) {
                ip5Var = cg.a();
                ip5Var.D(a37Var);
            }
            this.b = ip5Var;
        }

        public final a37 a() {
            return this.a;
        }

        public final ip5 b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public /* synthetic */ el5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private el5() {
    }
}
