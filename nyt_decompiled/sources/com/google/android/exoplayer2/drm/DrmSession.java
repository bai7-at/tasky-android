package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.h;
import defpackage.r31;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public final int errorCode;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }

    static void f(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.a(null);
        }
        if (drmSession != null) {
            drmSession.b(null);
        }
    }

    void a(h.a aVar);

    void b(h.a aVar);

    UUID c();

    boolean d();

    r31 e();

    Map g();

    DrmSessionException getError();

    int getState();

    boolean h(String str);
}
