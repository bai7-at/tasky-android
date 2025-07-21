package defpackage;

import com.nytimes.android.utils.ShareOrigin;

/* loaded from: classes4.dex */
public final class cx {
    private final ShareOrigin a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public cx(ShareOrigin shareOrigin, String str, String str2, String str3, String str4) {
        this.a = shareOrigin;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final ShareOrigin a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return this.a == cxVar.a && zq3.c(this.b, cxVar.b) && zq3.c(this.c, cxVar.c) && zq3.c(this.d, cxVar.d) && zq3.c(this.e, cxVar.e);
    }

    public int hashCode() {
        ShareOrigin shareOrigin = this.a;
        int hashCode = (shareOrigin == null ? 0 : shareOrigin.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AudioFooterViewModel(shareOrigin=" + this.a + ", title=" + this.b + ", shareUrl=" + this.c + ", saveUrl=" + this.d + ", subscribeUrl=" + this.e + ")";
    }
}
