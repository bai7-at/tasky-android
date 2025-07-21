package defpackage;

/* loaded from: classes3.dex */
final class iee extends cfe {
    private final int a;
    private final String b;

    /* synthetic */ iee(int i, String str, hee heeVar) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.cfe
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cfe
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfe) {
            cfe cfeVar = (cfe) obj;
            if (this.a == cfeVar.a() && ((str = this.b) != null ? str.equals(cfeVar.b()) : cfeVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.a + ", sessionToken=" + this.b + "}";
    }
}
