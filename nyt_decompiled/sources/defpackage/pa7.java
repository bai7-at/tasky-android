package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.b;

/* loaded from: classes.dex */
public abstract class pa7 {
    public static final Modifier a(Modifier modifier, float f) {
        return b(modifier, f, f);
    }

    public static final Modifier b(Modifier modifier, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? modifier : b.c(modifier, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }
}
