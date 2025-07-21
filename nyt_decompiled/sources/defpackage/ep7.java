package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
abstract class ep7 {
    static JsonReader.a a = JsonReader.a.a("nm", "ind", "ks", "hd");

    static dp7 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        int i = 0;
        boolean z = false;
        lh lhVar = null;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                i = jsonReader.nextInt();
            } else if (r == 2) {
                lhVar = th.k(jsonReader, lottieComposition);
            } else if (r != 3) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new dp7(str, i, lhVar, z);
    }
}
