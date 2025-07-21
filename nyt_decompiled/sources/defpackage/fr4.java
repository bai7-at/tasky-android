package defpackage;

import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class fr4 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final LocalDateTime e;

    public fr4(String str, String str2, String str3, String str4, LocalDateTime localDateTime) {
        zq3.h(str, "id");
        zq3.h(str2, "messageId");
        zq3.h(str3, "messageHistoryId");
        zq3.h(localDateTime, "timestamp");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = localDateTime;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final LocalDateTime e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr4)) {
            return false;
        }
        fr4 fr4Var = (fr4) obj;
        return zq3.c(this.a, fr4Var.a) && zq3.c(this.b, fr4Var.b) && zq3.c(this.c, fr4Var.c) && zq3.c(this.d, fr4Var.d) && zq3.c(this.e, fr4Var.e);
    }

    public final pg0 f() {
        return new pg0(this.a, this.b, this.c, "MobileNewsHome", this.e, 1, false);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "MessageHistory(id=" + this.a + ", messageId=" + this.b + ", messageHistoryId=" + this.c + ", action=" + this.d + ", timestamp=" + this.e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fr4(com.nytimes.android.libs.messagingarchitecture.model.Message r8) {
        /*
            r7 = this;
            java.lang.String r0 = "message"
            defpackage.zq3.h(r8, r0)
            java.lang.String r2 = r8.n()
            java.lang.String r0 = r8.j()
            if (r0 != 0) goto L13
            java.lang.String r0 = r8.q()
        L13:
            r3 = r0
            java.lang.String r4 = r8.q()
            com.nytimes.android.libs.messagingarchitecture.model.MessageProperties r8 = r8.g()
            if (r8 == 0) goto L24
            java.lang.String r8 = r8.b()
        L22:
            r5 = r8
            goto L26
        L24:
            r8 = 0
            goto L22
        L26:
            org.threeten.bp.LocalDateTime r6 = org.threeten.bp.LocalDateTime.now()
            java.lang.String r8 = "now(...)"
            defpackage.zq3.g(r6, r8)
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr4.<init>(com.nytimes.android.libs.messagingarchitecture.model.Message):void");
    }
}
