package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.c;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import defpackage.d04;
import defpackage.gf3;
import defpackage.hi2;
import defpackage.lh4;
import defpackage.og8;
import defpackage.q76;
import defpackage.qg8;
import defpackage.qo6;
import defpackage.uh2;
import defpackage.vg8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c implements hi2 {
    private static final Object m = new Object();
    private static final ThreadFactory n = new a();
    private final uh2 a;
    private final com.google.firebase.installations.remote.c b;
    private final PersistedInstallation c;
    private final h d;
    private final d04 e;
    private final qo6 f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;
    private Set k;
    private final List l;

    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final uh2 uh2Var, q76 q76Var) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n), uh2Var, new com.google.firebase.installations.remote.c(uh2Var.j(), q76Var), new PersistedInstallation(uh2Var), h.c(), new d04(new q76() { // from class: ei2
            @Override // defpackage.q76
            public final Object get() {
                gf3 y;
                y = c.y(uh2.this);
                return y;
            }
        }), new qo6());
    }

    private String A(com.google.firebase.installations.local.b bVar) {
        if ((!this.a.l().equals("CHIME_ANDROID_SDK") && !this.a.t()) || !bVar.m()) {
            return this.f.a();
        }
        String f = o().f();
        return TextUtils.isEmpty(f) ? this.f.a() : f;
    }

    private com.google.firebase.installations.local.b B(com.google.firebase.installations.local.b bVar) {
        InstallationResponse d = this.b.d(l(), bVar.d(), t(), m(), (bVar.d() == null || bVar.d().length() != 11) ? null : o().i());
        int i = b.a[d.e().ordinal()];
        if (i == 1) {
            return bVar.s(d.c(), d.d(), this.d.b(), d.b().c(), d.b().d());
        }
        if (i == 2) {
            return bVar.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void C(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it2 = this.l.iterator();
                while (it2.hasNext()) {
                    if (((g) it2.next()).a(exc)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void D(com.google.firebase.installations.local.b bVar) {
        synchronized (this.g) {
            try {
                Iterator it2 = this.l.iterator();
                while (it2.hasNext()) {
                    if (((g) it2.next()).b(bVar)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.j = str;
    }

    private synchronized void F(com.google.firebase.installations.local.b bVar, com.google.firebase.installations.local.b bVar2) {
        if (this.k.size() != 0 && !TextUtils.equals(bVar.d(), bVar2.d())) {
            Iterator it2 = this.k.iterator();
            if (it2.hasNext()) {
                lh4.a(it2.next());
                bVar2.d();
                throw null;
            }
        }
    }

    private og8 f() {
        qg8 qg8Var = new qg8();
        h(new d(this.d, qg8Var));
        return qg8Var.a();
    }

    private og8 g() {
        qg8 qg8Var = new qg8();
        h(new e(qg8Var));
        return qg8Var.a();
    }

    private void h(g gVar) {
        synchronized (this.g) {
            this.l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.b r0 = r2.r()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 != 0) goto L24
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r1 == 0) goto L11
            goto L24
        L11:
            if (r3 != 0) goto L1f
            com.google.firebase.installations.h r3 = r2.d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            if (r3 == 0) goto L1c
            goto L1f
        L1c:
            return
        L1d:
            r3 = move-exception
            goto L61
        L1f:
            com.google.firebase.installations.local.b r3 = r2.k(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
            goto L28
        L24:
            com.google.firebase.installations.local.b r3 = r2.B(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L1d
        L28:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L3b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L3b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4c
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r0 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L4c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.C(r3)
            goto L60
        L5d:
            r2.D(r3)
        L60:
            return
        L61:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z) {
        com.google.firebase.installations.local.b s = s();
        if (z) {
            s = s.p();
        }
        D(s);
        this.i.execute(new Runnable() { // from class: fi2
            @Override // java.lang.Runnable
            public final void run() {
                c.this.v(z);
            }
        });
    }

    private com.google.firebase.installations.local.b k(com.google.firebase.installations.local.b bVar) {
        TokenResult e = this.b.e(l(), bVar.d(), t(), bVar.f());
        int i = b.b[e.b().ordinal()];
        if (i == 1) {
            return bVar.o(e.c(), e.d(), this.d.b());
        }
        if (i == 2) {
            return bVar.q("BAD CONFIG");
        }
        if (i != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        E(null);
        return bVar.r();
    }

    private synchronized String n() {
        return this.j;
    }

    private gf3 o() {
        return (gf3) this.e.get();
    }

    public static c p() {
        return q(uh2.k());
    }

    public static c q(uh2 uh2Var) {
        Preconditions.checkArgument(uh2Var != null, "Null is not a valid value of FirebaseApp.");
        return (c) uh2Var.i(hi2.class);
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.b r() {
        com.google.firebase.installations.local.b d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
                try {
                    d = this.c.d();
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d;
    }

    /* JADX WARN: Finally extract failed */
    private com.google.firebase.installations.local.b s() {
        com.google.firebase.installations.local.b d;
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
                try {
                    d = this.c.d();
                    if (d.j()) {
                        d = this.c.b(d.t(A(d)));
                    }
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d;
    }

    /* JADX WARN: Finally extract failed */
    private void u(com.google.firebase.installations.local.b bVar) {
        synchronized (m) {
            try {
                com.google.firebase.installations.b a2 = com.google.firebase.installations.b.a(this.a.j(), "generatefid.lock");
                try {
                    this.c.b(bVar);
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gf3 y(uh2 uh2Var) {
        return new gf3(uh2Var);
    }

    private void z() {
        Preconditions.checkNotEmpty(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.hi2
    public og8 a(final boolean z) {
        z();
        og8 f = f();
        this.h.execute(new Runnable() { // from class: gi2
            @Override // java.lang.Runnable
            public final void run() {
                c.this.x(z);
            }
        });
        return f;
    }

    @Override // defpackage.hi2
    public og8 getId() {
        z();
        String n2 = n();
        if (n2 != null) {
            return vg8.e(n2);
        }
        og8 g = g();
        this.h.execute(new Runnable() { // from class: di2
            @Override // java.lang.Runnable
            public final void run() {
                c.this.w();
            }
        });
        return g;
    }

    String l() {
        return this.a.m().b();
    }

    String m() {
        return this.a.m().c();
    }

    String t() {
        return this.a.m().e();
    }

    c(ExecutorService executorService, uh2 uh2Var, com.google.firebase.installations.remote.c cVar, PersistedInstallation persistedInstallation, h hVar, d04 d04Var, qo6 qo6Var) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = uh2Var;
        this.b = cVar;
        this.c = persistedInstallation;
        this.d = hVar;
        this.e = d04Var;
        this.f = qo6Var;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n);
    }
}
