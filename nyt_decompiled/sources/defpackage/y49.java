package defpackage;

import androidx.compose.runtime.b0;
import androidx.compose.ui.input.pointer.util.a;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y49 {
    private static final sy4 a = b0.e(Boolean.FALSE, null, 2, null);

    public static final void c(a aVar, vx5 vx5Var) {
        if (h()) {
            e(aVar, vx5Var);
        } else {
            d(aVar, vx5Var);
        }
    }

    private static final void d(a aVar, vx5 vx5Var) {
        if (nx5.b(vx5Var)) {
            aVar.f(vx5Var.i());
            aVar.e();
        }
        long l = vx5Var.l();
        List f = vx5Var.f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            x83 x83Var = (x83) f.get(i);
            long s = fd5.s(x83Var.b(), l);
            long b = x83Var.b();
            aVar.f(fd5.t(aVar.c(), s));
            aVar.a(x83Var.c(), aVar.c());
            i++;
            l = b;
        }
        aVar.f(fd5.t(aVar.c(), fd5.s(vx5Var.i(), l)));
        aVar.a(vx5Var.p(), aVar.c());
    }

    private static final void e(a aVar, vx5 vx5Var) {
        if (nx5.b(vx5Var)) {
            aVar.e();
        }
        if (!nx5.d(vx5Var)) {
            List f = vx5Var.f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                x83 x83Var = (x83) f.get(i);
                aVar.a(x83Var.c(), x83Var.a());
            }
            aVar.a(vx5Var.p(), vx5Var.h());
        }
        if (nx5.d(vx5Var) && vx5Var.p() - aVar.d() > 40) {
            aVar.e();
        }
        aVar.g(vx5Var.p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i, boolean z) {
        float f = 0.0f;
        if (i < 2) {
            return 0.0f;
        }
        if (i == 2) {
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            if (f2 == f3) {
                return 0.0f;
            }
            return (z ? fArr[0] : fArr[0] - fArr[1]) / (f2 - f3);
        }
        int i2 = i - 1;
        for (int i3 = i2; i3 > 0; i3--) {
            int i4 = i3 - 1;
            if (fArr2[i3] != fArr2[i4]) {
                float signum = Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
                float f4 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (fArr2[i3] - fArr2[i4]);
                f += (f4 - signum) * Math.abs(f4);
                if (i3 == i2) {
                    f *= 0.5f;
                }
            }
        }
        return Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean h() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            float[] fArr8 = fArr4[i10];
            for (int i11 = 0; i11 < i; i11++) {
                fArr7[i11] = fArr8[i11];
            }
            for (int i12 = 0; i12 < i10; i12++) {
                float[] fArr9 = fArr5[i12];
                float g = g(fArr7, fArr9);
                for (int i13 = 0; i13 < i; i13++) {
                    fArr7[i13] = fArr7[i13] - (fArr9[i13] * g);
                }
            }
            float sqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f = 1.0f / sqrt;
            for (int i14 = 0; i14 < i; i14++) {
                fArr7[i14] = fArr7[i14] * f;
            }
            float[] fArr10 = fArr6[i10];
            int i15 = 0;
            while (i15 < i4) {
                fArr10[i15] = i15 < i10 ? 0.0f : g(fArr7, fArr4[i15]);
                i15++;
            }
            i10++;
        }
        for (int i16 = i3; -1 < i16; i16--) {
            fArr3[i16] = g(fArr5[i16], fArr2);
            int i17 = i16 + 1;
            if (i17 <= i3) {
                int i18 = i3;
                while (true) {
                    fArr3[i16] = fArr3[i16] - (fArr6[i16][i18] * fArr3[i18]);
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = fArr3[i16] / fArr6[i16][i16];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(q91[] q91VarArr, int i, long j, float f) {
        q91 q91Var = q91VarArr[i];
        if (q91Var == null) {
            q91VarArr[i] = new q91(j, f);
        } else {
            q91Var.d(j);
            q91Var.c(f);
        }
    }
}
