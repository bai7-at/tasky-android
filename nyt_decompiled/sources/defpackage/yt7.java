package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface yt7 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    pm8 timeout();

    void write(ad0 ad0Var, long j);
}
