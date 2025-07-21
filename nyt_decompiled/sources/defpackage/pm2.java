package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
abstract class pm2 {
    private static final JsonReader.a a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    static hm2 a(JsonReader jsonReader) {
        jsonReader.d();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                str = jsonReader.nextString();
            } else if (r == 1) {
                str3 = jsonReader.nextString();
            } else if (r == 2) {
                str2 = jsonReader.nextString();
            } else if (r != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                f = (float) jsonReader.nextDouble();
            }
        }
        jsonReader.i();
        return new hm2(str, str3, str2, f);
    }
}
