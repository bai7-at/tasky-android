package com.nytimes.android.abra.utilities;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import defpackage.by0;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import java.util.TimeZone;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public interface ParamProvider {

    public static final class DefaultImpls {
        public static String getAbraBundleUrl(ParamProvider paramProvider) {
            return "https://a1.nyt.com/analytics/abra/2.x/abra.bare-es.min.js";
        }

        public static TimeZone getCurrentTimeZone(ParamProvider paramProvider) {
            TimeZone timeZone = TimeZone.getDefault();
            zq3.g(timeZone, "getDefault(...)");
            return timeZone;
        }

        public static Map<String, String> getExtraParameters(ParamProvider paramProvider) {
            return t.i();
        }

        public static PointF getViewPort(ParamProvider paramProvider, Context context) {
            zq3.h(context, "context");
            PointF pointF = new PointF();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = displayMetrics.widthPixels;
            float f2 = displayMetrics.density;
            pointF.x = f / f2;
            pointF.y = displayMetrics.heightPixels / f2;
            return pointF;
        }

        public static Object onNetworkUpdate(ParamProvider paramProvider, by0<? super ww8> by0Var) {
            return ww8.a;
        }
    }

    String getAbraBundleUrl();

    String getAgentId();

    TimeZone getCurrentTimeZone();

    Map<String, String> getExtraParameters();

    String getIntegration();

    Map<String, String> getOverrides();

    PointF getViewPort(Context context);

    Object onNetworkUpdate(by0<? super ww8> by0Var);
}
