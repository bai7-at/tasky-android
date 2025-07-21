package defpackage;

import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class uz2 {
    private ByteBuffer b;
    private tz2 c;
    private final byte[] a = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
    private int d = 0;

    private boolean b() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = n();
        this.c.d.b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int d = d();
        boolean z = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d & 7) + 1);
        qz2 qz2Var = this.c.d;
        qz2Var.e = (d & 64) != 0;
        if (z) {
            qz2Var.k = g(pow);
        } else {
            qz2Var.k = null;
        }
        this.c.d.j = this.b.position();
        r();
        if (b()) {
            return;
        }
        tz2 tz2Var = this.c;
        tz2Var.c++;
        tz2Var.e.add(tz2Var.d);
    }

    private void f() {
        int d = d();
        this.d = d;
        if (d <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.d, e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    private int[] g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int d = d();
            if (d == 33) {
                int d2 = d();
                if (d2 == 1) {
                    q();
                } else if (d2 == 249) {
                    this.c.d = new qz2();
                    j();
                } else if (d2 == 254) {
                    q();
                } else if (d2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d == 44) {
                tz2 tz2Var = this.c;
                if (tz2Var.d == null) {
                    tz2Var.d = new qz2();
                }
                e();
            } else if (d != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void j() {
        d();
        int d = d();
        qz2 qz2Var = this.c.d;
        int i = (d & 28) >> 2;
        qz2Var.g = i;
        if (i == 0) {
            qz2Var.g = 1;
        }
        qz2Var.f = (d & 1) != 0;
        int n = n();
        if (n < 2) {
            n = 10;
        }
        qz2 qz2Var2 = this.c.d;
        qz2Var2.i = n * 10;
        qz2Var2.h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        l();
        if (!this.c.h || b()) {
            return;
        }
        tz2 tz2Var = this.c;
        tz2Var.a = g(tz2Var.i);
        tz2 tz2Var2 = this.c;
        tz2Var2.l = tz2Var2.a[tz2Var2.j];
    }

    private void l() {
        this.c.f = n();
        this.c.g = n();
        int d = d();
        tz2 tz2Var = this.c;
        tz2Var.h = (d & 128) != 0;
        tz2Var.i = (int) Math.pow(2.0d, (d & 7) + 1);
        this.c.j = d();
        this.c.k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new tz2();
        this.d = 0;
    }

    private void q() {
        int d;
        do {
            d = d();
            this.b.position(Math.min(this.b.position() + d, this.b.limit()));
        } while (d > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public tz2 c() {
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.c;
        }
        k();
        if (!b()) {
            h();
            tz2 tz2Var = this.c;
            if (tz2Var.c < 0) {
                tz2Var.b = 1;
            }
        }
        return this.c;
    }

    public uz2 p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
