package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface m37 {
    static /* synthetic */ Modifier b(m37 m37Var, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return m37Var.a(modifier, f, z);
    }

    Modifier a(Modifier modifier, float f, boolean z);

    Modifier c(Modifier modifier, Alignment.c cVar);
}
