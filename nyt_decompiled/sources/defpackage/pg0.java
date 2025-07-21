package defpackage;

import com.facebook.AuthenticationTokenClaims;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class pg0 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final LocalDateTime e;
    private final int f;
    private final boolean g;

    public pg0(String str, String str2, String str3, String str4, LocalDateTime localDateTime, int i, boolean z) {
        zq3.h(str, "id");
        zq3.h(str2, "audience");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str4, "unit");
        zq3.h(localDateTime, "lastSeenOn");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = localDateTime;
        this.f = i;
        this.g = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.g;
    }

    public final String c() {
        return this.a;
    }

    public final LocalDateTime d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg0)) {
            return false;
        }
        pg0 pg0Var = (pg0) obj;
        return zq3.c(this.a, pg0Var.a) && zq3.c(this.b, pg0Var.b) && zq3.c(this.c, pg0Var.c) && zq3.c(this.d, pg0Var.d) && zq3.c(this.e, pg0Var.e) && this.f == pg0Var.f && this.g == pg0Var.g;
    }

    public final String f() {
        return this.d;
    }

    public final int g() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Integer.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }

    public String toString() {
        return "CachedMessageHistory(id=" + this.a + ", audience=" + this.b + ", name=" + this.c + ", unit=" + this.d + ", lastSeenOn=" + this.e + ", viewCount=" + this.f + ", dismissed=" + this.g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ pg0(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, org.threeten.bp.LocalDateTime r15, int r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 16
            if (r0 == 0) goto Lf
            org.threeten.bp.LocalDateTime r0 = org.threeten.bp.LocalDateTime.now()
            java.lang.String r1 = "now(...)"
            defpackage.zq3.g(r0, r1)
            r7 = r0
            goto L10
        Lf:
            r7 = r15
        L10:
            r0 = r18 & 32
            if (r0 == 0) goto L17
            r0 = 1
            r8 = r0
            goto L19
        L17:
            r8 = r16
        L19:
            r0 = r18 & 64
            if (r0 == 0) goto L20
            r0 = 0
            r9 = r0
            goto L22
        L20:
            r9 = r17
        L22:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.threeten.bp.LocalDateTime, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
