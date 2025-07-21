package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* loaded from: classes.dex */
public final class vu4 {
    public static final int d = 0;
    private final SecureFlagPolicy a;
    private final boolean b;
    private final boolean c;

    public vu4(SecureFlagPolicy secureFlagPolicy, boolean z, boolean z2) {
        this.a = secureFlagPolicy;
        this.b = z;
        this.c = z2;
    }

    public final SecureFlagPolicy a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4)) {
            return false;
        }
        vu4 vu4Var = (vu4) obj;
        return this.a == vu4Var.a && this.b == vu4Var.b && this.c == vu4Var.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }
}
