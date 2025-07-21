package defpackage;

import com.nytimes.android.internal.auth.key.data.KeystoreType;

/* loaded from: classes4.dex */
public final class qv3 {
    private final int a;
    private final pv3 b;
    private final KeystoreType c;

    public qv3(int i, pv3 pv3Var, KeystoreType keystoreType) {
        zq3.h(pv3Var, "alias");
        zq3.h(keystoreType, "keystoreType");
        this.a = i;
        this.b = pv3Var;
        this.c = keystoreType;
    }

    public final String a() {
        return this.b.b();
    }

    public final int b() {
        return this.a;
    }

    public final KeystoreType c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv3)) {
            return false;
        }
        qv3 qv3Var = (qv3) obj;
        return this.a == qv3Var.a && zq3.c(this.b, qv3Var.b) && this.c == qv3Var.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "KeyConfiguration(keystoreId=" + this.a + ", alias=" + this.b + ", keystoreType=" + this.c + ")";
    }
}
