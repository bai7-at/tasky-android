package com.nytimes.android.devsettings.home;

import android.os.Bundle;
import androidx.fragment.app.f;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.d;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.qs2;
import defpackage.ul8;
import defpackage.wh6;
import defpackage.ww8;
import defpackage.y38;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DevSettingsXmlFragment extends d {
    private final DevSettingsXmlActivity f1() {
        f requireActivity = requireActivity();
        zq3.f(requireActivity, "null cannot be cast to non-null type com.nytimes.android.devsettings.home.DevSettingsXmlActivity");
        return (DevSettingsXmlActivity) requireActivity;
    }

    private final void g1(Preference preference) {
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            if (preferenceGroup.R0() > 0) {
                int R0 = preferenceGroup.R0();
                for (int i = 0; i < R0; i++) {
                    Preference Q0 = preferenceGroup.Q0(i);
                    zq3.g(Q0, "getPreference(...)");
                    g1(Q0);
                }
                return;
            }
        }
        if (preference instanceof EditTextPreference) {
            ((EditTextPreference) preference).R0(wh6.edit_text_preference_layout);
        }
    }

    @Override // androidx.preference.d
    public void onCreatePreferences(Bundle bundle, final String str) {
        final int O = f1().O();
        try {
            y38.a(new qs2() { // from class: com.nytimes.android.devsettings.home.DevSettingsXmlFragment$onCreatePreferences$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m361invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m361invoke() {
                    DevSettingsXmlFragment.this.setPreferencesFromResource(O, str);
                }
            });
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            zq3.g(preferenceScreen, "getPreferenceScreen(...)");
            g1(preferenceScreen);
        } catch (Exception e) {
            ul8.a.z("DevSetting").f(e, "ERROR: Unable to create Dev Settings Fragment from resId: " + O + ", rootKey: " + str + InstructionFileId.DOT, new Object[0]);
        }
    }
}
