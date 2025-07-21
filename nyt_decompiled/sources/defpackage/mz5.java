package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
abstract class mz5 {
    private static final JsonReader.a a = JsonReader.a.a("nm", "sy", "pt", "p", QueryKeys.EXTERNAL_REFERRER, "or", "os", "ir", "is", "hd", QueryKeys.SUBDOMAIN);

    static PolystarShape a(JsonReader jsonReader, LottieComposition lottieComposition, int i) {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        PolystarShape.Type type2 = null;
        dh dhVar = null;
        sh shVar = null;
        dh dhVar2 = null;
        dh dhVar3 = null;
        dh dhVar4 = null;
        dh dhVar5 = null;
        dh dhVar6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    type2 = PolystarShape.Type.forValue(jsonReader.nextInt());
                    break;
                case 2:
                    dhVar = th.f(jsonReader, lottieComposition, false);
                    break;
                case 3:
                    shVar = ih.b(jsonReader, lottieComposition);
                    break;
                case 4:
                    dhVar2 = th.f(jsonReader, lottieComposition, false);
                    break;
                case 5:
                    dhVar4 = th.e(jsonReader, lottieComposition);
                    break;
                case 6:
                    dhVar6 = th.f(jsonReader, lottieComposition, false);
                    break;
                case 7:
                    dhVar3 = th.e(jsonReader, lottieComposition);
                    break;
                case 8:
                    dhVar5 = th.f(jsonReader, lottieComposition, false);
                    break;
                case 9:
                    z = jsonReader.nextBoolean();
                    break;
                case 10:
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    break;
            }
        }
        return new PolystarShape(str, type2, dhVar, shVar, dhVar2, dhVar3, dhVar4, dhVar5, dhVar6, z, z2);
    }
}
