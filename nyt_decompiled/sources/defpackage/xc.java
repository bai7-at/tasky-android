package defpackage;

import android.app.Activity;
import android.app.Application;
import com.nytimes.android.analytics.api.Channel;
import com.nytimes.android.analytics.api.exception.EventRoutingException;
import com.nytimes.android.logging.NYTLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class xc implements wc {
    private final List a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.AppsFlyer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Channel.Firebase.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public xc(List list) {
        zq3.h(list, "channelHandlers");
        this.a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("need at least one channel handler");
        }
    }

    @Override // defpackage.wc
    public void a(m98 m98Var) {
        zq3.h(m98Var, "user");
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((gc) it2.next()).o(m98Var);
        }
    }

    @Override // defpackage.wc
    public void c(Activity activity) {
        zq3.h(activity, "activity");
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((gc) it2.next()).n(activity);
        }
    }

    @Override // defpackage.wc
    public void d(Application application) {
        zq3.h(application, "application");
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((gc) it2.next()).e(application);
        }
    }

    @Override // defpackage.wc
    public void e(Activity activity) {
        zq3.h(activity, "activity");
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((gc) it2.next()).l(activity);
        }
    }

    @Override // defpackage.g42
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(uc ucVar) {
        zq3.h(ucVar, "event");
        List list = this.a;
        ArrayList<gc> arrayList = new ArrayList();
        for (Object obj : list) {
            if (ucVar.a().contains(((gc) obj).b())) {
                arrayList.add(obj);
            }
        }
        for (gc gcVar : arrayList) {
            try {
                int i = a.a[gcVar.b().ordinal()];
                if (i == 1) {
                    zq3.f(gcVar, "null cannot be cast to non-null type com.nytimes.android.analytics.handler.AnalyticsChannelHandler<com.nytimes.android.analytics.api.event.AppsFlyerEvent>");
                    gcVar.d((on) ucVar);
                } else if (i == 2) {
                    zq3.f(gcVar, "null cannot be cast to non-null type com.nytimes.android.analytics.handler.AnalyticsChannelHandler<com.nytimes.android.analytics.api.event.FacebookEvent>");
                    gcVar.d((k92) ucVar);
                } else if (i == 3) {
                    zq3.f(gcVar, "null cannot be cast to non-null type com.nytimes.android.analytics.handler.AnalyticsChannelHandler<com.nytimes.android.analytics.api.event.FirebaseEvent>");
                    gcVar.d((ci2) ucVar);
                }
            } catch (EventRoutingException e) {
                NYTLogger.h(e);
            }
        }
    }
}
