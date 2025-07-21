package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;

/* loaded from: classes4.dex */
public final class m96 {
    public static final m96 a = new m96();

    private m96() {
    }

    public final un1 a(String str) {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("Enable Crash on PURR Query Failure", (r23 & 2) != 0 ? null : "Enabled crash on PURR Query failure", (r23 & 4) != 0 ? null : "No Override", "enable_crash_on_purr_query_failure", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : r41.a.a(), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable Crash on PURR Query Failure" : str == null ? "Enable Crash on PURR Query Failure" : str, (r23 & 512) != 0 ? null : null);
        return a2;
    }
}
