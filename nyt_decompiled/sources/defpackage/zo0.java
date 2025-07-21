package defpackage;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public interface zo0 {
    static /* synthetic */ Modifier b(zo0 zo0Var, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return zo0Var.a(modifier, f, z);
    }

    Modifier a(Modifier modifier, float f, boolean z);

    Modifier c(Modifier modifier, Alignment.b bVar);
}
