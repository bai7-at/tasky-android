package com.nytimes.android.devsettings.common;

import android.content.Context;
import androidx.compose.foundation.text.c;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.ss2;
import defpackage.ul8;
import defpackage.yn1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DevSettingTextFieldItemKt {
    public static final DevSettingTextFieldItem a(String str, final String str2, final String str3, ss2 ss2Var, boolean z, DevSettingUI devSettingUI, yn1 yn1Var, String str4, c cVar) {
        zq3.h(str, "title");
        zq3.h(str2, "preferenceKey");
        zq3.h(str3, "defaultValue");
        zq3.h(ss2Var, "lazySummary");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(str4, "sortKey");
        zq3.h(cVar, "keyboardOptions");
        return new DevSettingTextFieldItem(str, new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(Context context) {
                zq3.h(context, "context");
                try {
                    String string = ContextUtilsKt.a(context).getString(str2, str3);
                    return string == null ? "" : string;
                } catch (Exception e) {
                    ul8.a.z("DevSetting").f(e, "Invalid dev setting preference found for key: " + str2, new Object[0]);
                    return "";
                }
            }
        }, new DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3(z, str2, null), ss2Var, devSettingUI, null, cVar, yn1Var, str4, false, 544, null);
    }
}
