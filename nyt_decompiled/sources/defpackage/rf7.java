package defpackage;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class rf7 implements hb6 {
    public static final b Companion = new b(null);
    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

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
            return "Assets(edges=" + this.a + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query SectionFrontLegacyCollection($id: String!, $count: Int!, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { legacyCollection(id: $id) { uri section { name } subsection { name } assets(first: $count) { edges { node { __typename ...ArticleAsset ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...PromoAsset ...FeedPublicationAsset } } } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }  fragment PromoAsset on Promo { __typename uri url type promotionalHeadline promotionalSummary firstPublished lastMajorModification lastModified targetUrl sourceId promotionalMedia { __typename ...ImageAsset } }  fragment FeedPublicationAsset on FeedPublication { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Data(legacyCollection=" + this.a + ")";
        }
    }

    public static final class d {
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
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class e {
        private final String a;
        private final g b;
        private final h c;
        private final a d;

        public e(String str, g gVar, h hVar, a aVar) {
            zq3.h(str, "uri");
            this.a = str;
            this.b = gVar;
            this.c = hVar;
            this.d = aVar;
        }

        public final a a() {
            return this.d;
        }

        public final g b() {
            return this.b;
        }

        public final h c() {
            return this.c;
        }

        public final String d() {
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
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            h hVar = this.c;
            int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            a aVar = this.d;
            return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "LegacyCollection(uri=" + this.a + ", section=" + this.b + ", subsection=" + this.c + ", assets=" + this.d + ")";
        }
    }

    public static final class f {
        private final String a;
        private final gp b;
        private final n59 c;
        private final ho3 d;
        private final kf3 e;
        private final uu7 f;
        private final g56 g;
        private final wb2 h;

        public f(String str, gp gpVar, n59 n59Var, ho3 ho3Var, kf3 kf3Var, uu7 uu7Var, g56 g56Var, wb2 wb2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
            this.c = n59Var;
            this.d = ho3Var;
            this.e = kf3Var;
            this.f = uu7Var;
            this.g = g56Var;
            this.h = wb2Var;
        }

        public final gp a() {
            return this.b;
        }

        public final wb2 b() {
            return this.h;
        }

        public final kf3 c() {
            return this.e;
        }

        public final ho3 d() {
            return this.d;
        }

        public final g56 e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c) && zq3.c(this.d, fVar.d) && zq3.c(this.e, fVar.e) && zq3.c(this.f, fVar.f) && zq3.c(this.g, fVar.g) && zq3.c(this.h, fVar.h);
        }

        public final uu7 f() {
            return this.f;
        }

        public final n59 g() {
            return this.c;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            int hashCode2 = (hashCode + (gpVar == null ? 0 : gpVar.hashCode())) * 31;
            n59 n59Var = this.c;
            int hashCode3 = (hashCode2 + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            ho3 ho3Var = this.d;
            int hashCode4 = (hashCode3 + (ho3Var == null ? 0 : ho3Var.hashCode())) * 31;
            kf3 kf3Var = this.e;
            int hashCode5 = (hashCode4 + (kf3Var == null ? 0 : kf3Var.hashCode())) * 31;
            uu7 uu7Var = this.f;
            int hashCode6 = (hashCode5 + (uu7Var == null ? 0 : uu7Var.hashCode())) * 31;
            g56 g56Var = this.g;
            int hashCode7 = (hashCode6 + (g56Var == null ? 0 : g56Var.hashCode())) * 31;
            wb2 wb2Var = this.h;
            return hashCode7 + (wb2Var != null ? wb2Var.hashCode() : 0);
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", articleAsset=" + this.b + ", videoAsset=" + this.c + ", interactiveAsset=" + this.d + ", imageAsset=" + this.e + ", slideshowAsset=" + this.f + ", promoAsset=" + this.g + ", feedPublicationAsset=" + this.h + ")";
        }
    }

    public static final class g {
        private final String a;

        public g(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Section(name=" + this.a + ")";
        }
    }

    public static final class h {
        private final String a;

        public h(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && zq3.c(this.a, ((h) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Subsection(name=" + this.a + ")";
        }
    }

    public rf7(String str, int i, String str2, String str3, String str4, String str5) {
        zq3.h(str, "id");
        zq3.h(str2, "prop");
        zq3.h(str3, "edn");
        zq3.h(str4, "plat");
        zq3.h(str5, "ver");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(tf7.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zf7.a.a(lu3Var, this, w41Var, z);
    }

    public final int d() {
        return this.b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        return zq3.c(this.a, rf7Var.a) && this.b == rf7Var.b && zq3.c(this.c, rf7Var.c) && zq3.c(this.d, rf7Var.d) && zq3.c(this.e, rf7Var.e) && zq3.c(this.f, rf7Var.f);
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String i() {
        return this.f;
    }

    @Override // defpackage.ii5
    public String id() {
        return "f9d6d5b3eea03965e1e8284b61fa462ce1452999f2e6878b6b8ae6cb0192337c";
    }

    @Override // defpackage.ii5
    public String name() {
        return "SectionFrontLegacyCollection";
    }

    public String toString() {
        return "SectionFrontLegacyCollectionQuery(id=" + this.a + ", count=" + this.b + ", prop=" + this.c + ", edn=" + this.d + ", plat=" + this.e + ", ver=" + this.f + ")";
    }
}
