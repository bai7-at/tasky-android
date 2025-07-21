package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class yo7 {
    private static final JsonReader.a a = JsonReader.a.a("nm", "hd", "it");

    static xo7 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                z = jsonReader.nextBoolean();
            } else if (r != 2) {
                jsonReader.skipValue();
            } else {
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    pw0 a2 = qw0.a(jsonReader, lottieComposition);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jsonReader.h();
            }
        }
        return new xo7(str, arrayList, z);
    }
}
