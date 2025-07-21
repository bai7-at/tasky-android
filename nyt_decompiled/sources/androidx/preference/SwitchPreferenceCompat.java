package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.co6;
import defpackage.ic6;
import defpackage.nu8;
import defpackage.rf6;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a u0;
    private CharSequence v0;
    private CharSequence w0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.b(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.M0(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.SwitchPreferenceCompat, i, i2);
        P0(nu8.m(obtainStyledAttributes, co6.SwitchPreferenceCompat_summaryOn, co6.SwitchPreferenceCompat_android_summaryOn));
        O0(nu8.m(obtainStyledAttributes, co6.SwitchPreferenceCompat_summaryOff, co6.SwitchPreferenceCompat_android_summaryOff));
        T0(nu8.m(obtainStyledAttributes, co6.SwitchPreferenceCompat_switchTextOn, co6.SwitchPreferenceCompat_android_switchTextOn));
        S0(nu8.m(obtainStyledAttributes, co6.SwitchPreferenceCompat_switchTextOff, co6.SwitchPreferenceCompat_android_switchTextOff));
        N0(nu8.b(obtainStyledAttributes, co6.SwitchPreferenceCompat_disableDependentsState, co6.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void U0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.p0);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.v0);
            switchCompat.setTextOff(this.w0);
            switchCompat.setOnCheckedChangeListener(this.u0);
        }
    }

    private void V0(View view) {
        if (((AccessibilityManager) j().getSystemService("accessibility")).isEnabled()) {
            U0(view.findViewById(rf6.switchWidget));
            Q0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        U0(hVar.W(rf6.switchWidget));
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

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ic6.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }
}
