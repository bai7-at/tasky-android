package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class nx2 implements hb6 {
    public static final a Companion = new a(null);
    private final Object a;
    private final int b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GenericPersonalizedSectionFront($listUri: PersonalizedListUri!, $count: Int!, $prop: String!, $edn: String!, $plat: String!, $ver: String!) { lists { __typename genericPersonalizedList(first: $count, listUri: $listUri, personalizedListContext: { referrer: $prop appType: NATIVE } ) { metadata { uri } edges { __typename trackingParams { __typename key value } node { __typename ...ArticleAsset ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...PromoAsset ...FeedPublicationAsset } } } } }  fragment Column on LegacyCollection { slug showPicture name }  fragment ImageAsset on Image { __typename uri credit @stripHtml caption { __typename text @stripHtml } type crops(renditionNames: [\"articleInline\",\"articleLarge\",\"popup\",\"jumbo\",\"superJumbo\",\"thumbLarge\",\"mediumThreeByTwo225\",\"mediumThreeByTwo210\",\"videoSixteenByNine1050\",\"mediumThreeByTwo440\",\"smallSquare168\",\"square320\",\"square640\",\"master675\",\"master768\",\"master1050\"]) { __typename renditions { __typename width url name height } } sourceId url lastModified lastMajorModification }  fragment TargetingParam on AdTargetingParam { key value }  fragment AssetSection on Section { displayName name nytBranded }  fragment VideoAsset on Video { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...ImageAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { __typename displayName name } liveUrls is360 isLive playlist { __typename sourceId uri headline { __typename default } } contentSeries aspectRatio renditions { __typename width url type } duration productionType transcript }  fragment SlideshowAsset on Slideshow { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } slides { caption { text @stripHtml } image { __typename ...ImageAsset } } subsection { displayName name } }  fragment InteractiveAsset on Interactive { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }  fragment EmbeddedInteractiveAsset on EmbeddedInteractive { promotionalMedia { __typename ...ImageAsset } }  fragment ArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker bylines { __typename renderedRepresentation } column { __typename ...Column } commentProperties { __typename status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...InteractiveAsset ...ImageAsset ...SlideshowAsset ...EmbeddedInteractiveAsset } advertisingProperties { __typename sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug desk section { __typename ...AssetSection } subsection { __typename displayName name } hybridBody { __typename lastModified } }  fragment PromoAsset on Promo { __typename uri url type promotionalHeadline promotionalSummary firstPublished lastMajorModification lastModified targetUrl sourceId promotionalMedia { __typename ...ImageAsset } }  fragment FeedPublicationAsset on FeedPublication { uri headline { default seo } summary url kicker bylines { renderedRepresentation } column { __typename ...Column } commentProperties { status } lastModified lastMajorModification sourceId type promotionalMedia { __typename ...VideoAsset ...ImageAsset ...SlideshowAsset } advertisingProperties { sensitivity } adTargetingParams(clientAdParams: { prop: $prop edn: $edn plat: $plat ver: $ver } ) { __typename ...TargetingParam } slug section { __typename ...AssetSection } subsection { displayName name } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public final e a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            e eVar = this.a;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public String toString() {
            return "Data(lists=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final List b;
        private final g c;

        public c(String str, List list, g gVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = list;
            this.c = gVar;
        }

        public final g a() {
            return this.c;
        }

        public final List b() {
            return this.b;
        }

        public final String c() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            g gVar = this.c;
            return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", trackingParams=" + this.b + ", node=" + this.c + ")";
        }
    }

    public static final class d {
        private final f a;
        private final List b;

        public d(f fVar, List list) {
            this.a = fVar;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final f b() {
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
            f fVar = this.a;
            int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            List list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "GenericPersonalizedList(metadata=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final d b;

        public e(String str, d dVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = dVar;
        }

        public final d a() {
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
            d dVar = this.b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "Lists(__typename=" + this.a + ", genericPersonalizedList=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;

        public f(String str) {
            zq3.h(str, "uri");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Metadata(uri=" + this.a + ")";
        }
    }

    public static final class g {
        private final String a;
        private final gp b;
        private final n59 c;
        private final ho3 d;
        private final kf3 e;
        private final uu7 f;
        private final g56 g;
        private final wb2 h;

        public g(String str, gp gpVar, n59 n59Var, ho3 ho3Var, kf3 kf3Var, uu7 uu7Var, g56 g56Var, wb2 wb2Var) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d) && zq3.c(this.e, gVar.e) && zq3.c(this.f, gVar.f) && zq3.c(this.g, gVar.g) && zq3.c(this.h, gVar.h);
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

    public static final class h {
        private final String a;
        private final String b;
        private final String c;

        public h(String str, String str2, String str3) {
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
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    public nx2(Object obj, int i, String str, String str2, String str3, String str4) {
        zq3.h(obj, "listUri");
        zq3.h(str, "prop");
        zq3.h(str2, "edn");
        zq3.h(str3, "plat");
        zq3.h(str4, "ver");
        this.a = obj;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(ox2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        vx2.a.a(lu3Var, this, w41Var, z);
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
        if (!(obj instanceof nx2)) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        return zq3.c(this.a, nx2Var.a) && this.b == nx2Var.b && zq3.c(this.c, nx2Var.c) && zq3.c(this.d, nx2Var.d) && zq3.c(this.e, nx2Var.e) && zq3.c(this.f, nx2Var.f);
    }

    public final Object f() {
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
        return "35b6705b7121bbfe8e1736c277782f9d83f13e5fb5b7fcdec60679a56eb937a1";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GenericPersonalizedSectionFront";
    }

    public String toString() {
        return "GenericPersonalizedSectionFrontQuery(listUri=" + this.a + ", count=" + this.b + ", prop=" + this.c + ", edn=" + this.d + ", plat=" + this.e + ", ver=" + this.f + ")";
    }
}
