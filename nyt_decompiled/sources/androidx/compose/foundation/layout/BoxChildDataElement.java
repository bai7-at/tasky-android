package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class BoxChildDataElement extends ov4 {
    private final Alignment b;
    private final boolean c;
    private final ss2 d;

    public BoxChildDataElement(Alignment alignment, boolean z, ss2 ss2Var) {
        this.b = alignment;
        this.c = z;
        this.d = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return zq3.c(this.b, boxChildDataElement.b) && this.c == boxChildDataElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b l() {
        return new b(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(b bVar) {
        bVar.h2(this.b);
        bVar.i2(this.c);
    }
}
