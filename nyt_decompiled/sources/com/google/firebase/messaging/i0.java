package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.l0;
import defpackage.gh4;
import defpackage.me5;
import defpackage.og8;

/* loaded from: classes3.dex */
class i0 extends Binder {
    private final a a;

    interface a {
        og8 a(Intent intent);
    }

    i0(a aVar) {
        this.a = aVar;
    }

    void c(final l0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.a.a(aVar.a).c(new gh4(), new me5() { // from class: com.google.firebase.messaging.h0
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                l0.a.this.d();
            }
        });
    }
}
