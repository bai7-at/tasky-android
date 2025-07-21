package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class rt6 {
    private static final JsonReader.a a = JsonReader.a.a("nm", "p", "s", QueryKeys.EXTERNAL_REFERRER, "hd");

    static pt6 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        sh shVar = null;
        jh jhVar = null;
        dh dhVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                shVar = ih.b(jsonReader, lottieComposition);
            } else if (r == 2) {
                jhVar = th.i(jsonReader, lottieComposition);
            } else if (r == 3) {
                dhVar = th.e(jsonReader, lottieComposition);
            } else if (r != 4) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new pt6(str, shVar, jhVar, dhVar, z);
    }
}
