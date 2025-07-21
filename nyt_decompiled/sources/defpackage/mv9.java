package defpackage;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class mv9 implements tx9 {
    private final byte[] a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    @Override // defpackage.tx9
    public final /* synthetic */ int a(xyf xyfVar, int i, boolean z) {
        return kx9.a(this, xyfVar, i, z);
    }

    @Override // defpackage.tx9
    public final /* synthetic */ void b(b9e b9eVar, int i) {
        kx9.b(this, b9eVar, i);
    }

    @Override // defpackage.tx9
    public final void c(long j, int i, int i2, int i3, lx9 lx9Var) {
    }

    @Override // defpackage.tx9
    public final void d(b9e b9eVar, int i, int i2) {
        b9eVar.l(i);
    }

    @Override // defpackage.tx9
    public final int e(xyf xyfVar, int i, boolean z, int i2) {
        int b = xyfVar.b(this.a, 0, Math.min(ProgressEvent.PART_FAILED_EVENT_CODE, i));
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.tx9
    public final void f(l6a l6aVar) {
    }
}
