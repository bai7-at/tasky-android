package com.nytimes.xwords.hybrid.devsettings;

import android.content.Context;
import androidx.compose.foundation.text.c;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt;
import com.nytimes.xwords.hybrid.config.Environments;
import defpackage.ss2;
import defpackage.tn1;
import defpackage.yn1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class GamesHybridDevSettingFactory {
    public static final GamesHybridDevSettingFactory a = new GamesHybridDevSettingFactory();
    private static final yn1.b b = new yn1.b("Hybrid Games");
    public static final int c = yn1.b.c;

    private GamesHybridDevSettingFactory() {
    }

    private final tn1 b(Environments environments) {
        return new zn1(environments.getBaseUrl(), environments.name(), null, false, 4, null);
    }

    public final Set a(Context context, yn1 yn1Var) {
        DevSettingTextFieldItem a2;
        DevSettingSwitchItem a3;
        zq3.h(context, "context");
        zq3.h(yn1Var, "section");
        Environments[] values = Environments.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (Environments environments : values) {
            arrayList.add(a.b(environments));
        }
        DevSettingPreferenceGroupExpandable j = new DevSettingChoiceListPreferenceItem("Hybrid Environment", "GAMES_ENV_KEY", arrayList, null, null, yn1Var, null, false, false, 472, null).j(context);
        a2 = DevSettingTextFieldItemKt.a("Hybrid Variant Override", "SPELLING_BEE_ABRA_VARIANT_KEY", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (h.d0(str)) {
                    return null;
                }
                return str;
            }
        } : null, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : yn1Var, (r16 & 128) != 0 ? "Hybrid Variant Override" : null, (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        a3 = DevSettingSwitchItemKt.a("Hybrid Chrome Debugging", (r23 & 2) != 0 ? null : "Disable Hybrid Chrome Debugging", (r23 & 4) != 0 ? null : "Enable Hybrid Chrome Debugging", "HYBRID_CHROME_DEBUGGING_ENABLED", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : yn1Var, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Hybrid Chrome Debugging" : null, (r23 & 512) != 0 ? null : new GamesHybridDevSettingFactory$devSettings$2(null));
        return b0.j(j, a2, a3);
    }
}
