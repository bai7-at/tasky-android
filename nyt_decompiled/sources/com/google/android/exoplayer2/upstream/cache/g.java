package com.google.android.exoplayer2.upstream.cache;

import defpackage.ur;
import defpackage.z19;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class g extends BufferedOutputStream {
    private boolean a;

    public g(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        ur.g(this.a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            z19.T0(th);
        }
    }

    public g(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
