package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t;
import androidx.preference.d;
import com.nytimes.android.features.settings.SettingsFragment;
import dagger.hilt.android.internal.managers.a;

/* loaded from: classes4.dex */
public abstract class t83 extends d implements ix2 {
    private ContextWrapper componentContext;
    private volatile a componentManager;
    private boolean disableGetContextFix;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void f1() {
        if (this.componentContext == null) {
            this.componentContext = a.b(super.getContext(), this);
            this.disableGetContextFix = aq2.a(super.getContext());
        }
    }

    protected a createComponentManager() {
        return new a(this);
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return m1107componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        f1();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.d
    public t.b getDefaultViewModelProviderFactory() {
        return zk1.b(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((in7) generatedComponent()).j((SettingsFragment) nx8.a(this));
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

    /* renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final a m1107componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        f16.d(contextWrapper == null || a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f1();
        inject();
    }
}
