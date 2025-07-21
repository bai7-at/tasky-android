package com.nytimes.android.fragment.gateway;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.gateway.GatewayFragmentManager;
import com.nytimes.android.logging.NYTLogger;
import defpackage.d44;
import defpackage.dx2;
import defpackage.ei1;
import defpackage.ex2;
import defpackage.jk;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class GatewayBindings implements ex2, ei1 {
    private final GatewayFragmentManager a;
    private jk b;
    private dx2 c;

    public GatewayBindings(GatewayFragmentManager gatewayFragmentManager) {
        zq3.h(gatewayFragmentManager, "gatewayFragmentManager");
        this.a = gatewayFragmentManager;
    }

    @Override // defpackage.ex2
    public void a(dx2 dx2Var) {
        zq3.h(dx2Var, "gatewayToolbarManager");
        this.c = dx2Var;
    }

    @Override // defpackage.ex2
    public void b(Asset asset, String str) {
        if (this.a.j()) {
            NYTLogger.A("Not adding PaywallFragment, paywall already exists", new Object[0]);
            return;
        }
        Fragment f = this.a.f(asset, str);
        jk jkVar = this.b;
        jk jkVar2 = null;
        if (jkVar == null) {
            zq3.z("host");
            jkVar = null;
        }
        if (jkVar.isFinishing()) {
            return;
        }
        GatewayFragmentManager gatewayFragmentManager = this.a;
        jk jkVar3 = this.b;
        if (jkVar3 == null) {
            zq3.z("host");
        } else {
            jkVar2 = jkVar3;
        }
        FragmentManager supportFragmentManager = jkVar2.getSupportFragmentManager();
        zq3.g(supportFragmentManager, "getSupportFragmentManager(...)");
        gatewayFragmentManager.e(f, supportFragmentManager);
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        if (d44Var instanceof jk) {
            this.b = (jk) d44Var;
        }
    }
}
