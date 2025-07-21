package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.g;
import defpackage.ic6;
import defpackage.nu8;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean x0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, nu8.a(context, ic6.preferenceScreenStyle, R.attr.preferenceScreenStyle));
        this.x0 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    protected boolean S0() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected void T() {
        g.b g;
        if (p() != null || n() != null || R0() == 0 || (g = A().g()) == null) {
            return;
        }
        g.onNavigateToScreen(this);
    }

    public boolean Z0() {
        return this.x0;
    }
}
