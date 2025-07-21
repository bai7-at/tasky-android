package defpackage;

import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class b91 extends ok0 {
    private byte[] j;
    private volatile boolean k;

    public b91(a aVar, b bVar, int i, t0 t0Var, int i2, Object obj, byte[] bArr) {
        super(aVar, bVar, i, t0Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        b91 b91Var;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = z19.f;
            b91Var = this;
        } else {
            b91Var = this;
            bArr2 = bArr;
        }
        b91Var.j = bArr2;
    }

    private void i(int i) {
        byte[] bArr = this.j;
        if (bArr.length < i + Http2.INITIAL_MAX_FRAME_SIZE) {
            this.j = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                i(i2);
                i = this.i.read(this.j, i2, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                g(this.j, i2);
            }
            aa1.a(this.i);
        } catch (Throwable th) {
            aa1.a(this.i);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void c() {
        this.k = true;
    }

    protected abstract void g(byte[] bArr, int i);

    public byte[] h() {
        return this.j;
    }
}
