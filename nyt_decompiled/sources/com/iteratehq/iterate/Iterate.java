package com.iteratehq.iterate;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import com.chartbeat.androidsdk.QueryKeys;
import com.iteratehq.iterate.model.AppContext;
import com.iteratehq.iterate.model.Auth;
import com.iteratehq.iterate.model.EmbedContext;
import com.iteratehq.iterate.model.EmbedResults;
import com.iteratehq.iterate.model.EmbedType;
import com.iteratehq.iterate.model.EventContext;
import com.iteratehq.iterate.model.Frequency;
import com.iteratehq.iterate.model.InteractionEventSource;
import com.iteratehq.iterate.model.ProgressEventMessageData;
import com.iteratehq.iterate.model.StringToAnyMap;
import com.iteratehq.iterate.model.Survey;
import com.iteratehq.iterate.model.TargetingContext;
import com.iteratehq.iterate.model.Tracking;
import com.iteratehq.iterate.model.TrackingContext;
import com.iteratehq.iterate.model.Trigger;
import com.iteratehq.iterate.model.TriggerType;
import com.iteratehq.iterate.view.SurveyView;
import defpackage.co3;
import defpackage.di1;
import defpackage.do3;
import defpackage.e76;
import defpackage.gt2;
import defpackage.qj;
import defpackage.zq3;
import defpackage.zr3;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class Iterate {
    public static final Iterate a = new Iterate();
    private static zr3 b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;

    public static final class a implements e76.b {
        final /* synthetic */ Survey a;
        final /* synthetic */ long b;
        final /* synthetic */ FragmentManager c;

        a(Survey survey, long j, FragmentManager fragmentManager) {
            this.a = survey;
            this.b = j;
            this.c = fragmentManager;
        }

        @Override // e76.b
        public void a(InteractionEventSource interactionEventSource, ProgressEventMessageData progressEventMessageData) {
            zq3.h(interactionEventSource, "source");
            Iterate.a.e(interactionEventSource, this.a, progressEventMessageData);
        }

        @Override // e76.b
        public void b(Survey survey) {
            zq3.h(survey, "survey");
            Iterate.a.o(survey, this.b, this.c);
        }
    }

    public static final class b implements SurveyView.b {
        final /* synthetic */ Survey a;

        b(Survey survey) {
            this.a = survey;
        }

        @Override // com.iteratehq.iterate.view.SurveyView.b
        public void a(InteractionEventSource interactionEventSource, ProgressEventMessageData progressEventMessageData) {
            zq3.h(interactionEventSource, "source");
            Iterate.a.e(interactionEventSource, this.a, progressEventMessageData);
        }
    }

    private Iterate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(InteractionEventSource interactionEventSource, Survey survey, ProgressEventMessageData progressEventMessageData) {
        zr3 zr3Var = b;
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        zr3Var.p(survey);
        do3.a.a(interactionEventSource, survey, progressEventMessageData);
    }

    public static final void f(StringToAnyMap stringToAnyMap) {
        zq3.h(stringToAnyMap, "userTraits");
        zr3 zr3Var = b;
        if (zr3Var == null) {
            throw new IllegalStateException("Error calling Iterate.identify(). Make sure you call Iterate.init() before calling identify, see README for details");
        }
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        zr3Var.a(stringToAnyMap);
    }

    public static final void g(Context context, String str, String str2, String str3, String str4, boolean z) {
        zq3.h(context, "context");
        zq3.h(str, "apiKey");
        Context applicationContext = context.getApplicationContext();
        zq3.g(applicationContext, "context.applicationContext");
        b = new di1(applicationContext, str, z, null, null, null, 56, null);
        c = str;
        d = str2;
        e = str3;
        f = str4;
        a.i(str);
    }

    public static /* synthetic */ void h(Context context, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        String str7 = (i & 16) != 0 ? null : str4;
        if ((i & 32) != 0) {
            z = true;
        }
        g(context, str, str5, str6, str7, z);
    }

    private final void i(String str) {
        zr3 zr3Var = b;
        zr3 zr3Var2 = null;
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        zr3Var.b(str);
        zr3 zr3Var3 = b;
        if (zr3Var3 == null) {
            zq3.z("iterateRepository");
            zr3Var3 = null;
        }
        String g = zr3Var3.g();
        if (g != null) {
            zr3 zr3Var4 = b;
            if (zr3Var4 == null) {
                zq3.z("iterateRepository");
                zr3Var4 = null;
            }
            zr3Var4.h(g);
            zr3 zr3Var5 = b;
            if (zr3Var5 == null) {
                zq3.z("iterateRepository");
            } else {
                zr3Var2 = zr3Var5;
            }
            zr3Var2.o(g);
        }
    }

    public static final void j(gt2 gt2Var) {
        zq3.h(gt2Var, "userOnEventCallback");
        co3.a.c(gt2Var);
    }

    public static final void k() {
        zr3 zr3Var = b;
        if (zr3Var != null) {
            String str = null;
            if (zr3Var == null) {
                zq3.z("iterateRepository");
                zr3Var = null;
            }
            zr3Var.k();
            zr3 zr3Var2 = b;
            if (zr3Var2 == null) {
                zq3.z("iterateRepository");
                zr3Var2 = null;
            }
            String str2 = c;
            if (str2 == null) {
                zq3.z("apiKey");
            } else {
                str = str2;
            }
            zr3Var2.o(str);
        }
    }

    public static final void l(String str, final FragmentManager fragmentManager, final StringToAnyMap stringToAnyMap) {
        zq3.h(str, "eventName");
        zq3.h(fragmentManager, "fragmentManager");
        zr3 zr3Var = b;
        if (zr3Var == null) {
            throw new IllegalStateException("Error calling Iterate.sendEvent(). Make sure you call Iterate.init() before calling sendEvent, see README for details");
        }
        zr3 zr3Var2 = null;
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        StringToAnyMap c2 = zr3Var.c();
        zr3 zr3Var3 = b;
        if (zr3Var3 == null) {
            zq3.z("iterateRepository");
            zr3Var3 = null;
        }
        Long j = zr3Var3.j();
        TrackingContext trackingContext = j != null ? new TrackingContext(j) : null;
        zr3 zr3Var4 = b;
        if (zr3Var4 == null) {
            zq3.z("iterateRepository");
            zr3Var4 = null;
        }
        String d2 = zr3Var4.d();
        EmbedContext embedContext = new EmbedContext(new AppContext(d, "1.1.4"), new EventContext(str), d2 != null ? new TargetingContext(Frequency.ALWAYS, d2) : null, trackingContext, EmbedType.MOBILE, c2);
        zr3 zr3Var5 = b;
        if (zr3Var5 == null) {
            zq3.z("iterateRepository");
        } else {
            zr3Var2 = zr3Var5;
        }
        zr3Var2.i(embedContext, new qj() { // from class: com.iteratehq.iterate.Iterate$sendEvent$2
            @Override // defpackage.qj
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(EmbedResults embedResults) {
                zr3 zr3Var6;
                zr3 zr3Var7;
                String token;
                zr3 zr3Var8;
                zr3 zr3Var9;
                zq3.h(embedResults, "result");
                Auth auth = embedResults.getAuth();
                zr3 zr3Var10 = null;
                if (auth != null && (token = auth.getToken()) != null) {
                    zr3Var8 = Iterate.b;
                    if (zr3Var8 == null) {
                        zq3.z("iterateRepository");
                        zr3Var8 = null;
                    }
                    zr3Var8.h(token);
                    zr3Var9 = Iterate.b;
                    if (zr3Var9 == null) {
                        zq3.z("iterateRepository");
                        zr3Var9 = null;
                    }
                    zr3Var9.o(token);
                }
                Tracking tracking = embedResults.getTracking();
                if (tracking != null) {
                    long lastUpdated = tracking.getLastUpdated();
                    zr3Var7 = Iterate.b;
                    if (zr3Var7 == null) {
                        zq3.z("iterateRepository");
                        zr3Var7 = null;
                    }
                    zr3Var7.e(lastUpdated);
                }
                Survey survey = embedResults.getSurvey();
                if (survey != null) {
                    StringToAnyMap stringToAnyMap2 = StringToAnyMap.this;
                    FragmentManager fragmentManager2 = fragmentManager;
                    long time = new Date().getTime();
                    if (stringToAnyMap2 != null) {
                        zr3Var6 = Iterate.b;
                        if (zr3Var6 == null) {
                            zq3.z("iterateRepository");
                        } else {
                            zr3Var10 = zr3Var6;
                        }
                        zr3Var10.n(stringToAnyMap2, time);
                    }
                    List<Trigger> triggers = embedResults.getTriggers();
                    if (triggers == null || triggers.isEmpty() || embedResults.getTriggers().get(0).getType() != TriggerType.SECONDS) {
                        Iterate.a.p(survey, time, fragmentManager2);
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new Iterate$sendEvent$2$onSuccess$3$1(embedResults, survey, time, fragmentManager2, null), 3, null);
                    }
                }
            }

            @Override // defpackage.qj
            public void onError(Exception exc) {
                zq3.h(exc, QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING);
                Log.e("sendEvent error", exc.toString());
            }
        });
    }

    public static /* synthetic */ void m(String str, FragmentManager fragmentManager, StringToAnyMap stringToAnyMap, int i, Object obj) {
        if ((i & 4) != 0) {
            stringToAnyMap = null;
        }
        l(str, fragmentManager, stringToAnyMap);
    }

    private final void n(Survey survey, long j, FragmentManager fragmentManager) {
        e76 a2 = e76.e.a(survey, e, f);
        a2.k1(new a(survey, j, fragmentManager));
        try {
            if (!fragmentManager.K0()) {
                a2.show(fragmentManager, (String) null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        do3.a.b(survey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Survey survey, long j, FragmentManager fragmentManager) {
        zr3 zr3Var = b;
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        String g = zr3Var.g();
        if (g == null) {
            zr3 zr3Var2 = b;
            if (zr3Var2 == null) {
                zq3.z("iterateRepository");
                zr3Var2 = null;
            }
            g = zr3Var2.f();
        }
        String str = g;
        zr3 zr3Var3 = b;
        if (zr3Var3 == null) {
            zq3.z("iterateRepository");
            zr3Var3 = null;
        }
        SurveyView a2 = SurveyView.e.a(survey, str, zr3Var3.l(j), e, f);
        a2.i1(new b(survey));
        try {
            if (!fragmentManager.K0()) {
                a2.show(fragmentManager, (String) null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        do3.a.e(survey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Survey survey, long j, FragmentManager fragmentManager) {
        if (survey.getPrompt() != null) {
            n(survey, j, fragmentManager);
        } else {
            o(survey, j, fragmentManager);
        }
        zr3 zr3Var = b;
        if (zr3Var == null) {
            zq3.z("iterateRepository");
            zr3Var = null;
        }
        zr3Var.m(survey);
    }
}
