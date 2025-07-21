package com.nytimes.android.devsettings.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import defpackage.mx0;
import defpackage.oe3;
import defpackage.ss2;
import defpackage.vz0;
import defpackage.yn1;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class DevSettingSimpleClipboardItemKt {
    public static final DevSettingLazySummaryItem a(String str, ss2 ss2Var, DevSettingUI devSettingUI, yn1 yn1Var, String str2) {
        zq3.h(str, "title");
        zq3.h(ss2Var, "lazySummary");
        zq3.h(devSettingUI, "iconStart");
        zq3.h(str2, "sortKey");
        return new DevSettingLazySummaryItem(str, ss2Var, null, new DevSettingSimpleClipboardItemKt$DevSettingSimpleClipboardItem$1(ss2Var, str, null), devSettingUI, DevSettingUI.a.b(DevSettingUI.Companion, vz0.a(oe3.a.a()), null, 0.0f, null, 14, null), yn1Var, str2, false, false, 772, null);
    }

    public static /* synthetic */ DevSettingLazySummaryItem b(String str, ss2 ss2Var, DevSettingUI devSettingUI, yn1 yn1Var, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            devSettingUI = DevSettingUI.c.a;
        }
        if ((i & 8) != 0) {
            yn1Var = null;
        }
        if ((i & 16) != 0) {
            str2 = str;
        }
        return a(str, ss2Var, devSettingUI, yn1Var, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ClipboardManager clipboardManager, CharSequence charSequence, CharSequence charSequence2) {
        clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClipboardManager f(Context context, ss2 ss2Var) {
        ClipboardManager clipboardManager = (ClipboardManager) mx0.j(context, ClipboardManager.class);
        if (clipboardManager == null) {
            return null;
        }
        ss2Var.invoke(clipboardManager);
        return clipboardManager;
    }
}
