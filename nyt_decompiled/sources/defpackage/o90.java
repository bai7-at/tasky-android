package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class o90 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Integer g;
    private final Integer h;
    private final int i;
    private final Integer j;
    private final int k;
    private final Object l;
    private final Object m;
    private final Object n;
    private final Object o;
    private final List p;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "BuyLink(__typename=" + this.a + ", sellerName=" + this.b + ", url=" + this.c + ")";
        }
    }

    public o90(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, int i, Integer num3, int i2, Object obj, Object obj2, Object obj3, Object obj4, List list) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        zq3.h(str3, "author");
        zq3.h(str4, "title");
        zq3.h(str5, "description");
        zq3.h(list, "buyLinks");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = num;
        this.h = num2;
        this.i = i;
        this.j = num3;
        this.k = i2;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = list;
    }

    public final Object a() {
        return this.o;
    }

    public final String b() {
        return this.c;
    }

    public final Object c() {
        return this.l;
    }

    public final List d() {
        return this.p;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90Var = (o90) obj;
        return zq3.c(this.a, o90Var.a) && zq3.c(this.b, o90Var.b) && zq3.c(this.c, o90Var.c) && zq3.c(this.d, o90Var.d) && zq3.c(this.e, o90Var.e) && zq3.c(this.f, o90Var.f) && zq3.c(this.g, o90Var.g) && zq3.c(this.h, o90Var.h) && this.i == o90Var.i && zq3.c(this.j, o90Var.j) && this.k == o90Var.k && zq3.c(this.l, o90Var.l) && zq3.c(this.m, o90Var.m) && zq3.c(this.n, o90Var.n) && zq3.c(this.o, o90Var.o) && zq3.c(this.p, o90Var.p);
    }

    public final Object f() {
        return this.m;
    }

    public final String g() {
        return this.b;
    }

    public final Integer h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode4 = (((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.i)) * 31;
        Integer num3 = this.j;
        int hashCode5 = (((hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.k)) * 31;
        Object obj = this.l;
        int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.m;
        int hashCode7 = (hashCode6 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.n;
        int hashCode8 = (hashCode7 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.o;
        return ((hashCode8 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.p.hashCode();
    }

    public final String i() {
        return this.f;
    }

    public final Integer j() {
        return this.g;
    }

    public final int k() {
        return this.i;
    }

    public final Integer l() {
        return this.j;
    }

    public final Object m() {
        return this.n;
    }

    public final String n() {
        return this.d;
    }

    public final int o() {
        return this.k;
    }

    public final String p() {
        return this.a;
    }

    public String toString() {
        return "Book(__typename=" + this.a + ", id=" + this.b + ", author=" + this.c + ", title=" + this.d + ", description=" + this.e + ", imageUrl=" + this.f + ", imageWidth=" + this.g + ", imageHeight=" + this.h + ", rank=" + this.i + ", rankLastWeek=" + this.j + ", weeksOnList=" + this.k + ", bookReviewUrl=" + this.l + ", firstChapterUrl=" + this.m + ", sundayReviewUrl=" + this.n + ", articleChapterUrl=" + this.o + ", buyLinks=" + this.p + ")";
    }
}
