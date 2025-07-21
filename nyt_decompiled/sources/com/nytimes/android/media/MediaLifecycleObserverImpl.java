package com.nytimes.android.media;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import defpackage.bo4;
import defpackage.bp0;
import defpackage.d44;
import defpackage.ei1;
import defpackage.hb5;
import defpackage.oi4;
import defpackage.z4;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class MediaLifecycleObserverImpl implements oi4 {
    private final Activity a;
    private final hb5 b;
    private final bo4 c;
    private final z4 d;
    private final bp0 e;

    public MediaLifecycleObserverImpl(Activity activity, hb5 hb5Var, bo4 bo4Var, z4 z4Var, bp0 bp0Var) {
        zq3.h(activity, "activity");
        zq3.h(hb5Var, "mediaControl");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(z4Var, "activityMediaManager");
        zq3.h(bp0Var, "comScoreWrapper");
        this.a = activity;
        this.b = hb5Var;
        this.c = bo4Var;
        this.d = z4Var;
        this.e = bp0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        Bundle extras;
        return this.a.isFinishing() && (extras = this.a.getIntent().getExtras()) != null && extras.containsKey("com.nytimes.android.extra.VIDEO_FROM_INLINE");
    }

    @Override // defpackage.oi4
    public void a(Lifecycle lifecycle) {
        zq3.h(lifecycle, "lifecycle");
        lifecycle.a(new ei1() { // from class: com.nytimes.android.media.MediaLifecycleObserverImpl$observe$1
            @Override // defpackage.ei1
            public void onDestroy(d44 d44Var) {
                bo4 bo4Var;
                zq3.h(d44Var, "owner");
                bo4Var = MediaLifecycleObserverImpl.this.c;
                bo4Var.i();
            }

            @Override // defpackage.ei1
            public void onPause(d44 d44Var) {
                bp0 bp0Var;
                boolean g;
                hb5 hb5Var;
                hb5 hb5Var2;
                zq3.h(d44Var, "owner");
                bp0Var = MediaLifecycleObserverImpl.this.e;
                bp0Var.g();
                g = MediaLifecycleObserverImpl.this.g();
                if (g) {
                    return;
                }
                hb5Var = MediaLifecycleObserverImpl.this.b;
                if (hb5Var.a()) {
                    return;
                }
                hb5Var2 = MediaLifecycleObserverImpl.this.b;
                hb5Var2.v();
            }

            @Override // defpackage.ei1
            public void onResume(d44 d44Var) {
                bp0 bp0Var;
                zq3.h(d44Var, "owner");
                bp0Var = MediaLifecycleObserverImpl.this.e;
                bp0Var.e();
            }

            @Override // defpackage.ei1
            public void onStart(d44 d44Var) {
                z4 z4Var;
                zq3.h(d44Var, "owner");
                z4Var = MediaLifecycleObserverImpl.this.d;
                z4Var.m();
            }

            @Override // defpackage.ei1
            public void onStop(d44 d44Var) {
                z4 z4Var;
                zq3.h(d44Var, "owner");
                z4Var = MediaLifecycleObserverImpl.this.d;
                z4Var.n();
            }
        });
    }
}
