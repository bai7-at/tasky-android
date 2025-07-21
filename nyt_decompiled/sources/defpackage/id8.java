package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* loaded from: classes.dex */
public final class id8 {
    public static final id8 a = new id8();
    public static final int b = 0;

    private id8() {
    }

    public final hd8 a(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, Composer composer, int i, int i2, int i3) {
        float f3;
        long j9;
        long j10;
        long j11;
        long j12;
        int i4;
        long j13;
        composer.z(-1032127534);
        long m = (i3 & 1) != 0 ? ag4.a.a(composer, 6).m() : j;
        long j14 = (i3 & 2) != 0 ? m : j2;
        float f4 = (i3 & 4) != 0 ? 0.54f : f;
        long n = (i3 & 8) != 0 ? ag4.a.a(composer, 6).n() : j3;
        long i5 = (i3 & 16) != 0 ? ag4.a.a(composer, 6).i() : j4;
        float f5 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            f3 = f4;
            j9 = wn0.g(nn0.r(m, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), ag4.a.a(composer, 6).n());
        } else {
            f3 = f4;
            j9 = j5;
        }
        if ((i3 & 128) != 0) {
            j10 = m;
            j11 = wn0.g(nn0.r(j14, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), ag4.a.a(composer, 6).n());
        } else {
            j10 = m;
            j11 = j6;
        }
        if ((i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            i4 = 6;
            j12 = j9;
            j13 = wn0.g(nn0.r(n, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), ag4.a.a(composer, 6).n());
        } else {
            j12 = j9;
            i4 = 6;
            j13 = j7;
        }
        long g = (i3 & 512) != 0 ? wn0.g(nn0.r(i5, uv0.a.b(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), ag4.a.a(composer, 6).n()) : j8;
        if (b.G()) {
            b.S(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:340)");
        }
        vj1 vj1Var = new vj1(j10, nn0.r(j14, f3, 0.0f, 0.0f, 0.0f, 14, null), n, nn0.r(i5, f5, 0.0f, 0.0f, 0.0f, 14, null), j12, nn0.r(j11, f3, 0.0f, 0.0f, 0.0f, 14, null), j13, nn0.r(g, f5, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return vj1Var;
    }
}
