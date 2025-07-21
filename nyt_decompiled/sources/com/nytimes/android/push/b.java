package com.nytimes.android.push;

import android.app.IntentService;
import defpackage.bl7;
import defpackage.ix2;
import defpackage.nx8;
import defpackage.xa2;

/* loaded from: classes4.dex */
abstract class b extends IntentService implements ix2 {
    private volatile bl7 a;
    private final Object b;
    private boolean c;

    b(String str) {
        super(str);
        this.b = new Object();
        this.c = false;
    }

    public final bl7 a() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = b();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    protected bl7 b() {
        return new bl7(this);
    }

    protected void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((xa2) generatedComponent()).a((FcmIntentService) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return a().generatedComponent();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        c();
        super.onCreate();
    }
}
