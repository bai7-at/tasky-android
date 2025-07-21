package defpackage;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes3.dex */
final class bna extends PushbackInputStream {
    final /* synthetic */ cna a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bna(cna cnaVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.a = cnaVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ena.e(this.a.c);
        super.close();
    }
}
