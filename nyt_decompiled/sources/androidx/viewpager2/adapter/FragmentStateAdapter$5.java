package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.d44;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements g {
    final /* synthetic */ Handler a;
    final /* synthetic */ Runnable b;

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            d44Var.getLifecycle().d(this);
        }
    }
}
