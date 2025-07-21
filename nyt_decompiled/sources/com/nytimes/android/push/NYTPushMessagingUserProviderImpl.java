package com.nytimes.android.push;

import android.app.Application;
import com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import defpackage.a15;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class NYTPushMessagingUserProviderImpl implements a15 {
    private final Application a;
    private final Subauth b;
    private final CoroutineScope c;
    private final MutableSharedFlow d;
    private NYTPushMessagingUser e;

    @fc1(c = "com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1", f = "NYTPushMessagingUserProviderImpl.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        /* renamed from: com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1, reason: invalid class name and collision with other inner class name */
        static final class C03761 implements FlowCollector {
            final /* synthetic */ NYTPushMessagingUserProviderImpl a;

            C03761(NYTPushMessagingUserProviderImpl nYTPushMessagingUserProviderImpl) {
                this.a = nYTPushMessagingUserProviderImpl;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType r6, defpackage.by0 r7) {
                /*
                    r5 = this;
                    boolean r6 = r7 instanceof com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1$emit$1
                    if (r6 == 0) goto L13
                    r6 = r7
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1$emit$1 r6 = (com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1$emit$1) r6
                    int r0 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r6.label = r0
                    goto L18
                L13:
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1$emit$1 r6 = new com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1$emit$1
                    r6.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r6.result
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L40
                    if (r1 == r3) goto L34
                    if (r1 != r2) goto L2c
                    kotlin.f.b(r7)
                    goto L75
                L2c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L34:
                    java.lang.Object r5 = r6.L$1
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl r5 = (com.nytimes.android.push.NYTPushMessagingUserProviderImpl) r5
                    java.lang.Object r1 = r6.L$0
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl$1$1 r1 = (com.nytimes.android.push.NYTPushMessagingUserProviderImpl.AnonymousClass1.C03761) r1
                    kotlin.f.b(r7)
                    goto L56
                L40:
                    kotlin.f.b(r7)
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl r7 = r5.a
                    r6.L$0 = r5
                    r6.L$1 = r7
                    r6.label = r3
                    java.lang.Object r1 = com.nytimes.android.push.NYTPushMessagingUserProviderImpl.c(r7, r6)
                    if (r1 != r0) goto L52
                    return r0
                L52:
                    r4 = r1
                    r1 = r5
                    r5 = r7
                    r7 = r4
                L56:
                    com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser r7 = (com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser) r7
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl.f(r5, r7)
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl r5 = r1.a
                    kotlinx.coroutines.flow.MutableSharedFlow r5 = com.nytimes.android.push.NYTPushMessagingUserProviderImpl.e(r5)
                    com.nytimes.android.push.NYTPushMessagingUserProviderImpl r7 = r1.a
                    com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser r7 = com.nytimes.android.push.NYTPushMessagingUserProviderImpl.b(r7)
                    r1 = 0
                    r6.L$0 = r1
                    r6.L$1 = r1
                    r6.label = r2
                    java.lang.Object r5 = r5.emit(r7, r6)
                    if (r5 != r0) goto L75
                    return r0
                L75:
                    ww8 r5 = defpackage.ww8.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.NYTPushMessagingUserProviderImpl.AnonymousClass1.C03761.emit(com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType, by0):java.lang.Object");
            }
        }

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return NYTPushMessagingUserProviderImpl.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                SharedFlow h2 = NYTPushMessagingUserProviderImpl.this.b.i().h();
                C03761 c03761 = new C03761(NYTPushMessagingUserProviderImpl.this);
                this.label = 1;
                if (h2.collect(c03761, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.push.NYTPushMessagingUserProviderImpl$2", f = "NYTPushMessagingUserProviderImpl.kt", l = {41, 42}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.push.NYTPushMessagingUserProviderImpl$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return NYTPushMessagingUserProviderImpl.this.new AnonymousClass2(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NYTPushMessagingUserProviderImpl nYTPushMessagingUserProviderImpl;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                nYTPushMessagingUserProviderImpl = NYTPushMessagingUserProviderImpl.this;
                this.L$0 = nYTPushMessagingUserProviderImpl;
                this.label = 1;
                obj = nYTPushMessagingUserProviderImpl.g(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return ww8.a;
                }
                nYTPushMessagingUserProviderImpl = (NYTPushMessagingUserProviderImpl) this.L$0;
                f.b(obj);
            }
            nYTPushMessagingUserProviderImpl.e = (NYTPushMessagingUser) obj;
            MutableSharedFlow mutableSharedFlow = NYTPushMessagingUserProviderImpl.this.d;
            NYTPushMessagingUser nYTPushMessagingUser = NYTPushMessagingUserProviderImpl.this.e;
            this.L$0 = null;
            this.label = 2;
            if (mutableSharedFlow.emit(nYTPushMessagingUser, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public NYTPushMessagingUserProviderImpl(Application application, Subauth subauth) {
        zq3.h(application, "app");
        zq3.h(subauth, "subauth");
        this.a = application;
        this.b = subauth;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        this.c = CoroutineScope;
        this.d = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.e = new NYTPushMessagingUser(null, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.push.NYTPushMessagingUserProviderImpl$getCurrentUser$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.push.NYTPushMessagingUserProviderImpl$getCurrentUser$1 r0 = (com.nytimes.android.push.NYTPushMessagingUserProviderImpl$getCurrentUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.push.NYTPushMessagingUserProviderImpl$getCurrentUser$1 r0 = new com.nytimes.android.push.NYTPushMessagingUserProviderImpl$getCurrentUser$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r7 = r0.I$0
            java.lang.Object r1 = r0.L$1
            okhttp3.Cookie r1 = (okhttp3.Cookie) r1
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser$a r0 = (com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser.a) r0
            kotlin.f.b(r8)
            goto Lb7
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$1
            com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser$a r7 = (com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser.a) r7
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.push.NYTPushMessagingUserProviderImpl r2 = (com.nytimes.android.push.NYTPushMessagingUserProviderImpl) r2
            kotlin.f.b(r8)
            r6 = r2
            r2 = r7
            r7 = r6
            goto L69
        L4e:
            kotlin.f.b(r8)
            com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser$a r8 = com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser.Companion
            com.nytimes.android.subauth.core.api.setup.Subauth r2 = r7.b
            c05 r2 = r2.h()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.q(r0)
            if (r2 != r1) goto L66
            return r1
        L66:
            r6 = r2
            r2 = r8
            r8 = r6
        L69:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L8d
            okhttp3.Cookie$Builder r4 = new okhttp3.Cookie$Builder
            r4.<init>()
            java.lang.String r5 = "NYT-S"
            okhttp3.Cookie$Builder r4 = r4.name(r5)
            okhttp3.Cookie$Builder r8 = r4.value(r8)
            java.lang.String r4 = "nytimes.com"
            okhttp3.Cookie$Builder r8 = r8.domain(r4)
            java.lang.String r4 = "/"
            okhttp3.Cookie$Builder r8 = r8.path(r4)
            okhttp3.Cookie r8 = r8.build()
            goto L8e
        L8d:
            r8 = 0
        L8e:
            com.nytimes.android.subauth.core.api.setup.Subauth r4 = r7.b
            com.nytimes.android.subauth.core.api.client.NYTUser r4 = r4.i()
            java.lang.String r4 = r4.p()
            if (r4 == 0) goto L9f
            int r4 = java.lang.Integer.parseInt(r4)
            goto La0
        L9f:
            r4 = 0
        La0:
            com.nytimes.android.utils.AnalyticsTrackingIdRetriever r5 = com.nytimes.android.utils.AnalyticsTrackingIdRetriever.a
            android.app.Application r7 = r7.a
            r0.L$0 = r2
            r0.L$1 = r8
            r0.I$0 = r4
            r0.label = r3
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto Lb3
            return r1
        Lb3:
            r1 = r8
            r0 = r2
            r8 = r7
            r7 = r4
        Lb7:
            java.lang.String r8 = (java.lang.String) r8
            com.nytimes.android.internal.pushmessaging.model.NYTPushMessagingUser r7 = r0.a(r1, r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.push.NYTPushMessagingUserProviderImpl.g(by0):java.lang.Object");
    }

    @Override // defpackage.a15
    public Flow a() {
        return FlowKt.distinctUntilChanged(this.d);
    }
}
