package com.nytimes.android.logging.devsettings.items;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import defpackage.yn1;

/* loaded from: classes4.dex */
public final class NYTLoggingDevSettingsFactory {
    public static final NYTLoggingDevSettingsFactory a = new NYTLoggingDevSettingsFactory();
    private static final yn1.b b;
    private static final DevSettingSwitchItem c;
    public static final int d;

    static {
        DevSettingSwitchItem a2;
        yn1.b bVar = new yn1.b("NYTLogger");
        b = bVar;
        a2 = DevSettingSwitchItemKt.a("Enable/Disable Debug NYT logger (hide / show PII in logs)", (r23 & 2) != 0 ? null : "Enabled Debug NYT Logger", (r23 & 4) != 0 ? null : "Disabled Debug NYT Logger", "ENABLE_DEBUG_NYT_LOGGER", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : bVar, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable/Disable Debug NYT logger (hide / show PII in logs)" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (r23 & 512) != 0 ? null : new NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1(null));
        c = a2;
        d = DevSettingSwitchItem.j | yn1.b.c;
    }

    private NYTLoggingDevSettingsFactory() {
    }

    public final DevSettingSwitchItem a() {
        return c;
    }

    public final yn1.b b() {
        return b;
    }
}
