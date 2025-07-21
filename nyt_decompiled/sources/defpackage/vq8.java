package defpackage;

import androidx.compose.ui.graphics.e;

/* loaded from: classes.dex */
public abstract class vq8 {
    public static final long a(float f, float f2) {
        return e.c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }
}
