package defpackage;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class fq7 {
    private Bundle a;

    public fq7(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fq7) && zq3.c(this.a, ((fq7) obj).a);
    }

    public int hashCode() {
        Bundle bundle = this.a;
        if (bundle == null) {
            return 0;
        }
        return bundle.hashCode();
    }

    public String toString() {
        return "SharedTextFound(sharedTextInfo=" + this.a + ")";
    }
}
