package com.nytimes.android.features.settings;

import com.nytimes.android.features.settings.c;
import defpackage.q3;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class AccountSettingsPresenter {
    private final com.nytimes.android.entitlements.a a;
    private final CoroutineDispatcher b;
    private q3 c;
    private CoroutineScope d;
    private final CompositeDisposable e;

    public AccountSettingsPresenter(com.nytimes.android.entitlements.a aVar, CoroutineDispatcher coroutineDispatcher) {
        zq3.h(aVar, "eCommClient");
        zq3.h(coroutineDispatcher, "mainDispatcher");
        this.a = aVar;
        this.b = coroutineDispatcher;
        this.e = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c g() {
        boolean p = this.a.p();
        boolean a = this.a.a();
        return p ? c.d.a : a ? c.C0294c.a : (a || !this.a.q()) ? c.a.a : c.b.a;
    }

    public final void b(q3 q3Var, CoroutineScope coroutineScope) {
        zq3.h(q3Var, "view");
        zq3.h(coroutineScope, "scope");
        this.c = q3Var;
        this.d = coroutineScope;
        f();
        h();
    }

    public final void c() {
        this.e.clear();
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.d = null;
        this.c = null;
    }

    public final CoroutineDispatcher d() {
        return this.b;
    }

    public final q3 e() {
        return this.c;
    }

    public final void f() {
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope != null) {
            FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.a.h(), new AccountSettingsPresenter$listenToNYTUserChange$1$1(this, null)), new AccountSettingsPresenter$listenToNYTUserChange$1$2(null)), coroutineScope);
        }
    }

    public final void h() {
        CoroutineScope coroutineScope = this.d;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSettingsPresenter$setupAccountPreferences$1(this, null), 3, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountSettingsPresenter(com.nytimes.android.entitlements.a aVar) {
        this(aVar, Dispatchers.getMain());
        zq3.h(aVar, "eCommClient");
    }
}
