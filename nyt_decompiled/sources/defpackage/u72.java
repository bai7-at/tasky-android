package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
final class u72 extends ByteArrayOutputStream {
    public u72(int i) {
        super(i);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        zq3.g(bArr, "buf");
        return bArr;
    }
}
