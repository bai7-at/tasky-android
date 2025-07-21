package com.nytimes.android.assetretriever;

import defpackage.bl7;
import defpackage.ft;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.os3;

/* loaded from: classes.dex */
abstract class m extends os3 implements ix2 {
    private volatile bl7 j;
    private final Object k = new Object();
    private boolean l = false;

    m() {
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
        ((ft) generatedComponent()).c((AssetRetrieverJobIntentService) nx8.a(this));
    }

    @Override // defpackage.os3, android.app.Service
    public void onCreate() {
        l();
        super.onCreate();
    }
}
