package defpackage;

import java.util.List;
import org.threeten.bp.Instant;
import type.BestSellerBookListType;

/* loaded from: classes3.dex */
public final class v90 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final BestSellerBookListType d;
    private final String e;
    private final Instant f;
    private final Instant g;
    private final a h;

    public static final class a {
        private final String a;
        private final List b;

        public a(String str, List list) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Books(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final c b;

        public b(String str, c cVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = cVar;
        }

        public final c a() {
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
            c cVar = this.b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final o90 b;

        public c(String str, o90 o90Var) {
            zq3.h(str, "__typename");
            zq3.h(o90Var, "book");
            this.a = str;
            this.b = o90Var;
        }

        public final o90 a() {
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
            return "Node(__typename=" + this.a + ", book=" + this.b + ")";
        }
    }

    public v90(String str, String str2, String str3, BestSellerBookListType bestSellerBookListType, String str4, Instant instant, Instant instant2, a aVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        zq3.h(str3, "listName");
        zq3.h(bestSellerBookListType, "listType");
        zq3.h(str4, "displayName");
        zq3.h(instant2, "publishedDate");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bestSellerBookListType;
        this.e = str4;
        this.f = instant;
        this.g = instant2;
        this.h = aVar;
    }

    public final Instant a() {
        return this.f;
    }

    public final a b() {
        return this.h;
    }

    public final String c() {
        return this.e;
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
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return zq3.c(this.a, v90Var.a) && zq3.c(this.b, v90Var.b) && zq3.c(this.c, v90Var.c) && this.d == v90Var.d && zq3.c(this.e, v90Var.e) && zq3.c(this.f, v90Var.f) && zq3.c(this.g, v90Var.g) && zq3.c(this.h, v90Var.h);
    }

    public final BestSellerBookListType f() {
        return this.d;
    }

    public final Instant g() {
        return this.g;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Instant instant = this.f;
        int hashCode2 = (((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.g.hashCode()) * 31;
        a aVar = this.h;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "BookList(__typename=" + this.a + ", id=" + this.b + ", listName=" + this.c + ", listType=" + this.d + ", displayName=" + this.e + ", bestSellersDate=" + this.f + ", publishedDate=" + this.g + ", books=" + this.h + ")";
    }
}
