package com.nytimes.android.entitlements.subauth;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.auth.network.response.d;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.b04;
import defpackage.by0;
import defpackage.c05;
import defpackage.fc1;
import defpackage.lk6;
import defpackage.n98;
import defpackage.o98;
import defpackage.q98;
import defpackage.r98;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.rx2.RxConvertKt;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class SubauthUserClientImpl implements n98, n98.b {
    private final Subauth a;
    private final r98 b;
    private final b04 c;
    private final NetworkStatus d;
    private final PublishSubject e;
    private String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public SubauthUserClientImpl(Subauth subauth, r98 r98Var, b04 b04Var, NetworkStatus networkStatus, PublishSubject publishSubject, Resources resources) {
        zq3.h(subauth, "subauth");
        zq3.h(r98Var, "subauthUserUI");
        zq3.h(b04Var, "analyticsSubauthLogger");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(resources, "resources");
        this.a = subauth;
        this.b = r98Var;
        this.c = b04Var;
        this.d = networkStatus;
        this.e = publishSubject;
        this.g = this.f;
        String string = resources.getString(lk6.subauth_offline_error);
        zq3.g(string, "getString(...)");
        this.h = string;
        String string2 = resources.getString(lk6.login_success);
        zq3.g(string2, "getString(...)");
        this.i = string2;
        String string3 = resources.getString(lk6.logout_success);
        zq3.g(string3, "getString(...)");
        this.j = string3;
    }

    private final q98 f() {
        return this.a.f();
    }

    private final o98 o() {
        return this.a.p();
    }

    @Override // defpackage.n98
    public Object A(String str, by0 by0Var) {
        Object f = this.a.h().f("nyt-a", str, by0Var);
        return f == a.h() ? f : ww8.a;
    }

    @Override // defpackage.n98
    public Flow B() {
        return this.a.p().c();
    }

    @Override // defpackage.n98
    public Object C(by0 by0Var) {
        return this.a.h().a("nyt-a", by0Var);
    }

    @Override // defpackage.n98
    public String D() {
        return this.a.i().p();
    }

    @Override // defpackage.n98
    public String G() {
        return c05.b.b(this.a.h(), false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.n98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(android.content.Context r20, boolean r21, com.nytimes.android.subauth.core.auth.models.RegiInterface r22, java.lang.String r23, defpackage.by0 r24) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.I(android.content.Context, boolean, com.nytimes.android.subauth.core.auth.models.RegiInterface, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.n98
    public String L() {
        return this.a.i().d();
    }

    @Override // defpackage.n98
    public d a() {
        return f().a();
    }

    @Override // defpackage.n98
    public Object c(String str, by0 by0Var) {
        Object c = this.a.h().c(str, by0Var);
        return c == a.h() ? c : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.n98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$logout$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$logout$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$logout$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$logout$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl r4 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl) r4
            kotlin.f.b(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            o98 r5 = r4.o()
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = o98.a.e(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L48
            return r1
        L48:
            io.reactivex.subjects.PublishSubject r5 = r4.e
            java.lang.String r4 = r4.j
            r5.onNext(r4)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.d(by0):java.lang.Object");
    }

    @Override // defpackage.n98
    public Flow e() {
        final SharedFlow h = this.a.i().h();
        final Flow flow = new Flow() { // from class: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1

            /* renamed from: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2", f = "SubauthUserClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r6 = (com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType) r6
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.LOGIN_STATUS_CHANGED
                        if (r6 == r2) goto L41
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.LOGIN_STATUS_AND_ENTITLEMENTS_CHANGED
                        if (r6 != r2) goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L4a
                        return r1
                    L4a:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
        return new Flow() { // from class: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ SubauthUserClientImpl b;

                @fc1(c = "com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2", f = "SubauthUserClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, SubauthUserClientImpl subauthUserClientImpl) {
                    this.a = flowCollector;
                    this.b = subauthUserClientImpl;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.a
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r5 = (com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType) r5
                        com.nytimes.android.entitlements.subauth.SubauthUserClientImpl r4 = r4.b
                        com.nytimes.android.subauth.core.api.setup.Subauth r4 = com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.b(r4)
                        com.nytimes.android.subauth.core.api.client.NYTUser r4 = r4.i()
                        boolean r4 = r4.r()
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L53
                        return r1
                    L53:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$userLoginChangedFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // defpackage.n98
    public Object g(by0 by0Var) {
        Object g = o().g(by0Var);
        return g == a.h() ? g : ww8.a;
    }

    @Override // defpackage.n98
    public NYTUser h() {
        return this.a.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookie$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookie$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookie$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookie$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$getMeterServiceCookie$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            kotlin.f.b(r6)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.v(r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r4 = r6
            r6 = r5
            r5 = r4
        L4b:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L54
            java.lang.String r0 = "NYT-S"
            r5.put(r0, r6)
        L54:
            c05$a r6 = defpackage.c05.Companion
            r0 = 0
            java.lang.String r5 = r6.a(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.i(by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.n98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(android.content.Context r10, com.nytimes.android.subauth.core.auth.models.RegiInterface r11, defpackage.qs2 r12, defpackage.by0 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$reAuth$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$reAuth$1 r0 = (com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$reAuth$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$reAuth$1 r0 = new com.nytimes.android.entitlements.subauth.SubauthUserClientImpl$reAuth$1
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r6.L$0
            r12 = r9
            qs2 r12 = (defpackage.qs2) r12
            kotlin.f.b(r13)
            goto L4e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.f.b(r13)
            r6.L$0 = r12
            r6.label = r2
            r3 = 0
            r5 = 0
            r7 = 8
            r8 = 0
            r1 = r9
            r2 = r10
            r4 = r11
            java.lang.Object r13 = n98.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L4e
            return r0
        L4e:
            oa4 r13 = (defpackage.oa4) r13
            boolean r9 = r13 instanceof oa4.c
            if (r9 == 0) goto L57
            r12.mo865invoke()
        L57:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.j(android.content.Context, com.nytimes.android.subauth.core.auth.models.RegiInterface, qs2, by0):java.lang.Object");
    }

    @Override // defpackage.n98
    public Object k(String str, by0 by0Var) {
        Object k = this.a.h().k(str, by0Var);
        return k == a.h() ? k : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b9 -> B:12:0x00bd). Please report as a decompilation issue!!! */
    @Override // defpackage.n98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.util.List r10, defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.subauth.SubauthUserClientImpl.l(java.util.List, by0):java.lang.Object");
    }

    @Override // defpackage.n98
    public Flow m() {
        return o().m();
    }

    @Override // defpackage.n98
    public Object n(by0 by0Var) {
        return this.a.h().d(by0Var);
    }

    @Override // defpackage.n98
    public boolean q() {
        return this.a.i().r();
    }

    @Override // n98.b
    public Observable r() {
        return RxConvertKt.asObservable$default(e(), null, 1, null);
    }

    @Override // n98.b
    public Single u() {
        return RxSingleKt.rxSingle$default(null, new SubauthUserClientImpl$getMeterServiceCookieSingle$1(this, null), 1, null);
    }

    @Override // defpackage.n98
    public Object v(by0 by0Var) {
        return this.a.h().q(by0Var);
    }
}
