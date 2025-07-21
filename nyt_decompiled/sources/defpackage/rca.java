package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes3.dex */
public final class rca extends a3f {
    private Date l;
    private Date m;
    private long n;
    private long r;
    private double s;
    private float t;
    private k3f u;
    private long w;

    public rca() {
        super("mvhd");
        this.s = 1.0d;
        this.t = 1.0f;
        this.u = k3f.j;
    }

    @Override // defpackage.y2f
    public final void c(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.l = f3f.a(nca.f(byteBuffer));
            this.m = f3f.a(nca.f(byteBuffer));
            this.n = nca.e(byteBuffer);
            this.r = nca.f(byteBuffer);
        } else {
            this.l = f3f.a(nca.e(byteBuffer));
            this.m = f3f.a(nca.e(byteBuffer));
            this.n = nca.e(byteBuffer);
            this.r = nca.e(byteBuffer);
        }
        this.s = nca.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.t = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        nca.d(byteBuffer);
        nca.e(byteBuffer);
        nca.e(byteBuffer);
        this.u = new k3f(nca.b(byteBuffer), nca.b(byteBuffer), nca.b(byteBuffer), nca.b(byteBuffer), nca.a(byteBuffer), nca.a(byteBuffer), nca.a(byteBuffer), nca.b(byteBuffer), nca.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.w = nca.e(byteBuffer);
    }

    public final long h() {
        return this.r;
    }

    public final long i() {
        return this.n;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.l + ";modificationTime=" + this.m + ";timescale=" + this.n + ";duration=" + this.r + ";rate=" + this.s + ";volume=" + this.t + ";matrix=" + this.u + ";nextTrackId=" + this.w + "]";
    }
}
