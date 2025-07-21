package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class uq1 implements hb6 {
    public static final b Companion = new b(null);
    private final String a;
    private final List b;
    private final int c;
    private final nk5 d;
    private final nk5 e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public static final class a {
        private final String a;
        private final zq1 b;
        private final er1 c;

        public a(String str, zq1 zq1Var, er1 er1Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = zq1Var;
            this.c = er1Var;
        }

        public final zq1 a() {
            return this.b;
        }

        public final er1 b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            zq1 zq1Var = this.b;
            int hashCode2 = (hashCode + (zq1Var == null ? 0 : zq1Var.hashCode())) * 31;
            er1 er1Var = this.c;
            return hashCode2 + (er1Var != null ? er1Var.hashCode() : 0);
        }

        public String toString() {
            return "AnyBlock(__typename=" + this.a + ", discover_OnBlockBeta=" + this.b + ", discover_OnPersonalizedBlockBeta=" + this.c + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query Discover($programID: String!, $dataIDs: [String!]!, $fetchCount: Int!, $appType: PersonalizationAppType, $deviceType: PersonalizationDeviceType, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { program_beta(id: $programID) { __typename anyBlocks(dataIds: $dataIDs) { __typename ...Discover_OnBlockBeta ...Discover_OnPersonalizedBlockBeta } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }  fragment AudioAsset on Audio { uri credit fileName fileUrl length podcastSeries { name title subtitle summary itunesUrl image { __typename ...ImageAsset } } subscribeUrls { url platform } headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment FeedPublicationAsset on FeedPublication { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment PromoAsset on Promo { __typename uri url type promotionalHeadline promotionalSummary firstPublished lastMajorModification lastModified targetUrl sourceId promotionalMedia { __typename ...ImageAsset } }  fragment Discover_OnBlockBeta on Block_Beta { __typename dataId title link dataSource assets: firstLoad(first: $fetchCount) { __typename edges { __typename node { __typename ...ArticleAsset ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...AudioAsset ...FeedPublicationAsset ...PromoAsset } } } }  fragment Discover_OnPersonalizedBlockBeta on PersonalizedBlock_Beta { __typename dataId title link dataSource assets(first: $fetchCount, personalizedListContext: { appType: $appType deviceType: $deviceType } ) { __typename edges { __typename node { __typename ...ArticleAsset ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...AudioAsset ...FeedPublicationAsset ...PromoAsset } } } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final d a;

        public c(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Data(program_beta=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final List b;

        public d(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "anyBlocks");
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Program_beta(__typename=" + this.a + ", anyBlocks=" + this.b + ")";
        }
    }

    public uq1(String str, List list, int i, nk5 nk5Var, nk5 nk5Var2, String str2, String str3, String str4, String str5) {
        zq3.h(str, "programID");
        zq3.h(list, "dataIDs");
        zq3.h(nk5Var, "appType");
        zq3.h(nk5Var2, "deviceType");
        zq3.h(str2, "prop");
        zq3.h(str3, "edn");
        zq3.h(str4, "plat");
        zq3.h(str5, "ver");
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = nk5Var;
        this.e = nk5Var2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(wq1.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        yq1.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.d;
    }

    public final List e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq1)) {
            return false;
        }
        uq1 uq1Var = (uq1) obj;
        return zq3.c(this.a, uq1Var.a) && zq3.c(this.b, uq1Var.b) && this.c == uq1Var.c && zq3.c(this.d, uq1Var.d) && zq3.c(this.e, uq1Var.e) && zq3.c(this.f, uq1Var.f) && zq3.c(this.g, uq1Var.g) && zq3.c(this.h, uq1Var.h) && zq3.c(this.i, uq1Var.i);
    }

    public final nk5 f() {
        return this.e;
    }

    public final String g() {
        return this.g;
    }

    public final int h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.h;
    }

    @Override // defpackage.ii5
    public String id() {
        return "b2dcaa4db413b856700613ed26bf2b8410e29b422a8c028e8365f2e9e89c3d6d";
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.i;
    }

    @Override // defpackage.ii5
    public String name() {
        return "Discover";
    }

    public String toString() {
        return "DiscoverQuery(programID=" + this.a + ", dataIDs=" + this.b + ", fetchCount=" + this.c + ", appType=" + this.d + ", deviceType=" + this.e + ", prop=" + this.f + ", edn=" + this.g + ", plat=" + this.h + ", ver=" + this.i + ")";
    }
}
