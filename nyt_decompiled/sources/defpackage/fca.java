package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public final class fca extends ByteArrayOutputStream {
    private final lba a;

    public fca(lba lbaVar, int i) {
        this.a = lbaVar;
        ((ByteArrayOutputStream) this).buf = lbaVar.b(Math.max(i, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH));
    }

    private final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        byte[] b = this.a.b(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, b, 0, ((ByteArrayOutputStream) this).count);
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = b;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
