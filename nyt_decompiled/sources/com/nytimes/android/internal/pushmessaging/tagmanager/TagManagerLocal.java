package com.nytimes.android.internal.pushmessaging.tagmanager;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import defpackage.by0;
import defpackage.fc1;
import defpackage.vf8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public class TagManagerLocal implements vf8 {
    private final PushMessaging.c a;
    private final PushMessagingDao b;

    public TagManagerLocal(PushMessaging.c cVar, PushMessagingDao pushMessagingDao) {
        zq3.h(cVar, "settings");
        zq3.h(pushMessagingDao, "pushMessagingDao");
        this.a = cVar;
        this.b = pushMessagingDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal r4, defpackage.by0 r5) {
        /*
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$isReady$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$isReady$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$isReady$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$isReady$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$isReady$1
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
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r4 = r4.b
            r0.label = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            if (r4 <= 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r4 = defpackage.cc0.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal.d(com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$1
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
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal r5 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal) r5
            kotlin.f.b(r6)
            goto L4a
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            com.nytimes.android.internal.pushmessaging.tagmanager.a$b r5 = com.nytimes.android.internal.pushmessaging.tagmanager.a.b.a
            goto L75
        L55:
            com.nytimes.android.internal.pushmessaging.PushMessaging$c r6 = r5.a
            java.util.Set r6 = r6.e()
            if (r6 == 0) goto L76
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = kotlin.collections.i.X0(r6)
            if (r6 == 0) goto L76
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r5 = r5.b
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r5 = r5.g(r6, r0)
            if (r5 != r1) goto L73
            return r1
        L73:
            com.nytimes.android.internal.pushmessaging.tagmanager.a$c r5 = com.nytimes.android.internal.pushmessaging.tagmanager.a.c.a
        L75:
            return r5
        L76:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1 r6 = new defpackage.qs2() { // from class: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1
                static {
                    /*
                        com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1) com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1.a com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1.<init>():void");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ java.lang.Object mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = r0.mo865invoke()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1.mo865invoke():java.lang.Object");
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final java.lang.String mo865invoke() {
                    /*
                        r0 = this;
                        java.lang.String r0 = "Settings is missing tags"
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$refreshTagMetadata$tagList$1.mo865invoke():java.lang.String");
                }
            }
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal.e(com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal, by0):java.lang.Object");
    }

    @Override // defpackage.vf8
    public Flow a() {
        final Flow e = this.b.e();
        return new Flow() { // from class: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1

            /* renamed from: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2", f = "TagManagerLocal.kt", l = {223}, m = "emit")
                /* renamed from: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.Set r5 = kotlin.collections.i.c1(r5)
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L47
                        return r1
                    L47:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal$getTagMetadata$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // defpackage.vf8
    public Object b(by0 by0Var) {
        return e(this, by0Var);
    }

    public Object c(by0 by0Var) {
        return d(this, by0Var);
    }
}
