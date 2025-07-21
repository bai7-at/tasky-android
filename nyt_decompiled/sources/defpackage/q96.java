package defpackage;

import defpackage.om0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class q96 {
    private final String a;
    private final String b;

    public static abstract class a extends q96 {

        /* renamed from: q96$a$a, reason: collision with other inner class name */
        public static final class C0515a extends a {
            public static final C0515a c = new C0515a();

            private C0515a() {
                super(om0.a.c, null);
            }
        }

        public /* synthetic */ a(om0 om0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(om0Var);
        }

        private a(om0 om0Var) {
            super(om0Var.b(), om0Var.a(), null);
        }
    }

    public static abstract class b extends q96 {
        private final String c;

        public static final class a extends b {
            private final boolean d;
            private final om0 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, om0 om0Var) {
                super("accept_all", om0Var, null);
                zq3.h(om0Var, "layer");
                this.d = z;
                this.e = om0Var;
            }

            public final boolean d() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.d == aVar.d && zq3.c(this.e, aVar.e);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.d) * 31) + this.e.hashCode();
            }

            @Override // defpackage.q96
            public String toString() {
                return "OnTCFAcceptAll(isSuccess=" + this.d + ", layer=" + this.e + ")";
            }
        }

        /* renamed from: q96$b$b, reason: collision with other inner class name */
        public static final class C0516b extends b {
            public static final C0516b d = new C0516b();

            private C0516b() {
                super("cookie_policy", om0.a.c, null);
            }
        }

        public static final class c extends b {
            private final String d;

            public c(String str) {
                super(str, om0.b.c, null);
                this.d = str;
            }

            @Override // q96.b
            public String c() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && zq3.c(this.d, ((c) obj).d);
            }

            public int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // defpackage.q96
            public String toString() {
                return "OnTCFManageSettingsElementClick(element=" + this.d + ")";
            }
        }

        public static final class d extends b {
            public static final d d = new d();

            private d() {
                super("manage_prefs", om0.a.c, null);
            }
        }

        public static final class e extends b {
            private final om0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(om0 om0Var) {
                super("close", om0Var, null);
                zq3.h(om0Var, "layer");
                this.d = om0Var;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && zq3.c(this.d, ((e) obj).d);
            }

            public int hashCode() {
                return this.d.hashCode();
            }

            @Override // defpackage.q96
            public String toString() {
                return "OnTCFPageExit(layer=" + this.d + ")";
            }
        }

        public static final class f extends b {
            public static final f d = new f();

            private f() {
                super("privacy_policy", om0.a.c, null);
            }
        }

        public static final class g extends b {
            private final boolean d;
            private final om0 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(boolean z, om0 om0Var) {
                super("reject_all", om0Var, null);
                zq3.h(om0Var, "layer");
                this.d = z;
                this.e = om0Var;
            }

            public final boolean d() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.d == gVar.d && zq3.c(this.e, gVar.e);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.d) * 31) + this.e.hashCode();
            }

            @Override // defpackage.q96
            public String toString() {
                return "OnTCFRejectAll(isSuccess=" + this.d + ", layer=" + this.e + ")";
            }
        }

        public /* synthetic */ b(String str, om0 om0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, om0Var);
        }

        public String c() {
            return this.c;
        }

        private b(String str, om0 om0Var) {
            super(om0Var.b(), om0Var.a(), null);
            this.c = str;
        }
    }

    public static final class c extends q96 {
        private final boolean c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(boolean r4) {
            /*
                r3 = this;
                om0$b r0 = om0.b.c
                java.lang.String r1 = r0.b()
                java.lang.String r0 = r0.a()
                r2 = 0
                r3.<init>(r1, r0, r2)
                r3.c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q96.c.<init>(boolean):void");
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.c == ((c) obj).c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.c);
        }

        @Override // defpackage.q96
        public String toString() {
            return "OnTCFCustomSave(isSuccess=" + this.c + ")";
        }
    }

    public /* synthetic */ q96(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public String toString() {
        if (this instanceof b.a) {
            return "OnTCFAcceptAll(isSuccess:" + ((b.a) this).d() + ")";
        }
        if (zq3.c(this, a.C0515a.c)) {
            return "OnTCFBlockerCardShown";
        }
        if (this instanceof c) {
            return "OnTCFCustomSave(isSuccess:" + ((c) this).c() + ")";
        }
        if (zq3.c(this, b.d.d)) {
            return "OnTCFManageSettingsPageShown";
        }
        if (this instanceof b.g) {
            return "OnTCFRejectAll(isSuccess:" + ((b.g) this).d() + ")";
        }
        if (zq3.c(this, b.C0516b.d)) {
            return "OnTCFCookiePolicy";
        }
        if (zq3.c(this, b.f.d)) {
            return "OnTCFPrivacyPolicy";
        }
        if (this instanceof b.c) {
            return "OnManageSettingsTabClick";
        }
        if (this instanceof b.e) {
            return "OnTCFPageExit";
        }
        throw new NoWhenBranchMatchedException();
    }

    private q96(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
