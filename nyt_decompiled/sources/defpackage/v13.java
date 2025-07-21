package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class v13 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.ACCOUNT_ID, QueryKeys.DOCUMENT_WIDTH, QueryKeys.TOKEN, "s", QueryKeys.ENGAGED_SECONDS_SINCE_LAST_PING, QueryKeys.SCROLL_WINDOW_HEIGHT, "lc", "lj", "ml", "hd", QueryKeys.SUBDOMAIN);
    private static final JsonReader.a b = JsonReader.a.a("p", "k");
    private static final JsonReader.a c = JsonReader.a.a(QueryKeys.IS_NEW_USER, QueryKeys.INTERNAL_REFERRER);

    static a a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str;
        eh ehVar;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        GradientType gradientType = null;
        eh ehVar2 = null;
        jh jhVar = null;
        jh jhVar2 = null;
        dh dhVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        dh dhVar2 = null;
        boolean z = false;
        fh fhVar = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    str2 = jsonReader.nextString();
                    continue;
                case 1:
                    str = str2;
                    jsonReader.d();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        int r = jsonReader.r(b);
                        if (r != 0) {
                            ehVar = ehVar2;
                            if (r != 1) {
                                jsonReader.s();
                                jsonReader.skipValue();
                            } else {
                                ehVar2 = th.g(jsonReader, lottieComposition, i);
                            }
                        } else {
                            ehVar = ehVar2;
                            i = jsonReader.nextInt();
                        }
                        ehVar2 = ehVar;
                    }
                    jsonReader.i();
                    break;
                case 2:
                    fhVar = th.h(jsonReader, lottieComposition);
                    continue;
                case 3:
                    str = str2;
                    gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    jhVar = th.i(jsonReader, lottieComposition);
                    continue;
                case 5:
                    jhVar2 = th.i(jsonReader, lottieComposition);
                    continue;
                case 6:
                    dhVar = th.e(jsonReader, lottieComposition);
                    continue;
                case 7:
                    str = str2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 8:
                    str = str2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z = jsonReader.nextBoolean();
                    continue;
                case 11:
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        jsonReader.d();
                        String str3 = null;
                        dh dhVar3 = null;
                        while (jsonReader.hasNext()) {
                            int r2 = jsonReader.r(c);
                            if (r2 != 0) {
                                dh dhVar4 = dhVar2;
                                if (r2 != 1) {
                                    jsonReader.s();
                                    jsonReader.skipValue();
                                } else {
                                    dhVar3 = th.e(jsonReader, lottieComposition);
                                }
                                dhVar2 = dhVar4;
                            } else {
                                str3 = jsonReader.nextString();
                            }
                        }
                        dh dhVar5 = dhVar2;
                        jsonReader.i();
                        if (str3.equals(QueryKeys.DOCUMENT_WIDTH)) {
                            dhVar2 = dhVar3;
                        } else {
                            if (str3.equals(QueryKeys.SUBDOMAIN) || str3.equals(QueryKeys.ACCOUNT_ID)) {
                                lottieComposition.v(true);
                                arrayList.add(dhVar3);
                            }
                            dhVar2 = dhVar5;
                        }
                    }
                    dh dhVar6 = dhVar2;
                    jsonReader.h();
                    if (arrayList.size() == 1) {
                        arrayList.add((dh) arrayList.get(0));
                    }
                    dhVar2 = dhVar6;
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (fhVar == null) {
            fhVar = new fh(Collections.singletonList(new rw3(100)));
        }
        return new a(str4, gradientType, ehVar2, fhVar, jhVar, jhVar2, dhVar, lineCapType, lineJoinType, f, arrayList, dhVar2, z);
    }
}
