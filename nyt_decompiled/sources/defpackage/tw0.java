package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.SearchSort;

/* loaded from: classes3.dex */
public final class tw0 implements hb6 {
    public static final a Companion = new a(null);
    private final String a;
    private final SearchSort b;
    private final int c;
    private final nk5 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query ContentSearch($query: String!, $sort: SearchSort!, $first: Int!, $nextPage: String) { contentSearch(q: $query, fq: \"!sourcePublisher:archive-repub\", sort: $sort, types: [ARTICLE,ATHLETICARTICLE,ATHLETICLIVEBLOG,CARDDECK,INTERACTIVE,LEGACYCOLLECTION,RECIPE,SLIDESHOW,VIDEO,WIRECUTTERARTICLE]) { hits(first: $first, after: $nextPage) { pageInfo { __typename startCursor endCursor } metadata { directAnswer { url headline summary thumbnailUrl } } edges { node { __typename ...SearchPublished ...SearchCreativeWork ...SearchProperties } } } } }  fragment SearchPublished on Published { uri url lastModified }  fragment SearchCreativeWork on CreativeWork { headline { default } summary kicker }  fragment SearchImage on Image { crops(renditionNames: [\"square320\",\"square640\"]) { __typename renditions { __typename width url name height } } }  fragment SearchProperties on HasPromotionalProperties { promotionalMedia { __typename ...SearchImage } }";
        }

        private a() {
        }
    }

    public static final class b {
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
            return "ContentSearch(hits=" + this.a + ")";
        }
    }

    public static final class c implements ii5.a {
        private final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Data(contentSearch=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public d(String str, String str2, String str3, String str4) {
            zq3.h(str, "url");
            zq3.h(str2, "headline");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
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
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "DirectAnswer(url=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ", thumbnailUrl=" + this.d + ")";
        }
    }

    public static final class e {
        private final h a;

        public e(h hVar) {
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        public String toString() {
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class f {
        private final i a;
        private final g b;
        private final List c;

        public f(i iVar, g gVar, List list) {
            zq3.h(iVar, "pageInfo");
            this.a = iVar;
            this.b = gVar;
            this.c = list;
        }

        public final List a() {
            return this.c;
        }

        public final g b() {
            return this.b;
        }

        public final i c() {
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
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            List list = this.c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Hits(pageInfo=" + this.a + ", metadata=" + this.b + ", edges=" + this.c + ")";
        }
    }

    public static final class g {
        private final d a;

        public g(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Metadata(directAnswer=" + this.a + ")";
        }
    }

    public static final class h {
        private final String a;
        private final ee7 b;
        private final rd7 c;
        private final be7 d;

        public h(String str, ee7 ee7Var, rd7 rd7Var, be7 be7Var) {
            zq3.h(str, "__typename");
            zq3.h(be7Var, "searchProperties");
            this.a = str;
            this.b = ee7Var;
            this.c = rd7Var;
            this.d = be7Var;
        }

        public final rd7 a() {
            return this.c;
        }

        public final be7 b() {
            return this.d;
        }

        public final ee7 c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c) && zq3.c(this.d, hVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ee7 ee7Var = this.b;
            int hashCode2 = (hashCode + (ee7Var == null ? 0 : ee7Var.hashCode())) * 31;
            rd7 rd7Var = this.c;
            return ((hashCode2 + (rd7Var != null ? rd7Var.hashCode() : 0)) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", searchPublished=" + this.b + ", searchCreativeWork=" + this.c + ", searchProperties=" + this.d + ")";
        }
    }

    public static final class i {
        private final String a;
        private final String b;
        private final String c;

        public i(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && zq3.c(this.c, iVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "PageInfo(__typename=" + this.a + ", startCursor=" + this.b + ", endCursor=" + this.c + ")";
        }
    }

    public tw0(String str, SearchSort searchSort, int i2, nk5 nk5Var) {
        zq3.h(str, "query");
        zq3.h(searchSort, "sort");
        zq3.h(nk5Var, "nextPage");
        this.a = str;
        this.b = searchSort;
        this.c = i2;
        this.d = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(ww0.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        dx0.a.a(lu3Var, this, w41Var, z);
    }

    public final int d() {
        return this.c;
    }

    public final nk5 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return zq3.c(this.a, tw0Var.a) && this.b == tw0Var.b && this.c == tw0Var.c && zq3.c(this.d, tw0Var.d);
    }

    public final String f() {
        return this.a;
    }

    public final SearchSort g() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "e8179e34e8f55a1443c48796c2f8bd1345aed32296d13424a1b0ccb506afaf31";
    }

    @Override // defpackage.ii5
    public String name() {
        return "ContentSearch";
    }

    public String toString() {
        return "ContentSearchQuery(query=" + this.a + ", sort=" + this.b + ", first=" + this.c + ", nextPage=" + this.d + ")";
    }
}
