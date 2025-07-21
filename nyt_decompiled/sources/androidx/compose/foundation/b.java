package androidx.compose.foundation;

import defpackage.cg;
import defpackage.ip5;
import defpackage.ph0;
import defpackage.rh0;
import defpackage.sf3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class b {
    private sf3 a;
    private ph0 b;
    private rh0 c;
    private ip5 d;

    public b(sf3 sf3Var, ph0 ph0Var, rh0 rh0Var, ip5 ip5Var) {
        this.a = sf3Var;
        this.b = ph0Var;
        this.c = rh0Var;
        this.d = ip5Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
    }

    public final ip5 g() {
        ip5 ip5Var = this.d;
        if (ip5Var != null) {
            return ip5Var;
        }
        ip5 a = cg.a();
        this.d = a;
        return a;
    }

    public int hashCode() {
        sf3 sf3Var = this.a;
        int hashCode = (sf3Var == null ? 0 : sf3Var.hashCode()) * 31;
        ph0 ph0Var = this.b;
        int hashCode2 = (hashCode + (ph0Var == null ? 0 : ph0Var.hashCode())) * 31;
        rh0 rh0Var = this.c;
        int hashCode3 = (hashCode2 + (rh0Var == null ? 0 : rh0Var.hashCode())) * 31;
        ip5 ip5Var = this.d;
        return hashCode3 + (ip5Var != null ? ip5Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }

    public /* synthetic */ b(sf3 sf3Var, ph0 ph0Var, rh0 rh0Var, ip5 ip5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sf3Var, (i & 2) != 0 ? null : ph0Var, (i & 4) != 0 ? null : rh0Var, (i & 8) != 0 ? null : ip5Var);
    }
}
