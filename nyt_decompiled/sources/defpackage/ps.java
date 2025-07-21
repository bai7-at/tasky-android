package defpackage;

/* loaded from: classes3.dex */
public final class ps implements rp2 {
    private final String a;
    private final String b;
    private final ws c;
    private final es d;

    public ps(String str, String str2, ws wsVar, es esVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = wsVar;
        this.d = esVar;
    }

    public final es a() {
        return this.d;
    }

    public final ws b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        return zq3.c(this.a, psVar.a) && zq3.c(this.b, psVar.b) && zq3.c(this.c, psVar.c) && zq3.c(this.d, psVar.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        ws wsVar = this.c;
        int hashCode2 = (hashCode + (wsVar == null ? 0 : wsVar.hashCode())) * 31;
        es esVar = this.d;
        return hashCode2 + (esVar != null ? esVar.hashCode() : 0);
    }

    public String toString() {
        return "AssetNode(__typename=" + this.a + ", id=" + this.b + ", assetPublished=" + this.c + ", assetCreativeWork=" + this.d + ")";
    }
}
