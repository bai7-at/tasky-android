package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class n37 implements m37 {
    public static final n37 a = new n37();

    private n37() {
    }

    @Override // defpackage.m37
    public Modifier a(Modifier modifier, float f, boolean z) {
        if (f > 0.0d) {
            return modifier.h(new LayoutWeightElement(uo6.h(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // defpackage.m37
    public Modifier c(Modifier modifier, Alignment.c cVar) {
        return modifier.h(new VerticalAlignElement(cVar));
    }
}
