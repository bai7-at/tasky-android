package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class VerticalAlignElement extends ov4 {
    private final Alignment.c b;

    public VerticalAlignElement(Alignment.c cVar) {
        this.b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return zq3.c(this.b, verticalAlignElement.b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public n l() {
        return new n(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(n nVar) {
        nVar.f2(this.b);
    }
}
