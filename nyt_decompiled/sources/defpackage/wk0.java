package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class wk0 {
    private static final JsonReader.a a = JsonReader.a.a("nm", "p", "s", "hd", QueryKeys.SUBDOMAIN);

    static vk0 a(JsonReader jsonReader, LottieComposition lottieComposition, int i) {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        sh shVar = null;
        jh jhVar = null;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                shVar = ih.b(jsonReader, lottieComposition);
            } else if (r == 2) {
                jhVar = th.i(jsonReader, lottieComposition);
            } else if (r == 3) {
                z2 = jsonReader.nextBoolean();
            } else if (r != 4) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextInt() == 3;
            }
        }
        return new vk0(str, shVar, jhVar, z, z2);
    }
}
