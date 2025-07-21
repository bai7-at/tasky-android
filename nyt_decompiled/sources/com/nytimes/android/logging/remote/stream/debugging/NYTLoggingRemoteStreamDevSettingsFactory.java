package com.nytimes.android.logging.remote.stream.debugging;

import androidx.compose.foundation.text.c;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt;
import com.nytimes.android.logging.remote.stream.LoggingRemoteStreamManager;
import defpackage.ss2;
import defpackage.un1;
import defpackage.yn1;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class NYTLoggingRemoteStreamDevSettingsFactory {
    public static final NYTLoggingRemoteStreamDevSettingsFactory a = new NYTLoggingRemoteStreamDevSettingsFactory();
    private static final yn1.b b;
    private static final DevSettingTextFieldItem c;
    private static final DevSettingTextFieldItem d;
    public static final int e;

    static {
        DevSettingTextFieldItem a2;
        DevSettingTextFieldItem a3;
        yn1.b bVar = new yn1.b("NYTLogger");
        b = bVar;
        a2 = DevSettingTextFieldItemKt.a("Input your computer's IP Address (Settings > Network > Wi-Fi address). Toggle Enable Logger Remote Stream after changing this.", "nyt_remote_stream_ip_address", (r16 & 4) != 0 ? "" : "192.168.1.44", (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (h.d0(str)) {
                    return null;
                }
                return str;
            }
        } : null, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : bVar, (r16 & 128) != 0 ? "Input your computer's IP Address (Settings > Network > Wi-Fi address). Toggle Enable Logger Remote Stream after changing this." : "2.1", (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        c = a2;
        a3 = DevSettingTextFieldItemKt.a("Override socket port (default is 9002). Toggle Enable Logger Remote Stream after changing this.", "nyt_remote_stream_port", (r16 & 4) != 0 ? "" : "9002", (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (h.d0(str)) {
                    return null;
                }
                return str;
            }
        } : null, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : bVar, (r16 & 128) != 0 ? "Override socket port (default is 9002). Toggle Enable Logger Remote Stream after changing this." : "2.2", (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        d = a3;
        e = DevSettingTextFieldItem.k | yn1.b.c;
    }

    private NYTLoggingRemoteStreamDevSettingsFactory() {
    }

    public final DevSettingSwitchItem a(LoggingRemoteStreamManager loggingRemoteStreamManager) {
        DevSettingSwitchItem a2;
        zq3.h(loggingRemoteStreamManager, "manager");
        a2 = DevSettingSwitchItemKt.a("Enable/Disable Remote Stream Logging to MobileLogViewer. You must have `logging-remote-stream` setup and your ip address set.", (r23 & 2) != 0 ? null : "Enabled Remote Stream Logging", (r23 & 4) != 0 ? null : "Disabled Remote Stream Logging", "nyt_enable_logging_remote_stream", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : b, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable/Disable Remote Stream Logging to MobileLogViewer. You must have `logging-remote-stream` setup and your ip address set." : "2", (r23 & 512) != 0 ? null : new NYTLoggingRemoteStreamDevSettingsFactory$enableRemoteStreamLoggingDevSetting$1(loggingRemoteStreamManager, null));
        return a2;
    }

    public final un1 b(LoggingRemoteStreamManager loggingRemoteStreamManager) {
        zq3.h(loggingRemoteStreamManager, "manager");
        return new DevSettingGroupExpandable("Logging Remote Stream Dev Settings", i.X0(i.o(a(loggingRemoteStreamManager), c, d)), null, false, b, null, false, false, 236, null);
    }
}
