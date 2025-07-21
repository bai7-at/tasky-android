package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class t9d extends h0e {
    public t9d(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "C6OPKdOx6rUdfDdOmaUimt8yM1FrOv7bKCITdJ0Uo74WwXDfvXouJ4oz4kHBjTSk", "dTWRHHPyYq/fNXOTAS/wjayGzv2SlrSwyDcB+vX+h5Q=", h3Var, i, 5);
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.o0(-1L);
        this.e.n0(-1L);
        int[] iArr = (int[]) this.f.invoke(null, this.b.b());
        synchronized (this.e) {
            try {
                this.e.o0(iArr[0]);
                this.e.n0(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.e.l0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
