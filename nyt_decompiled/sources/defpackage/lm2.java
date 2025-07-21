package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class lm2 {
    private static final JsonReader.a a = JsonReader.a.a("ch", "size", QueryKeys.SCROLL_WINDOW_HEIGHT, "style", "fFamily", "data");
    private static final JsonReader.a b = JsonReader.a.a("shapes");

    static km2 a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        jsonReader.d();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                c = jsonReader.nextString().charAt(0);
            } else if (r == 1) {
                d2 = jsonReader.nextDouble();
            } else if (r == 2) {
                d = jsonReader.nextDouble();
            } else if (r == 3) {
                str = jsonReader.nextString();
            } else if (r == 4) {
                str2 = jsonReader.nextString();
            } else if (r != 5) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                jsonReader.d();
                while (jsonReader.hasNext()) {
                    if (jsonReader.r(b) != 0) {
                        jsonReader.s();
                        jsonReader.skipValue();
                    } else {
                        jsonReader.b();
                        while (jsonReader.hasNext()) {
                            arrayList.add((xo7) qw0.a(jsonReader, lottieComposition));
                        }
                        jsonReader.h();
                    }
                }
                jsonReader.i();
            }
        }
        jsonReader.i();
        return new km2(arrayList, c, d2, d, str, str2);
    }
}
