package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class HorizontalAlignElement extends ov4 {
    private final Alignment.b b;

    public HorizontalAlignElement(Alignment.b bVar) {
        this.b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return zq3.c(this.b, horizontalAlignElement.b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public g l() {
        return new g(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(g gVar) {
        gVar.f2(this.b);
    }
}
