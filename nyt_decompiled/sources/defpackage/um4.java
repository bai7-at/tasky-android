package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class um4 {
    private final Bundle a;
    private ym4 b;

    public um4(ym4 ym4Var, boolean z) {
        if (ym4Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.b = ym4Var;
        bundle.putBundle("selector", ym4Var.a());
        bundle.putBoolean("activeScan", z);
    }

    private void b() {
        if (this.b == null) {
            ym4 d = ym4.d(this.a.getBundle("selector"));
            this.b = d;
            if (d == null) {
                this.b = ym4.c;
            }
        }
    }

    public Bundle a() {
        return this.a;
    }

    public ym4 c() {
        b();
        return this.b;
    }

    public boolean d() {
        return this.a.getBoolean("activeScan");
    }

    public boolean e() {
        b();
        return this.b.g();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof um4)) {
            return false;
        }
        um4 um4Var = (um4) obj;
        return c().equals(um4Var.c()) && d() == um4Var.d();
    }

    public int hashCode() {
        return d() ^ c().hashCode();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + c() + ", activeScan=" + d() + ", isValid=" + e() + " }";
    }
}
