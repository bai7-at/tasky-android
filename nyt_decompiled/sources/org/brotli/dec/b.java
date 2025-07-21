package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;
import okhttp3.internal.http2.Http2;

/* loaded from: classes5.dex */
public class b extends InputStream {
    private byte[] a;
    private int b;
    private int c;
    private final j d;

    public b(InputStream inputStream) {
        this(inputStream, Http2.INITIAL_MAX_FRAME_SIZE, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j.a(this.d);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.c >= this.b) {
            byte[] bArr = this.a;
            int read = read(bArr, 0, bArr.length);
            this.b = read;
            this.c = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr2[i] & 255;
    }

    public b(InputStream inputStream, int i, byte[] bArr) {
        j jVar = new j();
        this.d = jVar;
        if (i <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.a = new byte[i];
        this.b = 0;
        this.c = 0;
        try {
            j.c(jVar, inputStream);
            if (bArr != null) {
                d.s(jVar, bArr);
            }
        } catch (BrotliRuntimeException e) {
            throw new IOException("Brotli decoder initialization failed", e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad offset: " + i);
        }
        if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i3 + " > " + bArr.length);
            }
            if (i2 == 0) {
                return 0;
            }
            int max = Math.max(this.b - this.c, 0);
            if (max != 0) {
                max = Math.min(max, i2);
                System.arraycopy(this.a, this.c, bArr, i, max);
                this.c += max;
                i += max;
                i2 -= max;
                if (i2 == 0) {
                    return max;
                }
            }
            try {
                j jVar = this.d;
                jVar.Z = bArr;
                jVar.U = i;
                jVar.V = i2;
                jVar.W = 0;
                d.i(jVar);
                int i4 = this.d.W;
                if (i4 == 0) {
                    return -1;
                }
                return i4 + max;
            } catch (BrotliRuntimeException e) {
                throw new IOException("Brotli stream decoding failed", e);
            }
        }
        throw new IllegalArgumentException("Bad length: " + i2);
    }
}
