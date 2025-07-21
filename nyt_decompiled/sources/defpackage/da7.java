package defpackage;

import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.saved.synchronization.SavedExperimentOption;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public abstract class da7 {
    private static final DevSettingChoiceListPreferenceItem a = new DevSettingChoiceListPreferenceItem("Saved UI Experiments", "SAVED_UI_EXPERIMENTS", d.C0(SavedExperimentOption.values()), null, null, null, null, false, false, 504, null);

    public static final DevSettingChoiceListPreferenceItem a() {
        return a;
    }
}
