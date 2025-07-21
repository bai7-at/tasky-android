package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class qx6 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.DOCUMENT_WIDTH, "tr", "hd");

    static ox6 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        dh dhVar = null;
        dh dhVar2 = null;
        qh qhVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                dhVar = th.f(jsonReader, lottieComposition, false);
            } else if (r == 2) {
                dhVar2 = th.f(jsonReader, lottieComposition, false);
            } else if (r == 3) {
                qhVar = rh.g(jsonReader, lottieComposition);
            } else if (r != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new ox6(str, dhVar, dhVar2, qhVar, z);
    }
}
