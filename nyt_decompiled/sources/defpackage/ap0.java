package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class ap0 implements zo0 {
    public static final ap0 a = new ap0();

    private ap0() {
    }

    @Override // defpackage.zo0
    public Modifier a(Modifier modifier, float f, boolean z) {
        if (f > 0.0d) {
            return modifier.h(new LayoutWeightElement(uo6.h(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // defpackage.zo0
    public Modifier c(Modifier modifier, Alignment.b bVar) {
        return modifier.h(new HorizontalAlignElement(bVar));
    }
}
