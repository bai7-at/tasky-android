package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class a extends LifecycleCallback {
    private List a;

    private a(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.a = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    static /* bridge */ /* synthetic */ a a(Activity activity) {
        a aVar;
        synchronized (activity) {
            try {
                LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
                aVar = (a) fragment.getCallbackOrNull("LifecycleObserverOnStop", a.class);
                if (aVar == null) {
                    aVar = new a(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c(Runnable runnable) {
        this.a.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        List list;
        synchronized (this) {
            list = this.a;
            this.a = new ArrayList();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }
}
