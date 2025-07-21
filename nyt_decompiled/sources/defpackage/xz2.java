package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class xz2 implements hb6 {
    public static final b Companion = new b(null);
    private final int a;

    public static final class a {
        private final String a;
        private final lr b;
        private final aq c;
        private final gr d;

        public a(String str, lr lrVar, aq aqVar, gr grVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = lrVar;
            this.c = aqVar;
            this.d = grVar;
        }

        public final aq a() {
            return this.c;
        }

        public final gr b() {
            return this.d;
        }

        public final lr c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            lr lrVar = this.b;
            int hashCode2 = (hashCode + (lrVar == null ? 0 : lrVar.hashCode())) * 31;
            aq aqVar = this.c;
            int hashCode3 = (hashCode2 + (aqVar == null ? 0 : aqVar.hashCode())) * 31;
            gr grVar = this.d;
            return hashCode3 + (grVar != null ? grVar.hashCode() : 0);
        }

        public String toString() {
            return "Asset(__typename=" + this.a + ", articlePublished=" + this.b + ", articleCreativeWork=" + this.c + ", articlePromotionalProperties=" + this.d + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query giftHistory($first: Int!) { user { __typename giftHistory(first: $first) { __typename remaining gifts { __typename shareCreationDate shareExpirationDate shareIsExpired shareCode shareViews asset { __typename ...articlePublished ...articleCreativeWork ...articlePromotionalProperties } } } } }  fragment articlePublished on Published { __typename uri url }  fragment articleCreativeWork on CreativeWork { __typename headline { __typename default } bylines { __typename renderedRepresentation } }  fragment articlePromotionalProperties on HasPromotionalProperties { __typename promotionalImage { __typename signableRendition(renditionPriority: [\"thumbLarge\",\"mediumSquare149\",\"smallSquare168\"]) { __typename rendition { __typename name url height width } } } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
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
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final Instant b;
        private final Instant c;
        private final Boolean d;
        private final String e;
        private final Integer f;
        private final a g;

        public d(String str, Instant instant, Instant instant2, Boolean bool, String str2, Integer num, a aVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = instant;
            this.c = instant2;
            this.d = bool;
            this.e = str2;
            this.f = num;
            this.g = aVar;
        }

        public final a a() {
            return this.g;
        }

        public final String b() {
            return this.e;
        }

        public final Instant c() {
            return this.b;
        }

        public final Instant d() {
            return this.c;
        }

        public final Boolean e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d) && zq3.c(this.e, dVar.e) && zq3.c(this.f, dVar.f) && zq3.c(this.g, dVar.g);
        }

        public final Integer f() {
            return this.f;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Instant instant = this.b;
            int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.c;
            int hashCode3 = (hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Boolean bool = this.d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Gift(__typename=" + this.a + ", shareCreationDate=" + this.b + ", shareExpirationDate=" + this.c + ", shareIsExpired=" + this.d + ", shareCode=" + this.e + ", shareViews=" + this.f + ", asset=" + this.g + ")";
        }
    }

    public static final class e {
        private final String a;
        private final int b;
        private final List c;

        public e(String str, int i, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "gifts");
            this.a = str;
            this.b = i;
            this.c = list;
        }

        public final List a() {
            return this.c;
        }

        public final int b() {
            return this.b;
        }

        public final String c() {
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
            return zq3.c(this.a, eVar.a) && this.b == eVar.b && zq3.c(this.c, eVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "GiftHistory(__typename=" + this.a + ", remaining=" + this.b + ", gifts=" + this.c + ")";
        }
    }

    public static final class f {
        private final String a;
        private final e b;

        public f(String str, e eVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = eVar;
        }

        public final e a() {
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
            e eVar = this.b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "User(__typename=" + this.a + ", giftHistory=" + this.b + ")";
        }
    }

    public xz2(int i) {
        this.a = i;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(zz2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        d03.a.a(lu3Var, this, w41Var, z);
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz2) && this.a == ((xz2) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.ii5
    public String id() {
        return "3c1eb925309a09be4ca4bfdbafd326568bf48588a74e46fa0a6c9d1ad80941f1";
    }

    @Override // defpackage.ii5
    public String name() {
        return "giftHistory";
    }

    public String toString() {
        return "GiftHistoryQuery(first=" + this.a + ")";
    }
}
