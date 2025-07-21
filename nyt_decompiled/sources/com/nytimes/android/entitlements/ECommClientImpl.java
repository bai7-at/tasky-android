package com.nytimes.android.entitlements;

import android.content.Context;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.cd;
import defpackage.cu;
import defpackage.ex1;
import defpackage.f98;
import defpackage.fc1;
import defpackage.j1;
import defpackage.lk6;
import defpackage.o98;
import defpackage.oa4;
import defpackage.ww8;
import defpackage.z58;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.Severity;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxObservableKt;

/* loaded from: classes4.dex */
public final class ECommClientImpl implements a {
    private final Context a;
    private final z58 b;
    private final cd c;
    private final BehaviorSubject d;
    private final PublishSubject e;
    private final String f;
    private final String g;
    private final BehaviorSubject h;
    private final j1 i;
    private final NetworkStatus j;
    private final Resources k;
    private final f98 l;
    private final CoroutineDispatcher m;
    private final CoroutineScope n;
    private final PublishSubject o;

    public ECommClientImpl(ex1 ex1Var) {
        zq3.h(ex1Var, "eCommClientParam");
        this.a = ex1Var.d();
        this.b = ex1Var.j();
        cd a = ex1Var.a();
        this.c = a;
        this.d = ex1Var.c();
        this.e = ex1Var.i();
        BehaviorSubject createDefault = BehaviorSubject.createDefault(Boolean.TRUE);
        zq3.g(createDefault, "createDefault(...)");
        this.h = createDefault;
        this.j = ex1Var.g();
        Resources h = ex1Var.h();
        this.k = h;
        this.l = ex1Var.e();
        this.m = ex1Var.f();
        this.n = ex1Var.b();
        PublishSubject create = PublishSubject.create();
        zq3.g(create, "create(...)");
        this.o = create;
        String string = h.getString(lk6.login_success);
        zq3.g(string, "getString(...)");
        this.f = string;
        String string2 = h.getString(lk6.link_success);
        zq3.g(string2, "getString(...)");
        this.g = string2;
        this.i = a.c("Smart Lock");
        G();
        F();
        E();
    }

    private final void B() {
        NYTLogger.l("SmartLockTask has completed", new Object[0]);
        this.h.onNext(Boolean.TRUE);
    }

    private final void C(Throwable th) {
        this.h.onNext(Boolean.TRUE);
        NYTLogger.i(th, "Error occurred while executing SmartLock", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(o98.b bVar) {
        String b = bVar.b();
        Object a = bVar.a();
        if (a == null) {
            a = "";
        }
        Map<String, ?> n = t.n(new Pair("Auth Backend Error Code", a), new Pair("NYT-S (Full)", b != null ? b : ""));
        if (b != null && h.P(b, "^", false, 2, null)) {
            String Y0 = h.Y0(b, "^", null, 2, null);
            String U0 = h.U0(b, "^", null, 2, null);
            n.put("NYT-S before ^", Y0);
            n.put("SIDNY after ^", U0);
        }
        Embrace.getInstance().logMessage("Force Logout", Severity.ERROR, n);
    }

    private final void E() {
        FlowKt.launchIn(FlowKt.onEach(H(), new ECommClientImpl$subscribeToForcedLogoutChanges$1(this, null)), this.n);
    }

    private final void F() {
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowOn(this.b.E(), this.m), new ECommClientImpl$subscribeToLIREEmailSupportRequests$1(this, null)), this.n);
    }

    private final void G() {
        FlowKt.launchIn(FlowKt.onEach(h(), new ECommClientImpl$subscribeToUserChanges$1(this, null)), this.n);
        FlowKt.launchIn(FlowKt.onEach(e(), new ECommClientImpl$subscribeToUserChanges$2(this, null)), this.n);
    }

    public final z58 A() {
        return this.b;
    }

    public Flow H() {
        return this.b.m();
    }

    @Override // com.nytimes.android.entitlements.a
    public boolean a() {
        return this.b.F();
    }

    @Override // com.nytimes.android.entitlements.a
    public boolean b() {
        return this.b.O();
    }

