package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class m90 {
    private static final JsonReader.a a = JsonReader.a.a("ef");
    private static final JsonReader.a b = JsonReader.a.a("ty", QueryKeys.INTERNAL_REFERRER);

    private static l90 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.d();
        l90 l90Var = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                int r = jsonReader.r(b);
                if (r != 0) {
                    if (r != 1) {
                        jsonReader.s();
                        jsonReader.skipValue();
                    } else if (z) {
                        l90Var = new l90(th.e(jsonReader, lottieComposition));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
            jsonReader.i();
            return l90Var;
        }
    }

    static l90 b(JsonReader jsonReader, LottieComposition lottieComposition) {
        l90 l90Var = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.r(a) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    l90 a2 = a(jsonReader, lottieComposition);
                    if (a2 != null) {
                        l90Var = a2;
                    }
                }
                jsonReader.h();
            }
        }
        return l90Var;
    }
}
