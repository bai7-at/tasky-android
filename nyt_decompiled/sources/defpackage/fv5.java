package defpackage;

import android.app.Application;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.features.games.gameshub.PlayTabExperimentOption;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public final class fv5 extends DevSettingChoiceListPreferenceItem {
    private final Application j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv5(Application application) {
        super("Play Tab Experiments", "PLAY_TAB_EXPERIMENTS", d.C0(PlayTabExperimentOption.values()), null, null, null, null, false, false, 504, null);
        zq3.h(application, "app");
        this.j = application;
    }
}
