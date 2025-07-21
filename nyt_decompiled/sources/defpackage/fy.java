package defpackage;

/* loaded from: classes4.dex */
public final class fy {
    private final String a;
    private final String b;
    private final String c;

    public fy(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return zq3.c(this.a, fyVar.a) && zq3.c(this.b, fyVar.b) && zq3.c(this.c, fyVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AudioInfoViewModel(mediaIconUrl=" + this.a + ", mediaTitle=" + this.b + ", shareUrl=" + this.c + ")";
    }
}
