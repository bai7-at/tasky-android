package defpackage;

import android.app.Application;
import com.nytimes.android.designsystem.uicompose.ui.ThemeExperimentOption;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public final class uk8 extends DevSettingChoiceListPreferenceItem {
    private final Application j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk8(Application application) {
        super("Theme Experiments", "THEME_EXPERIMENTS", d.C0(ThemeExperimentOption.values()), null, null, null, null, false, false, 504, null);
        zq3.h(application, "app");
        this.j = application;
    }

    public final boolean k() {
        return h(this.j, ThemeExperimentOption.AnimatedTabs);
    }

    public final boolean l() {
        return wd0.b() && h(this.j, ThemeExperimentOption.UseMaterialYouAsAccent);
    }
}
