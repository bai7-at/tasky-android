package defpackage;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class bv9 implements ov9 {
    private final xyf b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    static {
        zza.b("media3.extractor");
    }

    public bv9(xyf xyfVar, long j, long j2) {
        this.b = xyfVar;
        this.d = j;
        this.c = j2;
    }

    private final int m(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        r(min);
        return min;
    }

    private final int n(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int b = this.b.b(bArr, i + i3, i2 - i3);
        if (b != -1) {
            return i3 + b;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final int o(int i) {
        int min = Math.min(this.g, i);
        r(min);
        return min;
    }

    private final void p(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    private final void q(int i) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    private final void r(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.ov9
    public final int a(int i) {
        int o = o(1);
        if (o == 0) {
            o = n(this.a, 0, Math.min(1, ProgressEvent.PART_FAILED_EVENT_CODE), 0, true);
        }
        p(o);
        return o;
    }

    @Override // defpackage.ov9, defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        int m = m(bArr, i, i2);
        if (m == 0) {
            m = n(bArr, i, i2, 0, true);
        }
        p(m);
        return m;
    }

    @Override // defpackage.ov9
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        int m = m(bArr, i, i2);
        while (m < i2 && m != -1) {
            m = n(bArr, i, i2, m, z);
        }
        p(m);
        return m != -1;
    }

    @Override // defpackage.ov9
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        if (!k(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ov9
    public final void f(int i) {
        l(i, false);
    }

    @Override // defpackage.ov9
    public final int g(byte[] bArr, int i, int i2) {
        int min;
        q(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = n(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.e, this.f, bArr, i, min);
        this.f += min;
        return min;
    }

    @Override // defpackage.ov9
    public final void i(byte[] bArr, int i, int i2) {
        c(bArr, i, i2, false);
    }

    @Override // defpackage.ov9
    public final void j(byte[] bArr, int i, int i2) {
        d(bArr, i, i2, false);
    }

    public final boolean k(int i, boolean z) {
        q(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = n(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public final boolean l(int i, boolean z) {
        int o = o(i);
        while (o < i && o != -1) {
            o = n(this.a, -o, Math.min(i, o + ProgressEvent.PART_FAILED_EVENT_CODE), o, false);
        }
        p(o);
        return o != -1;
    }

    @Override // defpackage.ov9
    public final long zzd() {
        return this.c;
    }

    @Override // defpackage.ov9
    public final long zze() {
        return this.d + this.f;
    }

    @Override // defpackage.ov9
    public final long zzf() {
        return this.d;
    }

    @Override // defpackage.ov9
    public final void zzg(int i) {
        k(i, false);
    }

    @Override // defpackage.ov9
    public final void zzj() {
        this.f = 0;
    }
}