    @Override // com.nytimes.android.entitlements.a
    public Flow c() {
        final Flow h = h();
        final Flow flow = new Flow() { // from class: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1

            /* renamed from: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2", f = "ECommClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2$1 r0 = (com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2$1 r0 = new com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1$2$1
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
                        com.nytimes.android.subauth.core.api.client.NYTUser$StateChangeType r2 = com.nytimes.android.subauth.core.api.client.NYTUser.StateChangeType.ENTITLEMENTS_CHANGED
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
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
        return new Flow() { // from class: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1

            /* renamed from: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ ECommClientImpl b;

                @fc1(c = "com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2", f = "ECommClientImpl.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ECommClientImpl eCommClientImpl) {
                    this.a = flowCollector;
                    this.b = eCommClientImpl;
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
                        boolean r0 = r6 instanceof com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2$1 r0 = (com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2$1 r0 = new com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1$2$1
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
                        com.nytimes.android.entitlements.ECommClientImpl r4 = r4.b
                        z58 r4 = r4.A()
                        com.nytimes.android.subauth.core.api.client.NYTUser r4 = r4.h()
                        boolean r4 = r4.a()
                        java.lang.Boolean r4 = defpackage.cc0.a(r4)
                        r0.label = r3
                        java.lang.Object r4 = r6.emit(r4, r0)
                        if (r4 != r1) goto L53
                        return r1
                    L53:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.ECommClientImpl$entitlementsChangedFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        };
    }

    @Override // com.nytimes.android.entitlements.a
    public Object d(by0 by0Var) {
        Object d = this.b.d(by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    @Override // com.nytimes.android.entitlements.b
    public Flow e() {
        return this.b.e();
    }

    @Override // com.nytimes.android.entitlements.a
    public boolean f() {
        return this.b.z();
    }

    @Override // com.nytimes.android.entitlements.a
    public String g() {
        return this.b.L();
    }

    @Override // com.nytimes.android.entitlements.a
    public Flow h() {
        return this.b.h().h();
    }

    @Override // com.nytimes.android.entitlements.b
    public boolean i() {
        if (!this.h.hasValue()) {
            return true;
        }
        Boolean bool = (Boolean) this.h.getValue();
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.nytimes.android.entitlements.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(android.content.Context r9, com.nytimes.android.subauth.core.auth.models.RegiInterface r10, defpackage.qs2 r11, defpackage.by0 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.nytimes.android.entitlements.ECommClientImpl$reAuth$1
            if (r0 == 0) goto L14
            r0 = r12
            com.nytimes.android.entitlements.ECommClientImpl$reAuth$1 r0 = (com.nytimes.android.entitlements.ECommClientImpl$reAuth$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.nytimes.android.entitlements.ECommClientImpl$reAuth$1 r0 = new com.nytimes.android.entitlements.ECommClientImpl$reAuth$1
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r8 = r5.L$0
            r11 = r8
            qs2 r11 = (defpackage.qs2) r11
            kotlin.f.b(r12)
            goto L4c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.f.b(r12)
            r5.L$0 = r11
            r5.label = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r12 = com.nytimes.android.entitlements.b.a.a(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L4c
            return r0
        L4c:
            oa4 r12 = (defpackage.oa4) r12
            boolean r8 = r12 instanceof oa4.c
            if (r8 == 0) goto L55
            r11.mo865invoke()
        L55:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.ECommClientImpl.j(android.content.Context, com.nytimes.android.subauth.core.auth.models.RegiInterface, qs2, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.entitlements.a
    public void k(cu cuVar) {
        NYTLogger.l("AssistedLoginStatus " + cuVar, new Object[0]);
        if (cuVar instanceof cu.a) {
            this.h.onNext(Boolean.FALSE);
            return;
        }
        if (cuVar instanceof cu.f) {
            this.e.onNext(this.f);
            this.i.a(((cu.f) cuVar).a());
            B();
            return;
        }
        if (cuVar instanceof cu.g) {
            this.e.onNext(this.f);
            this.i.a(((cu.g) cuVar).a());
            B();
            return;
        }
        if (cuVar instanceof cu.d) {
            cu.d dVar = (cu.d) cuVar;
            this.i.a(dVar.a());
            C(new Exception("Smart lock login failed " + dVar.a()));
            return;
        }
        if (cuVar instanceof cu.e) {
            cu.e eVar = (cu.e) cuVar;
            this.i.a(eVar.a());
            C(new Exception("Smart lock login failed " + eVar.a()));
            return;
        }
        if (cuVar instanceof cu.i) {
            C(new Exception("Smart lock failed to get credentials"));
            NYTLogger.l("Failed to get credentials from SmartLock " + ((cu.i) cuVar).a().d(), new Object[0]);
            return;
        }
        if (zq3.c(cuVar, cu.b.a)) {
            NYTLogger.l("Criteria to execute smart lock has not been met", new Object[0]);
            B();
        } else if (!(cuVar instanceof cu.c)) {
            NYTLogger.g("Unknown handled result type", new Object[0]);
        } else {
            NYTLogger.l("Smart lock cancelled", new Object[0]);
            B();
        }
    }

    @Override // com.nytimes.android.entitlements.a
    public Object l(List list, by0 by0Var) {
        return this.b.l(list, by0Var);
    }

    @Override // com.nytimes.android.entitlements.a
    public boolean m() {
        return this.b.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.nytimes.android.entitlements.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(androidx.fragment.app.f r9, java.lang.String r10, com.nytimes.android.subauth.core.auth.models.RegiInterface r11, java.lang.String r12, defpackage.by0 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.nytimes.android.entitlements.ECommClientImpl$link$1
            if (r0 == 0) goto L14
            r0 = r13
            com.nytimes.android.entitlements.ECommClientImpl$link$1 r0 = (com.nytimes.android.entitlements.ECommClientImpl$link$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.nytimes.android.entitlements.ECommClientImpl$link$1 r0 = new com.nytimes.android.entitlements.ECommClientImpl$link$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r7.L$0
            com.nytimes.android.entitlements.ECommClientImpl r8 = (com.nytimes.android.entitlements.ECommClientImpl) r8
            kotlin.f.b(r13)
            goto L4d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.f.b(r13)
            z58 r1 = r8.b
            com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource r6 = com.nytimes.android.subauth.core.api.listeners.PurchaseLinkSource.RE_LINK_USER_INIT
            r7.L$0 = r8
            r7.label = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r13 = r1.J(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L4d
            return r0
        L4d:
            r9 = r13
            d54 r9 = (defpackage.d54) r9
            boolean r9 = r9 instanceof d54.d
            if (r9 == 0) goto L5b
            io.reactivex.subjects.PublishSubject r9 = r8.e
            java.lang.String r8 = r8.g
            r9.onNext(r8)
        L5b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.entitlements.ECommClientImpl.n(androidx.fragment.app.f, java.lang.String, com.nytimes.android.subauth.core.auth.models.RegiInterface, java.lang.String, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.entitlements.a
    public Set o() {
        return this.b.o();
    }

    @Override // com.nytimes.android.entitlements.a
    public boolean p() {
        return this.b.p();
    }

    @Override // com.nytimes.android.entitlements.b
    public boolean q() {
        return this.b.q();
    }

    @Override // com.nytimes.android.entitlements.b.InterfaceC0262b
    public Observable r() {
        return this.b.r();
    }

    @Override // com.nytimes.android.entitlements.b
    public Object s(Context context, RegiInterface regiInterface, String str, by0 by0Var) {
        return this.b.I(context, false, regiInterface, str, by0Var);
    }

    @Override // com.nytimes.android.entitlements.b
    public BehaviorSubject t() {
        return this.h;
    }

    @Override // com.nytimes.android.entitlements.a
    public String u() {
        return this.b.D();
    }

    @Override // com.nytimes.android.entitlements.b
    public boolean v(oa4 oa4Var) {
        zq3.h(oa4Var, "loginResponse");
        return oa4Var instanceof oa4.c;
    }

    @Override // com.nytimes.android.entitlements.b.InterfaceC0262b
    public Observable w(Context context, RegiInterface regiInterface, String str) {
        zq3.h(context, "context");
        return RxObservableKt.rxObservable$default(null, new ECommClientImpl$loginObservable$1(this, context, regiInterface, str, null), 1, null);
    }

    public final BehaviorSubject z() {
        return this.d;
    }
}
