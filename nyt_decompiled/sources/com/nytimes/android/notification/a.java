package com.nytimes.android.notification;

import defpackage.bl7;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.os3;
import defpackage.s95;

/* loaded from: classes4.dex */
public abstract class a extends os3 implements ix2 {
    private volatile bl7 j;
    private final Object k = new Object();
    private boolean l = false;

    a() {
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return j().generatedComponent();
    }

    public final bl7 j() {
        if (this.j == null) {
            synchronized (this.k) {
                try {
                    if (this.j == null) {
                        this.j = k();
                    }
                } finally {
                }
            }
        }
        return this.j;
    }

    protected bl7 k() {
        return new bl7(this);
    }

    protected void l() {
        if (this.l) {
            return;
        }
        this.l = true;
        ((s95) generatedComponent()).b((NotificationParsingJobService) nx8.a(this));
    }

    @Override // defpackage.os3, android.app.Service
    public void onCreate() {
        l();
        super.onCreate();
    }
}
