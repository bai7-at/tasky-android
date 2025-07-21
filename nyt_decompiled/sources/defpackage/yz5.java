package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class yz5 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final SecureFlagPolicy d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public yz5(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = secureFlagPolicy;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz5)) {
            return false;
        }
        yz5 yz5Var = (yz5) obj;
        return this.a == yz5Var.a && this.b == yz5Var.b && this.c == yz5Var.c && this.d == yz5Var.d && this.e == yz5Var.e && this.f == yz5Var.f && this.g == yz5Var.g;
    }

    public final SecureFlagPolicy f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.b) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }

    public /* synthetic */ yz5(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    public yz5(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false);
    }
}
