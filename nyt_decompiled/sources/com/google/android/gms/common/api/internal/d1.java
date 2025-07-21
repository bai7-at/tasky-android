package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class d1 implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ zzd c;

    d1(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = zzdVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.c;
        i = zzdVar.zzc;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            bundle = zzdVar.zzd;
            if (bundle != null) {
                bundle3 = zzdVar.zzd;
                bundle2 = bundle3.getBundle(this.b);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.c.zzc;
        if (i2 >= 2) {
            this.a.onStart();
        }
        i3 = this.c.zzc;
        if (i3 >= 3) {
            this.a.onResume();
        }
        i4 = this.c.zzc;
        if (i4 >= 4) {
            this.a.onStop();
        }
        i5 = this.c.zzc;
        if (i5 >= 5) {
            this.a.onDestroy();
        }
    }
}
