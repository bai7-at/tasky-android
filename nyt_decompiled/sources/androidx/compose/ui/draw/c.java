package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import defpackage.qn0;

/* loaded from: classes.dex */
public abstract class c {
    public static final Modifier a(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var) {
        return modifier.h(new PainterElement(painter, z, alignment, contentScale, f, qn0Var));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, qn0 qn0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            alignment = Alignment.a.e();
        }
        Alignment alignment2 = alignment;
        if ((i & 8) != 0) {
            contentScale = ContentScale.a.f();
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            qn0Var = null;
        }
        return a(modifier, painter, z2, alignment2, contentScale2, f2, qn0Var);
    }
}
