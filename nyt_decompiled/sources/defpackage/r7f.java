package defpackage;

import com.google.android.gms.internal.measurement.p1;

/* loaded from: classes3.dex */
public abstract class r7f implements zdf {
    @Override // defpackage.zdf
    public final /* synthetic */ zdf K0(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    @Override // defpackage.zdf
    public final /* synthetic */ zdf L(byte[] bArr, daf dafVar) {
        return d(bArr, 0, bArr.length, dafVar);
    }

    protected abstract r7f b(p1 p1Var);

    public abstract r7f c(byte[] bArr, int i, int i2);

    public abstract r7f d(byte[] bArr, int i, int i2, daf dafVar);

    @Override // defpackage.zdf
    public final /* bridge */ /* synthetic */ zdf e0(cef cefVar) {
        if (a().getClass().isInstance(cefVar)) {
            return b((p1) cefVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
