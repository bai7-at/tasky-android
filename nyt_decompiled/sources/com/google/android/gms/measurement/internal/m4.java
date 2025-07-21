package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.a0b;
import defpackage.f1b;

/* loaded from: classes3.dex */
public final class m4 implements ServiceConnection {
    private final String a;
    final /* synthetic */ n4 b;

    m4(n4 n4Var, String str) {
        this.b = n4Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.o().v().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            f1b Q1 = a0b.Q1(iBinder);
            if (Q1 == null) {
                this.b.a.o().v().a("Install Referrer Service implementation was not found");
            } else {
                this.b.a.o().u().a("Install Referrer Service connected");
                this.b.a.e().y(new l4(this, Q1, this));
            }
        } catch (RuntimeException e) {
            this.b.a.o().v().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.o().u().a("Install Referrer Service disconnected");
    }
}
