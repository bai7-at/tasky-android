package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class xj5 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query OpinionPersonalizedQuery { recommended: lists { personalizedList(listUri: \"nyt://per/personalized-list/sectionfront-opinion\", first: 5) { edges { trackingParams { __typename key value } node { __typename ...NodeFragment } } } } thePoint: lists { personalizedList(listUri: \"nyt://per/personalized-list/home-packages-opinion\", first: 1) { edges { trackingParams { __typename key value } node { __typename ...OpinionArticle } } } } }  fragment PublishedArticle on Published { url uri }  fragment ArticleDetails on CreativeWork { headline { default } bylines { renderedRepresentation } summary kicker wordCount }  fragment ImageDetails on HasPromotionalProperties { promotionalImage { image { id altText credit crops(renditionNames: [\"square320\"]) { renditions { url } } } } }  fragment NodeFragment on Node { __typename id ...PublishedArticle ...ArticleDetails ...ImageDetails }  fragment OpinionImage on Image { id altText crops(renditionNames: [\"square320\"]) { renditions { url } } }  fragment OpinionPerson on Person { id displayName title promotionalMedia { __typename ...OpinionImage } }  fragment OpinionArticle on Article { id headline { default } summary url uri section { taxonomyID name } bylines { creators { __typename ...OpinionPerson } } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final i a;
        private final j b;

        public b(i iVar, j jVar) {
            this.a = iVar;
            this.b = jVar;
        }

        public final i a() {
            return this.a;
        }

        public final j b() {
            return this.b;
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
            i iVar = this.a;
            int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            j jVar = this.b;
            return hashCode + (jVar != null ? jVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(recommended=" + this.a + ", thePoint=" + this.b + ")";
        }
    }

    public static final class c {
        private final List a;
        private final e b;

        public c(List list, e eVar) {
            this.a = list;
            this.b = eVar;
        }

        public final e a() {
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
            e eVar = this.b;
            return hashCode + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            return "Edge1(trackingParams=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class d {
        private final List a;
        private final f b;

        public d(List list, f fVar) {
            this.a = list;
            this.b = fVar;
        }

        public final f a() {
            return this.b;
        }

        public final List b() {
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
            List list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            f fVar = this.b;
            return hashCode + (fVar != null ? fVar.hashCode() : 0);
        }

        public String toString() {
            return "Edge(trackingParams=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final aj5 b;

        public e(String str, aj5 aj5Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = aj5Var;
        }

        public final aj5 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            aj5 aj5Var = this.b;
            return hashCode + (aj5Var == null ? 0 : aj5Var.hashCode());
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", opinionArticle=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final y75 b;

        public f(String str, y75 y75Var) {
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
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

    public static final class g {
        private final List a;

        public g(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "PersonalizedList1(edges=" + this.a + ")";
        }
    }

    public static final class h {
        private final List a;

        public h(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
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

    public static final class i {
        private final h a;

        public i(h hVar) {
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && zq3.c(this.a, ((i) obj).a);
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        public String toString() {
            return "Recommended(personalizedList=" + this.a + ")";
        }
    }

    public static final class j {
        private final g a;

        public j(g gVar) {
            this.a = gVar;
        }

        public final g a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && zq3.c(this.a, ((j) obj).a);
        }

        public int hashCode() {
            g gVar = this.a;
            if (gVar == null) {
                return 0;
            }
            return gVar.hashCode();
        }

        public String toString() {
            return "ThePoint(personalizedList=" + this.a + ")";
        }
    }

    public static final class k {
        private final String a;
        private final String b;
        private final String c;

        public k(String str, String str2, String str3) {
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
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return zq3.c(this.a, kVar.a) && zq3.c(this.b, kVar.b) && zq3.c(this.c, kVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam1(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    public static final class l {
        private final String a;
        private final String b;
        private final String c;

        public l(String str, String str2, String str3) {
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
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b) && zq3.c(this.c, lVar.c);
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
        return j8.d(yj5.a, false, 1, null);
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
        return obj != null && obj.getClass() == xj5.class;
    }

    public int hashCode() {
        return zt6.b(xj5.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "d78c0752e7d6a452b78105cf62258340d2536737e84686b4315302aae56ae3d4";
    }

    @Override // defpackage.ii5
    public String name() {
        return "OpinionPersonalizedQuery";
    }
}
