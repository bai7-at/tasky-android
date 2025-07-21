package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class ge7 extends j38 {
    private final List b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Instant i;
    private final String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge7(List list, String str, String str2, String str3, String str4, String str5, String str6, Instant instant, String str7) {
        super(null);
        zq3.h(list, "title");
        zq3.h(str5, "uri");
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = instant;
        this.j = str7;
    }

    @Override // defpackage.j38
    public String c() {
        return this.g;
    }

    @Override // defpackage.j38
    public String d() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge7)) {
            return false;
        }
        ge7 ge7Var = (ge7) obj;
        return zq3.c(this.b, ge7Var.b) && zq3.c(this.c, ge7Var.c) && zq3.c(this.d, ge7Var.d) && zq3.c(this.e, ge7Var.e) && zq3.c(this.f, ge7Var.f) && zq3.c(this.g, ge7Var.g) && zq3.c(this.h, ge7Var.h) && zq3.c(this.i, ge7Var.i) && zq3.c(this.j, ge7Var.j);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.g.hashCode()) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Instant instant = this.i;
        int hashCode7 = (hashCode6 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str6 = this.j;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SearchResponseLockup(title=" + this.b + ", summary=" + this.c + ", formattedDate=" + this.d + ", kicker=" + this.e + ", imageUrl=" + this.f + ", uri=" + this.g + ", url=" + this.h + ", lastModified=" + this.i + ", type=" + this.j + ")";
    }
}
