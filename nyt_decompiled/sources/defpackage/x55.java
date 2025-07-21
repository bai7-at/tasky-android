package defpackage;

import java.util.List;
import org.threeten.bp.Instant;
import type.InterestType;

/* loaded from: classes3.dex */
public final class x55 implements rp2 {
    private final String a;
    private final Instant b;
    private final InterestType c;
    private final Double d;
    private final List e;
    private final Integer f;
    private final String g;
    private final String h;
    private final List i;
    private final String j;
    private final String k;
    private final Integer l;
    private final b m;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, "text");
            zq3.h(str3, "id");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
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
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Choice(__typename=" + this.a + ", text=" + this.b + ", id=" + this.c + ")";
        }
    }

    public static final class b {
        private final String a;
        private final pp3 b;

        public b(String str, pp3 pp3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = pp3Var;
        }

        public final pp3 a() {
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
            pp3 pp3Var = this.b;
            return hashCode + (pp3Var == null ? 0 : pp3Var.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", interestLegacyCollectionWithSingleAsset=" + this.b + ")";
        }
    }

    public x55(String str, Instant instant, InterestType interestType, Double d, List list, Integer num, String str2, String str3, List list2, String str4, String str5, Integer num2, b bVar) {
        zq3.h(str, "__typename");
        zq3.h(interestType, "interestType");
        this.a = str;
        this.b = instant;
        this.c = interestType;
        this.d = d;
        this.e = list;
        this.f = num;
        this.g = str2;
        this.h = str3;
        this.i = list2;
        this.j = str4;
        this.k = str5;
        this.l = num2;
        this.m = bVar;
    }

    public final String a() {
        return this.g;
    }

    public final List b() {
        return this.e;
    }

    public final Integer c() {
        return this.f;
    }

    public final List d() {
        return this.i;
    }

    public final b e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x55)) {
            return false;
        }
        x55 x55Var = (x55) obj;
        return zq3.c(this.a, x55Var.a) && zq3.c(this.b, x55Var.b) && this.c == x55Var.c && zq3.c(this.d, x55Var.d) && zq3.c(this.e, x55Var.e) && zq3.c(this.f, x55Var.f) && zq3.c(this.g, x55Var.g) && zq3.c(this.h, x55Var.h) && zq3.c(this.i, x55Var.i) && zq3.c(this.j, x55Var.j) && zq3.c(this.k, x55Var.k) && zq3.c(this.l, x55Var.l) && zq3.c(this.m, x55Var.m);
    }

    public final String f() {
        return this.j;
    }

    public final InterestType g() {
        return this.c;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        int hashCode2 = (((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.c.hashCode()) * 31;
        Double d = this.d;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.f;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.i;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        b bVar = this.m;
        return hashCode11 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final Double i() {
        return this.d;
    }

    public final String j() {
        return this.k;
    }

    public final Integer k() {
        return this.l;
    }

    public final Instant l() {
        return this.b;
    }

    public final String m() {
        return this.a;
    }

    public String toString() {
        return "NewsQuizInterestFragment(__typename=" + this.a + ", updatedAt=" + this.b + ", interestType=" + this.c + ", score=" + this.d + ", answers=" + this.e + ", average=" + this.f + ", answer=" + this.g + ", question=" + this.h + ", choices=" + this.i + ", explanation=" + this.j + ", statsCopy=" + this.k + ", totalQuestions=" + this.l + ", data=" + this.m + ")";
    }
}
