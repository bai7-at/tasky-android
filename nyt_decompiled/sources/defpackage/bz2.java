package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;
import type.InterestType;

/* loaded from: classes3.dex */
public final class bz2 implements hb6 {
    public static final a Companion = new a(null);
    private final nk5 a;
    private final nk5 b;
    private final nk5 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetUserInterests($limit: Int, $page: Int, $interestIds: [Int!]) { user { __typename userInterests(limit: $limit, page: $page, interestIds: $interestIds) { __typename userInterests { __typename interestId interestType interestSubType name description promoImageURL isOpinion isEditorsPick autoAddedAt content { __typename ...ColumnInterestFragment ...ShuffleInterestFragment ...NewsLetterInterestFragment ...FlashbackQuizInterestFragment ...FilterInterestFragment ...BooksInterestFragment ...NewsQuizInterestFragment } } metadata { __typename ordering lastAutoAddedAt } } } }  fragment InterestPromoImageFragment on Image { __typename uri url type caption { __typename text @stripHtml } lastModified lastMajorModification crops(renditionNames: [\"thumbLarge\",\"square320\",\"square640\",\"mediumThreeByTwo440\"]) { __typename renditions { __typename width url name height } } }  fragment promotionalMedia on PromotionalPropertiesMedia { __typename ... on Image { __typename ...InterestPromoImageFragment } ... on Video { __typename promotionalMedia { __typename ...InterestPromoImageFragment } } ... on Slideshow { __typename promotionalMedia { __typename ...InterestPromoImageFragment } } ... on Audio { __typename podcastCollection { __typename promotionalMedia { __typename ...InterestPromoImageFragment } } } ... on EmbeddedInteractive { promotionalMedia { __typename ...InterestPromoImageFragment } } }  fragment InterestArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker lastModified lastMajorModification sourceId type tone promotionalMedia { __typename ...promotionalMedia } slug desk hybridBody { __typename lastModified } }  fragment InterestInteractiveAsset on Interactive { __typename uri headline { __typename default seo } summary url kicker lastModified firstPublished lastMajorModification sourceId type tone promotionalMedia { __typename ...promotionalMedia } slug desk }  fragment LegacyCollectionAssetsFragment on LegacyCollection { stream(first: 10, query: { sort: newest } , exclusionMode: NONE) { edges { node { __typename ...InterestArticleAsset ...InterestInteractiveAsset } } } }  fragment InterestLegacyCollectionWithAssetList on LegacyCollection { __typename id tone url uri type name showPicture promotionalHeadline promotionalExcerpt promotionalMedia { __typename ...InterestPromoImageFragment } ...LegacyCollectionAssetsFragment }  fragment ColumnInterestFragment on ColumnInterest { __typename updatedAt data { __typename ...InterestLegacyCollectionWithAssetList } }  fragment ShuffleInterestFragment on ShuffleInterest { __typename updatedAt data { __typename edges { __typename node { __typename ...InterestArticleAsset ...InterestInteractiveAsset } trackingParams { __typename key value } } } }  fragment NewsLetterInterestFragment on NewsletterInterest { __typename updatedAt data { __typename ...InterestLegacyCollectionWithAssetList } }  fragment FlashbackQuizInterestFragment on FlashbackQuizInterest { __typename score updatedAt answers event image data { __typename ...InterestLegacyCollectionWithAssetList } }  fragment FilterInterestPromoImageFragment on Image { __typename uri url type caption { __typename text @stripHtml } lastModified lastMajorModification crops(renditionNames: [\"verticalTwoByThree735\"]) { __typename renditions { __typename width url name height } } }  fragment filterPromotionalMedia on PromotionalPropertiesMedia { __typename ... on Image { __typename ...FilterInterestPromoImageFragment } ... on Video { __typename promotionalMedia { __typename ...FilterInterestPromoImageFragment } } ... on Slideshow { __typename promotionalMedia { __typename ...FilterInterestPromoImageFragment } } ... on Audio { __typename podcastCollection { __typename promotionalMedia { __typename ...FilterInterestPromoImageFragment } } } ... on EmbeddedInteractive { promotionalMedia { __typename ...FilterInterestPromoImageFragment } } }  fragment FilterInterestArticleAsset on Article { __typename uri headline { __typename default seo } summary url kicker lastModified lastMajorModification sourceId type tone slug desk hybridBody { __typename lastModified } promotionalMedia { __typename ...filterPromotionalMedia } }  fragment FilterInterestInteractiveAsset on Interactive { __typename uri headline { __typename default seo } summary url kicker lastModified firstPublished lastMajorModification sourceId type tone slug desk promotionalMedia { __typename ...filterPromotionalMedia } }  fragment FilterInterestFragment on FilterInterest { __typename interestType updatedAt metadata { __typename ordering } data { __typename aggregate { __typename filter { __typename name filterId } assets { __typename hits(first: 10) { __typename edges { __typename node { __typename promotionalHeadline ...FilterInterestArticleAsset ...FilterInterestInteractiveAsset } } } } } childCollections { __typename filter { __typename name filterId } assets { __typename hits(first: 5) { __typename edges { __typename node { __typename promotionalHeadline ...FilterInterestArticleAsset ...FilterInterestInteractiveAsset } } } } } } }  fragment BooksInterestFragment on BooksInterest { __typename totalSaved updatedAt books { __typename url promoImageUrl title listTitle } lists { __typename ...InterestInteractiveAsset } }  fragment LegacyCollectionAssetFragment on LegacyCollection { stream(first: 1, query: { sort: newest } , exclusionMode: NONE) { edges { node { __typename ...InterestArticleAsset ...InterestInteractiveAsset } } } }  fragment InterestLegacyCollectionWithSingleAsset on LegacyCollection { __typename id tone url uri type name showPicture promotionalHeadline promotionalExcerpt promotionalMedia { __typename ...InterestPromoImageFragment } ...LegacyCollectionAssetFragment }  fragment NewsQuizInterestFragment on NewsQuizInterest { __typename updatedAt interestType score answers average answer question choices { __typename text id } explanation statsCopy totalQuestions data { __typename ...InterestLegacyCollectionWithSingleAsset } }";
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;
        private final wo0 b;
        private final kr7 c;
        private final u55 d;
        private final jk2 e;
        private final yf2 f;
        private final ma0 g;
        private final x55 h;

        public b(String str, wo0 wo0Var, kr7 kr7Var, u55 u55Var, jk2 jk2Var, yf2 yf2Var, ma0 ma0Var, x55 x55Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = wo0Var;
            this.c = kr7Var;
            this.d = u55Var;
            this.e = jk2Var;
            this.f = yf2Var;
            this.g = ma0Var;
            this.h = x55Var;
        }

        public final ma0 a() {
            return this.g;
        }

        public final wo0 b() {
            return this.b;
        }

        public final yf2 c() {
            return this.f;
        }

        public final jk2 d() {
            return this.e;
        }

        public final u55 e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f) && zq3.c(this.g, bVar.g) && zq3.c(this.h, bVar.h);
        }

        public final x55 f() {
            return this.h;
        }

        public final kr7 g() {
            return this.c;
        }

        public final String h() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            wo0 wo0Var = this.b;
            int hashCode2 = (hashCode + (wo0Var == null ? 0 : wo0Var.hashCode())) * 31;
            kr7 kr7Var = this.c;
            int hashCode3 = (hashCode2 + (kr7Var == null ? 0 : kr7Var.hashCode())) * 31;
            u55 u55Var = this.d;
            int hashCode4 = (hashCode3 + (u55Var == null ? 0 : u55Var.hashCode())) * 31;
            jk2 jk2Var = this.e;
            int hashCode5 = (hashCode4 + (jk2Var == null ? 0 : jk2Var.hashCode())) * 31;
            yf2 yf2Var = this.f;
            int hashCode6 = (hashCode5 + (yf2Var == null ? 0 : yf2Var.hashCode())) * 31;
            ma0 ma0Var = this.g;
            int hashCode7 = (hashCode6 + (ma0Var == null ? 0 : ma0Var.hashCode())) * 31;
            x55 x55Var = this.h;
            return hashCode7 + (x55Var != null ? x55Var.hashCode() : 0);
        }

