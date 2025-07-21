package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import defpackage.og8;
import defpackage.qg8;
import defpackage.so;
import defpackage.vg8;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
class e0 {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private final Context a;
    private final o b;
    private final m c;
    private final FirebaseMessaging d;
    private final ScheduledExecutorService f;
    private final c0 h;
    private final Map e = new so();
    private boolean g = false;

    private e0(FirebaseMessaging firebaseMessaging, o oVar, c0 c0Var, m mVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = oVar;
        this.h = c0Var;
        this.c = mVar;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    private static void b(og8 og8Var) {
        try {
            vg8.b(og8Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    private void c(String str) {
        b(this.c.k(this.d.i(), str));
    }

    private void d(String str) {
        b(this.c.l(this.d.i(), str));
    }

    static og8 e(final FirebaseMessaging firebaseMessaging, final o oVar, final m mVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return vg8.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e0 i2;
                i2 = e0.i(context, scheduledExecutorService, firebaseMessaging, oVar, mVar);
                return i2;
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, o oVar, m mVar) {
        return new e0(firebaseMessaging, oVar, c0.a(context, scheduledExecutorService), mVar, context, scheduledExecutorService);
    }

    private void j(b0 b0Var) {
        synchronized (this.e) {
            try {
                String e = b0Var.e();
                if (this.e.containsKey(e)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(e);
                    qg8 qg8Var = (qg8) arrayDeque.poll();
                    if (qg8Var != null) {
                        qg8Var.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.h.b() != null;
    }

    synchronized boolean h() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: IOException -> 0x001f, TryCatch #0 {IOException -> 0x001f, blocks: (B:3:0x0003, B:12:0x0033, B:14:0x0039, B:17:0x0053, B:19:0x0060, B:20:0x007c, B:22:0x0089, B:23:0x0015, B:26:0x0022), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean k(com.google.firebase.messaging.b0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> L1f
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L1f
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L22
            r4 = 85
            if (r3 == r4) goto L15
            goto L2c
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r5
            goto L2d
        L1f:
            r6 = move-exception
            goto La5
        L22:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> L1f
            if (r2 == 0) goto L2c
            r2 = r1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L7c
            if (r2 == r5) goto L53
            boolean r6 = g()     // Catch: java.io.IOException -> L1f
            if (r6 == 0) goto La4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r6.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = "Unknown topic operation"
            r6.append(r2)     // Catch: java.io.IOException -> L1f
            r6.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = "."
            r6.append(r7)     // Catch: java.io.IOException -> L1f
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r6)     // Catch: java.io.IOException -> L1f
            goto La4
        L53:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.d(r2)     // Catch: java.io.IOException -> L1f
            boolean r6 = g()     // Catch: java.io.IOException -> L1f
            if (r6 == 0) goto La4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r6.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = "Unsubscribe from topic: "
            r6.append(r2)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.append(r7)     // Catch: java.io.IOException -> L1f
            r6.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r6)     // Catch: java.io.IOException -> L1f
            goto La4
        L7c:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.c(r2)     // Catch: java.io.IOException -> L1f
            boolean r6 = g()     // Catch: java.io.IOException -> L1f
            if (r6 == 0) goto La4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r6.<init>()     // Catch: java.io.IOException -> L1f
            java.lang.String r2 = "Subscribe to topic: "
            r6.append(r2)     // Catch: java.io.IOException -> L1f
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> L1f
            r6.append(r7)     // Catch: java.io.IOException -> L1f
            r6.append(r3)     // Catch: java.io.IOException -> L1f
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> L1f
            android.util.Log.d(r0, r6)     // Catch: java.io.IOException -> L1f
        La4:
            return r5
        La5:
            java.lang.String r7 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto Lcb
            java.lang.String r7 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r6.getMessage()
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto Lbe
            goto Lcb
        Lbe:
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto Lca
            java.lang.String r6 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r6)
            return r1
        Lca:
            throw r6
        Lcb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Topic operation failed: "
            r7.append(r2)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.k(com.google.firebase.messaging.b0):boolean");
    }

    void l(Runnable runnable, long j) {
        this.f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    synchronized void m(boolean z) {
        this.g = z;
    }

    void o() {
        if (f()) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (g() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.c0 r0 = r2.h     // Catch: java.lang.Throwable -> L17
            com.google.firebase.messaging.b0 r0 = r0.b()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1c
            boolean r0 = g()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L2e
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            r2 = 1
            return r2
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L25
            r2 = 0
            return r2
        L25:
            com.google.firebase.messaging.c0 r1 = r2.h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.e0.p():boolean");
    }

    void q(long j) {
        l(new f0(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), i)), j);
        m(true);
    }
}
