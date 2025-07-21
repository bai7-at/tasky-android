package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class bu2 implements hb6 {
    public static final e Companion = new e(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public static final class a {
        private final List a;

        public a(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Assets1(edges=" + this.a + ")";
        }
    }

    public static final class b {
        private final List a;

        public b(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Assets2(edges=" + this.a + ")";
        }
    }

    public static final class c {
        private final List a;

        public c(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Assets3(edges=" + this.a + ")";
        }
    }

    public static final class d {
        private final List a;

        public d(List list) {
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
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Assets(edges=" + this.a + ")";
        }
    }

    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GamesDestination($prop: String!, $edn: String!, $plat: String!, $ver: String!) { connectionsCompanion: legacyCollection(id: \"/spotlight/connections-companion\") { assets(first: 1) { edges { node { __typename ...ArticleAsset } } } } wordleReview: legacyCollection(id: \"/spotlight/wordle-review\") { assets(first: 1) { edges { node { __typename ...ArticleAsset } } } } spellingBeeForum: legacyCollection(id: \"/spotlight/spelling-bee-forum\") { assets(first: 1) { edges { node { __typename ...ArticleAsset } } } } featured: legacyCollection(id: \"/spotlight/games-feature\") { assets(first: 2) { edges { node { __typename ...ArticleAsset } } } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }";
        }

        private e() {
        }
    }

    public static final class f {
        private final d a;

        public f(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "ConnectionsCompanion(assets=" + this.a + ")";
        }
    }

    public static final class g implements ii5.a {
        private final f a;
        private final r b;
        private final q c;
        private final l d;

        public g(f fVar, r rVar, q qVar, l lVar) {
            this.a = fVar;
            this.b = rVar;
            this.c = qVar;
            this.d = lVar;
        }

        public final f a() {
            return this.a;
        }

        public final l b() {
            return this.d;
        }

        public final q c() {
            return this.c;
        }

        public final r d() {
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
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d);
        }

        public int hashCode() {
            f fVar = this.a;
            int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            r rVar = this.b;
            int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
            q qVar = this.c;
            int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
            l lVar = this.d;
            return hashCode3 + (lVar != null ? lVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(connectionsCompanion=" + this.a + ", wordleReview=" + this.b + ", spellingBeeForum=" + this.c + ", featured=" + this.d + ")";
        }
    }

    public static final class h {
        private final m a;

        public h(m mVar) {
            this.a = mVar;
        }

        public final m a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            m mVar = this.a;
            if (mVar == null) {
                return 0;
            }
            return mVar.hashCode();
        }

        public String toString() {
            return "Edge1(node=" + this.a + ")";
        }
    }

    public static final class i {
        private final n a;

        public i(n nVar) {
            this.a = nVar;
        }

        public final n a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && zq3.c(this.a, ((i) obj).a);
        }

        public int hashCode() {
            n nVar = this.a;
            if (nVar == null) {
                return 0;
            }
            return nVar.hashCode();
        }

        public String toString() {
            return "Edge2(node=" + this.a + ")";
        }
    }

    public static final class j {
        private final o a;

        public j(o oVar) {
            this.a = oVar;
        }

        public final o a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && zq3.c(this.a, ((j) obj).a);
        }

        public int hashCode() {
            o oVar = this.a;
            if (oVar == null) {
                return 0;
            }
            return oVar.hashCode();
        }

        public String toString() {
            return "Edge3(node=" + this.a + ")";
        }
    }

    public static final class k {
        private final p a;

        public k(p pVar) {
            this.a = pVar;
        }

        public final p a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && zq3.c(this.a, ((k) obj).a);
        }

        public int hashCode() {
            p pVar = this.a;
            if (pVar == null) {
                return 0;
            }
            return pVar.hashCode();
        }

        public String toString() {
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class l {
        private final c a;

        public l(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && zq3.c(this.a, ((l) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Featured(assets=" + this.a + ")";
        }
    }

    public static final class m {
        private final String a;
        private final gp b;

        public m(String str, gp gpVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
        }

        public final gp a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return zq3.c(this.a, mVar.a) && zq3.c(this.b, mVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            return hashCode + (gpVar == null ? 0 : gpVar.hashCode());
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", articleAsset=" + this.b + ")";
        }
    }

    public static final class n {
        private final String a;
        private final gp b;

        public n(String str, gp gpVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
        }

        public final gp a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return zq3.c(this.a, nVar.a) && zq3.c(this.b, nVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            return hashCode + (gpVar == null ? 0 : gpVar.hashCode());
        }

        public String toString() {
            return "Node2(__typename=" + this.a + ", articleAsset=" + this.b + ")";
        }
    }

    public static final class o {
        private final String a;
        private final gp b;

        public o(String str, gp gpVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
        }

        public final gp a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return zq3.c(this.a, oVar.a) && zq3.c(this.b, oVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            return hashCode + (gpVar == null ? 0 : gpVar.hashCode());
        }

        public String toString() {
            return "Node3(__typename=" + this.a + ", articleAsset=" + this.b + ")";
        }
    }

    public static final class p {
        private final String a;
        private final gp b;

        public p(String str, gp gpVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
        }

        public final gp a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return zq3.c(this.a, pVar.a) && zq3.c(this.b, pVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            return hashCode + (gpVar == null ? 0 : gpVar.hashCode());
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", articleAsset=" + this.b + ")";
        }
    }

    public static final class q {
        private final b a;

        public q(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && zq3.c(this.a, ((q) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "SpellingBeeForum(assets=" + this.a + ")";
        }
    }

    public static final class r {
        private final a a;

        public r(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && zq3.c(this.a, ((r) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "WordleReview(assets=" + this.a + ")";
        }
    }

    public bu2(String str, String str2, String str3, String str4) {
        zq3.h(str, "prop");
        zq3.h(str2, "edn");
        zq3.h(str3, "plat");
        zq3.h(str4, "ver");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(hu2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        tu2.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2)) {
            return false;
        }
        bu2 bu2Var = (bu2) obj;
        return zq3.c(this.a, bu2Var.a) && zq3.c(this.b, bu2Var.b) && zq3.c(this.c, bu2Var.c) && zq3.c(this.d, bu2Var.d);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "bc512552d3bc10d938999d45d2f4453af58d7ef199135d66b7f526010b43c1ad";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GamesDestination";
    }

    public String toString() {
        return "GamesDestinationQuery(prop=" + this.a + ", edn=" + this.b + ", plat=" + this.c + ", ver=" + this.d + ")";
    }
}
