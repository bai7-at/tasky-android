package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class i36 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public i36(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z || z2 || z5;
    }

    public static /* synthetic */ i36 b(i36 i36Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = i36Var.a;
        }
        if ((i & 2) != 0) {
            z2 = i36Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = i36Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = i36Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = i36Var.e;
        }
        return i36Var.a(z, z6, z7, z8, z5);
    }

    public final i36 a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new i36(z, z2, z3, z4, z5);
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i36)) {
            return false;
        }
        i36 i36Var = (i36) obj;
        return this.a == i36Var.a && this.b == i36Var.b && this.c == i36Var.c && this.d == i36Var.d && this.e == i36Var.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        return "PrivacySettingsScreenState(showDoNotSell=" + this.a + ", showLimitSensitiveInformation=" + this.b + ", showCaliforniaNotices=" + this.c + ", showAccountDelete=" + this.d + ", showTCFManagePrivacyPreferences=" + this.e + ")";
    }

    public /* synthetic */ i36(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
