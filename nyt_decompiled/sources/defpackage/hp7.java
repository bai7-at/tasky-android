package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class hp7 {
    private static final JsonReader.a a = JsonReader.a.a("s", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.DOCUMENT_WIDTH, "nm", QueryKeys.MAX_SCROLL_DEPTH, "hd");

    static ShapeTrimPath a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        ShapeTrimPath.Type type2 = null;
        dh dhVar = null;
        dh dhVar2 = null;
        dh dhVar3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(a);
            if (r == 0) {
                dhVar = th.f(jsonReader, lottieComposition, false);
            } else if (r == 1) {
                dhVar2 = th.f(jsonReader, lottieComposition, false);
            } else if (r == 2) {
                dhVar3 = th.f(jsonReader, lottieComposition, false);
            } else if (r == 3) {
                str = jsonReader.nextString();
            } else if (r == 4) {
                type2 = ShapeTrimPath.Type.forId(jsonReader.nextInt());
            } else if (r != 5) {
                jsonReader.skipValue();
            } else {
                z = jsonReader.nextBoolean();
            }
        }
        return new ShapeTrimPath(str, type2, dhVar, dhVar2, dhVar3, z);
    }
}
