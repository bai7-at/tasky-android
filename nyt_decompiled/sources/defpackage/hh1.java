package defpackage;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hh1 implements z72 {
    private final s91 b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    static {
        n72.a("goog.exo.extractor");
    }

    public hh1(s91 s91Var, long j, long j2) {
        this.b = s91Var;
        this.d = j;
        this.c = j2;
    }

    private void k(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    private void s(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, z19.q(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int t(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        x(min);
        return min;
    }

    private int u(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private int v(int i) {
        int min = Math.min(this.g, i);
        x(min);
        return min;
    }

    private void x(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // defpackage.z72
    public int a(int i) {
        int v = v(i);
        if (v == 0) {
            byte[] bArr = this.a;
            v = u(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        k(v);
        return v;
    }

    @Override // defpackage.z72
    public boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!q(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.z72
    public void g() {
        this.f = 0;
    }

    @Override // defpackage.z72
    public long getLength() {
        return this.c;
    }

    @Override // defpackage.z72
    public long getPosition() {
        return this.d;
    }

    @Override // defpackage.z72
    public boolean h(byte[] bArr, int i, int i2, boolean z) {
        int t = t(bArr, i, i2);
        while (t < i2 && t != -1) {
            t = u(bArr, i, i2, t, z);
        }
        k(t);
        return t != -1;
    }

    @Override // defpackage.z72
    public long l() {
        return this.d + this.f;
    }

    @Override // defpackage.z72
    public void n(int i) {
        q(i, false);
    }

    @Override // defpackage.z72
    public int o(byte[] bArr, int i, int i2) {
        int min;
        s(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = u(this.e, i4, i2, 0, true);
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

    @Override // defpackage.z72
    public void p(int i) {
        w(i, false);
    }

    @Override // defpackage.z72
    public boolean q(int i, boolean z) {
        s(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = u(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    @Override // defpackage.z72
    public void r(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    @Override // defpackage.z72, defpackage.s91
    public int read(byte[] bArr, int i, int i2) {
        int t = t(bArr, i, i2);
        if (t == 0) {
            t = u(bArr, i, i2, 0, true);
        }
        k(t);
        return t;
    }

    @Override // defpackage.z72
    public void readFully(byte[] bArr, int i, int i2) {
        h(bArr, i, i2, false);
    }

    public boolean w(int i, boolean z) {
        int v = v(i);
        while (v < i && v != -1) {
            v = u(this.a, -v, Math.min(i, this.a.length + v), v, z);
        }
        k(v);
        return v != -1;
    }
}
