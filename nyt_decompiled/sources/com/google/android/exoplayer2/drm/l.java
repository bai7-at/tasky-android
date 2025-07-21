package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import defpackage.r31;
import defpackage.ur;
import defpackage.zf0;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class l implements DrmSession {
    private final DrmSession.DrmSessionException a;

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.a = (DrmSession.DrmSessionException) ur.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(h.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void b(h.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return zf0.a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public r31 e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map g() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean h(String str) {
        return false;
    }
}
