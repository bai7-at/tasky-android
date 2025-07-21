package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class sg2 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final a e;
    private final Instant f;
    private final Instant g;
    private final List h;

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "text");
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
            return "Caption(__typename=" + this.a + ", text=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final List b;

        public b(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "renditions");
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Crop(__typename=" + this.a + ", renditions=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final int b;
        private final String c;
        private final String d;
        private final int e;

        public c(String str, int i, String str2, String str3, int i2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = i2;
        }

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public final String e() {
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
            return zq3.c(this.a, cVar.a) && this.b == cVar.b && zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && this.e == cVar.e;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", width=" + this.b + ", url=" + this.c + ", name=" + this.d + ", height=" + this.e + ")";
        }
    }

    public sg2(String str, String str2, String str3, String str4, a aVar, Instant instant, Instant instant2, List list) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "url");
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(list, "crops");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = instant;
        this.g = instant2;
        this.h = list;
    }

    public final a a() {
        return this.e;
    }

    public final List b() {
        return this.h;
    }

    public final Instant c() {
        return this.g;
    }

    public final Instant d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return zq3.c(this.a, sg2Var.a) && zq3.c(this.b, sg2Var.b) && zq3.c(this.c, sg2Var.c) && zq3.c(this.d, sg2Var.d) && zq3.c(this.e, sg2Var.e) && zq3.c(this.f, sg2Var.f) && zq3.c(this.g, sg2Var.g) && zq3.c(this.h, sg2Var.h);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        a aVar = this.e;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Instant instant = this.f;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.g;
        return ((hashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "FilterInterestPromoImageFragment(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", type=" + this.d + ", caption=" + this.e + ", lastModified=" + this.f + ", lastMajorModification=" + this.g + ", crops=" + this.h + ")";
    }
}
