package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class ra7 implements v39 {
    public static final ra7 a = new ra7();

    private ra7() {
    }

    @Override // defpackage.v39
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qa7 a(JsonReader jsonReader, float f) {
        boolean z = jsonReader.l() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.b();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.h();
        }
        return new qa7((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
