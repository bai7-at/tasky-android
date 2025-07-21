package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class y28 {

    public static abstract class a extends y28 {

        /* renamed from: y28$a$a, reason: collision with other inner class name */
        public static final class C0556a extends a {
            private final String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0556a(String str) {
                super(null);
                zq3.h(str, "errorMessage");
                this.a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0556a) && zq3.c(this.a, ((C0556a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "ConnectionFailed(errorMessage=" + this.a + ")";
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        public static final class e extends a {
            private final String a;

            public e(String str) {
                super(null);
                this.a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
            }

            public int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Unknown(errorMessage=" + this.a + ")";
            }
        }

        public static final class f extends a {
            public static final f a = new f();

            private f() {
                super(null);
            }
        }

        public static final class g extends a {
            private final String a;

            public g(String str) {
                super(null);
                this.a = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
            }

            public int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "VerifyPurchaseReceiptFailed(errorMessage=" + this.a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(null);
        }
    }

    public static final class b extends y28 {
        private final x28 a;
        private final d54 b;

        public /* synthetic */ b(x28 x28Var, d54 d54Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(x28Var, (i & 2) != 0 ? null : d54Var);
        }

        public final d54 a() {
            return this.b;
        }

        public final x28 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            d54 d54Var = this.b;
            return hashCode + (d54Var == null ? 0 : d54Var.hashCode());
        }

        public String toString() {
            return "Success(response=" + this.a + ", linkNYTAccountToPurchaseStatus=" + this.b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x28 x28Var, d54 d54Var) {
            super(null);
            zq3.h(x28Var, "response");
            this.a = x28Var;
            this.b = d54Var;
        }
    }

    public /* synthetic */ y28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y28() {
    }
}
