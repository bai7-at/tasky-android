package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import com.nytimes.android.features.settings.PreferenceLongSummary;

/* loaded from: classes4.dex */
public final class i34 extends d {
    private final void f1(String str, String str2) {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        zq3.g(preferenceScreen, "getPreferenceScreen(...)");
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        PreferenceLongSummary preferenceLongSummary = new PreferenceLongSummary(requireContext, null, 2, null);
        preferenceLongSummary.F0(str);
        preferenceLongSummary.C0(str2);
        preferenceLongSummary.L0(3);
        preferenceScreen.M0(preferenceLongSummary);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.setBackground(view.getContext().getDrawable(gd6.content_primary_inverse));
        }
    }

    @Override // androidx.preference.d
    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(ho6.legal);
        String[] stringArray = getResources().getStringArray(ac6.license_names);
        zq3.g(stringArray, "getStringArray(...)");
        String[] stringArray2 = getResources().getStringArray(ac6.license_values);
        zq3.g(stringArray2, "getStringArray(...)");
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            f1(stringArray[i], stringArray2[i2]);
            i++;
            i2++;
        }
    }
}
