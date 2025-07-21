package defpackage;

import java.io.Closeable;

/* loaded from: classes5.dex */
public interface px7 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
    void close();

    long read(ad0 ad0Var, long j);

    pm8 timeout();
}
