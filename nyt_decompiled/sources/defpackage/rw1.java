package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.google.android.exoplayer2.t0;
import defpackage.yp8;
import java.io.EOFException;

/* loaded from: classes2.dex */
public final class rw1 implements yp8 {
    private final byte[] a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    @Override // defpackage.yp8
    public void b(long j, int i, int i2, int i3, yp8.a aVar) {
    }

    @Override // defpackage.yp8
    public void c(yo5 yo5Var, int i, int i2) {
        yo5Var.V(i);
    }

    @Override // defpackage.yp8
    public void d(t0 t0Var) {
    }

    @Override // defpackage.yp8
    public int f(s91 s91Var, int i, boolean z, int i2) {
        int read = s91Var.read(this.a, 0, Math.min(this.a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
