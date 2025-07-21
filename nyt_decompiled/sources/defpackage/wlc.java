package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes3.dex */
public final class wlc implements GestureDetector.OnGestureListener {
    private final jkc a;
    private final nlc b;

    wlc(jkc jkcVar, nlc nlcVar) {
        this.a = jkcVar;
        this.b = nlcVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:3:0x0001, B:9:0x0008, B:13:0x001c, B:14:0x0064, B:16:0x006c, B:22:0x0030, B:26:0x0044, B:29:0x0057), top: B:2:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            jkc r0 = r5.a     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            if (r0 != 0) goto L8
            goto L79
        L8:
            float r0 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L2a
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L2a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = -1
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 0
            if (r0 <= 0) goto L40
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2c
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            goto L64
        L2a:
            r6 = move-exception
            goto L7b
        L2c:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 >= 0) goto L3e
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 2
            goto L64
        L3e:
            r6 = r1
            goto L64
        L40:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 <= 0) goto L53
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 8
            goto L64
        L53:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3e
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L2a
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L2a
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L2a
            r2 = 4
        L64:
            jkc r7 = r5.a     // Catch: java.lang.Throwable -> L2a
            int r7 = r7.H()     // Catch: java.lang.Throwable -> L2a
            if (r2 != r7) goto L79
            jkc r7 = r5.a     // Catch: java.lang.Throwable -> L2a
            nlc r8 = r5.b     // Catch: java.lang.Throwable -> L2a
            android.widget.FrameLayout r8 = r8.x6()     // Catch: java.lang.Throwable -> L2a
            r7.k(r8, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return r1
        L79:
            monitor-exit(r5)
            return r1
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlc.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
