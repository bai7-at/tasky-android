package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class jx5 implements v39 {
    public static final jx5 a = new jx5();

    private jx5() {
    }

    @Override // defpackage.v39
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f) {
        JsonReader.Token l = jsonReader.l();
        if (l != JsonReader.Token.BEGIN_ARRAY && l != JsonReader.Token.BEGIN_OBJECT) {
            if (l == JsonReader.Token.NUMBER) {
                PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + l);
        }
        return iu3.e(jsonReader, f);
    }
}
