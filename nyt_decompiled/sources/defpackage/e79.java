package defpackage;

import com.nytimes.android.api.cms.VideoAssetKt;
import com.nytimes.android.utils.ShareOrigin;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class e79 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final ShareOrigin g;
    private final String h;
    private final boolean i;
    private final boolean j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e79(String str, String str2, String str3, String str4, String str5, long j, ShareOrigin shareOrigin, String str6, boolean z, boolean z2) {
        zq3.h(str, "itemId");
        zq3.h(str2, "uniqueId");
        zq3.h(str3, "webUrl");
        zq3.h(str4, "title");
        zq3.h(str5, "assetType");
        zq3.h(shareOrigin, "shareOrigin");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = shareOrigin;
        this.h = str6;
        this.i = z;
        this.j = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r2 = this;
            java.lang.String r2 = r2.h
            if (r2 == 0) goto Le
            int r0 = r2.length()
            if (r0 <= 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != 0) goto L10
        Le:
            java.lang.String r2 = "16:9"
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "H,"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e79.a():java.lang.String");
    }

    public final String b() {
        return this.e;
    }

    public final long c() {
        return this.f;
    }

    public final String d() {
        return this.a;
    }

    public final ShareOrigin e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e79)) {
            return false;
        }
        e79 e79Var = (e79) obj;
        return zq3.c(this.a, e79Var.a) && zq3.c(this.b, e79Var.b) && zq3.c(this.c, e79Var.c) && zq3.c(this.d, e79Var.d) && zq3.c(this.e, e79Var.e) && this.f == e79Var.f && this.g == e79Var.g && zq3.c(this.h, e79Var.h) && this.i == e79Var.i && this.j == e79Var.j;
    }

    public final boolean f() {
        return this.j;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Long.hashCode(this.f)) * 31) + this.g.hashCode()) * 31;
        String str = this.h;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.j);
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return zq3.c(this.h, VideoAssetKt.VERTICAL_ASPECT_RATIO);
    }

    public String toString() {
        return "VideoCoverItem(itemId=" + this.a + ", uniqueId=" + this.b + ", webUrl=" + this.c + ", title=" + this.d + ", assetType=" + this.e + ", durationInMilliSecs=" + this.f + ", shareOrigin=" + this.g + ", aspectRatio=" + this.h + ", isLive=" + this.i + ", showTitle=" + this.j + ")";
    }
}
