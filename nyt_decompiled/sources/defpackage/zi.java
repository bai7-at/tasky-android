package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class zi implements hb6 {
    public static final b Companion = new b(null);
    private final List a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public static final class a {
        private final String a;
        private final tp b;
        private final n59 c;
        private final ho3 d;
        private final d24 e;
        private final kf3 f;
        private final uu7 g;
        private final lv h;
        private final wb2 i;
        private final pu j;
        private final bi0 k;
        private final dt6 l;
        private final ci9 m;
        private final uu n;

        public a(String str, tp tpVar, n59 n59Var, ho3 ho3Var, d24 d24Var, kf3 kf3Var, uu7 uu7Var, lv lvVar, wb2 wb2Var, pu puVar, bi0 bi0Var, dt6 dt6Var, ci9 ci9Var, uu uuVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = tpVar;
            this.c = n59Var;
            this.d = ho3Var;
            this.e = d24Var;
            this.f = kf3Var;
            this.g = uu7Var;
            this.h = lvVar;
            this.i = wb2Var;
            this.j = puVar;
            this.k = bi0Var;
            this.l = dt6Var;
            this.m = ci9Var;
            this.n = uuVar;
        }

        public final tp a() {
            return this.b;
        }

        public final pu b() {
            return this.j;
        }

        public final uu c() {
            return this.n;
        }

        public final lv d() {
            return this.h;
        }

        public final bi0 e() {
            return this.k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g) && zq3.c(this.h, aVar.h) && zq3.c(this.i, aVar.i) && zq3.c(this.j, aVar.j) && zq3.c(this.k, aVar.k) && zq3.c(this.l, aVar.l) && zq3.c(this.m, aVar.m) && zq3.c(this.n, aVar.n);
        }

        public final wb2 f() {
            return this.i;
        }

        public final kf3 g() {
            return this.f;
        }

        public final ho3 h() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            tp tpVar = this.b;
            int hashCode2 = (hashCode + (tpVar == null ? 0 : tpVar.hashCode())) * 31;
            n59 n59Var = this.c;
            int hashCode3 = (hashCode2 + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            ho3 ho3Var = this.d;
            int hashCode4 = (hashCode3 + (ho3Var == null ? 0 : ho3Var.hashCode())) * 31;
            d24 d24Var = this.e;
            int hashCode5 = (hashCode4 + (d24Var == null ? 0 : d24Var.hashCode())) * 31;
            kf3 kf3Var = this.f;
            int hashCode6 = (hashCode5 + (kf3Var == null ? 0 : kf3Var.hashCode())) * 31;
            uu7 uu7Var = this.g;
            int hashCode7 = (hashCode6 + (uu7Var == null ? 0 : uu7Var.hashCode())) * 31;
            lv lvVar = this.h;
            int hashCode8 = (hashCode7 + (lvVar == null ? 0 : lvVar.hashCode())) * 31;
            wb2 wb2Var = this.i;
            int hashCode9 = (hashCode8 + (wb2Var == null ? 0 : wb2Var.hashCode())) * 31;
            pu puVar = this.j;
            int hashCode10 = (hashCode9 + (puVar == null ? 0 : puVar.hashCode())) * 31;
            bi0 bi0Var = this.k;
            int hashCode11 = (hashCode10 + (bi0Var == null ? 0 : bi0Var.hashCode())) * 31;
            dt6 dt6Var = this.l;
            int hashCode12 = (hashCode11 + (dt6Var == null ? 0 : dt6Var.hashCode())) * 31;
            ci9 ci9Var = this.m;
            int hashCode13 = (hashCode12 + (ci9Var == null ? 0 : ci9Var.hashCode())) * 31;
            uu uuVar = this.n;
            return hashCode13 + (uuVar != null ? uuVar.hashCode() : 0);
        }

        public final d24 i() {
            return this.e;
        }

        public final dt6 j() {
            return this.l;
        }

        public final uu7 k() {
            return this.g;
        }

        public final n59 l() {
            return this.c;
        }

        public final ci9 m() {
            return this.m;
        }

        public final String n() {
            return this.a;
        }

        public String toString() {
            return "AnyWork(__typename=" + this.a + ", articleAssetWithHybridBody=" + this.b + ", videoAsset=" + this.c + ", interactiveAsset=" + this.d + ", legacyCollectionAsset=" + this.e + ", imageAsset=" + this.f + ", slideshowAsset=" + this.g + ", audioAsset=" + this.h + ", feedPublicationAsset=" + this.i + ", athleticArticleAsset=" + this.j + ", cardDeckAsset=" + this.k + ", recipeAsset=" + this.l + ", wirecutterArticleAsset=" + this.m + ", athleticLiveBlogAsset=" + this.n + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query AnyWorks($uris: [ID!]!, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { anyWorks(ids: $uris) { __typename ...ArticleAssetWithHybridBody ...VideoAsset ...InteractiveAsset ...LegacyCollectionAsset ...ImageAsset ...SlideshowAsset ...AudioAsset ...FeedPublicationAsset ...AthleticArticleAsset ...CardDeckAsset ...RecipeAsset ...WirecutterArticleAsset ...AthleticLiveBlogAsset } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }  fragment ArticleAssetWithHybridBody on Article { __typename ...ArticleAsset hybridBody { lastModified main { contents } subResources { target } images { crops { target minViewportWidth } } } }  fragment LegacyCollectionAsset on LegacyCollection { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment AudioAsset on Audio { uri credit fileName fileUrl length podcastSeries { name title subtitle summary itunesUrl image { __typename ...ImageAsset } } subscribeUrls { url platform } headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment FeedPublicationAsset on FeedPublication { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment PublishedProperties on Published { uri url lastModified lastMajorModification sourceId type }  fragment CreativeWorkProperties on CreativeWork { headline { __typename default seo } summary kicker }  fragment PromotionalProperties on HasPromotionalProperties { promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } }  fragment AthleticArticleAsset on AthleticArticle { __typename ...PublishedProperties ...CreativeWorkProperties ...PromotionalProperties }  fragment CardDeckAsset on CardDeck { __typename ...PublishedProperties ...CreativeWorkProperties ...PromotionalProperties }  fragment RecipeAsset on Recipe { __typename ...PublishedProperties ...CreativeWorkProperties ...PromotionalProperties }  fragment WirecutterArticleAsset on WirecutterArticle { __typename ...PublishedProperties ...CreativeWorkProperties ...PromotionalProperties }  fragment AthleticLiveBlogAsset on AthleticLiveBlog { __typename ...PublishedProperties ...CreativeWorkProperties ...PromotionalProperties }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final List a;

        public c(List list) {
            zq3.h(list, "anyWorks");
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
            return this.a.hashCode();
        }

        public String toString() {
            return "Data(anyWorks=" + this.a + ")";
        }
    }

    public zi(List list, String str, String str2, String str3, String str4) {
        zq3.h(list, "uris");
        zq3.h(str, "prop");
        zq3.h(str2, "edn");
        zq3.h(str3, "plat");
        zq3.h(str4, "ver");
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(bj.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        cj.a.a(lu3Var, this, w41Var, z);
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
        if (!(obj instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj;
        return zq3.c(this.a, ziVar.a) && zq3.c(this.b, ziVar.b) && zq3.c(this.c, ziVar.c) && zq3.c(this.d, ziVar.d) && zq3.c(this.e, ziVar.e);
    }

    public final String f() {
        return this.b;
    }

    public final List g() {
        return this.a;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "bdc5a0a609b818d1b14fc9368893275ead43e3a9cd883fb9c79f2dccedbabb6f";
    }

    @Override // defpackage.ii5
    public String name() {
        return "AnyWorks";
    }

    public String toString() {
        return "AnyWorksQuery(uris=" + this.a + ", prop=" + this.b + ", edn=" + this.c + ", plat=" + this.d + ", ver=" + this.e + ")";
    }
}
