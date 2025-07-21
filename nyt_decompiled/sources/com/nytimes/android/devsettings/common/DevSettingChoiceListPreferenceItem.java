package com.nytimes.android.devsettings.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingGroupAlwaysExpanded;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.gt2;
import defpackage.tn1;
import defpackage.ul8;
import defpackage.yn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public class DevSettingChoiceListPreferenceItem {
    private final String a;
    private final String b;
    private final List c;
    private final tn1 d;
    private final gt2 e;
    private final yn1 f;
    private final String g;
    private final boolean h;
    private final boolean i;

    public DevSettingChoiceListPreferenceItem(String str, String str2, List list, tn1 tn1Var, gt2 gt2Var, yn1 yn1Var, String str3, boolean z, boolean z2) {
        zq3.h(str, "title");
        zq3.h(str2, "prefKey");
        zq3.h(list, "items");
        zq3.h(tn1Var, "defaultValue");
        zq3.h(str3, "sortKey");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = tn1Var;
        this.e = gt2Var;
        this.f = yn1Var;
        this.g = str3;
        this.h = z;
        this.i = z2;
    }

    public final boolean a() {
        return this.h;
    }

    public final List b() {
        return this.c;
    }

    public final gt2 c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final yn1 e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.a;
    }

    public final boolean h(Context context, tn1 tn1Var) {
        zq3.h(context, "context");
        zq3.h(tn1Var, "option");
        String str = this.b + QueryKeys.END_MARKER + tn1Var.getPrefValue();
        try {
            return ContextUtilsKt.a(context).getBoolean(str, false);
        } catch (Exception e) {
            ul8.a.z("DevSetting").f(e, "Invalid dev setting preference found for key: " + str, new Object[0]);
            return false;
        }
    }

    public final DevSettingGroupAlwaysExpanded i() {
        DevSettingSwitchItem a;
        String str = this.a;
        List<tn1> list = this.c;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (tn1 tn1Var : list) {
            a = DevSettingSwitchItemKt.a(r5, (r23 & 2) != 0 ? null : tn1Var.getSummary(), (r23 & 4) != 0 ? null : tn1Var.getSummary(), this.b + QueryKeys.END_MARKER + tn1Var.getPrefValue(), (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : tn1Var.getRequestRestart(), (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? tn1Var.getTitle() : null, (r23 & 512) != 0 ? null : null);
            arrayList.add(a);
        }
        return new DevSettingGroupAlwaysExpanded(str, arrayList, null, this.f, this.g, this.h, false, 68, null);
    }

    public final DevSettingPreferenceGroupExpandable j(Context context) {
        Object obj;
        String title;
        SharedPreferences a;
        String string = (context == null || (a = ContextUtilsKt.a(context)) == null) ? null : a.getString(this.b, null);
        Iterator it2 = this.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((tn1) obj).getPrefValue(), string)) {
                break;
            }
        }
        tn1 tn1Var = (tn1) obj;
        if (tn1Var != null && (title = tn1Var.getTitle()) != null) {
            string = title;
        }
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(string);
        List<tn1> list = this.c;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (tn1 tn1Var2 : list) {
            arrayList.add(new DevSettingSimpleItem(tn1Var2.getTitle(), tn1Var2.getSummary(), new DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1(this, tn1Var2, MutableStateFlow, null), null, null, null, null, false, 248, null));
        }
        return new DevSettingPreferenceGroupExpandable(this.a, arrayList, false, this.f, this.g, this.h, false, MutableStateFlow, 68, null);
    }

    public /* synthetic */ DevSettingChoiceListPreferenceItem(String str, String str2, List list, tn1 tn1Var, gt2 gt2Var, yn1 yn1Var, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? (tn1) i.k0(list) : tn1Var, (i & 16) != 0 ? null : gt2Var, (i & 32) != 0 ? null : yn1Var, (i & 64) != 0 ? str : str3, (i & 128) != 0 ? false : z, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z2);
    }
}
