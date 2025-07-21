package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class q70 implements hb6 {
    public static final c Companion = new c(null);
    private final Instant a;

    public static final class a {
        private final String a;
        private final g b;

        public a(String str, g gVar) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "Bestsellers(__typename=" + this.a + ", overview=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final List b;

        public b(String str, List list) {
            zq3.h(str, "__typename");
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "BookLists(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query BestSellers($date: DateTime!) { bestsellers(date: $date) { __typename overview { __typename bookLists { __typename edges { __typename node { __typename ...BookList } } } } } }  fragment Book on BestSellerBook { __typename id author title description imageUrl imageWidth imageHeight rank rankLastWeek weeksOnList bookReviewUrl firstChapterUrl sundayReviewUrl articleChapterUrl buyLinks { __typename sellerName url } }  fragment BookList on BestSellerBookList { __typename id listName listType displayName bestSellersDate publishedDate books { __typename edges { __typename node { __typename ...Book } } } }";
        }

        private c() {
        }
    }

    public static final class d implements ii5.a {
        private final a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Data(bestsellers=" + this.a + ")";
        }
    }

    public static final class e {
        private final String a;
        private final f b;

        public e(String str, f fVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = fVar;
        }

        public final f a() {
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
            f fVar = this.b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final v90 b;

        public f(String str, v90 v90Var) {
            zq3.h(str, "__typename");
            zq3.h(v90Var, "bookList");
            this.a = str;
            this.b = v90Var;
        }

        public final v90 a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", bookList=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final b b;

        public g(String str, b bVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = bVar;
        }

        public final b a() {
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
            b bVar = this.b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Overview(__typename=" + this.a + ", bookLists=" + this.b + ")";
        }
    }

    public q70(Instant instant) {
        zq3.h(instant, "date");
        this.a = instant;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(t70.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        x70.a.a(lu3Var, this, w41Var, z);
    }

    public final Instant d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q70) && zq3.c(this.a, ((q70) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "4b1a4eb5d14930d92e1b7a5f29d21f4e22c26eb5168d1cc8b63da080ff7c0c7d";
    }

    @Override // defpackage.ii5
    public String name() {
        return "BestSellers";
    }

    public String toString() {
        return "BestSellersQuery(date=" + this.a + ")";
    }
}
