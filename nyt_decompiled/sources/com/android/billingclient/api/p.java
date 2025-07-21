package com.android.billingclient.api;

import defpackage.uma;

/* loaded from: classes2.dex */
public final class p {
    private boolean a;

    /* synthetic */ p(uma umaVar) {
    }

    public final p a() {
        this.a = true;
        return this;
    }

    public final q b() {
        if (this.a) {
            return new q(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
