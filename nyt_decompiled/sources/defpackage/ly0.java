package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ly0 implements hb6 {
    public static final b Companion = new b(null);
    private final String a;

    public static final class a {
        private final String a;
        private final fz0 b;
        private final cx3 c;
        private final jz0 d;
        private final e86 e;
        private final e56 f;

        public a(String str, fz0 fz0Var, cx3 cx3Var, jz0 jz0Var, e86 e86Var, e56 e56Var) {
            zq3.h(str, "__typename");
            zq3.h(jz0Var, "cookingPromotional");
            this.a = str;
            this.b = fz0Var;
            this.c = cx3Var;
            this.d = jz0Var;
            this.e = e86Var;
            this.f = e56Var;
        }

        public final fz0 a() {
            return this.b;
        }

        public final jz0 b() {
            return this.d;
        }

        public final cx3 c() {
            return this.c;
        }

        public final e56 d() {
            return this.f;
        }

        public final e86 e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            fz0 fz0Var = this.b;
            int hashCode2 = (hashCode + (fz0Var == null ? 0 : fz0Var.hashCode())) * 31;
            cx3 cx3Var = this.c;
            int hashCode3 = (((hashCode2 + (cx3Var == null ? 0 : cx3Var.hashCode())) * 31) + this.d.hashCode()) * 31;
            e86 e86Var = this.e;
            int hashCode4 = (hashCode3 + (e86Var == null ? 0 : e86Var.hashCode())) * 31;
            e56 e56Var = this.f;
            return hashCode4 + (e56Var != null ? e56Var.hashCode() : 0);
        }

        public String toString() {
            return "Asset(__typename=" + this.a + ", cookingNewsletter=" + this.b + ", kicker=" + this.c + ", cookingPromotional=" + this.d + ", publishedUrl=" + this.e + ", promoArticle=" + this.f + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query CookingCollection($id: String!) { legacyCollection(id: $id) { id groupings { containers { __typename ... on LegacyCollectionContainer { label relations { asset { __typename ...CookingNewsletter ...Kicker ...CookingPromotional ...PublishedUrl ...PromoArticle } } } } } } }  fragment CookingNewsletter on Article { id associatedNewsletter { newsletterProduct { id name url } } }  fragment Kicker on CreativeWork { kicker }  fragment CookingImage on Image { id crops(renditionNames: [\"square640\",\"square320\"]) { renditions { url width height name } } caption { text } credit }  fragment CookingVideo on Video { id promotionalImage { image { __typename id ...CookingImage } } }  fragment CookingPromotional on HasPromotionalProperties { __typename promotionalHeadline promotionalSummary promotionalMedia { __typename ...CookingVideo ...CookingImage } }  fragment PublishedUrl on Published { url uri }  fragment PromoArticle on Promo { __typename id targetUrl }";
        }

        private b() {
        }
    }

    public static final class c {
        private final String a;
        private final g b;

        public c(String str, g gVar) {
            zq3.h(str, "__typename");
            zq3.h(gVar, "onLegacyCollectionContainer");
            this.a = str;
            this.b = gVar;
        }

        public final g a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Container(__typename=" + this.a + ", onLegacyCollectionContainer=" + this.b + ")";
        }
    }

    public static final class d implements ii5.a {
        private final f a;

        public d(f fVar) {
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Data(legacyCollection=" + this.a + ")";
        }
    }

    public static final class e {
        private final List a;

        public e(List list) {
            zq3.h(list, "containers");
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Grouping(containers=" + this.a + ")";
        }
    }

    public static final class f {
        private final String a;
        private final List b;

        public f(String str, List list) {
            zq3.h(str, "id");
            zq3.h(list, "groupings");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "LegacyCollection(id=" + this.a + ", groupings=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final List b;

        public g(String str, List list) {
            zq3.h(str, "label");
            zq3.h(list, "relations");
            this.a = str;
            this.b = list;
        }

        public final String a() {
            return this.a;
        }

        public final List b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OnLegacyCollectionContainer(label=" + this.a + ", relations=" + this.b + ")";
        }
    }

    public static final class h {
        private final a a;

        public h(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Relation(asset=" + this.a + ")";
        }
    }

    public ly0(String str) {
        zq3.h(str, "id");
        this.a = str;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(oy0.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ty0.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly0) && zq3.c(this.a, ((ly0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "bb155bd8856788a1501069b45b9194dc2f778a4064a6b19b10c98bf27eb4ea7f";
    }

    @Override // defpackage.ii5
    public String name() {
        return "CookingCollection";
    }

    public String toString() {
        return "CookingCollectionQuery(id=" + this.a + ")";
    }
}
