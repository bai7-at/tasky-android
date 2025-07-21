package com.nytimes.android.libs.iterate;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.iteratehq.iterate.Iterate;
import com.iteratehq.iterate.model.InteractionEventData;
import com.iteratehq.iterate.model.InteractionEventTypes;
import com.iteratehq.iterate.model.StringToAnyMap;
import com.nytimes.abtests.IterateSurveyVariants;
import com.nytimes.android.abra.utilities.ParamProviderKt;
import com.nytimes.android.secrets.Secrets;
import com.nytimes.android.utils.AppPreferences;
import defpackage.b05;
import defpackage.bs3;
import defpackage.cb2;
import defpackage.du8;
import defpackage.gt2;
import defpackage.il6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class IterateSurveyReporterImpl implements bs3 {
    private final cb2 a;
    private final AppPreferences b;
    private final b05 c;
    private final Application d;

    public IterateSurveyReporterImpl(cb2 cb2Var, AppPreferences appPreferences, b05 b05Var, Application application) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(b05Var, "nytClock");
        zq3.h(application, "application");
        this.a = cb2Var;
        this.b = appPreferences;
        this.c = b05Var;
        this.d = application;
    }

    @Override // defpackage.bs3
    public void a(IterateUserType iterateUserType, String str) {
        zq3.h(iterateUserType, "userType");
        zq3.h(str, "agentId");
        Iterate.f(new StringToAnyMap(du8.a(ParamProviderKt.PARAM_AGENT_ID, str), du8.a("userType", iterateUserType.getValue())));
    }

    @Override // defpackage.bs3
    public void b(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        String string = this.d.getString(il6.ITERATE_HYBRID_SCROLL_UP_EVENT);
        zq3.g(string, "getString(...)");
        Iterate.m(string, fragmentManager, null, 4, null);
    }

    @Override // defpackage.bs3
    public void c(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        String string = this.d.getString(il6.ITERATE_YOU_TAB_SCROLL_EVENT);
        zq3.g(string, "getString(...)");
        Iterate.m(string, fragmentManager, null, 4, null);
        Iterate.j(new gt2() { // from class: com.nytimes.android.libs.iterate.IterateSurveyReporterImpl$promptYouTabScrollSurvey$1
            {
                super(2);
            }

            public final void b(InteractionEventTypes interactionEventTypes, InteractionEventData interactionEventData) {
                AppPreferences appPreferences;
                Application application;
                b05 b05Var;
                zq3.h(interactionEventTypes, TransferTable.COLUMN_TYPE);
                zq3.h(interactionEventData, "data");
                if (zq3.c(interactionEventTypes.getValue(), "displayed")) {
                    appPreferences = IterateSurveyReporterImpl.this.b;
                    application = IterateSurveyReporterImpl.this.d;
                    String string2 = application.getString(il6.ITERATE_YOU_TAB_SCROLL_EVENT);
                    zq3.g(string2, "getString(...)");
                    b05Var = IterateSurveyReporterImpl.this.c;
                    appPreferences.c(string2, b05Var.c());
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InteractionEventTypes) obj, (InteractionEventData) obj2);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.bs3
    public void d(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        String string = this.d.getString(il6.ITERATE_HOME_SCROLL_EVENT);
        zq3.g(string, "getString(...)");
        Iterate.m(string, fragmentManager, null, 4, null);
        Iterate.j(new gt2() { // from class: com.nytimes.android.libs.iterate.IterateSurveyReporterImpl$promptHomeScrollSurvey$1
            {
                super(2);
            }

            public final void b(InteractionEventTypes interactionEventTypes, InteractionEventData interactionEventData) {
                AppPreferences appPreferences;
                Application application;
                b05 b05Var;
                zq3.h(interactionEventTypes, TransferTable.COLUMN_TYPE);
                zq3.h(interactionEventData, "data");
                if (zq3.c(interactionEventTypes.getValue(), "displayed")) {
                    appPreferences = IterateSurveyReporterImpl.this.b;
                    application = IterateSurveyReporterImpl.this.d;
                    String string2 = application.getString(il6.ITERATE_HOME_SCROLL_EVENT);
                    zq3.g(string2, "getString(...)");
                    b05Var = IterateSurveyReporterImpl.this.c;
                    appPreferences.c(string2, b05Var.c());
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InteractionEventTypes) obj, (InteractionEventData) obj2);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.bs3
    public void e() {
        Iterate.k();
        Iterate.h(this.d, this.a.c() == IterateSurveyVariants.PRODUCTION ? Secrets.ITERATE_API_KEY_PROD.decode() : Secrets.ITERATE_API_KEY_STAGING.decode(), null, null, null, false, 28, null);
    }

    @Override // defpackage.bs3
    public void f(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        Iterate.m("you-tab-viewed", fragmentManager, null, 4, null);
    }

    @Override // defpackage.bs3
    public void g(FragmentManager fragmentManager) {
        zq3.h(fragmentManager, "fragmentManager");
        String string = this.d.getString(il6.ITERATE_PLAY_TAB_SCROLL_UP_EVENT);
        zq3.g(string, "getString(...)");
        Iterate.m(string, fragmentManager, null, 4, null);
    }
}
