package defpackage;

import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.devsettings.common.DevSettingTextFieldConfirmationButtonItem;
import com.nytimes.android.logging.devsettings.items.NYTLoggingDevSettingsFactory;
import com.nytimes.android.logging.devsettings.items.NYTLoggingFiltersDevSettingsFactory;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class u05 {
    public static final u05 a = new u05();

    private u05() {
    }

    public final un1 a() {
        NYTLoggingFiltersDevSettingsFactory nYTLoggingFiltersDevSettingsFactory = NYTLoggingFiltersDevSettingsFactory.a;
        DevSettingTextFieldConfirmationButtonItem b = nYTLoggingFiltersDevSettingsFactory.b();
        DevSettingTextFieldConfirmationButtonItem c = nYTLoggingFiltersDevSettingsFactory.c();
        DevSettingLazySummaryItem e = nYTLoggingFiltersDevSettingsFactory.e();
        DevSettingLazySummaryItem d = nYTLoggingFiltersDevSettingsFactory.d();
        DevSettingLazySummaryItem f = nYTLoggingFiltersDevSettingsFactory.f();
        NYTLoggingDevSettingsFactory nYTLoggingDevSettingsFactory = NYTLoggingDevSettingsFactory.a;
        return new DevSettingGroupExpandable("Logging Dev Settings", i.X0(b0.j(b, c, e, d, f, nYTLoggingDevSettingsFactory.a())), null, false, nYTLoggingDevSettingsFactory.b(), null, false, false, 236, null);
    }
}
