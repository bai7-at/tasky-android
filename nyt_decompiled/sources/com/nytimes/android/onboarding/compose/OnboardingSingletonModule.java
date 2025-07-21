package com.nytimes.android.onboarding.compose;

import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.utils.AppPreferences;
import defpackage.wn1;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface OnboardingSingletonModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final wn1 a(AppPreferences appPreferences) {
            zq3.h(appPreferences, "appPreferences");
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = "Clear Onboarding Flags";
            String str2 = "Clear app preferences and revert to a \"fresh install\" state";
            DevSettingUI devSettingUI = null;
            DevSettingUI devSettingUI2 = null;
            yn1 yn1Var = null;
            String str3 = null;
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            return new DevSettingGroupExpandable("Onboarding", i.e(new DevSettingSimpleItem(str, str2, new OnboardingSingletonModule$Companion$provideDevSettingItem$1(appPreferences, null), devSettingUI, devSettingUI2, yn1Var, str3, z, 120, defaultConstructorMarker)), null, false, yn1.c.b, 0 == true ? 1 : 0, z2, z3, 236, defaultConstructorMarker);
        }
    }
}
