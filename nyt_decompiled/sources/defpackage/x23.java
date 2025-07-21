package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class x23 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GreatReadsPersonalizedQuery { recommended: lists { personalizedList(listUri: \"nyt://per/personalized-list/xpn-great-read\", first: 6) { edges { trackingParams { __typename key value } node { __typename ...NodeFragment } } } } }  fragment PublishedArticle on Published { url uri }  fragment ArticleDetails on CreativeWork { headline { default } bylines { renderedRepresentation } summary kicker wordCount }  fragment ImageDetails on HasPromotionalProperties { promotionalImage { image { id altText credit crops(renditionNames: [\"square320\"]) { renditions { url } } } } }  fragment NodeFragment on Node { __typename id ...PublishedArticle ...ArticleDetails ...ImageDetails }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final f a;

        public b(f fVar) {
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            f fVar = this.a;
            if (fVar == null) {
                return 0;
            }
            return fVar.hashCode();
        }

        public String toString() {
            return "Data(recommended=" + this.a + ")";
        }
    }

    public static final class c {
        private final List a;
        private final d b;

        public c(List list, d dVar) {
            this.a = list;
            this.b = dVar;
        }

        public final d a() {
            return this.b;
        }

        public final List b() {
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
            List list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            d dVar = this.b;
            return hashCode + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "Edge(trackingParams=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final y75 b;

        public d(String str, y75 y75Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = y75Var;
        }

        public final y75 a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            y75 y75Var = this.b;
            return hashCode + (y75Var == null ? 0 : y75Var.hashCode());
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", nodeFragment=" + this.b + ")";
        }
    }

    public static final class e {
        private final List a;

        public e(List list) {
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
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "PersonalizedList(edges=" + this.a + ")";
        }
    }

    public static final class f {
        private final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Recommended(personalizedList=" + this.a + ")";
        }
    }

    public static final class g {
        private final String a;
        private final String b;
        private final String c;

        public g(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, TransferTable.COLUMN_KEY);
            zq3.h(str3, "value");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(y23.a, false, 1, null);
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
        return obj != null && obj.getClass() == x23.class;
    }

    public int hashCode() {
        return zt6.b(x23.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "4f34f1263d2a6fb0378c44fc08a3062c228f0f842ac627f26d41e03c624e3afe";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GreatReadsPersonalizedQuery";
    }
}
