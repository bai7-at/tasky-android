package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;

/* loaded from: classes2.dex */
public final class i52 {
    public static final i52 a = new i52();

    private i52() {
    }

    public final un1 a() {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("ET2 Guard", (r23 & 2) != 0 ? null : "Force a crash when ET2 finds an issue with events being sent", (r23 & 4) != 0 ? null : "Don't force a crash when ET2 finds an issue with events being sent", "com.nytimes.android.phoenix.beta.ET2_GUARD", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : f05.a.b(), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "ET2 Guard" : null, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 b() {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("ET2 Logging", (r23 & 2) != 0 ? null : "Allow ET2 Logs to pass logs to LogCat.", (r23 & 4) != 0 ? null : "Don't allow ET2 Logs to pass logs to LogCat.", "com.nytimes.android.phoenix.beta.ET2_LOGCAT", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : f05.a.b(), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "ET2 Logging" : null, (r23 & 512) != 0 ? null : null);
        return a2;
    }
}
