package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.event.ProgressEvent;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class mb6 implements Closeable {
    private static final Logger g = Logger.getLogger(mb6.class.getName());
    private final RandomAccessFile a;
    int b;
    private int c;
    private b d;
    private b e;
    private final byte[] f = new byte[16];

    class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // mb6.d
        public void a(InputStream inputStream, int i) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    private final class c extends InputStream {
        private int a;
        private int b;

        /* synthetic */ c(mb6 mb6Var, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            mb6.G(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            mb6.this.m0(this.a, bArr, i, i2);
            this.a = mb6.this.G0(this.a + i2);
            this.b -= i2;
            return i2;
        }

        private c(b bVar) {
            this.a = mb6.this.G0(bVar.a + 4);
            this.b = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.b == 0) {
                return -1;
            }
            mb6.this.a.seek(this.a);
            int read = mb6.this.a.read();
            this.a = mb6.this.G0(this.a + 1);
            this.b--;
            return read;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i);
    }

    public mb6(File file) {
        if (!file.exists()) {
            s(file);
        }
        this.a = L(file);
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object G(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int G0(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void H0(int i, int i2, int i3, int i4) {
        W0(this.f, i, i2, i3, i4);
        this.a.seek(0L);
        this.a.write(this.f);
    }

    private static void K0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static RandomAccessFile L(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b P(int i) {
        if (i == 0) {
            return b.c;
        }
        this.a.seek(i);
        return new b(i, this.a.readInt());
    }

    private static void W0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            K0(bArr, i, i2);
            i += 4;
        }
    }

    private void X() {
        this.a.seek(0L);
        this.a.readFully(this.f);
        int c0 = c0(this.f, 0);
        this.b = c0;
        if (c0 <= this.a.length()) {
            this.c = c0(this.f, 4);
            int c02 = c0(this.f, 8);
            int c03 = c0(this.f, 12);
            this.d = P(c02);
            this.e = P(c03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + this.a.length());
    }

    private static int c0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int e0() {
        return this.b - F0();
    }

    private void m(int i) {
        int i2 = i + 4;
        int e0 = e0();
        if (e0 >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            e0 += i3;
            i3 <<= 1;
        } while (e0 < i2);
        w0(i3);
        b bVar = this.e;
        int G0 = G0(bVar.a + 4 + bVar.b);
        if (G0 < this.d.a) {
            FileChannel channel = this.a.getChannel();
            channel.position(this.b);
            long j = G0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.e.a;
        int i5 = this.d.a;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            H0(i3, this.c, i5, i6);
            this.e = new b(i6, this.e.b);
        } else {
            H0(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int i, byte[] bArr, int i2, int i3) {
        int G0 = G0(i);
        int i4 = G0 + i3;
        int i5 = this.b;
        if (i4 <= i5) {
            this.a.seek(G0);
            this.a.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - G0;
        this.a.seek(G0);
        this.a.readFully(bArr, i2, i6);
        this.a.seek(16L);
        this.a.readFully(bArr, i2 + i6, i3 - i6);
    }

    private static void s(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile L = L(file2);
        try {
            L.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            L.seek(0L);
            byte[] bArr = new byte[16];
            W0(bArr, ProgressEvent.PART_FAILED_EVENT_CODE, 0, 0, 0);
            L.write(bArr);
            L.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            L.close();
            throw th;
        }
    }

    private void t0(int i, byte[] bArr, int i2, int i3) {
        int G0 = G0(i);
        int i4 = G0 + i3;
        int i5 = this.b;
        if (i4 <= i5) {
            this.a.seek(G0);
            this.a.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - G0;
        this.a.seek(G0);
        this.a.write(bArr, i2, i6);
        this.a.seek(16L);
        this.a.write(bArr, i2 + i6, i3 - i6);
    }

    private void w0(int i) {
        this.a.setLength(i);
        this.a.getChannel().force(true);
    }

    public synchronized boolean C() {
        return this.c == 0;
    }

    public int F0() {
        if (this.c == 0) {
            return 16;
        }
        b bVar = this.e;
        int i = bVar.a;
        int i2 = this.d.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.b) - i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.a.close();
    }

    public synchronized void f0() {
        try {
            if (C()) {
                throw new NoSuchElementException();
            }
            if (this.c == 1) {
                l();
            } else {
                b bVar = this.d;
                int G0 = G0(bVar.a + 4 + bVar.b);
                m0(G0, this.f, 0, 4);
                int c0 = c0(this.f, 0);
                H0(this.b, this.c - 1, G0, this.e.a);
                this.c--;
                this.d = new b(G0, c0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void i(byte[] bArr) {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i, int i2) {
        int G0;
        try {
            G(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            m(i2);
            boolean C = C();
            if (C) {
                G0 = 16;
            } else {
                b bVar = this.e;
                G0 = G0(bVar.a + 4 + bVar.b);
            }
            b bVar2 = new b(G0, i2);
            K0(this.f, 0, i2);
            t0(bVar2.a, this.f, 0, 4);
            t0(bVar2.a + 4, bArr, i, i2);
            H0(this.b, this.c + 1, C ? bVar2.a : this.d.a, bVar2.a);
            this.e = bVar2;
            this.c++;
            if (C) {
                this.d = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l() {
        try {
            H0(ProgressEvent.PART_FAILED_EVENT_CODE, 0, 0, 0);
            this.c = 0;
            b bVar = b.c;
            this.d = bVar;
            this.e = bVar;
            if (this.b > 4096) {
                w0(ProgressEvent.PART_FAILED_EVENT_CODE);
            }
            this.b = ProgressEvent.PART_FAILED_EVENT_CODE;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void r(d dVar) {
        int i = this.d.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            b P = P(i);
            dVar.a(new c(this, P, null), P.b);
            i = G0(P.a + 4 + P.b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            r(new a(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
