package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class kf3 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final a d;
    private final String e;
    private final List f;
    private final String g;
    private final String h;
    private final Instant i;
    private final Instant j;

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

    public kf3(String str, String str2, String str3, a aVar, String str4, List list, String str5, String str6, Instant instant, Instant instant2) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "credit");
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(list, "crops");
        zq3.h(str5, "sourceId");
        zq3.h(str6, "url");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = str6;
        this.i = instant;
        this.j = instant2;
    }

    public final a a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.f;
    }

    public final Instant d() {
        return this.j;
    }

    public final Instant e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf3)) {
            return false;
        }
        kf3 kf3Var = (kf3) obj;
        return zq3.c(this.a, kf3Var.a) && zq3.c(this.b, kf3Var.b) && zq3.c(this.c, kf3Var.c) && zq3.c(this.d, kf3Var.d) && zq3.c(this.e, kf3Var.e) && zq3.c(this.f, kf3Var.f) && zq3.c(this.g, kf3Var.g) && zq3.c(this.h, kf3Var.h) && zq3.c(this.i, kf3Var.i) && zq3.c(this.j, kf3Var.j);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        a aVar = this.d;
        int hashCode2 = (((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        Instant instant = this.i;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.j;
        return hashCode3 + (instant2 != null ? instant2.hashCode() : 0);
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.a;
    }

    public String toString() {
        return "ImageAsset(__typename=" + this.a + ", uri=" + this.b + ", credit=" + this.c + ", caption=" + this.d + ", type=" + this.e + ", crops=" + this.f + ", sourceId=" + this.g + ", url=" + this.h + ", lastModified=" + this.i + ", lastMajorModification=" + this.j + ")";
    }
}
