package com.nytimes.android.fragment.gateway;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.gateway.HasGateway;
import com.nytimes.android.gateway.GatewayFragmentManager;
import com.nytimes.android.logging.NYTLogger;
import defpackage.c44;
import defpackage.d44;
import defpackage.dx2;
import defpackage.ei1;
import defpackage.ex2;
import defpackage.fc;
import defpackage.gw2;
import defpackage.jk;
import defpackage.qq5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class HasGateway implements ei1, dx2 {
    private final GatewayStrategy a;
    private final GatewayFragmentManager b;
    private final ex2 c;
    private final qq5 d;
    private final CompositeDisposable e;
    private boolean f;
    private jk g;
    private gw2 h;
    private final StateFlow i;

    public HasGateway(GatewayStrategy gatewayStrategy, GatewayFragmentManager gatewayFragmentManager, ex2 ex2Var, qq5 qq5Var) {
        zq3.h(gatewayStrategy, "strategy");
        zq3.h(gatewayFragmentManager, "gatewayFragmentManager");
        zq3.h(ex2Var, "bindings");
        zq3.h(qq5Var, "stateManager");
        this.a = gatewayStrategy;
        this.b = gatewayFragmentManager;
        this.c = ex2Var;
        this.d = qq5Var;
        this.e = new CompositeDisposable();
        this.i = gatewayFragmentManager.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HasGateway hasGateway) {
        zq3.h(hasGateway, "this$0");
        gw2 gw2Var = hasGateway.h;
        if (gw2Var != null) {
            gw2Var.R0();
        }
        hasGateway.f = true;
        hasGateway.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void i() {
        if (!this.f || this.b.j()) {
            return;
        }
        this.b.k();
    }

    public final void c(Asset asset, String str) {
        CompositeDisposable compositeDisposable = this.e;
        Completable h = this.a.h(asset, str);
        Action action = new Action() { // from class: z63
            @Override // io.reactivex.functions.Action
            public final void run() {
                HasGateway.d(HasGateway.this);
            }
        };
        final HasGateway$applyPaywall$2 hasGateway$applyPaywall$2 = new ss2() { // from class: com.nytimes.android.fragment.gateway.HasGateway$applyPaywall$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                NYTLogger.s(new Exception("GMAX: error on shouldShowPaywall event", th));
            }
        };
        Disposable subscribe = h.subscribe(action, new Consumer() { // from class: a73
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HasGateway.e(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    public final StateFlow f() {
        return this.i;
    }

    public final int g() {
        return this.d.a();
    }

    public void j(boolean z) {
        this.b.n(z);
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.e.clear();
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        if (d44Var instanceof fc) {
            this.b.l((fc) d44Var);
        }
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onResume(d44Var);
        if (d44Var instanceof fc) {
            this.b.d((fc) d44Var);
        }
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        if (d44Var instanceof jk) {
            jk jkVar = (jk) d44Var;
            this.g = jkVar;
            this.a.o(jkVar.getIntent().getBooleanExtra("com.nytimes.android.extra.METER_OVERRIDE", false));
        }
        if (d44Var instanceof gw2) {
            this.h = (gw2) d44Var;
        }
        this.c.a(this);
        if (this.c instanceof c44) {
            d44Var.getLifecycle().a((c44) this.c);
        }
    }
}
