package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
abstract class fp7 {
    private static final JsonReader.a a = JsonReader.a.a("nm", QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.SCROLL_WINDOW_HEIGHT, QueryKeys.DOCUMENT_WIDTH, "lc", "lj", "ml", "hd", QueryKeys.SUBDOMAIN);
    private static final JsonReader.a b = JsonReader.a.a(QueryKeys.IS_NEW_USER, QueryKeys.INTERNAL_REFERRER);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static ShapeStroke a(JsonReader jsonReader, LottieComposition lottieComposition) {
        char c;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        dh dhVar = null;
        ch chVar = null;
        dh dhVar2 = null;
        fh fhVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    chVar = th.c(jsonReader, lottieComposition);
                    break;
                case 2:
                    dhVar2 = th.e(jsonReader, lottieComposition);
                    break;
                case 3:
                    fhVar = th.h(jsonReader, lottieComposition);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.b();
                    while (jsonReader.hasNext()) {
                        jsonReader.d();
                        String str2 = null;
                        dh dhVar3 = null;
                        while (jsonReader.hasNext()) {
                            int r = jsonReader.r(b);
                            if (r == 0) {
                                str2 = jsonReader.nextString();
                            } else if (r != 1) {
                                jsonReader.s();
                                jsonReader.skipValue();
                            } else {
                                dhVar3 = th.e(jsonReader, lottieComposition);
                            }
                        }
                        jsonReader.i();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals(QueryKeys.SUBDOMAIN)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 103:
                                if (str2.equals(QueryKeys.ACCOUNT_ID)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                if (str2.equals(QueryKeys.DOCUMENT_WIDTH)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                lottieComposition.v(true);
                                arrayList.add(dhVar3);
                                break;
                            case 2:
                                dhVar = dhVar3;
                                break;
                        }
                    }
                    jsonReader.h();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((dh) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new ShapeStroke(str, dhVar, arrayList, chVar, fhVar == null ? new fh(Collections.singletonList(new rw3(100))) : fhVar, dhVar2, lineCapType == null ? ShapeStroke.LineCapType.BUTT : lineCapType, lineJoinType == null ? ShapeStroke.LineJoinType.MITER : lineJoinType, f, z);
    }
}
