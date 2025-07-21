package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t;
import androidx.preference.d;
import com.nytimes.android.features.settings.AboutFragment;
import dagger.hilt.android.internal.managers.a;

/* loaded from: classes4.dex */
public abstract class l83 extends d implements ix2 {
    private ContextWrapper a;
    private boolean b;
    private volatile a c;
    private final Object d = new Object();
    private boolean e = false;

    private void f1() {
        if (this.a == null) {
            this.a = a.b(super.getContext(), this);
            this.b = aq2.a(super.getContext());
        }
    }

    public final a componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    protected a createComponentManager() {
        return new a(this);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        f1();
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return zk1.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((k0) generatedComponent()).d((AboutFragment) nx8.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        f1();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(a.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.a;
        f16.d(contextWrapper == null || a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f1();
        inject();
    }
}
