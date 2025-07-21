package com.nytimes.android.saved;

import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import defpackage.da7;
import defpackage.un1;
import defpackage.wn1;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface SavedManagerModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final wn1 a(SavedManager savedManager) {
            zq3.h(savedManager, "savedManager");
            DefaultConstructorMarker defaultConstructorMarker = null;
            DevSettingUI devSettingUI = null;
            DevSettingUI devSettingUI2 = null;
            String str = null;
            boolean z = false;
            un1[] un1VarArr = {new DevSettingSimpleItem("Delete", "Delete all SavedArticles", new SavedManagerModule$Companion$provideDevSettingItem$1(savedManager, null), devSettingUI, devSettingUI2, null, str, z, 248, defaultConstructorMarker), da7.a().i(), new DevSettingSimpleItem("Current Modals value", null, new SavedManagerModule$Companion$provideDevSettingItem$2(null), devSettingUI, devSettingUI2, 0 == true ? 1 : 0, str, z, 250, defaultConstructorMarker)};
            return new DevSettingGroupExpandable("Saved for Later", i.o(un1VarArr), null, false, yn1.c.b, 0 == true ? 1 : 0, false, z, 236, defaultConstructorMarker);
        }
    }
}
