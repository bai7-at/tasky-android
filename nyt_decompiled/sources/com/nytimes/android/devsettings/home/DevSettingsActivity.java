package com.nytimes.android.devsettings.home;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import com.nytimes.android.devsettings.base.composables.DevSettingsScreenKt;
import com.nytimes.android.devsettings.search.DevSettingsSearchManager;
import defpackage.gt2;
import defpackage.ho1;
import defpackage.tq0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class DevSettingsActivity extends a {
    public ho1 devSettingsMaterialTheme;
    public DevSettingsSearchManager searchManager;

    public final ho1 L() {
        ho1 ho1Var = this.devSettingsMaterialTheme;
        if (ho1Var != null) {
            return ho1Var;
        }
        zq3.z("devSettingsMaterialTheme");
        return null;
    }

    public final DevSettingsSearchManager M() {
        DevSettingsSearchManager devSettingsSearchManager = this.searchManager;
        if (devSettingsSearchManager != null) {
            return devSettingsSearchManager;
        }
        zq3.z("searchManager");
        return null;
    }

    @Override // com.nytimes.android.devsettings.home.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tq0.b(this, null, zr0.c(193364972, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsActivity$onCreate$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(193364972, i, -1, "com.nytimes.android.devsettings.home.DevSettingsActivity.onCreate.<anonymous> (DevSettingsActivity.kt:29)");
                }
                ho1 L = DevSettingsActivity.this.L();
                final DevSettingsActivity devSettingsActivity = DevSettingsActivity.this;
                DevSettingsCustomThemeKt.a(false, L, zr0.b(composer, 1284862943, true, new gt2() { // from class: com.nytimes.android.devsettings.home.DevSettingsActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(1284862943, i2, -1, "com.nytimes.android.devsettings.home.DevSettingsActivity.onCreate.<anonymous>.<anonymous> (DevSettingsActivity.kt:32)");
                        }
                        DevSettingsScreenKt.b(DevSettingsActivity.this.M(), false, composer2, 8, 2);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), composer, 384, 1);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
            }
        }), 1, null);
    }
}
