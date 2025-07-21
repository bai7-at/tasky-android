package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.nytimes.android.utils.TimeStampUtil;
import io.embrace.android.embracesdk.payload.Session;
import io.reactivex.subjects.PublishSubject;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class t74 implements s74 {
    private final Application a;
    private final PublishSubject b;
    private final TimeStampUtil c;

    public t74(Application application, PublishSubject publishSubject, TimeStampUtil timeStampUtil) {
        zq3.h(application, "context");
        zq3.h(publishSubject, "localeChangeListener");
        zq3.h(timeStampUtil, "timeStampUtil");
        this.a = application;
        this.b = publishSubject;
        this.c = timeStampUtil;
        Configuration configuration = application.getResources().getConfiguration();
        zq3.g(configuration, "getConfiguration(...)");
        String language = c(configuration).getLanguage();
        zq3.g(language, "getLanguage(...)");
        d(application, language);
    }

    private final Locale c(Configuration configuration) {
        Locale c = hu0.a(configuration).c(0);
        if (c != null) {
            return c;
        }
        Locale locale = Locale.getDefault();
        zq3.g(locale, "getDefault(...)");
        return locale;
    }

    private final void e(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    @Override // defpackage.s74
    public Context a(Activity activity) {
        zq3.h(activity, "activity");
        Context baseContext = activity.getBaseContext();
        zq3.g(baseContext, "getBaseContext(...)");
        return b(baseContext);
    }

    @Override // defpackage.s74
    public Context b(Context context) {
        zq3.h(context, "context");
        return d(context, Session.MESSAGE_TYPE_END);
    }

    public Context d(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "language");
        Configuration configuration = context.getResources().getConfiguration();
        zq3.e(configuration);
        Locale c = c(configuration);
        Locale locale = new Locale(str);
        if (!zq3.c(str, "") && !zq3.c(c.getLanguage(), str)) {
            Locale.setDefault(locale);
            e(configuration, locale);
            this.b.onNext(new j74());
        }
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        TimeStampUtil timeStampUtil = this.c;
        Resources resources = createConfigurationContext.getResources();
        zq3.g(resources, "getResources(...)");
        timeStampUtil.I(resources, locale);
        zq3.e(createConfigurationContext);
        return createConfigurationContext;
    }
}
