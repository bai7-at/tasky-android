package com.google.android.exoplayer2.upstream.cache;

import defpackage.lg0;
import defpackage.mw0;
import defpackage.ow0;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {
        void a(Cache cache, lg0 lg0Var, lg0 lg0Var2);

        void c(Cache cache, lg0 lg0Var);

        void f(Cache cache, lg0 lg0Var);
    }

    File a(String str, long j, long j2);

    mw0 b(String str);

    void c(lg0 lg0Var);

    lg0 d(String str, long j, long j2);

    void e(lg0 lg0Var);

    lg0 f(String str, long j, long j2);

    void g(File file, long j);

    void h(String str, ow0 ow0Var);
}
