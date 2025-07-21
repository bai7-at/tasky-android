package com.nytimes.android.libs.messagingarchitecture.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4;
import defpackage.b4;
import defpackage.by0;
import defpackage.cb2;
import defpackage.dm8;
import defpackage.ec1;
import defpackage.fc1;
import defpackage.kr4;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr4;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class MessageQueueImpl implements ec1 {
    private final zr4 a;
    private final kr4 b;
    private final b4 c;
    private final MessagePreferencesStore d;
    private final cb2 e;
    private final dm8 f;

    public MessageQueueImpl(zr4 zr4Var, kr4 kr4Var, b4 b4Var, MessagePreferencesStore messagePreferencesStore, cb2 cb2Var, dm8 dm8Var) {
        zq3.h(zr4Var, "messageStorage");
        zq3.h(kr4Var, "messageHistoryStorage");
        zq3.h(b4Var, "actionHistoryDao");
        zq3.h(messagePreferencesStore, "messagePreferences");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(dm8Var, "timeProvider");
        this.a = zr4Var;
        this.b = kr4Var;
        this.c = b4Var;
        this.d = messagePreferencesStore;
        this.e = cb2Var;
        this.f = dm8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.nytimes.android.libs.messagingarchitecture.model.Message r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$isAfterCoolDown$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$isAfterCoolDown$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$isAfterCoolDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$isAfterCoolDown$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$isAfterCoolDown$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            r5 = r4
            com.nytimes.android.libs.messagingarchitecture.model.Message r5 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r5
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r4 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r4
            kotlin.f.b(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.f.b(r6)
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.i(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            org.threeten.bp.LocalDateTime r6 = (org.threeten.bp.LocalDateTime) r6
            if (r6 == 0) goto L64
            if (r5 == 0) goto L64
            dm8 r4 = r4.f
            org.threeten.bp.LocalDateTime r4 = r4.a()
            int r5 = r5.l()
            long r0 = (long) r5
            org.threeten.bp.LocalDateTime r5 = r6.plusHours(r0)
            boolean r4 = r4.isAfter(r5)
            goto L65
        L64:
            r4 = 0
        L65:
            java.lang.Boolean r4 = defpackage.cc0.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.p(com.nytimes.android.libs.messagingarchitecture.model.Message, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateMessages$1
            if (r0 == 0) goto L14
            r0 = r9
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateMessages$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.f.b(r9)
            goto L69
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r4.L$1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r4.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r7 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r7
            kotlin.f.b(r9)
            goto L55
        L43:
            kotlin.f.b(r9)
            zr4 r9 = r7.a
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r3
            java.lang.Object r9 = r9.b(r4)
            if (r9 != r0) goto L55
            return r0
        L55:
            zr4 r1 = r7.a
            r7 = 0
            r4.L$0 = r7
            r4.L$1 = r7
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r7 = zr4.a.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.a(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a0 -> B:11:0x00a2). Please report as a decompilation issue!!! */
    @Override // defpackage.ec1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getMessagesHistory$1
            if (r0 == 0) goto L13
            r0 = r10
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getMessagesHistory$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getMessagesHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getMessagesHistory$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getMessagesHistory$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L54
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r9 = r0.L$5
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r2 = r0.L$4
            pg0 r2 = (defpackage.pg0) r2
            java.lang.Object r4 = r0.L$3
            pg0 r4 = (defpackage.pg0) r4
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r7 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r7
            kotlin.f.b(r10)
            goto La2
        L44:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4c:
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r9 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r9
            kotlin.f.b(r10)
            goto L64
        L54:
            kotlin.f.b(r10)
            kr4 r10 = r9.b
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L64
            return r1
        L64:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.i.w(r10, r4)
            r2.<init>(r4)
            java.util.Iterator r10 = r10.iterator()
            r7 = r9
            r5 = r10
            r9 = r2
        L78:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lb2
            java.lang.Object r10 = r5.next()
            r2 = r10
            pg0 r2 = (defpackage.pg0) r2
            zr4 r10 = r7.a
            java.lang.String r4 = r2.c()
            r0.L$0 = r7
            r0.L$1 = r9
            r0.L$2 = r5
            r0.L$3 = r2
            r0.L$4 = r2
            r0.L$5 = r9
            r0.label = r3
            java.lang.Object r10 = r10.c(r4, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            r6 = r9
            r4 = r2
        La2:
            com.nytimes.android.libs.messagingarchitecture.model.Message r10 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r10
            org.threeten.bp.LocalDateTime r4 = r4.d()
            lr4 r8 = new lr4
            r8.<init>(r2, r10, r4)
            r9.add(r8)
            r9 = r6
            goto L78
        Lb2:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.b(by0):java.lang.Object");
    }

    @Override // defpackage.xr4
    public Object c(a4 a4Var, by0 by0Var) {
        Object c = this.c.c(a4Var, by0Var);
        return c == a.h() ? c : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.util.List r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateLegacyMessages$1
            if (r0 == 0) goto L14
            r0 = r9
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateLegacyMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateLegacyMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateLegacyMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$updateLegacyMessages$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.f.b(r9)
            goto L69
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r4.L$1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r4.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r7 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r7
            kotlin.f.b(r9)
        L42:
            r3 = r8
            goto L56
        L44:
            kotlin.f.b(r9)
            zr4 r9 = r7.a
            r4.L$0 = r7
            r4.L$1 = r8
            r4.label = r3
            java.lang.Object r9 = r9.b(r4)
            if (r9 != r0) goto L42
            return r0
        L56:
            zr4 r1 = r7.a
            r7 = 0
            r4.L$0 = r7
            r4.L$1 = r7
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r7 = zr4.a.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.d(java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.ec1
    public Object e(by0 by0Var) {
        Object b = this.c.b(by0Var);
        return b == a.h() ? b : ww8.a;
    }

    @Override // defpackage.xr4
    public Object f(by0 by0Var) {
        return this.c.a(by0Var);
    }

    @Override // defpackage.ec1
    public Object g(String str, by0 by0Var) {
        return this.a.e(str, by0Var);
    }

    @Override // defpackage.ec1
    public Object h(by0 by0Var) {
        Object b = this.b.b(by0Var);
        return b == a.h() ? b : ww8.a;
    }

    @Override // defpackage.xr4
    public Object i(by0 by0Var) {
        final Flow f = this.d.f();
        return FlowKt.firstOrNull(new Flow() { // from class: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1

            /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2", f = "MessageQueueImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        is4 r5 = (defpackage.is4) r5
                        org.threeten.bp.LocalDateTime r5 = r5.a()
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L45
                        return r1
                    L45:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getLastMessageDateTime$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var2);
                return collect == a.h() ? collect : ww8.a;
            }
        }, by0Var);
    }

    @Override // defpackage.ec1
    public Object j(by0 by0Var) {
        return this.a.a(by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r6, com.nytimes.android.libs.messagingarchitecture.model.Message r7, defpackage.by0 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getFirstMessageForUnit$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getFirstMessageForUnit$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getFirstMessageForUnit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getFirstMessageForUnit$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$getFirstMessageForUnit$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.model.Message r5 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r5
            kotlin.f.b(r8)
            goto L6d
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r5
            kotlin.f.b(r8)
            goto L50
        L40:
            kotlin.f.b(r8)
            if (r7 != 0) goto L59
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r5.g(r6, r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r6 = kotlin.collections.i.m0(r8)
            r7 = r6
            com.nytimes.android.libs.messagingarchitecture.model.Message r7 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r7
        L59:
            cb2 r6 = r5.e
            boolean r6 = r6.a()
            if (r6 != 0) goto L79
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r5.p(r7, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r5 = r7
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L77
            r7 = r5
            goto L79
        L77:
            r5 = 0
            goto L7a
        L79:
            r5 = r7
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.k(java.lang.String, com.nytimes.android.libs.messagingarchitecture.model.Message, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(com.nytimes.android.libs.messagingarchitecture.model.Message r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$markMessageAsSeen$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$markMessageAsSeen$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$markMessageAsSeen$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$markMessageAsSeen$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$markMessageAsSeen$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L66
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r5
            kotlin.f.b(r7)
            goto L54
        L3c:
            kotlin.f.b(r7)
            cb2 r7 = r5.e
            boolean r7 = r7.I()
            if (r7 == 0) goto L69
            kr4 r7 = r5.b
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            dm8 r6 = r5.f
            org.threeten.bp.LocalDateTime r6 = r6.a()
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = r5.n(r6, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            ww8 r5 = defpackage.ww8.a
            return r5
        L69:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.l(com.nytimes.android.libs.messagingarchitecture.model.Message, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ec1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.util.List r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$overrideMessages$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$overrideMessages$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$overrideMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$overrideMessages$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl$overrideMessages$1
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
            goto L61
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl r5 = (com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl) r5
            kotlin.f.b(r7)
            goto L53
        L41:
            kotlin.f.b(r7)
            com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore r7 = r5.d
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessageQueueImpl.m(java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.xr4
    public Object n(LocalDateTime localDateTime, by0 by0Var) {
        Object g = this.d.g(localDateTime, by0Var);
        return g == a.h() ? g : ww8.a;
    }
}
