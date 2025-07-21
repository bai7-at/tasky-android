package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j5g implements haf {
    private final r6g a;
    private final ecf b;

    public j5g(r6g r6gVar, ecf ecfVar, int i) {
        this.a = r6gVar;
        this.b = ecfVar;
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] a = this.a.a(bArr);
        return q4g.c(a, this.b.a(q4g.c(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
