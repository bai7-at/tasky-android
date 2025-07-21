package com.nytimes.android.ads;

import android.content.Context;
import androidx.compose.foundation.text.c;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.WindowState;
import com.nytimes.android.abra.models.AbraPackageKt;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSimpleItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.b22;
import defpackage.h9;
import defpackage.ss2;
import defpackage.tn1;
import defpackage.un1;
import defpackage.yj6;
import defpackage.yn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes2.dex */
public final class AdsDevSettings {
    public static final AdsDevSettings a = new AdsDevSettings();

    private AdsDevSettings() {
    }

    private final DevSettingPreferenceGroupExpandable e(DevSettingChoiceListPreferenceItem devSettingChoiceListPreferenceItem, Context context) {
        Object obj;
        String title;
        String valueOf = String.valueOf(ContextUtilsKt.a(context).getLong("ad_stale_timer", AbraPackageKt.MS_IN_HOUR));
        Iterator it2 = devSettingChoiceListPreferenceItem.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (zq3.c(((AdStaleTimers) obj).getPrefValue(), valueOf)) {
                break;
            }
        }
        AdStaleTimers adStaleTimers = (AdStaleTimers) obj;
        if (adStaleTimers != null && (title = adStaleTimers.getTitle()) != null) {
            valueOf = title;
        }
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(valueOf);
        List<AdStaleTimers> b = devSettingChoiceListPreferenceItem.b();
        ArrayList arrayList = new ArrayList(i.w(b, 10));
        for (AdStaleTimers adStaleTimers2 : b) {
            arrayList.add(new DevSettingSimpleItem(adStaleTimers2.getTitle(), adStaleTimers2.getSummary(), new AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1(devSettingChoiceListPreferenceItem, adStaleTimers2, MutableStateFlow, null), null, null, null, null, false, 248, null));
        }
        return new DevSettingPreferenceGroupExpandable(devSettingChoiceListPreferenceItem.g(), arrayList, false, devSettingChoiceListPreferenceItem.e(), devSettingChoiceListPreferenceItem.f(), devSettingChoiceListPreferenceItem.a(), false, MutableStateFlow, 68, null);
    }

    public final un1 a(Context context, int i) {
        DevSettingSwitchItem a2;
        zq3.h(context, "context");
        String string = context.getString(yj6.ad_enable_toggle_title);
        String string2 = context.getString(yj6.ad_enable_toggle_summary_on);
        String string3 = context.getString(yj6.ad_enable_toggle_summary_off);
        yn1.b a3 = h9.a.a(context);
        String valueOf = String.valueOf(i);
        zq3.e(string);
        a2 = DevSettingSwitchItemKt.a(string, (r23 & 2) != 0 ? null : string2, (r23 & 4) != 0 ? null : string3, "ad_enabled", (r23 & 16) != 0 ? false : true, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : a3, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? string : valueOf, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 b(final Context context, int i) {
        DevSettingTextFieldItem a2;
        zq3.h(context, "context");
        String string = context.getString(yj6.ad_keyword_title);
        String valueOf = String.valueOf(i);
        yn1.b a3 = h9.a.a(context);
        zq3.e(string);
        a2 = DevSettingTextFieldItemKt.a(string, "ad_keyword", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? new ss2() { // from class: com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (h.d0(str)) {
                    return null;
                }
                return str;
            }
        } : new ss2() { // from class: com.nytimes.android.ads.AdsDevSettings$adKeywordDevSettings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                return context.getString(yj6.ad_keyword_summary);
            }
        }, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? DevSettingUI.c.a : null, (r16 & 64) != 0 ? null : a3, (r16 & 128) != 0 ? string : valueOf, (r16 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? c.e.a() : null);
        return a2;
    }

    public final un1 c(Context context, int i) {
        DevSettingSwitchItem a2;
        zq3.h(context, "context");
        String string = context.getString(yj6.ad_stale_check_enable);
        String string2 = context.getString(yj6.ad_stale_check_enable_toggle_summary_on);
        String string3 = context.getString(yj6.ad_stale_check_enable_toggle_summary_off);
        yn1.b a3 = h9.a.a(context);
        String valueOf = String.valueOf(i);
        zq3.e(string);
        a2 = DevSettingSwitchItemKt.a(string, (r23 & 2) != 0 ? null : string2, (r23 & 4) != 0 ? null : string3, "ad_stale_toggle", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : a3, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? string : valueOf, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 d(Context context, int i) {
        zq3.h(context, "context");
        List C0 = d.C0(AdStaleTimers.values());
        String string = context.getString(yj6.ad_stale_timer_title);
        AdStaleTimers adStaleTimers = (AdStaleTimers) i.k0(C0);
        String valueOf = String.valueOf(i);
        yn1.b a2 = h9.a.a(context);
        zq3.e(string);
        return e(new DevSettingChoiceListPreferenceItem(string, "ad_stale_timer", C0, adStaleTimers, null, a2, valueOf, false, false, WindowState.NORMAL, null), context);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AdStaleTimers implements tn1 {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ AdStaleTimers[] $VALUES;
        public static final AdStaleTimers HOUR_1;
        public static final AdStaleTimers MINUTE_1;
        public static final AdStaleTimers MINUTE_10;
        public static final AdStaleTimers MINUTE_30;
        public static final AdStaleTimers SECOND_1 = new AdStaleTimers("SECOND_1", 0, "1000", "1 second", null, false, 12, null);
        private final String prefValue;
        private final boolean requestRestart;
        private final String summary;
        private final String title;

        private static final /* synthetic */ AdStaleTimers[] $values() {
            return new AdStaleTimers[]{SECOND_1, MINUTE_1, MINUTE_10, MINUTE_30, HOUR_1};
        }

        static {
            int i = 12;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            boolean z = false;
            MINUTE_1 = new AdStaleTimers("MINUTE_1", 1, "60000", "1 minute", str, z, i, defaultConstructorMarker);
            int i2 = 12;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            String str2 = null;
            boolean z2 = false;
            MINUTE_10 = new AdStaleTimers("MINUTE_10", 2, "600000", "10 minute", str2, z2, i2, defaultConstructorMarker2);
            MINUTE_30 = new AdStaleTimers("MINUTE_30", 3, "1800000", "30 minute", str, z, i, defaultConstructorMarker);
            HOUR_1 = new AdStaleTimers("HOUR_1", 4, "3600000", "1 hour", str2, z2, i2, defaultConstructorMarker2);
            AdStaleTimers[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AdStaleTimers(String str, int i, String str2, String str3, String str4, boolean z) {
            this.prefValue = str2;
            this.title = str3;
            this.summary = str4;
            this.requestRestart = z;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static AdStaleTimers valueOf(String str) {
            return (AdStaleTimers) Enum.valueOf(AdStaleTimers.class, str);
        }

        public static AdStaleTimers[] values() {
            return (AdStaleTimers[]) $VALUES.clone();
        }

        @Override // defpackage.tn1
        public String getPrefValue() {
            return this.prefValue;
        }

        @Override // defpackage.tn1
        public boolean getRequestRestart() {
            return this.requestRestart;
        }

        @Override // defpackage.tn1
        public String getSummary() {
            return this.summary;
        }

        @Override // defpackage.tn1
        public String getTitle() {
            return this.title;
        }

        /* synthetic */ AdStaleTimers(String str, int i, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, (i2 & 4) != 0 ? null : str4, (i2 & 8) != 0 ? true : z);
        }
    }
}
