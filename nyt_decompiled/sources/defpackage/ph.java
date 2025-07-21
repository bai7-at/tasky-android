package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;

/* loaded from: classes.dex */
public abstract class ph {
    private static final JsonReader.a a = JsonReader.a.a(Tag.A);
    private static final JsonReader.a b = JsonReader.a.a("fc", "sc", "sw", QueryKeys.TOKEN);

    public static oh a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.d();
        oh ohVar = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.r(a) != 0) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                ohVar = b(jsonReader, lottieComposition);
            }
        }
        jsonReader.i();
        return ohVar == null ? new oh(null, null, null, null) : ohVar;
    }

    private static oh b(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.d();
        ch chVar = null;
        ch chVar2 = null;
        dh dhVar = null;
        dh dhVar2 = null;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(b);
            if (r == 0) {
                chVar = th.c(jsonReader, lottieComposition);
            } else if (r == 1) {
                chVar2 = th.c(jsonReader, lottieComposition);
            } else if (r == 2) {
                dhVar = th.e(jsonReader, lottieComposition);
            } else if (r != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                dhVar2 = th.e(jsonReader, lottieComposition);
            }
        }
        jsonReader.i();
        return new oh(chVar, chVar2, dhVar, dhVar2);
    }
}
