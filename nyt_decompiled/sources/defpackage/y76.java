package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class y76 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Instant f;
    private final Instant g;
    private final Instant h;

    public y76(String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "url");
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(str5, "sourceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = instant;
        this.g = instant2;
        this.h = instant3;
    }

    public final Instant a() {
        return this.f;
    }

    public final Instant b() {
        return this.g;
    }

    public final Instant c() {
        return this.h;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y76)) {
            return false;
        }
        y76 y76Var = (y76) obj;
        return zq3.c(this.a, y76Var.a) && zq3.c(this.b, y76Var.b) && zq3.c(this.c, y76Var.c) && zq3.c(this.d, y76Var.d) && zq3.c(this.e, y76Var.e) && zq3.c(this.f, y76Var.f) && zq3.c(this.g, y76Var.g) && zq3.c(this.h, y76Var.h);
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
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Instant instant = this.f;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.g;
        int hashCode3 = (hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.h;
        return hashCode3 + (instant3 != null ? instant3.hashCode() : 0);
    }

    public String toString() {
        return "Published(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", type=" + this.d + ", sourceId=" + this.e + ", firstPublished=" + this.f + ", lastMajorModification=" + this.g + ", lastModified=" + this.h + ")";
    }
}
