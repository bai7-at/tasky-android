package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import defpackage.f1b;
import defpackage.mkf;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class l4 implements Runnable {
    final /* synthetic */ f1b a;
    final /* synthetic */ ServiceConnection b;
    final /* synthetic */ m4 c;

    l4(m4 m4Var, f1b f1bVar, ServiceConnection serviceConnection) {
        this.c = m4Var;
        this.a = f1bVar;
        this.b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle bundle;
        m4 m4Var = this.c;
        n4 n4Var = m4Var.b;
        str = m4Var.a;
        f1b f1bVar = this.a;
        ServiceConnection serviceConnection = this.b;
        n4Var.a.e().c();
        Bundle bundle2 = new Bundle();
        bundle2.putString("package_name", str);
        try {
            bundle = f1bVar.G(bundle2);
        } catch (Exception e) {
            n4Var.a.o().n().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        if (bundle == null) {
            n4Var.a.o().n().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        n4Var.a.e().c();
        a5.s();
        if (bundle != null) {
            long j = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                n4Var.a.o().v().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    n4Var.a.o().n().a("No referrer defined in Install Referrer response");
                } else {
                    n4Var.a.o().u().b("InstallReferrer API result", string);
                    x9 M = n4Var.a.M();
                    Uri parse = Uri.parse("?".concat(string));
                    mkf.b();
                    boolean A = n4Var.a.y().A(null, m3.w0);
                    mkf.b();
                    Bundle s0 = M.s0(parse, A, n4Var.a.y().A(null, m3.z0));
                    if (s0 == null) {
                        n4Var.a.o().n().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = s0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                n4Var.a.o().n().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                s0.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == n4Var.a.E().f.a()) {
                            n4Var.a.o().u().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (n4Var.a.k()) {
                            n4Var.a.E().f.b(j);
                            n4Var.a.o().u().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            s0.putString("_cis", "referrer API v2");
                            n4Var.a.H().t(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", s0, str);
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(n4Var.a.zzau(), serviceConnection);
    }
}
