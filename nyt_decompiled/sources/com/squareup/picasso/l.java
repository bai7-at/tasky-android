package com.squareup.picasso;

import com.amazonaws.event.ProgressEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
final class l extends InputStream {
    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private int g;

    l(InputStream inputStream) {
        this(inputStream, ProgressEvent.PART_FAILED_EVENT_CODE);
    }

    private void h(long j) {
        try {
            long j2 = this.c;
            long j3 = this.b;
            if (j2 >= j3 || j3 > this.d) {
                this.c = j3;
                this.a.mark((int) (j - j3));
            } else {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                i(this.c, this.b);
            }
            this.d = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void i(long j, long j2) {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j += skip;
        }
    }

    public void a(boolean z) {
        this.f = z;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    public void b(long j) {
        if (this.b > this.d || j < this.c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        i(this.c, j);
        this.b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    public long d(int i) {
        long j = this.b + i;
        if (this.d < j) {
            h(j);
        }
        return this.b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.e = d(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f) {
            long j = this.b + 1;
            long j2 = this.d;
            if (j > j2) {
                h(j2 + this.g);
            }
        }
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        b(this.e);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (!this.f) {
            long j2 = this.b;
            if (j2 + j > this.d) {
                h(j2 + j + this.g);
            }
        }
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }

    l(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private l(InputStream inputStream, int i, int i2) {
        this.e = -1L;
        this.f = true;
        this.g = -1;
        this.a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i);
        this.g = i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f) {
            long j = this.b;
            if (bArr.length + j > this.d) {
                h(j + bArr.length + this.g);
            }
        }
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (!this.f) {
            long j = this.b;
            long j2 = i2;
            if (j + j2 > this.d) {
                h(j + j2 + this.g);
            }
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
