package com.nytimes.android;

import android.content.Context;
import android.content.Intent;
import defpackage.e83;
import defpackage.nx8;
import defpackage.ul3;
import defpackage.vc0;

/* loaded from: classes2.dex */
abstract class c extends e83 {
    private volatile boolean a = false;
    private final Object b = new Object();

    c() {
    }

    protected void a(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    ((ul3) vc0.a(context)).n((InstallReferrerReceiver) nx8.a(this));
                    this.a = true;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.e83, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        super.onReceive(context, intent);
    }
}
