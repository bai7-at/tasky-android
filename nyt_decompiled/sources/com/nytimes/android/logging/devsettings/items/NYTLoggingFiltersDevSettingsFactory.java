package com.nytimes.android.logging.devsettings.items;

import android.content.Context;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import com.nytimes.android.logging.NYTLogger;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class NYTLoggingFiltersDevSettingsFactory {
    public static final NYTLoggingFiltersDevSettingsFactory a = new NYTLoggingFiltersDevSettingsFactory();
    private static final DevSettingTextFieldConfirmationButtonItem b;
    private static final DevSettingTextFieldConfirmationButtonItem c;
    private static final DevSettingLazySummaryItem d;
    private static final DevSettingLazySummaryItem e;
    private static final DevSettingLazySummaryItem f;
    public static final int g;

    static {
        NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1 nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1 = new NYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1(null);
        NYTLoggingDevSettingsFactory nYTLoggingDevSettingsFactory = NYTLoggingDevSettingsFactory.a;
        b = new DevSettingTextFieldConfirmationButtonItem("Add 1 filter to remove text TAG from logs (searches by full string, ignoring case).", null, nYTLoggingFiltersDevSettingsFactory$addTagRemovalFiltersDevSetting$1, null, null, null, null, null, true, true, nYTLoggingDevSettingsFactory.b(), "5", false, 250, null);
        c = new DevSettingTextFieldConfirmationButtonItem("Add 1 filter to remove text MESSAGE from logs (searches by substring, ignores case).", null, new NYTLoggingFiltersDevSettingsFactory$addMessageRemovalFiltersDevSetting$1(null), null, null, null, null, null, true, true, nYTLoggingDevSettingsFactory.b(), "4", false, 250, null);
        d = new DevSettingLazySummaryItem("Current NYT Logger Filters. Click to refresh.", new NYTLoggingFiltersDevSettingsFactory$currentNYTLoggerFiltersDevSetting$1(null), null, null, null, null, nYTLoggingDevSettingsFactory.b(), "3", false, true, 316, null);
        e = new DevSettingLazySummaryItem("Click to clear log removal filters for TAGs", null, null, new NYTLoggingFiltersDevSettingsFactory$clearTagRemovalFiltersDevSetting$1(null), null, null, nYTLoggingDevSettingsFactory.b(), "7", false, false, 566, null);
        f = new DevSettingLazySummaryItem("Click to clear log removal filters for MESSAGEs", null, null, new NYTLoggingFiltersDevSettingsFactory$clearMessageRemovalFiltersDevSetting$1(null), null, null, nYTLoggingDevSettingsFactory.b(), "6", false, false, 566, null);
        int i = DevSettingLazySummaryItem.m;
        int i2 = DevSettingTextFieldConfirmationButtonItem.n;
        g = i | i2 | i2;
    }

    private NYTLoggingFiltersDevSettingsFactory() {
    }

    public final void a(Context context) {
        zq3.h(context, "context");
        Set<String> stringSet = ContextUtilsKt.a(context).getStringSet("NYTLogger.tagFiltersKey", b0.e());
        if (stringSet == null) {
            stringSet = b0.e();
        }
        Set<String> stringSet2 = ContextUtilsKt.a(context).getStringSet("NYTLogger.msgFiltersKey", b0.e());
        if (stringSet2 == null) {
            stringSet2 = b0.e();
        }
        NYTLogger.u(stringSet);
        NYTLogger.t(stringSet2);
    }

    public final DevSettingTextFieldConfirmationButtonItem b() {
        return c;
    }

    public final DevSettingTextFieldConfirmationButtonItem c() {
        return b;
    }

    public final DevSettingLazySummaryItem d() {
        return f;
    }

    public final DevSettingLazySummaryItem e() {
        return e;
    }

    public final DevSettingLazySummaryItem f() {
        return d;
    }
}
