package defpackage;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes.dex */
public abstract class ei0 {
    public static final void a(Modifier modifier, no7 no7Var, long j, long j2, eb0 eb0Var, float f, gt2 gt2Var, Composer composer, int i, int i2) {
        composer.z(1956755640);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        no7 b = (i2 & 2) != 0 ? ag4.a.b(composer, 6).b() : no7Var;
        long n = (i2 & 4) != 0 ? ag4.a.a(composer, 6).n() : j;
        long b2 = (i2 & 8) != 0 ? ColorsKt.b(n, composer, (i >> 6) & 14) : j2;
        eb0 eb0Var2 = (i2 & 16) != 0 ? null : eb0Var;
        float g = (i2 & 32) != 0 ? bu1.g(1) : f;
        if (b.G()) {
            b.S(1956755640, i, -1, "androidx.compose.material.Card (Card.kt:66)");
        }
        SurfaceKt.a(modifier2, b, n, b2, eb0Var2, g, gt2Var, composer, i & 4194302, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
    }

    public static final void b(qs2 qs2Var, Modifier modifier, boolean z, no7 no7Var, long j, long j2, eb0 eb0Var, float f, dy4 dy4Var, gt2 gt2Var, Composer composer, int i, int i2) {
        dy4 dy4Var2;
        composer.z(778538979);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        no7 b = (i2 & 8) != 0 ? ag4.a.b(composer, 6).b() : no7Var;
        long n = (i2 & 16) != 0 ? ag4.a.a(composer, 6).n() : j;
        long b2 = (i2 & 32) != 0 ? ColorsKt.b(n, composer, (i >> 12) & 14) : j2;
        eb0 eb0Var2 = (i2 & 64) != 0 ? null : eb0Var;
        float g = (i2 & 128) != 0 ? bu1.g(1) : f;
        if ((i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = fo3.a();
                composer.q(A);
            }
            composer.R();
            dy4Var2 = (dy4) A;
        } else {
            dy4Var2 = dy4Var;
        }
        if (b.G()) {
            b.S(778538979, i, -1, "androidx.compose.material.Card (Card.kt:118)");
        }
        SurfaceKt.b(qs2Var, modifier2, z2, b, n, b2, eb0Var2, g, dy4Var2, gt2Var, composer, i & 2147483646, 0);
        if (b.G()) {
            b.R();
        }
        composer.R();
    }
}
