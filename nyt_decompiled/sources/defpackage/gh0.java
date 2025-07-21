package defpackage;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.t0;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class gh0 extends f {
    private final DecoderInputBuffer s;
    private final yo5 t;
    private long u;
    private fh0 w;
    private long x;

    public gh0() {
        super(6);
        this.s = new DecoderInputBuffer(1);
        this.t = new yo5();
    }

    private float[] d0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.t.S(byteBuffer.array(), byteBuffer.limit());
        this.t.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.t.u());
        }
        return fArr;
    }

    private void e0() {
        fh0 fh0Var = this.w;
        if (fh0Var != null) {
            fh0Var.i();
        }
    }

    @Override // com.google.android.exoplayer2.z1
    public void D(long j, long j2) {
        while (!k() && this.x < 100000 + j) {
            this.s.f();
            if (a0(M(), this.s, 0) != -4 || this.s.l()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.s;
            this.x = decoderInputBuffer.e;
            if (this.w != null && !decoderInputBuffer.k()) {
                this.s.u();
                float[] d0 = d0((ByteBuffer) z19.j(this.s.c));
                if (d0 != null) {
                    ((fh0) z19.j(this.w)).e(this.x - this.u, d0);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void R() {
        e0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void T(long j, boolean z) {
        this.x = Long.MIN_VALUE;
        e0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void Z(t0[] t0VarArr, long j, long j2) {
        this.u = j2;
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(t0 t0Var) {
        return "application/x-camera-motion".equals(t0Var.l) ? a2.r(4) : a2.r(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean d() {
        return k();
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void s(int i, Object obj) {
        if (i == 8) {
            this.w = (fh0) obj;
        } else {
            super.s(i, obj);
        }
    }
}
