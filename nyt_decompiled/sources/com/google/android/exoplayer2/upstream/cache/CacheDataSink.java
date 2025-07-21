package com.google.android.exoplayer2.upstream.cache;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.upstream.cache.Cache;
import defpackage.a84;
import defpackage.ur;
import defpackage.w91;
import defpackage.z19;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class CacheDataSink implements w91 {
    private final Cache a;
    private final long b;
    private final int c;
    private com.google.android.exoplayer2.upstream.b d;
    private long e;
    private File f;
    private OutputStream g;
    private long h;
    private long i;
    private g j;

    public static final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    public static final class a implements w91.a {
        private Cache a;
        private long b = 5242880;
        private int c = 20480;

        @Override // w91.a
        public w91 a() {
            return new CacheDataSink((Cache) ur.e(this.a), this.b, this.c);
        }

        public a b(Cache cache) {
            this.a = cache;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j, int i) {
        ur.h(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            a84.j("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.a = (Cache) ur.e(cache);
        this.b = j == -1 ? Long.MAX_VALUE : j;
        this.c = i;
    }

    private void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            z19.n(this.g);
            this.g = null;
            File file = (File) z19.j(this.f);
            this.f = null;
            this.a.g(file, this.h);
        } catch (Throwable th) {
            z19.n(this.g);
            this.g = null;
            File file2 = (File) z19.j(this.f);
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    private void c(com.google.android.exoplayer2.upstream.b bVar) {
        long j = bVar.h;
        this.f = this.a.a((String) z19.j(bVar.i), bVar.g + this.i, j != -1 ? Math.min(j - this.i, this.e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            g gVar = this.j;
            if (gVar == null) {
                this.j = new g(fileOutputStream, this.c);
            } else {
                gVar.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.w91
    public void b(com.google.android.exoplayer2.upstream.b bVar) {
        ur.e(bVar.i);
        if (bVar.h == -1 && bVar.d(2)) {
            this.d = null;
            return;
        }
        this.d = bVar;
        this.e = bVar.d(4) ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            c(bVar);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // defpackage.w91
    public void close() {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // defpackage.w91
    public void p(byte[] bArr, int i, int i2) {
        com.google.android.exoplayer2.upstream.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    c(bVar);
                }
                int min = (int) Math.min(i2 - i3, this.e - this.h);
                ((OutputStream) z19.j(this.g)).write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }
}
