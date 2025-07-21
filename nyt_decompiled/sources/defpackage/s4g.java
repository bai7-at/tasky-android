package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class s4g implements haf {
    private final ygf a;

    public s4g(byte[] bArr) {
        this.a = new ygf(bArr);
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a = d7g.a(12);
        allocate.put(a);
        this.a.b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
