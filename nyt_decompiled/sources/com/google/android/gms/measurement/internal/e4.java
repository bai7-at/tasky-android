package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class e4 extends BroadcastReceiver {
    private final r9 a;
    private boolean b;
    private boolean c;

    e4(r9 r9Var) {
        Preconditions.checkNotNull(r9Var);
        this.a = r9Var;
    }

    public final void b() {
        this.a.b();
        this.a.e().c();
        if (this.b) {
            return;
        }
        this.a.zzau().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.W().i();
        this.a.o().u().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void c() {
        this.a.b();
        this.a.e().c();
        this.a.e().c();
        if (this.b) {
            this.a.o().u().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.zzau().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.o().n().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b();
        String action = intent.getAction();
        this.a.o().u().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.a.o().v().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean i = this.a.W().i();
        if (this.c != i) {
            this.c = i;
            this.a.e().y(new d4(this, i));
        }
    }
}
