package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d65 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query NewsletterSubscriptions { user { newsletterSubscriptions { newsletters { productCode freeTrialSignupTime isFreeTrial } } } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final Integer b;
        private final boolean c;

        public c(String str, Integer num, boolean z) {
            zq3.h(str, "productCode");
            this.a = str;
            this.b = num;
            this.c = z;
        }

        public final Integer a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "Newsletter(productCode=" + this.a + ", freeTrialSignupTime=" + this.b + ", isFreeTrial=" + this.c + ")";
        }
    }

    public static final class d {
        private final List a;

        public d(List list) {
            zq3.h(list, "newsletters");
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "NewsletterSubscriptions(newsletters=" + this.a + ")";
        }
    }

    public static final class e {
        private final d a;

        public e(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "User(newsletterSubscriptions=" + this.a + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(e65.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == d65.class;
    }

    public int hashCode() {
        return zt6.b(d65.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "afeac96a7fd2fa51f8cb3c2cba1829c014241be6bb404347341eba05fe5349db";
    }

    @Override // defpackage.ii5
    public String name() {
        return "NewsletterSubscriptions";
    }
}
