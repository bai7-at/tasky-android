package androidx.compose.foundation.layout;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.ym5;
import defpackage.zq3;

/* loaded from: classes.dex */
final class PaddingValuesElement extends ov4 {
    private final ym5 b;
    private final ss2 c;

    public PaddingValuesElement(ym5 ym5Var, ss2 ss2Var) {
        this.b = ym5Var;
        this.c = ss2Var;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return zq3.c(this.b, paddingValuesElement.b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public PaddingValuesModifier l() {
        return new PaddingValuesModifier(this.b);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.f2(this.b);
    }
}
