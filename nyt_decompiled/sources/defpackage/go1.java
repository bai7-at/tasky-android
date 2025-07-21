package defpackage;

import com.nytimes.android.devsettings.home.DevSettingsActivity;
import com.nytimes.android.devsettings.search.DevSettingsSearchManager;

/* loaded from: classes4.dex */
public abstract class go1 implements op4 {
    public static void a(DevSettingsActivity devSettingsActivity, ho1 ho1Var) {
        devSettingsActivity.devSettingsMaterialTheme = ho1Var;
    }

    public static void b(DevSettingsActivity devSettingsActivity, DevSettingsSearchManager devSettingsSearchManager) {
        devSettingsActivity.searchManager = devSettingsSearchManager;
    }
}
