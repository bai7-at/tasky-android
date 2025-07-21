package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ki9 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query WirecutterXPN { theRecommendation: newsletterConfig(slug: \"the-recommendation\") { __typename id ... on NewsletterConfig { __typename id newsletterId slug title titleFont titleImage altTextLogo caption frequency altText sampleUrl thumbImageUrl allowedEntitlement subscriptionPageLink } } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Data(theRecommendation=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final Object e;
        private final String f;
        private final Object g;
        private final Object h;
        private final Object i;
        private final Object j;
        private final Object k;
        private final Object l;
        private final Object m;
        private final Object n;
        private final Object o;

        public c(String str, String str2, String str3, String str4, Object obj, String str5, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            zq3.h(str, "__typename");
            zq3.h(str2, "id");
            zq3.h(str3, "newsletterId");
            zq3.h(str4, "slug");
            zq3.h(str5, "titleFont");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = obj;
            this.f = str5;
            this.g = obj2;
            this.h = obj3;
            this.i = obj4;
            this.j = obj5;
            this.k = obj6;
            this.l = obj7;
            this.m = obj8;
            this.n = obj9;
            this.o = obj10;
        }

        public final Object a() {
            return this.n;
        }

        public final Object b() {
            return this.k;
        }

        public final Object c() {
            return this.h;
        }

        public final Object d() {
            return this.i;
        }

        public final Object e() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && zq3.c(this.e, cVar.e) && zq3.c(this.f, cVar.f) && zq3.c(this.g, cVar.g) && zq3.c(this.h, cVar.h) && zq3.c(this.i, cVar.i) && zq3.c(this.j, cVar.j) && zq3.c(this.k, cVar.k) && zq3.c(this.l, cVar.l) && zq3.c(this.m, cVar.m) && zq3.c(this.n, cVar.n) && zq3.c(this.o, cVar.o);
        }

        public final String f() {
            return this.b;
        }

        public final String g() {
            return this.c;
        }

        public final Object h() {
            return this.l;
        }

        public int hashCode() {
            int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            Object obj = this.e;
            int hashCode2 = (((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.f.hashCode()) * 31;
            Object obj2 = this.g;
            int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.h;
            int hashCode4 = (hashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.i;
            int hashCode5 = (hashCode4 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            Object obj5 = this.j;
            int hashCode6 = (hashCode5 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
            Object obj6 = this.k;
            int hashCode7 = (hashCode6 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
            Object obj7 = this.l;
            int hashCode8 = (hashCode7 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
            Object obj8 = this.m;
            int hashCode9 = (hashCode8 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
            Object obj9 = this.n;
            int hashCode10 = (hashCode9 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
            Object obj10 = this.o;
            return hashCode10 + (obj10 != null ? obj10.hashCode() : 0);
        }

        public final String i() {
            return this.d;
        }

        public final Object j() {
            return this.o;
        }

        public final Object k() {
            return this.m;
        }

        public final Object l() {
            return this.e;
        }

        public final String m() {
            return this.f;
        }

        public final Object n() {
            return this.g;
        }

        public final String o() {
            return this.a;
        }

        public String toString() {
            return "OnNewsletterConfig(__typename=" + this.a + ", id=" + this.b + ", newsletterId=" + this.c + ", slug=" + this.d + ", title=" + this.e + ", titleFont=" + this.f + ", titleImage=" + this.g + ", altTextLogo=" + this.h + ", caption=" + this.i + ", frequency=" + this.j + ", altText=" + this.k + ", sampleUrl=" + this.l + ", thumbImageUrl=" + this.m + ", allowedEntitlement=" + this.n + ", subscriptionPageLink=" + this.o + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final c c;

        public d(String str, String str2, c cVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "id");
            zq3.h(cVar, "onNewsletterConfig");
            this.a = str;
            this.b = str2;
            this.c = cVar;
        }

        public final String a() {
            return this.b;
        }

        public final c b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TheRecommendation(__typename=" + this.a + ", id=" + this.b + ", onNewsletterConfig=" + this.c + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(li9.a, false, 1, null);
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
        return obj != null && obj.getClass() == ki9.class;
    }

    public int hashCode() {
        return zt6.b(ki9.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "b8a3a9ea80fbfafba92153aad00b0634a9963031ba9d893dd8fce3cf415bf05c";
    }

    @Override // defpackage.ii5
    public String name() {
        return "WirecutterXPN";
    }
}
