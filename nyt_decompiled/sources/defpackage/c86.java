package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class c86 implements rp2 {
    private final String a;
    private final String b;
    private final Instant c;
    private final Instant d;
    private final String e;
    private final String f;

    public c86(String str, String str2, Instant instant, Instant instant2, String str3, String str4) {
        zq3.h(str, "uri");
        zq3.h(str2, "url");
        zq3.h(str3, "sourceId");
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        this.a = str;
        this.b = str2;
        this.c = instant;
        this.d = instant2;
        this.e = str3;
        this.f = str4;
    }

    public final Instant a() {
        return this.d;
    }

    public final Instant b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c86)) {
            return false;
        }
        c86 c86Var = (c86) obj;
        return zq3.c(this.a, c86Var.a) && zq3.c(this.b, c86Var.b) && zq3.c(this.c, c86Var.c) && zq3.c(this.d, c86Var.d) && zq3.c(this.e, c86Var.e) && zq3.c(this.f, c86Var.f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Instant instant = this.c;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.d;
        return ((((hashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "PublishedProperties(uri=" + this.a + ", url=" + this.b + ", lastModified=" + this.c + ", lastMajorModification=" + this.d + ", sourceId=" + this.e + ", type=" + this.f + ")";
    }
}
