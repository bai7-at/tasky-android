package defpackage;

/* loaded from: classes3.dex */
final class kja extends yfa {
    private final String a;
    private final String b;
    private final boolean c;

    kja(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null advertisingId");
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.yfa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.yfa
    public final String b() {
        return this.b;
    }

    @Override // defpackage.yfa
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yfa) {
            yfa yfaVar = (yfa) obj;
            if (this.a.equals(yfaVar.a()) && this.b.equals(yfaVar.b()) && this.c == yfaVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "AdvertisingIdInfo{advertisingId=" + this.a + ", advertisingIdType=" + this.b + ", isLimitAdTracking=" + this.c + "}";
    }
}
