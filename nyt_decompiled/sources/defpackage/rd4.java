package defpackage;

import android.app.Application;
import com.nytimes.android.MainActivityExperimentOption;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import kotlin.collections.d;

/* loaded from: classes2.dex */
public final class rd4 extends DevSettingChoiceListPreferenceItem {
    private final Application j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd4(Application application) {
        super("Main Activity Experiments", "MAIN_ACTIVITY_EXPERIMENTS", d.C0(MainActivityExperimentOption.values()), null, null, null, null, false, false, 504, null);
        zq3.h(application, "app");
        this.j = application;
    }
}
