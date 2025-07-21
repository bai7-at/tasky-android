package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.t0;
import defpackage.sv5;

/* loaded from: classes2.dex */
public interface i {
    public static final i a;
    public static final i b;

    class a implements i {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.i
        public int a(t0 t0Var) {
            return t0Var.r != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void b(Looper looper, sv5 sv5Var) {
        }

        @Override // com.google.android.exoplayer2.drm.i
        public DrmSession c(h.a aVar, t0 t0Var) {
            if (t0Var.r == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }
    }

    public interface b {
        public static final b a = new b() { // from class: ew1
            @Override // com.google.android.exoplayer2.drm.i.b
            public final void release() {
                i.b.a();
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void a() {
        }

        void release();
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    default void Z() {
    }

    int a(t0 t0Var);

    void b(Looper looper, sv5 sv5Var);

    DrmSession c(h.a aVar, t0 t0Var);

    default b d(h.a aVar, t0 t0Var) {
        return b.a;
    }

    default void release() {
    }
}
