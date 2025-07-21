package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class st {
    private final String a;
    private final Instant b;
    private final Long c;
    private final String d;
    private final String e;

    public st(String str, Instant instant, Long l, String str2, String str3) {
        zq3.h(str, TransferTable.COLUMN_TYPE);
        this.a = str;
        this.b = instant;
        this.c = l;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        return this.d;
    }

    public final Instant b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return zq3.c(this.a, stVar.a) && zq3.c(this.b, stVar.b) && zq3.c(this.c, stVar.c) && zq3.c(this.d, stVar.d) && zq3.c(this.e, stVar.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AssetSource(type=" + this.a + ", expirationDate=" + this.b + ", externalId=" + this.c + ", additionalData=" + this.d + ", userEmail=" + this.e + ")";
    }

    public /* synthetic */ st(String str, Instant instant, Long l, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
