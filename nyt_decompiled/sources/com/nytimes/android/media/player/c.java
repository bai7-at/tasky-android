package com.nytimes.android.media.player;

import defpackage.bl7;
import defpackage.co4;
import defpackage.ix2;
import defpackage.nh4;
import defpackage.nx8;

/* loaded from: classes4.dex */
abstract class c extends nh4 implements ix2 {
    private volatile bl7 i;
    private final Object j = new Object();
    private boolean k = false;

    c() {
    }

    protected void A() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((co4) generatedComponent()).d((MediaService) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return y().generatedComponent();
    }

    @Override // defpackage.nh4, android.app.Service
    public void onCreate() {
        A();
        super.onCreate();
    }

    public final bl7 y() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = z();
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    protected bl7 z() {
        return new bl7(this);
    }
}
