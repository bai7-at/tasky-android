package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import defpackage.dv1;
import defpackage.ov4;
import defpackage.qn0;
import defpackage.qz3;
import defpackage.zq3;
import defpackage.zt7;

/* loaded from: classes.dex */
final class PainterElement extends ov4 {
    private final Painter b;
    private final boolean c;
    private final Alignment d;
    private final ContentScale e;
    private final float f;
    private final qn0 g;

    public PainterElement(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var) {
        this.b = painter;
        this.c = z;
        this.d = alignment;
        this.e = contentScale;
        this.f = f;
        this.g = qn0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return zq3.c(this.b, painterElement.b) && this.c == painterElement.c && zq3.c(this.d, painterElement.d) && zq3.c(this.e, painterElement.e) && Float.compare(this.f, painterElement.f) == 0 && zq3.c(this.g, painterElement.g);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.hashCode(this.f)) * 31;
        qn0 qn0Var = this.g;
        return hashCode + (qn0Var == null ? 0 : qn0Var.hashCode());
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public PainterNode l() {
        return new PainterNode(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(PainterNode painterNode) {
        boolean g2 = painterNode.g2();
        boolean z = this.c;
        boolean z2 = g2 != z || (z && !zt7.f(painterNode.f2().k(), this.b.k()));
        painterNode.o2(this.b);
        painterNode.p2(this.c);
        painterNode.l2(this.d);
        painterNode.n2(this.e);
        painterNode.c(this.f);
        painterNode.m2(this.g);
        if (z2) {
            qz3.b(painterNode);
        }
        dv1.a(painterNode);
    }
}
