package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
public abstract class i37 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.EXTERNAL_REFERRER, "hd");

    static g37 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z = false;
        String str = null;
        dh dhVar = null;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                dhVar = th.f(jsonReader, lottieComposition, true);
            } else if (r != 2) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        if (z) {
            return null;
        }
        return new g37(str, dhVar);
    }
}
