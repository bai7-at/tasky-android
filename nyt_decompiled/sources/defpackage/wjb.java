package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class wjb implements d3f {
    private final ByteBuffer a;

    wjb(ByteBuffer byteBuffer) {
        this.a = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.d3f
    public final void f(long j) {
        this.a.position((int) j);
    }

    @Override // defpackage.d3f
    public final ByteBuffer k(long j, long j2) {
        ByteBuffer byteBuffer = this.a;
        int position = byteBuffer.position();
        byteBuffer.position((int) j);
        ByteBuffer slice = this.a.slice();
        slice.limit((int) j2);
        this.a.position(position);
        return slice;
    }

    @Override // defpackage.d3f
    public final int r1(ByteBuffer byteBuffer) {
        if (this.a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.a.remaining());
        byte[] bArr = new byte[min];
        this.a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // defpackage.d3f
    public final long zzb() {
        return this.a.position();
    }

    @Override // defpackage.d3f
    public final long zzc() {
        return this.a.limit();
    }
}
