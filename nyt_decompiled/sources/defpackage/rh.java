package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;

/* loaded from: classes.dex */
public abstract class rh {
    private static final JsonReader.a a = JsonReader.a.a(Tag.A, "p", "s", "rz", QueryKeys.EXTERNAL_REFERRER, QueryKeys.DOCUMENT_WIDTH, "so", "eo", "sk", "sa");
    private static final JsonReader.a b = JsonReader.a.a("k");

    private static boolean a(hh hhVar) {
        return hhVar == null || (hhVar.c() && ((PointF) ((rw3) hhVar.b().get(0)).b).equals(0.0f, 0.0f));
    }

    private static boolean b(sh shVar) {
        return shVar == null || (!(shVar instanceof mh) && shVar.c() && ((PointF) ((rw3) shVar.b().get(0)).b).equals(0.0f, 0.0f));
    }

    private static boolean c(dh dhVar) {
        return dhVar == null || (dhVar.c() && ((Float) ((rw3) dhVar.b().get(0)).b).floatValue() == 0.0f);
    }

    private static boolean d(kh khVar) {
        return khVar == null || (khVar.c() && ((qa7) ((rw3) khVar.b().get(0)).b).a(1.0f, 1.0f));
    }

    private static boolean e(dh dhVar) {
        return dhVar == null || (dhVar.c() && ((Float) ((rw3) dhVar.b().get(0)).b).floatValue() == 0.0f);
    }

    private static boolean f(dh dhVar) {
        return dhVar == null || (dhVar.c() && ((Float) ((rw3) dhVar.b().get(0)).b).floatValue() == 0.0f);
    }

    public static qh g(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z;
        boolean z2 = false;
        boolean z3 = jsonReader.l() == JsonReader.Token.BEGIN_OBJECT;
        if (z3) {
            jsonReader.d();
        }
        dh dhVar = null;
        hh hhVar = null;
        sh shVar = null;
        kh khVar = null;
        dh dhVar2 = null;
        dh dhVar3 = null;
        fh fhVar = null;
        dh dhVar4 = null;
        dh dhVar5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.r(a)) {
                case 0:
                    boolean z4 = z2;
                    jsonReader.d();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.r(b) != 0) {
                            jsonReader.s();
                            jsonReader.skipValue();
                        } else {
                            hhVar = ih.a(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.i();
                    z2 = z4;
                    continue;
                case 1:
                    shVar = ih.b(jsonReader, lottieComposition);
                    continue;
                case 2:
                    khVar = th.j(jsonReader, lottieComposition);
                    continue;
                case 3:
                    lottieComposition.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    fhVar = th.h(jsonReader, lottieComposition);
                    continue;
                case 6:
                    dhVar4 = th.f(jsonReader, lottieComposition, z2);
                    continue;
                case 7:
                    dhVar5 = th.f(jsonReader, lottieComposition, z2);
                    continue;
                case 8:
                    dhVar2 = th.f(jsonReader, lottieComposition, z2);
                    continue;
                case 9:
                    dhVar3 = th.f(jsonReader, lottieComposition, z2);
                    continue;
                default:
                    jsonReader.s();
                    jsonReader.skipValue();
                    continue;
            }
            dh f = th.f(jsonReader, lottieComposition, z2);
            if (f.b().isEmpty()) {
                f.b().add(new rw3(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f())));
            } else if (((rw3) f.b().get(0)).b == null) {
                z = false;
                f.b().set(0, new rw3(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.f())));
                z2 = z;
                dhVar = f;
            }
            z = false;
            z2 = z;
            dhVar = f;
        }
        if (z3) {
            jsonReader.i();
        }
        hh hhVar2 = a(hhVar) ? null : hhVar;
        sh shVar2 = b(shVar) ? null : shVar;
        dh dhVar6 = c(dhVar) ? null : dhVar;
        if (d(khVar)) {
            khVar = null;
        }
        return new qh(hhVar2, shVar2, khVar, dhVar6, fhVar, dhVar4, dhVar5, f(dhVar2) ? null : dhVar2, e(dhVar3) ? null : dhVar3);
    }
}
