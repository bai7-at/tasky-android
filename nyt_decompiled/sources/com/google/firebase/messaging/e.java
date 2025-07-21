package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.e;
import defpackage.cy0;
import defpackage.gh4;
import defpackage.og8;
import defpackage.vg8;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class e {
    private static final Object c = new Object();
    private static l0 d;
    private final Context a;
    private final Executor b = new gh4();

    public e(Context context) {
        this.a = context;
    }

    private static og8 e(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return f(context, "com.google.firebase.MESSAGING_EVENT").c(intent).i(new gh4(), new cy0() { // from class: ta2
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                Integer g;
                g = e.g(og8Var);
                return g;
            }
        });
    }

    private static l0 f(Context context, String str) {
        l0 l0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new l0(context, str);
                }
                l0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(og8 og8Var) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(w.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(og8 og8Var) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ og8 j(Context context, Intent intent, og8 og8Var) {
        return (PlatformVersion.isAtLeastO() && ((Integer) og8Var.m()).intValue() == 402) ? e(context, intent).i(new gh4(), new cy0() { // from class: sa2
            @Override // defpackage.cy0
            public final Object then(og8 og8Var2) {
                Integer i;
                i = e.i(og8Var2);
                return i;
            }
        }) : og8Var;
    }

    public og8 k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.a, intent);
    }

    public og8 l(final Context context, final Intent intent) {
        return (!(PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) || ((intent.getFlags() & 268435456) != 0)) ? vg8.c(this.b, new Callable() { // from class: qa2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h;
                h = e.h(context, intent);
                return h;
            }
        }).k(this.b, new cy0() { // from class: ra2
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                og8 j;
                j = e.j(context, intent, og8Var);
                return j;
            }
        }) : e(context, intent);
    }
}
