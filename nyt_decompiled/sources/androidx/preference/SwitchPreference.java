package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import defpackage.co6;
import defpackage.ic6;
import defpackage.nu8;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a u0;
    private CharSequence v0;
    private CharSequence w0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.b(Boolean.valueOf(z))) {
                SwitchPreference.this.M0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.SwitchPreference, i, i2);
        P0(nu8.m(obtainStyledAttributes, co6.SwitchPreference_summaryOn, co6.SwitchPreference_android_summaryOn));
        O0(nu8.m(obtainStyledAttributes, co6.SwitchPreference_summaryOff, co6.SwitchPreference_android_summaryOff));
        T0(nu8.m(obtainStyledAttributes, co6.SwitchPreference_switchTextOn, co6.SwitchPreference_android_switchTextOn));
        S0(nu8.m(obtainStyledAttributes, co6.SwitchPreference_switchTextOff, co6.SwitchPreference_android_switchTextOff));
        N0(nu8.b(obtainStyledAttributes, co6.SwitchPreference_disableDependentsState, co6.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void U0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.p0);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.v0);
            r4.setTextOff(this.w0);
            r4.setOnCheckedChangeListener(this.u0);
        }
    }

    private void V0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            U0(view.findViewById(R.id.switch_widget));
            Q0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        U0(hVar.W(R.id.switch_widget));
        R0(hVar);
    }

    public void S0(CharSequence charSequence) {
        this.w0 = charSequence;
        M();
    }

    public void T0(CharSequence charSequence) {
        this.v0 = charSequence;
        M();
    }

    @Override // androidx.preference.Preference
    protected void f0(View view) {
        super.f0(view);
        V0(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.switchPreferenceStyle, R.attr.switchPreferenceStyle));
    }
}
