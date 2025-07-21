package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class l7g implements haf {
    private final ehf a;

    public l7g(byte[] bArr) {
        this.a = new ehf(bArr);
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = d7g.a(24);
        allocate.put(a);
        this.a.b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
