package defpackage;

import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class h03 {
    private final int a;
    private final List b;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final String e;
        private final String f;
        private final Integer g;
        private final String h;
        private final String i;
        private final String j;
        private final int k;
        private final int l;

        public a(String str, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6, String str7, String str8, int i, int i2) {
            zq3.h(str, "shareCreationDate");
            zq3.h(str2, "shareExpirationDate");
            zq3.h(str3, "shareCode");
            zq3.h(str4, "uri");
            zq3.h(str5, "url");
            zq3.h(str6, "headline");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = str4;
            this.f = str5;
            this.g = num;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = i;
            this.l = i2;
        }

        public final String a() {
            return this.h;
        }

        public final int b() {
            return this.k;
        }

        public final String c() {
            return this.i;
        }

        public final int d() {
            return this.l;
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && this.d == aVar.d && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g) && zq3.c(this.h, aVar.h) && zq3.c(this.i, aVar.i) && zq3.c(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l;
        }

        public final String f() {
            return this.b;
        }

        public final Integer g() {
            return this.g;
        }

        public final String h() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
            Integer num = this.g;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.h.hashCode()) * 31;
            String str = this.i;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.j;
            return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.k)) * 31) + Integer.hashCode(this.l);
        }

        public final String i() {
            return this.f;
        }

        public final boolean j() {
            return this.d;
        }

        public String toString() {
            return "GiftData(shareCreationDate=" + this.a + ", shareExpirationDate=" + this.b + ", shareCode=" + this.c + ", isExpired=" + this.d + ", uri=" + this.e + ", url=" + this.f + ", shareViews=" + this.g + ", headline=" + this.h + ", imageUrl=" + this.i + ", imageName=" + this.j + ", imageHeight=" + this.k + ", imageWidth=" + this.l + ")";
        }
    }

    public h03(int i, List list) {
        zq3.h(list, "gifts");
        this.a = i;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        return this.a == h03Var.a && zq3.c(this.b, h03Var.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "GiftShareHubData(remaining=" + this.a + ", gifts=" + this.b + ")";
    }

    public /* synthetic */ h03(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? i.l() : list);
    }
}
