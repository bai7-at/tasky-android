package defpackage;

/* loaded from: classes3.dex */
final class nee extends ffe {
    private final String a;
    private final String b;

    /* synthetic */ nee(String str, String str2, kee keeVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ffe
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ffe
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffe) {
            ffe ffeVar = (ffe) obj;
            String str = this.a;
            if (str != null ? str.equals(ffeVar.b()) : ffeVar.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(ffeVar.a()) : ffeVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }
}
