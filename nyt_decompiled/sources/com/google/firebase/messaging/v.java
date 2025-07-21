package com.google.firebase.messaging;

import android.util.Log;
import defpackage.cy0;
import defpackage.og8;
import defpackage.so;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class v {
    private final Executor a;
    private final Map b = new so();

    interface a {
        og8 start();
    }

    v(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 c(String str, og8 og8Var) {
        synchronized (this) {
            this.b.remove(str);
        }
        return og8Var;
    }

    synchronized og8 b(final String str, a aVar) {
        og8 og8Var = (og8) this.b.get(str);
        if (og8Var != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return og8Var;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        og8 k = aVar.start().k(this.a, new cy0() { // from class: com.google.firebase.messaging.u
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                og8 c;
                c = v.this.c(str, og8Var2);
                return c;
            }
        });
        this.b.put(str, k);
        return k;
    }
}
