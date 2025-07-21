package defpackage;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.Tag;

/* loaded from: classes.dex */
abstract class df4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static Mask a(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z;
        boolean z2;
        jsonReader.d();
        Mask.MaskMode maskMode = null;
        lh lhVar = null;
        fh fhVar = null;
        boolean z3 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                    if (nextName.equals(QueryKeys.DOCUMENT_WIDTH)) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    fhVar = th.h(jsonReader, lottieComposition);
                    break;
                case true:
                    lhVar = th.k(jsonReader, lottieComposition);
                    break;
                case true:
                    z3 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals(Tag.A)) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 105:
                            if (nextString.equals(QueryKeys.VIEW_TITLE)) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 110:
                            if (nextString.equals(QueryKeys.IS_NEW_USER)) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case true:
                            lottieComposition.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case true:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            j94.c("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.i();
        return new Mask(maskMode, lhVar, fhVar, z3);
    }
}
