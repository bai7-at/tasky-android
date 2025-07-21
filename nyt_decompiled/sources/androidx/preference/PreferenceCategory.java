package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import defpackage.ic6;
import defpackage.nu8;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean G0() {
        return !super.I();
    }

    @Override // androidx.preference.Preference
    public boolean I() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        super.S(hVar);
        hVar.a.setAccessibilityHeading(true);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nu8.a(context, ic6.preferenceCategoryStyle, R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }
}
