package com.nytimes.android.betasettings;

import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSimpleClipboardItemKt;
import defpackage.wn1;
import defpackage.zq3;
import kotlin.collections.i;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface ReaderBetaSettingsModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final wn1 a(Flow flow) {
            zq3.h(flow, "firebaseIdTokenFlow");
            String str = null;
            return new DevSettingGroupExpandable("App Information", i.o(DevSettingSimpleClipboardItemKt.b("Android version", new ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$1(null), null, null, null, 28, null), DevSettingSimpleClipboardItemKt.b("Firebase Token", new ReaderBetaSettingsModule$Companion$provideDevSettingAppInfo$2(flow, null), null, null, null, 28, null)), str, false, null, null, false, false, 252, null);
        }
    }
}
