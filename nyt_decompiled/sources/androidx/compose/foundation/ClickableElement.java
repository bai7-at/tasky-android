package androidx.compose.foundation;

import defpackage.dy4;
import defpackage.n27;
import defpackage.ov4;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class ClickableElement extends ov4 {
    private final dy4 b;
    private final boolean c;
    private final String d;
    private final n27 e;
    private final qs2 f;

    public /* synthetic */ ClickableElement(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dy4Var, z, str, n27Var, qs2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return zq3.c(this.b, clickableElement.b) && this.c == clickableElement.c && zq3.c(this.d, clickableElement.d) && zq3.c(this.e, clickableElement.e) && zq3.c(this.f, clickableElement.f);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        n27 n27Var = this.e;
        return ((hashCode2 + (n27Var != null ? n27.l(n27Var.n()) : 0)) * 31) + this.f.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c l() {
        return new c(this.b, this.c, this.d, this.e, this.f, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(c cVar) {
        cVar.q2(this.b, this.c, this.d, this.e, this.f);
    }

    private ClickableElement(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var) {
        this.b = dy4Var;
        this.c = z;
        this.d = str;
        this.e = n27Var;
        this.f = qs2Var;
    }
}
