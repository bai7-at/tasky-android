package com.nytimes.android.devsettings.common;

import android.content.Context;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.it2;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.yn1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DevSettingSwitchItemKt {
    public static final DevSettingSwitchItem a(String str, String str2, String str3, final String str4, final boolean z, boolean z2, DevSettingUI devSettingUI, yn1 yn1Var, String str5, it2 it2Var) {
        zq3.h(str, "title");
        zq3.h(str4, "preferenceKey");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(str5, "sortKey");
        return new DevSettingSwitchItem(str, new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Context context) {
                boolean z3;
                zq3.h(context, "context");
                try {
                    z3 = ContextUtilsKt.a(context).getBoolean(str4, z);
                } catch (Exception e) {
                    ul8.a.z("DevSetting").f(e, "Invalid dev setting preference found for key: " + str4, new Object[0]);
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }, new DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2(z2, it2Var, str4, null), str2, str3, devSettingUI, yn1Var, str5, false, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, null);
    }
}
