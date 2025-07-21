package com.nytimes.android.subauth.devsettings.purr.env;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.subauth.core.purr.a;
import defpackage.r41;
import defpackage.un1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class PurrCCPADevSettings {
    public static final PurrCCPADevSettings a = new PurrCCPADevSettings();

    private PurrCCPADevSettings() {
    }

    public final un1 a(a aVar, String str) {
        DevSettingSwitchItem a2;
        zq3.h(aVar, "purrManager");
        a2 = DevSettingSwitchItemKt.a("Opt-in to CCPA data collection", (r23 & 2) != 0 ? null : "Opted in to CCPA data collection", (r23 & 4) != 0 ? null : "Opted out of CCPA data collection", "CCPA_OPT_IN", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : r41.a.a(), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Opt-in to CCPA data collection" : str == null ? "Opt-in to CCPA data collection" : str, (r23 & 512) != 0 ? null : new PurrCCPADevSettings$purrCCPAOptInDevSetting$1(aVar, null));
        return a2;
    }
}
