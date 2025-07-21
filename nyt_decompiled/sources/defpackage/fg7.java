package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.MostPopularType;

/* loaded from: classes3.dex */
public final class fg7 implements hb6 {
    public static final a Companion = new a(null);
    private final MostPopularType a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query SectionFrontMostPopularList($popularType: MostPopularType!, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { lists { mostPopularAssets(criteria: { popularType: $popularType } ) { edges { node { __typename ...ArticleAsset ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...PromoAsset ...FeedPublicationAsset } } } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }  fragment PromoAsset on Promo { __typename uri url type promotionalHeadline promotionalSummary firstPublished lastMajorModification lastModified targetUrl sourceId promotionalMedia { __typename ...ImageAsset } }  fragment FeedPublicationAsset on FeedPublication { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }";
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
            return "Data(lists=" + this.a + ")";
        }
    }

    public static final class c {
        private final f a;

        public c(f fVar) {
            this.a = fVar;
        }

        public final f a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
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

    public static final class d {
        private final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Lists(mostPopularAssets=" + this.a + ")";
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
            return "MostPopularAssets(edges=" + this.a + ")";
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

    public fg7(MostPopularType mostPopularType, String str, String str2, String str3, String str4) {
        zq3.h(mostPopularType, "popularType");
        zq3.h(str, "prop");
        zq3.h(str2, "edn");
        zq3.h(str3, "plat");
        zq3.h(str4, "ver");
        this.a = mostPopularType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(gg7.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        lg7.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg7)) {
            return false;
        }
        fg7 fg7Var = (fg7) obj;
        return this.a == fg7Var.a && zq3.c(this.b, fg7Var.b) && zq3.c(this.c, fg7Var.c) && zq3.c(this.d, fg7Var.d) && zq3.c(this.e, fg7Var.e);
    }

    public final MostPopularType f() {
        return this.a;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "bd6d82391e5b279e45b6b87f1f89ce472fc76e56def063f57b2817a4cd7806de";
    }

    @Override // defpackage.ii5
    public String name() {
        return "SectionFrontMostPopularList";
    }

    public String toString() {
        return "SectionFrontMostPopularListQuery(popularType=" + this.a + ", prop=" + this.b + ", edn=" + this.c + ", plat=" + this.d + ", ver=" + this.e + ")";
    }
}
