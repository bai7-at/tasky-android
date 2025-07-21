package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class vt {
    private final long a;
    private final long b;
    private final String c;
    private final Instant d;
    private final Instant e;
    private final Long f;
    private final String g;
    private final String h;

    public vt(long j, long j2, String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        zq3.h(instant, "insertDate");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = instant;
        this.e = instant2;
        this.f = l;
        this.g = str2;
        this.h = str3;
    }

    public final vt a(long j, long j2, String str, Instant instant, Instant instant2, Long l, String str2, String str3) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        zq3.h(instant, "insertDate");
        return new vt(j, j2, str, instant, instant2, l, str2, str3);
    }

    public final String c() {
        return this.g;
    }

    public final long d() {
        return this.b;
    }

    public final Instant e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt)) {
            return false;
        }
        vt vtVar = (vt) obj;
        return this.a == vtVar.a && this.b == vtVar.b && zq3.c(this.c, vtVar.c) && zq3.c(this.d, vtVar.d) && zq3.c(this.e, vtVar.e) && zq3.c(this.f, vtVar.f) && zq3.c(this.g, vtVar.g) && zq3.c(this.h, vtVar.h);
    }

    public final Long f() {
        return this.f;
    }

    public final long g() {
        return this.a;
    }

    public final Instant h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Instant instant = this.e;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Long l = this.f;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.h;
    }

    public String toString() {
        return "AssetSourceEntity(id=" + this.a + ", assetRequestId=" + this.b + ", type=" + this.c + ", insertDate=" + this.d + ", expirationDate=" + this.e + ", externalId=" + this.f + ", additionalData=" + this.g + ", userEmail=" + this.h + ")";
    }

    public /* synthetic */ vt(long j, long j2, String str, Instant instant, Instant instant2, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, str, instant, instant2, l, str2, str3);
    }
}
