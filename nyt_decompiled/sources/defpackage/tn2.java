package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class tn2 implements hb6 {
    public static final d Companion = new d(null);
    private final nk5 a;

    public static final class a {
        private final String a;
        private final hj3 b;

        public a(String str, hj3 hj3Var) {
            zq3.h(str, "__typename");
            zq3.h(hj3Var, "inferredRecommendation");
            this.a = str;
            this.b = hj3Var;
        }

        public final hj3 a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Asset1(__typename=" + this.a + ", inferredRecommendation=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final List b;
        private final String c;
        private final g d;

        public b(String str, List list, String str2, g gVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = list;
            this.c = str2;
            this.d = gVar;
        }

        public final String a() {
            return this.c;
        }

        public final g b() {
            return this.d;
        }

        public final List c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            g gVar = this.d;
            return hashCode3 + (gVar != null ? gVar.hashCode() : 0);
        }

        public String toString() {
            return "Asset2(__typename=" + this.a + ", trackingParams=" + this.b + ", channelUri=" + this.c + ", node=" + this.d + ")";
        }
    }

    public static final class c {
        private final String a;
        private final hj3 b;

        public c(String str, hj3 hj3Var) {
            zq3.h(str, "__typename");
            zq3.h(hj3Var, "inferredRecommendation");
            this.a = str;
            this.b = hj3Var;
        }

        public final hj3 a() {
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
            return "Asset(__typename=" + this.a + ", inferredRecommendation=" + this.b + ")";
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query ForYouDaily($itemsToFetch: Int) { dailyFive(first: $itemsToFetch, version: 2) { __typename ... on DailyFiveSalutation { __typename headline summary } ... on DailyFiveNumbered { __typename itemIdentifier kicker isEditorial packChannelURI promoText ...forYou_channelFields assets { __typename ...inferredRecommendation } } ... on DailyFiveTrending { __typename ...forYou_channelFields assets { __typename ...inferredRecommendation } } ... on DailyFiveGames { __typename kicker ...forYou_channelFields assets { __typename trackingParams { __typename key value } channelUri node { __typename ...gamesPromotionalMedia } } } ... on DailyFiveCompletion { __typename headline } } }  fragment cropOrPosterFields on Image { __typename credit crops(renditionNames: [\"largeHorizontalJumbo\",\"smallSquare252\",\"mediumThreeByTwo378\",\"threeByTwoSmallAt2X\",\"square320\",\"videoLarge\"]) { __typename renditions { __typename name height width url } } }  fragment forYou_channelFields on HasFollowChannels { channels { __typename uri name description shortDescription image { __typename ...cropOrPosterFields } } }  fragment audioPromotionalMediaFields on PromotionalPropertiesMedia { __typename ... on Image { crops(renditionNames: [\"thumbStandard\"]) { __typename renditions { __typename name height width url } } } }  fragment promotionalMediaFields on PromotionalPropertiesMedia { __typename ... on Image { __typename ...cropOrPosterFields } ... on Video { __typename assetID: sourceId lastUpdatedDate: lastMajorModification promotionalMedia { __typename ...cropOrPosterFields } } ... on Slideshow { __typename assetID: sourceId slides { __typename slug } promotionalMedia { __typename ...cropOrPosterFields } } ... on Audio { __typename assetID: sourceId duration: length fileUrl fingerprint: lastModified headlineInfo: headline { __typename headline: default } podcastCollection { __typename promotionalMedia { __typename ...audioPromotionalMediaFields } ... on Podcast { __typename subscriptionUrls(services: [GOOGLE]) { __typename url platform: podcastService } } } } ... on EmbeddedInteractive { promotionalMedia { __typename ...cropOrPosterFields } } }  fragment articleFields on Article { __typename assetID: sourceId uri url commentProperties { __typename status } fingerprint: lastModified headlineInfo: headline { __typename headline: default } summary lastUpdatedDate: lastMajorModification promotionalMedia { __typename ...promotionalMediaFields } tone lastModified hybridBody { __typename lastModified } }  fragment interactiveFields on Interactive { __typename assetID: sourceId uri url commentProperties { __typename status } fingerprint: lastModified headlineInfo: headline { __typename headline: default } summary lastUpdatedDate: lastMajorModification promotionalMedia { __typename ...promotionalMediaFields } tone lastModified }  fragment guideFields on Guide { __typename uri url summary headlineInfo: headline { __typename headline: default } lastModified promotionalMedia { __typename ...promotionalMediaFields } tone }  fragment inferredRecommendation on InferredRecommendationAsset { __typename trackingParams { __typename key value } channelUri node { __typename ...articleFields ...interactiveFields ...guideFields } }  fragment gamesPromo on Promo { __typename uri targetUrl promotionalHeadline promotionalSummary lastModified sourceId }  fragment gamesPromotionalMedia on PromotionalPropertiesMedia { __typename ...gamesPromo }";
        }

        private d() {
        }
    }

    public static final class e {
        private final String a;
        private final k b;
        private final j c;
        private final l d;
        private final i e;
        private final h f;

        public e(String str, k kVar, j jVar, l lVar, i iVar, h hVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = kVar;
            this.c = jVar;
            this.d = lVar;
            this.e = iVar;
            this.f = hVar;
        }

        public final h a() {
            return this.f;
        }

        public final i b() {
            return this.e;
        }

        public final j c() {
            return this.c;
        }

        public final k d() {
            return this.b;
        }

        public final l e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d) && zq3.c(this.e, eVar.e) && zq3.c(this.f, eVar.f);
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            k kVar = this.b;
            int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            j jVar = this.c;
            int hashCode3 = (hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            l lVar = this.d;
            int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            i iVar = this.e;
            int hashCode5 = (hashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            h hVar = this.f;
            return hashCode5 + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "DailyFive(__typename=" + this.a + ", onDailyFiveSalutation=" + this.b + ", onDailyFiveNumbered=" + this.c + ", onDailyFiveTrending=" + this.d + ", onDailyFiveGames=" + this.e + ", onDailyFiveCompletion=" + this.f + ")";
        }
    }

    public static final class f implements ii5.a {
        private final List a;

        public f(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Data(dailyFive=" + this.a + ")";
        }
    }

    public static final class g {
        private final String a;
        private final qv2 b;

        public g(String str, qv2 qv2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = qv2Var;
        }

        public final qv2 a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            qv2 qv2Var = this.b;
            return hashCode + (qv2Var == null ? 0 : qv2Var.hashCode());
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", gamesPromotionalMedia=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final String b;

        public h(String str, String str2) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OnDailyFiveCompletion(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class i {
        private final String a;
        private final String b;
        private final List c;
        private final ko2 d;

        public i(String str, String str2, List list, ko2 ko2Var) {
            zq3.h(str, "__typename");
            zq3.h(str2, "kicker");
            zq3.h(list, "assets");
            zq3.h(ko2Var, "forYou_channelFields");
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = ko2Var;
        }

        public final List a() {
            return this.c;
        }

        public final ko2 b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && zq3.c(this.c, iVar.c) && zq3.c(this.d, iVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "OnDailyFiveGames(__typename=" + this.a + ", kicker=" + this.b + ", assets=" + this.c + ", forYou_channelFields=" + this.d + ")";
        }
    }

    public static final class j {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final String e;
        private final String f;
        private final List g;
        private final ko2 h;

        public j(String str, String str2, String str3, boolean z, String str4, String str5, List list, ko2 ko2Var) {
            zq3.h(str, "__typename");
            zq3.h(str3, "kicker");
            zq3.h(str4, "packChannelURI");
            zq3.h(str5, "promoText");
            zq3.h(list, "assets");
            zq3.h(ko2Var, "forYou_channelFields");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = str5;
            this.g = list;
            this.h = ko2Var;
        }

        public final List a() {
            return this.g;
        }

        public final ko2 b() {
            return this.h;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && zq3.c(this.c, jVar.c) && this.d == jVar.d && zq3.c(this.e, jVar.e) && zq3.c(this.f, jVar.f) && zq3.c(this.g, jVar.g) && zq3.c(this.h, jVar.h);
        }

        public final String f() {
            return this.f;
        }

        public final String g() {
            return this.a;
        }

        public final boolean h() {
            return this.d;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        }

        public String toString() {
            return "OnDailyFiveNumbered(__typename=" + this.a + ", itemIdentifier=" + this.b + ", kicker=" + this.c + ", isEditorial=" + this.d + ", packChannelURI=" + this.e + ", promoText=" + this.f + ", assets=" + this.g + ", forYou_channelFields=" + this.h + ")";
        }
    }

    public static final class k {
        private final String a;
        private final String b;
        private final String c;

        public k(String str, String str2, String str3) {
            zq3.h(str, "__typename");
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "OnDailyFiveSalutation(__typename=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ")";
        }
    }

    public static final class l {
        private final String a;
        private final List b;
        private final ko2 c;

        public l(String str, List list, ko2 ko2Var) {
            zq3.h(str, "__typename");
            zq3.h(list, "assets");
            zq3.h(ko2Var, "forYou_channelFields");
            this.a = str;
            this.b = list;
            this.c = ko2Var;
        }

        public final List a() {
            return this.b;
        }

        public final ko2 b() {
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
            return "OnDailyFiveTrending(__typename=" + this.a + ", assets=" + this.b + ", forYou_channelFields=" + this.c + ")";
        }
    }

    public static final class m {
        private final String a;
        private final String b;
        private final String c;

        public m(String str, String str2, String str3) {
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
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return zq3.c(this.a, mVar.a) && zq3.c(this.b, mVar.b) && zq3.c(this.c, mVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    public tn2(nk5 nk5Var) {
        zq3.h(nk5Var, "itemsToFetch");
        this.a = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(yn2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        go2.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn2) && zq3.c(this.a, ((tn2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "a740a3673f58fe6585e4c52e74274c8f3d25eabec77d919964de22b6ef76f8c2";
    }

    @Override // defpackage.ii5
    public String name() {
        return "ForYouDaily";
    }

    public String toString() {
        return "ForYouDailyQuery(itemsToFetch=" + this.a + ")";
    }
}
