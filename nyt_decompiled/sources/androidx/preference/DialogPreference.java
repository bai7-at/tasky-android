package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.co6;
import defpackage.ic6;
import defpackage.nu8;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence p0;
    private CharSequence q0;
    private Drawable r0;
    private CharSequence s0;
    private CharSequence t0;
    private int u0;

    public interface a {
        Preference findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co6.DialogPreference, i, i2);
        String m = nu8.m(obtainStyledAttributes, co6.DialogPreference_dialogTitle, co6.DialogPreference_android_dialogTitle);
        this.p0 = m;
        if (m == null) {
            this.p0 = E();
        }
        this.q0 = nu8.m(obtainStyledAttributes, co6.DialogPreference_dialogMessage, co6.DialogPreference_android_dialogMessage);
        this.r0 = nu8.c(obtainStyledAttributes, co6.DialogPreference_dialogIcon, co6.DialogPreference_android_dialogIcon);
        this.s0 = nu8.m(obtainStyledAttributes, co6.DialogPreference_positiveButtonText, co6.DialogPreference_android_positiveButtonText);
        this.t0 = nu8.m(obtainStyledAttributes, co6.DialogPreference_negativeButtonText, co6.DialogPreference_android_negativeButtonText);
        this.u0 = nu8.l(obtainStyledAttributes, co6.DialogPreference_dialogLayout, co6.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable L0() {
        return this.r0;
    }

    public int M0() {
        return this.u0;
    }

    public CharSequence N0() {
        return this.q0;
    }

    public CharSequence O0() {
        return this.p0;
    }

    public CharSequence P0() {
        return this.t0;
    }

    public CharSequence Q0() {
        return this.s0;
    }

    public void R0(int i) {
        this.u0 = i;
    }

    public void S0(CharSequence charSequence) {
        this.t0 = charSequence;
    }

    @Override // androidx.preference.Preference
    protected void T() {
        A().u(this);
    }

    public void T0(CharSequence charSequence) {
        this.s0 = charSequence;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
