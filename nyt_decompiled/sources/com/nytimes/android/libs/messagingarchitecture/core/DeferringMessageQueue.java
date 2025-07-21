package com.nytimes.android.libs.messagingarchitecture.core;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.a4;
import defpackage.by0;
import defpackage.ec1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class DeferringMessageQueue implements ec1 {
    private final MessageQueueImpl a;
    private final CompletableDeferred b;

    public DeferringMessageQueue(MessageQueueImpl messageQueueImpl) {
        zq3.h(messageQueueImpl, "delegateQueue");
        this.a = messageQueueImpl;
        this.b = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateMessages$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateMessages$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue r4 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue) r4
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r6 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.CompletableDeferred r4 = r4.b
            ww8 r5 = defpackage.ww8.a
            r4.complete(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue.a(java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.ec1
    public Object b(by0 by0Var) {
        return this.a.b(by0Var);
    }

    @Override // defpackage.xr4
    public Object c(a4 a4Var, by0 by0Var) {
        Object c = this.a.c(a4Var, by0Var);
        return c == a.h() ? c : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.util.List r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateLegacyMessages$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateLegacyMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateLegacyMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateLegacyMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$updateLegacyMessages$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue r4 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue) r4
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r6 = r4.a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.d(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlinx.coroutines.CompletableDeferred r4 = r4.b
            ww8 r5 = defpackage.ww8.a
            r4.complete(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue.d(java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.ec1
    public Object e(by0 by0Var) {
        Object e = this.a.e(by0Var);
        return e == a.h() ? e : ww8.a;
    }

    @Override // defpackage.xr4
    public Object f(by0 by0Var) {
        return this.a.f(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[PHI: r7
      0x0063: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ec1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessagesForUnit$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessagesForUnit$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessagesForUnit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessagesForUnit$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessagesForUnit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue r5 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue) r5
            kotlin.f.b(r7)
            goto L53
        L41:
            kotlin.f.b(r7)
            kotlinx.coroutines.CompletableDeferred r7 = r5.b
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = r5.a
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r7 = r5.g(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue.g(java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.ec1
    public Object h(by0 by0Var) {
        Object h = this.a.h(by0Var);
        return h == a.h() ? h : ww8.a;
    }

    @Override // defpackage.xr4
    public Object i(by0 by0Var) {
        return this.a.i(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[PHI: r6
      0x005a: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0057, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ec1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessages$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getAllMessages$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue r5 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue) r5
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            kotlinx.coroutines.CompletableDeferred r6 = r5.b
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.await(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = r5.a
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r5.j(r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue.j(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c A[PHI: r8
      0x006c: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0069, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r6, com.nytimes.android.libs.messagingarchitecture.model.Message r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getFirstMessageForUnit$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getFirstMessageForUnit$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getFirstMessageForUnit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getFirstMessageForUnit$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue$getFirstMessageForUnit$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            com.nytimes.android.libs.messagingarchitecture.model.Message r7 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue r5 = (com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue) r5
            kotlin.f.b(r8)
            goto L5a
        L46:
            kotlin.f.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = r5.b
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.await(r0)
            if (r8 != r1) goto L5a
            return r1
        L5a:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = r5.a
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r8 = r5.k(r6, r7, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.DeferringMessageQueue.k(java.lang.String, com.nytimes.android.libs.messagingarchitecture.model.Message, by0):java.lang.Object");
    }

    @Override // defpackage.xr4
    public Object l(Message message, by0 by0Var) {
        Object l = this.a.l(message, by0Var);
        return l == a.h() ? l : ww8.a;
    }

    @Override // defpackage.ec1
    public Object m(List list, by0 by0Var) {
        Object m = this.a.m(list, by0Var);
        return m == a.h() ? m : ww8.a;
    }

    @Override // defpackage.xr4
    public Object n(LocalDateTime localDateTime, by0 by0Var) {
        Object n = this.a.n(localDateTime, by0Var);
        return n == a.h() ? n : ww8.a;
    }
}
