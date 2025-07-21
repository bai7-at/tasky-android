package defpackage;

import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;

/* loaded from: classes.dex */
public final class uv0 {
    public static final uv0 a = new uv0();
    public static final int b = 0;

    private uv0() {
    }

    private final float a(float f, float f2, Composer composer, int i) {
        composer.z(-1528360391);
        if (b.G()) {
            b.S(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:76)");
        }
        long B = ((nn0) composer.m(ContentColorKt.a())).B();
        if (!ag4.a.a(composer, 6).o() ? wn0.i(B) >= 0.5d : wn0.i(B) <= 0.5d) {
            f = f2;
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return f;
    }

    public final float b(Composer composer, int i) {
        composer.z(621183615);
        if (b.G()) {
            b.S(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:57)");
        }
        float a2 = a(0.38f, 0.38f, composer, ((i << 6) & 896) | 54);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    public final float c(Composer composer, int i) {
        composer.z(629162431);
        if (b.G()) {
            b.S(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:35)");
        }
        float a2 = a(1.0f, 0.87f, composer, ((i << 6) & 896) | 54);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }

    public final float d(Composer composer, int i) {
        composer.z(1999054879);
        if (b.G()) {
            b.S(1999054879, i, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:46)");
        }
        float a2 = a(0.74f, 0.6f, composer, ((i << 6) & 896) | 54);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a2;
    }
}
