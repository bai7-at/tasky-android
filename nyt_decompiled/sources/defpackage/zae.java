package defpackage;

/* loaded from: classes3.dex */
final class zae extends vae {
    private final String a;
    private final boolean b;
    private final boolean c;

    /* synthetic */ zae(String str, boolean z, boolean z2, yae yaeVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.vae
    public final String b() {
        return this.a;
    }

    @Override // defpackage.vae
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.vae
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vae) {
            vae vaeVar = (vae) obj;
            if (this.a.equals(vaeVar.b()) && this.b == vaeVar.d() && this.c == vaeVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.a + ", shouldGetAdvertisingId=" + this.b + ", isGooglePlayServicesAvailable=" + this.c + "}";
    }
}
