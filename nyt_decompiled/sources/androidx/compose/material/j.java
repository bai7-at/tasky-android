package androidx.compose.material;

import androidx.compose.runtime.Composer;
import defpackage.bu1;
import defpackage.fl2;

/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    private j() {
    }

    public final fl2 a(float f, float f2, float f3, float f4, Composer composer, int i, int i2) {
        composer.z(380403812);
        if ((i2 & 1) != 0) {
            f = bu1.g(6);
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = bu1.g(12);
        }
        float f6 = f2;
        if ((i2 & 4) != 0) {
            f3 = bu1.g(8);
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = bu1.g(8);
        }
        float f8 = f4;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(380403812, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:246)");
        }
        Object[] objArr = {bu1.d(f5), bu1.d(f6), bu1.d(f7), bu1.d(f8)};
        composer.z(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z |= composer.S(objArr[i3]);
        }
        Object A = composer.A();
        if (z || A == Composer.a.a()) {
            A = new DefaultFloatingActionButtonElevation(f5, f6, f7, f8, null);
            composer.q(A);
        }
        composer.R();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return defaultFloatingActionButtonElevation;
    }
}
