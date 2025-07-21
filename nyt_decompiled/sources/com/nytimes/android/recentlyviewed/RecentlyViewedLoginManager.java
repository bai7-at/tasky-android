package com.nytimes.android.recentlyviewed;

import com.nytimes.android.entitlements.b;
import defpackage.d44;
import defpackage.e44;
import defpackage.ei1;
import defpackage.k19;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class RecentlyViewedLoginManager implements ei1 {
    public static final a Companion = new a(null);
    private final b a;
    private final k19 b;
    private final CompositeDisposable c;
    private boolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecentlyViewedLoginManager a(d44 d44Var, b bVar, k19 k19Var) {
            zq3.h(d44Var, "host");
            zq3.h(bVar, "signInClient");
            zq3.h(k19Var, "callbackView");
            RecentlyViewedLoginManager recentlyViewedLoginManager = new RecentlyViewedLoginManager(bVar, k19Var);
            d44Var.getLifecycle().a(recentlyViewedLoginManager);
            return recentlyViewedLoginManager;
        }

        private a() {
        }
    }

    public RecentlyViewedLoginManager(b bVar, k19 k19Var) {
        zq3.h(bVar, "ecommClient");
        zq3.h(k19Var, "callbackView");
        this.a = bVar;
        this.b = k19Var;
        this.c = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(boolean z) {
        this.d = z;
        if (z) {
            this.b.a();
        } else {
            this.b.c();
        }
    }

    public final void c() {
        this.c.clear();
    }

    public final void d() {
        i(this.a.q());
    }

    public final boolean e() {
        return this.d;
    }

    public final void f(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(this.a.e(), new RecentlyViewedLoginManager$observeLoginChanges$1(this, null)), new RecentlyViewedLoginManager$observeLoginChanges$2(this, null)), coroutineScope);
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        f(e44.a(d44Var));
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        zq3.h(d44Var, "owner");
        c();
    }
}
