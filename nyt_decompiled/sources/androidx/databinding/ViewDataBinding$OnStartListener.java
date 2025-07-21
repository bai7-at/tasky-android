package androidx.databinding;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import defpackage.c44;
import defpackage.lh4;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class ViewDataBinding$OnStartListener implements c44 {
    final WeakReference a;

    @k(Lifecycle.Event.ON_START)
    public void onStart() {
        lh4.a(this.a.get());
    }
}
