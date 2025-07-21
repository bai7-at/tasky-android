package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class ma0 implements rp2 {
    private final String a;
    private final Integer b;
    private final Instant c;
    private final List d;
    private final List e;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public a(String str, String str2, String str3, String str4, String str5) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(str3, "promoImageUrl");
            zq3.h(str4, "title");
            zq3.h(str5, "listTitle");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final String a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e);
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "Book(__typename=" + this.a + ", url=" + this.b + ", promoImageUrl=" + this.c + ", title=" + this.d + ", listTitle=" + this.e + ")";
        }
    }

    public static final class b {
        private final String a;
        private final ip3 b;

        public b(String str, ip3 ip3Var) {
            zq3.h(str, "__typename");
            zq3.h(ip3Var, "interestInteractiveAsset");
            this.a = str;
            this.b = ip3Var;
        }

        public final ip3 a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "List(__typename=" + this.a + ", interestInteractiveAsset=" + this.b + ")";
        }
    }

    public ma0(String str, Integer num, Instant instant, List list, List list2) {
        zq3.h(str, "__typename");
        zq3.h(list, "books");
        zq3.h(list2, "lists");
        this.a = str;
        this.b = num;
        this.c = instant;
        this.d = list;
        this.e = list2;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.e;
    }

    public final Integer c() {
        return this.b;
    }

    public final Instant d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return zq3.c(this.a, ma0Var.a) && zq3.c(this.b, ma0Var.b) && zq3.c(this.c, ma0Var.c) && zq3.c(this.d, ma0Var.d) && zq3.c(this.e, ma0Var.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Instant instant = this.c;
        return ((((hashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "BooksInterestFragment(__typename=" + this.a + ", totalSaved=" + this.b + ", updatedAt=" + this.c + ", books=" + this.d + ", lists=" + this.e + ")";
    }
}
