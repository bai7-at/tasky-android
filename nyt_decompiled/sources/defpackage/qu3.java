package defpackage;

import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class qu3 extends fe2 {
    private final RandomAccessFile e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu3(boolean z, RandomAccessFile randomAccessFile) {
        super(z);
        zq3.h(randomAccessFile, "randomAccessFile");
        this.e = randomAccessFile;
    }

    @Override // defpackage.fe2
    protected synchronized void j() {
        this.e.close();
    }

    @Override // defpackage.fe2
    protected synchronized int l(long j, byte[] bArr, int i, int i2) {
        zq3.h(bArr, "array");
        this.e.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.e.read(bArr, i, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // defpackage.fe2
    protected synchronized long m() {
        return this.e.length();
    }
}
