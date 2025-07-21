package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class he7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Instant h;
    private final String i;
    private final boolean j;
    private boolean k;

    public he7(String str, String str2, String str3, String str4, String str5, String str6, String str7, Instant instant, String str8, boolean z, boolean z2) {
        zq3.h(str, "title");
        zq3.h(str6, "uri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = instant;
        this.i = str8;
        this.j = z;
        this.k = z2;
    }

    public final he7 a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Instant instant, String str8, boolean z, boolean z2) {
        zq3.h(str, "title");
        zq3.h(str6, "uri");
        return new he7(str, str2, str3, str4, str5, str6, str7, instant, str8, z, z2);
    }

    public final String c() {
        return this.c;
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
        if (!(obj instanceof he7)) {
            return false;
        }
        he7 he7Var = (he7) obj;
        return zq3.c(this.a, he7Var.a) && zq3.c(this.b, he7Var.b) && zq3.c(this.c, he7Var.c) && zq3.c(this.d, he7Var.d) && zq3.c(this.e, he7Var.e) && zq3.c(this.f, he7Var.f) && zq3.c(this.g, he7Var.g) && zq3.c(this.h, he7Var.h) && zq3.c(this.i, he7Var.i) && this.j == he7Var.j && this.k == he7Var.k;
    }

    public final Instant f() {
        return this.h;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Instant instant = this.h;
        int hashCode7 = (hashCode6 + (instant == null ? 0 : instant.hashCode())) * 31;
        String str6 = this.i;
        return ((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.k);
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.g;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean m() {
        return this.k;
    }

    public final void n(boolean z) {
        this.k = z;
    }

    public String toString() {
        return "SearchResult(title=" + this.a + ", summary=" + this.b + ", formattedDate=" + this.c + ", kicker=" + this.d + ", imageUrl=" + this.e + ", uri=" + this.f + ", url=" + this.g + ", lastModified=" + this.h + ", type=" + this.i + ", isDirectAnswer=" + this.j + ", isRead=" + this.k + ")";
    }

    public /* synthetic */ he7(String str, String str2, String str3, String str4, String str5, String str6, String str7, Instant instant, String str8, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : instant, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str8, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2);
    }
}
