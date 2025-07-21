package com.nytimes.android.eventtracker.buffer;

import defpackage.by0;
import defpackage.g32;
import defpackage.md0;
import defpackage.nd0;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DefaultEventBuffer implements g32 {
    private final nd0 a;

    public DefaultEventBuffer(nd0 nd0Var) {
        zq3.h(nd0Var, "bufferedEventDao");
        this.a = nd0Var;
    }

    @Override // defpackage.g32
    public Object a(by0 by0Var) {
        return this.a.a(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.g32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$fetchPendingUpload$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$fetchPendingUpload$1 r0 = (com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$fetchPendingUpload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$fetchPendingUpload$1 r0 = new com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$fetchPendingUpload$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            nd0 r4 = r4.a
            r0.label = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L47
            java.util.List r5 = kotlin.collections.i.l()
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.buffer.DefaultEventBuffer.b(by0):java.lang.Object");
    }

    @Override // defpackage.g32
    public Object c(md0 md0Var, by0 by0Var) {
        md0 a;
        nd0 nd0Var = this.a;
        a = md0Var.a((r22 & 1) != 0 ? md0Var.a : 0L, (r22 & 2) != 0 ? md0Var.b : 0L, (r22 & 4) != 0 ? md0Var.c : System.currentTimeMillis(), (r22 & 8) != 0 ? md0Var.d : null, (r22 & 16) != 0 ? md0Var.e : UploadStatus.UPLOADED, (r22 & 32) != 0 ? md0Var.f : true, (r22 & 64) != 0 ? md0Var.g : null);
        return nd0Var.c(a, by0Var);
    }

    @Override // defpackage.g32
    public Object d(by0 by0Var) {
        return nd0.b.c(this.a, null, null, by0Var, 3, null);
    }

    @Override // defpackage.g32
    public Object e(by0 by0Var) {
        return nd0.b.a(this.a, 0L, by0Var, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.g32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(com.nytimes.android.eventtracker.model.Event r19, com.nytimes.android.eventtracker.buffer.ValidationStatus r20, defpackage.by0 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$captureEvent$1
            if (r2 == 0) goto L17
            r2 = r1
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$captureEvent$1 r2 = (com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$captureEvent$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$captureEvent$1 r2 = new com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$captureEvent$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.h()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r0 = r2.L$0
            md0 r0 = (defpackage.md0) r0
            kotlin.f.b(r1)
            goto L62
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.f.b(r1)
            long r11 = java.lang.System.currentTimeMillis()
            md0 r1 = new md0
            com.nytimes.android.eventtracker.buffer.UploadStatus r14 = com.nytimes.android.eventtracker.buffer.UploadStatus.PENDING
            r15 = 0
            r7 = 0
            r6 = r1
            r9 = r11
            r13 = r20
            r16 = r19
            r6.<init>(r7, r9, r11, r13, r14, r15, r16)
            nd0 r0 = r0.a
            r2.L$0 = r1
            r2.label = r5
            java.lang.Object r0 = r0.e(r1, r2)
            if (r0 != r3) goto L5d
            return r3
        L5d:
            r17 = r1
            r1 = r0
            r0 = r17
        L62:
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            k42 r2 = defpackage.k42.a
            com.nytimes.android.eventtracker.clock.Clock r3 = com.nytimes.android.eventtracker.clock.Clock.a
            com.nytimes.android.eventtracker.model.Timestamp r3 = r3.b()
            r2.b(r3, r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.buffer.DefaultEventBuffer.f(com.nytimes.android.eventtracker.model.Event, com.nytimes.android.eventtracker.buffer.ValidationStatus, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.g32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$containsContextId$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$containsContextId$1 r0 = (com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$containsContextId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$containsContextId$1 r0 = new com.nytimes.android.eventtracker.buffer.DefaultEventBuffer$containsContextId$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            nd0 r4 = r4.a
            r0.label = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.List r6 = (java.util.List) r6
            r4 = 0
            if (r6 == 0) goto L4b
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L4b
            goto L4c
        L4b:
            r3 = r4
        L4c:
            java.lang.Boolean r4 = defpackage.cc0.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.buffer.DefaultEventBuffer.g(java.lang.String, by0):java.lang.Object");
    }
}
