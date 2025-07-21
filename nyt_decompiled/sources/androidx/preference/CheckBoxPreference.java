package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.co6;
import defpackage.ic6;
import defpackage.nu8;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a u0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.b(Boolean.valueOf(z))) {
                CheckBoxPreference.this.M0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void S0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.p0);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.u0);
        }
    }

    private void T0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            S0(view.findViewById(R.id.checkbox));
            Q0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        S0(hVar.W(R.id.checkbox));
        R0(hVar);
    }

    @Override // androidx.preference.Preference
    protected void f0(View view) {
        super.f0(view);
        T0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.CheckBoxPreference, i, i2);
        P0(nu8.m(obtainStyledAttributes, co6.CheckBoxPreference_summaryOn, co6.CheckBoxPreference_android_summaryOn));
        O0(nu8.m(obtainStyledAttributes, co6.CheckBoxPreference_summaryOff, co6.CheckBoxPreference_android_summaryOff));
        N0(nu8.b(obtainStyledAttributes, co6.CheckBoxPreference_disableDependentsState, co6.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.checkBoxPreferenceStyle, R.attr.checkBoxPreferenceStyle));
    }
}
