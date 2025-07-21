package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public final class cw2 {
    private final String a;
    private final boolean b;

    public cw2(String str, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2)) {
            return false;
        }
        cw2 cw2Var = (cw2) obj;
        return zq3.c(this.a, cw2Var.a) && this.b == cw2Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.a + ", value=" + this.b + ')';
    }
}
