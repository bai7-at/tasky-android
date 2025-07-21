package defpackage;

import android.graphics.Bitmap;
import defpackage.kz2;

/* loaded from: classes2.dex */
public final class jz2 implements kz2.a {
    private final w80 a;
    private final to b;

    public jz2(w80 w80Var, to toVar) {
        this.a = w80Var;
        this.b = toVar;
    }

    @Override // kz2.a
    public void a(Bitmap bitmap) {
        this.a.b(bitmap);
    }

    @Override // kz2.a
    public byte[] b(int i) {
        to toVar = this.b;
        return toVar == null ? new byte[i] : (byte[]) toVar.b(i, byte[].class);
    }

    @Override // kz2.a
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return this.a.d(i, i2, config);
    }

    @Override // kz2.a
    public int[] d(int i) {
        to toVar = this.b;
        return toVar == null ? new int[i] : (int[]) toVar.b(i, int[].class);
    }

    @Override // kz2.a
    public void e(byte[] bArr) {
        to toVar = this.b;
        if (toVar == null) {
            return;
        }
        toVar.put(bArr);
    }

    @Override // kz2.a
    public void f(int[] iArr) {
        to toVar = this.b;
        if (toVar == null) {
            return;
        }
        toVar.put(iArr);
    }
}
