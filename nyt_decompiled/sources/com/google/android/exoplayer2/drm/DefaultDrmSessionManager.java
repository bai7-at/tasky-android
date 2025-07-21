package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.t0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.s;
import defpackage.a84;
import defpackage.gx8;
import defpackage.ku4;
import defpackage.rq2;
import defpackage.sv5;
import defpackage.ur;
import defpackage.z19;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes2.dex */
public class DefaultDrmSessionManager implements i {
    private final UUID c;
    private final m.c d;
    private final p e;
    private final HashMap f;
    private final boolean g;
    private final int[] h;
    private final boolean i;
    private final f j;
    private final com.google.android.exoplayer2.upstream.h k;
    private final g l;
    private final long m;
    private final List n;
    private final Set o;
    private final Set p;
    private int q;
    private m r;
    private DefaultDrmSession s;
    private DefaultDrmSession t;
    private Looper u;
    private Handler v;
    private int w;
    private byte[] x;
    private sv5 y;
    volatile d z;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {
        private boolean d;
        private boolean f;
        private final HashMap a = new HashMap();
        private UUID b = zf0.d;
        private m.c c = n.d;
        private com.google.android.exoplayer2.upstream.h g = new com.google.android.exoplayer2.upstream.g();
        private int[] e = new int[0];
        private long h = 300000;

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.b, this.c, pVar, this.a, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(boolean z) {
            this.d = z;
            return this;
        }

        public b c(boolean z) {
            this.f = z;
            return this;
        }

        public b d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                ur.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, m.c cVar) {
            this.b = (UUID) ur.e(uuid);
            this.c = (m.c) ur.e(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.drm.m.b
        public void a(m mVar, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((d) ur.e(DefaultDrmSessionManager.this.z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.n) {
                if (defaultDrmSession.t(bArr)) {
                    defaultDrmSession.B(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements i.b {
        private final h.a b;
        private DrmSession c;
        private boolean d;

        public e(h.a aVar) {
            this.b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(t0 t0Var) {
            if (DefaultDrmSessionManager.this.q == 0 || this.d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.c = defaultDrmSessionManager.s((Looper) ur.e(defaultDrmSessionManager.u), this.b, t0Var, false);
            DefaultDrmSessionManager.this.o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (this.d) {
                return;
            }
            DrmSession drmSession = this.c;
            if (drmSession != null) {
                drmSession.b(this.b);
            }
            DefaultDrmSessionManager.this.o.remove(this);
            this.d = true;
        }

        public void e(final t0 t0Var) {
            ((Handler) ur.e(DefaultDrmSessionManager.this.v)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.this.f(t0Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.i.b
        public void release() {
            z19.M0((Handler) ur.e(DefaultDrmSessionManager.this.v), new Runnable() { // from class: com.google.android.exoplayer2.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.this.g();
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {
        private final Set a = new HashSet();
        private DefaultDrmSession b;

        public f() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z) {
            this.b = null;
            ImmutableList t = ImmutableList.t(this.a);
            this.a.clear();
            gx8 it2 = t.iterator();
            while (it2.hasNext()) {
                ((DefaultDrmSession) it2.next()).D(exc, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b(DefaultDrmSession defaultDrmSession) {
            this.a.add(defaultDrmSession);
            if (this.b != null) {
                return;
            }
            this.b = defaultDrmSession;
            defaultDrmSession.H();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void c() {
            this.b = null;
            ImmutableList t = ImmutableList.t(this.a);
            this.a.clear();
            gx8 it2 = t.iterator();
            while (it2.hasNext()) {
                ((DefaultDrmSession) it2.next()).C();
            }
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.a.remove(defaultDrmSession);
            if (this.b == defaultDrmSession) {
                this.b = null;
                if (this.a.isEmpty()) {
                    return;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) this.a.iterator().next();
                this.b = defaultDrmSession2;
                defaultDrmSession2.H();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.p.remove(defaultDrmSession);
                ((Handler) ur.e(DefaultDrmSessionManager.this.v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.q > 0 && DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.p.add(defaultDrmSession);
                ((Handler) ur.e(DefaultDrmSessionManager.this.v)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultDrmSession.this.b(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.m);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.s = null;
                }
                if (DefaultDrmSessionManager.this.t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.t = null;
                }
                DefaultDrmSessionManager.this.j.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.m != -9223372036854775807L) {
                    ((Handler) ur.e(DefaultDrmSessionManager.this.v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.B();
        }
    }

    private void A(Looper looper) {
        if (this.z == null) {
            this.z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.r != null && this.q == 0 && this.n.isEmpty() && this.o.isEmpty()) {
            ((m) ur.e(this.r)).release();
            this.r = null;
        }
    }

    private void C() {
        gx8 it2 = ImmutableSet.u(this.p).iterator();
        while (it2.hasNext()) {
            ((DrmSession) it2.next()).b(null);
        }
    }

    private void D() {
        gx8 it2 = ImmutableSet.u(this.o).iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).release();
        }
    }

    private void F(DrmSession drmSession, h.a aVar) {
        drmSession.b(aVar);
        if (this.m != -9223372036854775807L) {
            drmSession.b(null);
        }
    }

    private void G(boolean z) {
        if (z && this.u == null) {
            a84.k("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) ur.e(this.u)).getThread()) {
            a84.k("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession s(Looper looper, h.a aVar, t0 t0Var, boolean z) {
        List list;
        A(looper);
        DrmInitData drmInitData = t0Var.r;
        if (drmInitData == null) {
            return z(ku4.k(t0Var.l), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.x == null) {
            list = x((DrmInitData) ur.e(drmInitData), this.c, false);
            if (list.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.c);
                a84.e("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            list = null;
        }
        if (this.g) {
            Iterator it2 = this.n.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) it2.next();
                if (z19.c(defaultDrmSession2.a, list)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.t;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = w(list, false, aVar, z);
            if (!this.g) {
                this.t = defaultDrmSession;
            }
            this.n.add(defaultDrmSession);
        } else {
            defaultDrmSession.a(aVar);
        }
        return defaultDrmSession;
    }

    private static boolean t(DrmSession drmSession) {
        return drmSession.getState() == 1 && (z19.a < 19 || (((DrmSession.DrmSessionException) ur.e(drmSession.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean u(DrmInitData drmInitData) {
        if (this.x != null) {
            return true;
        }
        if (x(drmInitData, this.c, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.e(0).d(zf0.b)) {
                return false;
            }
            a84.j("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.c);
        }
        String str = drmInitData.schemeType;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? z19.a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession v(List list, boolean z, h.a aVar) {
        ur.e(this.r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.c, this.r, this.j, this.l, list, this.w, this.i | z, z, this.x, this.f, this.e, (Looper) ur.e(this.u), this.k, (sv5) ur.e(this.y));
        defaultDrmSession.a(aVar);
        if (this.m != -9223372036854775807L) {
            defaultDrmSession.a(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession w(List list, boolean z, h.a aVar, boolean z2) {
        DefaultDrmSession v = v(list, z, aVar);
        if (t(v) && !this.p.isEmpty()) {
            C();
            F(v, aVar);
            v = v(list, z, aVar);
        }
        if (!t(v) || !z2 || this.o.isEmpty()) {
            return v;
        }
        D();
        if (!this.p.isEmpty()) {
            C();
        }
        F(v, aVar);
        return v(list, z, aVar);
    }

    private static List x(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData e2 = drmInitData.e(i);
            if ((e2.d(uuid) || (zf0.c.equals(uuid) && e2.d(zf0.b))) && (e2.data != null || z)) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private synchronized void y(Looper looper) {
        try {
            Looper looper2 = this.u;
            if (looper2 == null) {
                this.u = looper;
                this.v = new Handler(looper);
            } else {
                ur.g(looper2 == looper);
                ur.e(this.v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private DrmSession z(int i, boolean z) {
        m mVar = (m) ur.e(this.r);
        if ((mVar.g() == 2 && rq2.d) || z19.B0(this.h, i) == -1 || mVar.g() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.s;
        if (defaultDrmSession == null) {
            DefaultDrmSession w = w(ImmutableList.x(), true, null, z);
            this.n.add(w);
            this.s = w;
        } else {
            defaultDrmSession.a(null);
        }
        return this.s;
    }

    public void E(int i, byte[] bArr) {
        ur.g(this.n.isEmpty());
        if (i == 1 || i == 3) {
            ur.e(bArr);
        }
        this.w = i;
        this.x = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void Z() {
        G(true);
        int i = this.q;
        this.q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.r == null) {
            m a2 = this.d.a(this.c);
            this.r = a2;
            a2.e(new c());
        } else if (this.m != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                ((DefaultDrmSession) this.n.get(i2)).a(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.i
    public int a(t0 t0Var) {
        G(false);
        int g2 = ((m) ur.e(this.r)).g();
        DrmInitData drmInitData = t0Var.r;
        if (drmInitData != null) {
            if (u(drmInitData)) {
                return g2;
            }
            return 1;
        }
        if (z19.B0(this.h, ku4.k(t0Var.l)) != -1) {
            return g2;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public void b(Looper looper, sv5 sv5Var) {
        y(looper);
        this.y = sv5Var;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public DrmSession c(h.a aVar, t0 t0Var) {
        G(false);
        ur.g(this.q > 0);
        ur.i(this.u);
        return s(this.u, aVar, t0Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.i
    public i.b d(h.a aVar, t0 t0Var) {
        ur.g(this.q > 0);
        ur.i(this.u);
        e eVar = new e(aVar);
        eVar.e(t0Var);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.drm.i
    public final void release() {
        G(true);
        int i = this.q - 1;
        this.q = i;
        if (i != 0) {
            return;
        }
        if (this.m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).b(null);
            }
        }
        D();
        B();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, com.google.android.exoplayer2.upstream.h hVar, long j) {
        ur.e(uuid);
        ur.b(!zf0.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = cVar;
        this.e = pVar;
        this.f = hashMap;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.k = hVar;
        this.j = new f();
        this.l = new g();
        this.w = 0;
        this.n = new ArrayList();
        this.o = s.h();
        this.p = s.h();
        this.m = j;
    }
}
