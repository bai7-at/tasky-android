package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.room.common.CompositeState;
import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class d28 {
    private final long a;
    private final String b;
    private final long c;
    private final OffsetDateTime d;
    private final CompositeState e;

    public d28(long j, String str, long j2, OffsetDateTime offsetDateTime, CompositeState compositeState) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(offsetDateTime, "lastUpdated");
        zq3.h(compositeState, TransferTable.COLUMN_STATE);
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = offsetDateTime;
        this.e = compositeState;
    }

    public final long a() {
        return this.a;
    }

    public final OffsetDateTime b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final CompositeState e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d28)) {
            return false;
        }
        d28 d28Var = (d28) obj;
        return this.a == d28Var.a && zq3.c(this.b, d28Var.b) && this.c == d28Var.c && zq3.c(this.d, d28Var.d) && this.e == d28Var.e;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "StorableMediaItem(id=" + this.a + ", name=" + this.b + ", seekPosition=" + this.c + ", lastUpdated=" + this.d + ", state=" + this.e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d28(long r11, java.lang.String r13, long r14, org.threeten.bp.OffsetDateTime r16, com.nytimes.android.room.common.CompositeState r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            if (r0 == 0) goto Lf
            org.threeten.bp.OffsetDateTime r0 = org.threeten.bp.OffsetDateTime.now()
            java.lang.String r1 = "now(...)"
            defpackage.zq3.g(r0, r1)
            r8 = r0
            goto L11
        Lf:
            r8 = r16
        L11:
            r0 = r18 & 16
            if (r0 == 0) goto L19
            com.nytimes.android.room.common.CompositeState r0 = com.nytimes.android.room.common.CompositeState.PAUSED
            r9 = r0
            goto L1b
        L19:
            r9 = r17
        L1b:
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r2.<init>(r3, r5, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.<init>(long, java.lang.String, long, org.threeten.bp.OffsetDateTime, com.nytimes.android.room.common.CompositeState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
