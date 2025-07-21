package com.dropbox.android.external.store4.impl;

import defpackage.gt2;
import defpackage.it2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes2.dex */
public final class RefCountedResource {
    private final gt2 a;
    private final it2 b;
    private final Map c;
    private final Mutex d;

    public RefCountedResource(gt2 gt2Var, it2 it2Var) {
        zq3.h(gt2Var, "create");
        this.a = gt2Var;
        this.b = it2Var;
        this.c = new LinkedHashMap();
        this.d = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:27:0x006c, B:29:0x0074), top: B:26:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, defpackage.by0 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.dropbox.android.external.store4.impl.RefCountedResource$acquire$1
            if (r0 == 0) goto L13
            r0 = r14
            com.dropbox.android.external.store4.impl.RefCountedResource$acquire$1 r0 = (com.dropbox.android.external.store4.impl.RefCountedResource$acquire$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.dropbox.android.external.store4.impl.RefCountedResource$acquire$1 r0 = new com.dropbox.android.external.store4.impl.RefCountedResource$acquire$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L58
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r12 = r0.L$3
            com.dropbox.android.external.store4.impl.RefCountedResource r12 = (com.dropbox.android.external.store4.impl.RefCountedResource) r12
            java.lang.Object r13 = r0.L$2
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.L$0
            kotlin.f.b(r14)     // Catch: java.lang.Throwable -> L3d
            r7 = r12
            r8 = r14
            goto L8c
        L3d:
            r12 = move-exception
            goto Lb3
        L40:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L48:
            java.lang.Object r12 = r0.L$2
            kotlinx.coroutines.sync.Mutex r12 = (kotlinx.coroutines.sync.Mutex) r12
            java.lang.Object r13 = r0.L$1
            java.lang.Object r2 = r0.L$0
            com.dropbox.android.external.store4.impl.RefCountedResource r2 = (com.dropbox.android.external.store4.impl.RefCountedResource) r2
            kotlin.f.b(r14)
            r14 = r12
            r12 = r2
            goto L6c
        L58:
            kotlin.f.b(r14)
            kotlinx.coroutines.sync.Mutex r14 = r12.d
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r14
            r0.label = r4
            java.lang.Object r2 = r14.lock(r5, r0)
            if (r2 != r1) goto L6c
            return r1
        L6c:
            java.util.Map r2 = r12.c     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r6 = r2.get(r13)     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L9d
            gt2 r6 = r12.a     // Catch: java.lang.Throwable -> L9a
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r14     // Catch: java.lang.Throwable -> L9a
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L9a
            r0.L$3 = r12     // Catch: java.lang.Throwable -> L9a
            r0.label = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = r6.invoke(r13, r0)     // Catch: java.lang.Throwable -> L9a
            if (r0 != r1) goto L87
            return r1
        L87:
            r7 = r12
            r1 = r14
            r8 = r0
            r0 = r13
            r13 = r2
        L8c:
            com.dropbox.android.external.store4.impl.RefCountedResource$a r12 = new com.dropbox.android.external.store4.impl.RefCountedResource$a     // Catch: java.lang.Throwable -> L3d
            r9 = 0
            r10 = 2
            r11 = 0
            r6 = r12
            r6.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3d
            r13.put(r0, r12)     // Catch: java.lang.Throwable -> L3d
            r6 = r12
            goto L9e
        L9a:
            r12 = move-exception
            r1 = r14
            goto Lb3
        L9d:
            r1 = r14
        L9e:
            r12 = r6
            com.dropbox.android.external.store4.impl.RefCountedResource$a r12 = (com.dropbox.android.external.store4.impl.RefCountedResource.a) r12     // Catch: java.lang.Throwable -> L3d
            int r13 = r12.a()     // Catch: java.lang.Throwable -> L3d
            int r13 = r13 + r4
            r12.c(r13)     // Catch: java.lang.Throwable -> L3d
            com.dropbox.android.external.store4.impl.RefCountedResource$a r6 = (com.dropbox.android.external.store4.impl.RefCountedResource.a) r6     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r12 = r6.b()     // Catch: java.lang.Throwable -> L3d
            r1.unlock(r5)
            return r12
        Lb3:
            r1.unlock(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.RefCountedResource.a(java.lang.Object, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x006f, B:31:0x007d, B:33:0x008c, B:36:0x0096, B:40:0x00b0, B:41:0x00cf), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x006f, B:31:0x007d, B:33:0x008c, B:36:0x0096, B:40:0x00b0, B:41:0x00cf), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8, java.lang.Object r9, defpackage.by0 r10) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.android.external.store4.impl.RefCountedResource.b(java.lang.Object, java.lang.Object, by0):java.lang.Object");
    }

    private final class a {
        private final Object a;
        private int b;

        public a(RefCountedResource refCountedResource, Object obj, int i) {
            zq3.h(refCountedResource, "this$0");
            RefCountedResource.this = refCountedResource;
            this.a = obj;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final Object b() {
            return this.a;
        }

        public final void c(int i) {
            this.b = i;
        }

        public /* synthetic */ a(Object obj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(RefCountedResource.this, obj, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public /* synthetic */ RefCountedResource(gt2 gt2Var, it2 it2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gt2Var, (i & 2) != 0 ? null : it2Var);
    }
}