        public String toString() {
            return "Content(__typename=" + this.a + ", columnInterestFragment=" + this.b + ", shuffleInterestFragment=" + this.c + ", newsLetterInterestFragment=" + this.d + ", flashbackQuizInterestFragment=" + this.e + ", filterInterestFragment=" + this.f + ", booksInterestFragment=" + this.g + ", newsQuizInterestFragment=" + this.h + ")";
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
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final List b;
        private final Instant c;

        public d(String str, List list, Instant instant) {
            zq3.h(str, "__typename");
            zq3.h(list, "ordering");
            this.a = str;
            this.b = list;
            this.c = instant;
        }

        public final Instant a() {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Instant instant = this.c;
            return hashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "Metadata(__typename=" + this.a + ", ordering=" + this.b + ", lastAutoAddedAt=" + this.c + ")";
        }
    }

    public static final class e {
        private final String a;
        private final g b;

        public e(String str, g gVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gVar;
        }

        public final g a() {
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
            g gVar = this.b;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "User(__typename=" + this.a + ", userInterests=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final int b;
        private final InterestType c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private final Boolean h;
        private final Boolean i;
        private final Instant j;
        private final b k;

        public f(String str, int i, InterestType interestType, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Instant instant, b bVar) {
            zq3.h(str, "__typename");
            zq3.h(interestType, "interestType");
            zq3.h(str2, "interestSubType");
            this.a = str;
            this.b = i;
            this.c = interestType;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = bool;
            this.i = bool2;
            this.j = instant;
            this.k = bVar;
        }

        public final Instant a() {
            return this.j;
        }

        public final b b() {
            return this.k;
        }

        public final String c() {
            return this.f;
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && zq3.c(this.d, fVar.d) && zq3.c(this.e, fVar.e) && zq3.c(this.f, fVar.f) && zq3.c(this.g, fVar.g) && zq3.c(this.h, fVar.h) && zq3.c(this.i, fVar.i) && zq3.c(this.j, fVar.j) && zq3.c(this.k, fVar.k);
        }

        public final InterestType f() {
            return this.c;
        }

        public final String g() {
            return this.e;
        }

        public final String h() {
            return this.g;
        }

        public int hashCode() {
            int hashCode = ((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.h;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.i;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Instant instant = this.j;
            int hashCode7 = (hashCode6 + (instant == null ? 0 : instant.hashCode())) * 31;
            b bVar = this.k;
            return hashCode7 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String i() {
            return this.a;
        }

        public final Boolean j() {
            return this.i;
        }

        public final Boolean k() {
            return this.h;
        }

        public String toString() {
            return "UserInterest(__typename=" + this.a + ", interestId=" + this.b + ", interestType=" + this.c + ", interestSubType=" + this.d + ", name=" + this.e + ", description=" + this.f + ", promoImageURL=" + this.g + ", isOpinion=" + this.h + ", isEditorsPick=" + this.i + ", autoAddedAt=" + this.j + ", content=" + this.k + ")";
        }
    }

    public static final class g {
        private final String a;
        private final List b;
        private final d c;

        public g(String str, List list, d dVar) {
            zq3.h(str, "__typename");
            zq3.h(list, "userInterests");
            zq3.h(dVar, "metadata");
            this.a = str;
            this.b = list;
            this.c = dVar;
        }

        public final d a() {
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
            return "UserInterests(__typename=" + this.a + ", userInterests=" + this.b + ", metadata=" + this.c + ")";
        }
    }

    public bz2(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3) {
        zq3.h(nk5Var, "limit");
        zq3.h(nk5Var2, "page");
        zq3.h(nk5Var3, "interestIds");
        this.a = nk5Var;
        this.b = nk5Var2;
        this.c = nk5Var3;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(dz2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        iz2.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.c;
    }

    public final nk5 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz2)) {
            return false;
        }
        bz2 bz2Var = (bz2) obj;
        return zq3.c(this.a, bz2Var.a) && zq3.c(this.b, bz2Var.b) && zq3.c(this.c, bz2Var.c);
    }

    public final nk5 f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "69995723f36c25133c99063d1de01d4d7fcbedc72bca1f5b11f28723989d2b36";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GetUserInterests";
    }

    public String toString() {
        return "GetUserInterestsQuery(limit=" + this.a + ", page=" + this.b + ", interestIds=" + this.c + ")";
    }
}
