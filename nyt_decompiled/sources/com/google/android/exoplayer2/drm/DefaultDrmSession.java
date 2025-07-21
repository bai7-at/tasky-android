package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.upstream.h;
import defpackage.a84;
import defpackage.gg9;
import defpackage.kv0;
import defpackage.pi4;
import defpackage.r31;
import defpackage.sv5;
import defpackage.ur;
import defpackage.v64;
import defpackage.wz0;
import defpackage.z19;
import defpackage.zf0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
class DefaultDrmSession implements DrmSession {
    public final List a;
    private final m b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap h;
    private final wz0 i;
    private final com.google.android.exoplayer2.upstream.h j;
    private final sv5 k;
    private final p l;
    private final UUID m;
    private final Looper n;
    private final e o;
    private int p;
    private int q;
    private HandlerThread r;
    private c s;
    private r31 t;
    private DrmSession.DrmSessionException u;
    private byte[] v;
    private byte[] w;
    private m.a x;
    private m.d y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(Exception exc, boolean z);

        void b(DefaultDrmSession defaultDrmSession);

        void c();
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i);

        void b(DefaultDrmSession defaultDrmSession, int i);
    }

    private class c extends Handler {
        private boolean a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > DefaultDrmSession.this.j.b(3)) {
                return false;
            }
            long a = DefaultDrmSession.this.j.a(new h.c(new v64(dVar.a, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, mediaDrmCallbackException.bytesLoaded), new pi4(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.e));
            if (a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(int i, Object obj, boolean z) {
            obtainMessage(i, new d(v64.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    th = DefaultDrmSession.this.l.a(DefaultDrmSession.this.m, (m.d) dVar.d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    th = DefaultDrmSession.this.l.b(DefaultDrmSession.this.m, (m.a) dVar.d);
                }
            } catch (MediaDrmCallbackException e) {
                boolean a = a(message, e);
                th = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                a84.k("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                th = e2;
            }
            DefaultDrmSession.this.j.d(dVar.a);
            synchronized (this) {
                try {
                    if (!this.a) {
                        DefaultDrmSession.this.o.obtainMessage(message.what, Pair.create(dVar.d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    private static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.E(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.y(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, p pVar, Looper looper, com.google.android.exoplayer2.upstream.h hVar, sv5 sv5Var) {
        if (i == 1 || i == 3) {
            ur.e(bArr);
        }
        this.m = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = mVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) ur.e(list));
        }
        this.h = hashMap;
        this.l = pVar;
        this.i = new wz0();
        this.j = hVar;
        this.k = sv5Var;
        this.p = 2;
        this.n = looper;
        this.o = new e(looper);
    }

    private void A() {
        if (this.e == 0 && this.p == 4) {
            z19.j(this.v);
            r(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Object obj, Object obj2) {
        if (obj == this.y) {
            if (this.p == 2 || u()) {
                this.y = null;
                if (obj2 instanceof Exception) {
                    this.c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.b.f((byte[]) obj2);
                    this.c.c();
                } catch (Exception e2) {
                    this.c.a(e2, true);
                }
            }
        }
    }

    private boolean F() {
        if (u()) {
            return true;
        }
        try {
            byte[] c2 = this.b.c();
            this.v = c2;
            this.b.h(c2, this.k);
            this.t = this.b.i(this.v);
            final int i = 3;
            this.p = 3;
            q(new kv0() { // from class: com.google.android.exoplayer2.drm.b
                @Override // defpackage.kv0
                public final void accept(Object obj) {
                    ((h.a) obj).k(i);
                }
            });
            ur.e(this.v);
            return true;
        } catch (NotProvisionedException unused) {
            this.c.b(this);
            return false;
        } catch (Exception e2) {
            x(e2, 1);
            return false;
        }
    }

    private void G(byte[] bArr, int i, boolean z) {
        try {
            this.x = this.b.m(bArr, this.a, i, this.h);
            ((c) z19.j(this.s)).b(1, ur.e(this.x), z);
        } catch (Exception e2) {
            z(e2, true);
        }
    }

    private boolean I() {
        try {
            this.b.d(this.v, this.w);
            return true;
        } catch (Exception e2) {
            x(e2, 1);
            return false;
        }
    }

    private void J() {
        if (Thread.currentThread() != this.n.getThread()) {
            a84.k("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.n.getThread().getName(), new IllegalStateException());
        }
    }

    private void q(kv0 kv0Var) {
        Iterator it2 = this.i.w0().iterator();
        while (it2.hasNext()) {
            kv0Var.accept((h.a) it2.next());
        }
    }

    private void r(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) z19.j(this.v);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.w == null || I()) {
                    G(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            ur.e(this.w);
            ur.e(this.v);
            G(this.w, 3, z);
            return;
        }
        if (this.w == null) {
            G(bArr, 1, z);
            return;
        }
        if (this.p == 4 || I()) {
            long s = s();
            if (this.e != 0 || s > 60) {
                if (s <= 0) {
                    x(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.p = 4;
                    q(new kv0() { // from class: zg1
                        @Override // defpackage.kv0
                        public final void accept(Object obj) {
                            ((h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            a84.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + s);
            G(bArr, 2, z);
        }
    }

    private long s() {
        if (!zf0.d.equals(this.m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) ur.e(gg9.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean u() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    private void x(final Exception exc, int i) {
        this.u = new DrmSession.DrmSessionException(exc, j.a(exc, i));
        a84.e("DefaultDrmSession", "DRM session error", exc);
        q(new kv0() { // from class: com.google.android.exoplayer2.drm.c
            @Override // defpackage.kv0
            public final void accept(Object obj) {
                ((h.a) obj).l(exc);
            }
        });
        if (this.p != 4) {
            this.p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(Object obj, Object obj2) {
        if (obj == this.x && u()) {
            this.x = null;
            if (obj2 instanceof Exception) {
                z((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.b.l((byte[]) z19.j(this.w), bArr);
                    q(new kv0() { // from class: ah1
                        @Override // defpackage.kv0
                        public final void accept(Object obj3) {
                            ((h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] l = this.b.l(this.v, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.w != null)) && l != null && l.length != 0) {
                    this.w = l;
                }
                this.p = 4;
                q(new kv0() { // from class: bh1
                    @Override // defpackage.kv0
                    public final void accept(Object obj3) {
                        ((h.a) obj3).h();
                    }
                });
            } catch (Exception e2) {
                z(e2, true);
            }
        }
    }

    private void z(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.c.b(this);
        } else {
            x(exc, z ? 1 : 2);
        }
    }

    void B(int i) {
        if (i != 2) {
            return;
        }
        A();
    }

    void C() {
        if (F()) {
            r(true);
        }
    }

    void D(Exception exc, boolean z) {
        x(exc, z ? 1 : 3);
    }

    void H() {
        this.y = this.b.b();
        ((c) z19.j(this.s)).b(0, ur.e(this.y), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(h.a aVar) {
        J();
        if (this.q < 0) {
            a84.d("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (aVar != null) {
            this.i.a(aVar);
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            ur.g(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new c(this.r.getLooper());
            if (F()) {
                r(true);
            }
        } else if (aVar != null && u() && this.i.c(aVar) == 1) {
            aVar.k(this.p);
        }
        this.d.a(this, this.q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void b(h.a aVar) {
        J();
        int i = this.q;
        if (i <= 0) {
            a84.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            ((e) z19.j(this.o)).removeCallbacksAndMessages(null);
            ((c) z19.j(this.s)).c();
            this.s = null;
            ((HandlerThread) z19.j(this.r)).quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (aVar != null) {
            this.i.e(aVar);
            if (this.i.c(aVar) == 0) {
                aVar.m();
            }
        }
        this.d.b(this, this.q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        J();
        return this.m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        J();
        return this.f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final r31 e() {
        J();
        return this.t;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map g() {
        J();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        J();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        J();
        return this.p;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean h(String str) {
        J();
        return this.b.j((byte[]) ur.i(this.v), str);
    }

    public boolean t(byte[] bArr) {
        J();
        return Arrays.equals(this.v, bArr);
    }
}
