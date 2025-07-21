package com.nytimes.subauth.ui.purr.privacysettings;

import android.content.Context;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrDataSaleOptOutDirectiveV2;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.directive.PurrPrivacyDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowLimitSensitivePIUiDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import com.nytimes.subauth.ui.purr.ui.screens.PrivacySettingsSnackbarState;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h55;
import defpackage.i36;
import defpackage.qm9;
import defpackage.t98;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class PrivacySettingsViewModel extends q {
    private final NYTUser a;
    private final com.nytimes.android.subauth.core.purr.a b;
    private final t98 c;
    private final PurrDirectiveOverrider d;
    private final MutableSharedFlow e;
    private final h55 f;
    private final CoroutineDispatcher g;
    private final CoroutineDispatcher h;
    private final CoroutineDispatcher i;
    private PrivacyConfiguration j;
    private PrivacyConfiguration k;
    private boolean l;
    private final MutableStateFlow m;
    private final StateFlow n;
    private final MutableStateFlow r;
    private final MutableStateFlow s;
    private final MutableStateFlow t;
    private final MutableStateFlow u;

    @fc1(c = "com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$1", f = "PrivacySettingsViewModel.kt", l = {74}, m = "invokeSuspend")
    /* renamed from: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return PrivacySettingsViewModel.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                PrivacySettingsViewModel privacySettingsViewModel = PrivacySettingsViewModel.this;
                this.label = 1;
                if (privacySettingsViewModel.J(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public PrivacySettingsViewModel(NYTUser nYTUser, com.nytimes.android.subauth.core.purr.a aVar, t98 t98Var, PurrDirectiveOverrider purrDirectiveOverrider, MutableSharedFlow mutableSharedFlow, h55 h55Var, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3) {
        PrivacyConfiguration applyOverrides;
        zq3.h(nYTUser, "nytUser");
        zq3.h(aVar, "purrManager");
        zq3.h(t98Var, "subauthUserUI");
        zq3.h(mutableSharedFlow, "purrErrorFlow");
        zq3.h(h55Var, "networkStatus");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        zq3.h(coroutineDispatcher3, "defaultDispatcher");
        this.a = nYTUser;
        this.b = aVar;
        this.c = t98Var;
        this.d = purrDirectiveOverrider;
        this.e = mutableSharedFlow;
        this.f = h55Var;
        this.g = coroutineDispatcher;
        this.h = coroutineDispatcher2;
        this.i = coroutineDispatcher3;
        PrivacyConfiguration n = aVar.n();
        this.j = n;
        this.k = (purrDirectiveOverrider == null || (applyOverrides = purrDirectiveOverrider.applyOverrides(n)) == null) ? this.j : applyOverrides;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new qm9(false, false, 3, null));
        this.m = MutableStateFlow;
        this.n = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(PrivacySettingsSnackbarState.NONE);
        this.r = MutableStateFlow2;
        this.s = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(new i36(false, false, false, false, false, 31, null));
        this.t = MutableStateFlow3;
        this.u = MutableStateFlow3;
        BuildersKt__Builders_commonKt.launch$default(r.a(this), coroutineDispatcher3, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(Exception exc, by0 by0Var) {
        Object withContext = BuildersKt.withContext(this.h, new PrivacySettingsViewModel$handleCCPAUpdateError$2(this, exc, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(Exception exc) {
        this.r.setValue(PrivacySettingsSnackbarState.ERROR);
        if (exc != null) {
            ul8.a.z("PURR").e(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(PrivacyConfiguration privacyConfiguration, by0 by0Var) {
        PrivacyConfiguration applyOverrides;
        this.j = privacyConfiguration;
        PurrDirectiveOverrider purrDirectiveOverrider = this.d;
        if (purrDirectiveOverrider != null && (applyOverrides = purrDirectiveOverrider.applyOverrides(privacyConfiguration)) != null) {
            privacyConfiguration = applyOverrides;
        }
        this.k = privacyConfiguration;
        this.l = true;
        Object J = J(by0Var);
        return J == kotlin.coroutines.intrinsics.a.h() ? J : ww8.a;
    }

    private final Object I(by0 by0Var) {
        PurrDataSaleOptOutDirectiveV2 v = v();
        boolean z = (v != null ? v.getValue() : null) != DataSaleOptOutDirectiveValueV2.HIDE;
        PurrShowLimitSensitivePIUiDirective z2 = z();
        ToggleableDirectiveValue value = z2 != null ? z2.getValue() : null;
        ToggleableDirectiveValue toggleableDirectiveValue = ToggleableDirectiveValue.SHOW;
        boolean z3 = value == toggleableDirectiveValue;
        PurrShowCaliforniaNoticesUiDirective y = y();
        Object withContext = BuildersKt.withContext(this.h, new PrivacySettingsViewModel$updatePrivacySettingsScreenState$2(this, new i36(z, z3, (y != null ? y.getValue() : null) == toggleableDirectiveValue, this.a.r(), this.b.p()), null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(defpackage.by0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateState$1 r0 = (com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateState$1 r0 = new com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel$updateState$1
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
            goto L56
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$0
            com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel r5 = (com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel) r5
            kotlin.f.b(r6)
            goto L4a
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.I(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.K(r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsViewModel.J(by0):java.lang.Object");
    }

    private final Object K(by0 by0Var) {
        PurrDataSaleOptOutDirectiveV2 v = v();
        Object withContext = BuildersKt.withContext(this.h, new PrivacySettingsViewModel$updateYourPrivacyState$2(this, (v != null ? v.getValue() : null) == DataSaleOptOutDirectiveValueV2.SHOW_OPTED_OUT, !this.a.r(), null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }

    private final PurrDataSaleOptOutDirectiveV2 v() {
        List<PurrPrivacyDirective> directives = this.k.getDirectives();
        ArrayList arrayList = new ArrayList();
        for (Object obj : directives) {
            if (obj instanceof PurrDataSaleOptOutDirectiveV2) {
                arrayList.add(obj);
            }
        }
        return (PurrDataSaleOptOutDirectiveV2) i.m0(arrayList);
    }

    private final PurrShowCaliforniaNoticesUiDirective y() {
        List<PurrPrivacyDirective> directives = this.k.getDirectives();
        ArrayList arrayList = new ArrayList();
        for (Object obj : directives) {
            if (obj instanceof PurrShowCaliforniaNoticesUiDirective) {
                arrayList.add(obj);
            }
        }
        return (PurrShowCaliforniaNoticesUiDirective) i.m0(arrayList);
    }

    private final PurrShowLimitSensitivePIUiDirective z() {
        List<PurrPrivacyDirective> directives = this.k.getDirectives();
        ArrayList arrayList = new ArrayList();
        for (Object obj : directives) {
            if (obj instanceof PurrShowLimitSensitivePIUiDirective) {
                arrayList.add(obj);
            }
        }
        return (PurrShowLimitSensitivePIUiDirective) i.m0(arrayList);
    }

    public final StateFlow A() {
        return this.n;
    }

    public final boolean C() {
        return this.f.a();
    }

    public final void D() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.h, null, new PrivacySettingsViewModel$onSnackbarShown$1(this, null), 2, null);
    }

    public final void E(Context context) {
        zq3.h(context, "context");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PrivacySettingsViewModel$openAccountDelete$1(this, context, null), 3, null);
    }

    public final void F() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.i, null, new PrivacySettingsViewModel$optOutCCPA$1(this, null), 2, null);
    }

    public final boolean t() {
        boolean a = this.f.a();
        if (!a) {
            this.r.setValue(PrivacySettingsSnackbarState.ERROR_DEVICE_OFFLINE);
        }
        return a;
    }

    public final void u() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PrivacySettingsViewModel$checkUserLoginState$1(this, null), 3, null);
    }

    public final MutableStateFlow w() {
        return this.u;
    }

    public final MutableStateFlow x() {
        return this.s;
    }
}
