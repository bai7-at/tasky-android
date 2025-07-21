package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class to7 implements v39 {
    public static final to7 a = new to7();
    private static final JsonReader.a b = JsonReader.a.a(QueryKeys.TIME_ON_VIEW_IN_MINUTES, QueryKeys.INTERNAL_REFERRER, QueryKeys.VIEW_TITLE, QueryKeys.DOCUMENT_WIDTH);

    private to7() {
    }

    @Override // defpackage.v39
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public so7 a(JsonReader jsonReader, float f) {
        if (jsonReader.l() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.d();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int r = jsonReader.r(b);
            if (r == 0) {
                z = jsonReader.nextBoolean();
            } else if (r == 1) {
                list = iu3.f(jsonReader, f);
            } else if (r == 2) {
                list2 = iu3.f(jsonReader, f);
            } else if (r != 3) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                list3 = iu3.f(jsonReader, f);
            }
        }
        jsonReader.i();
        if (jsonReader.l() == JsonReader.Token.END_ARRAY) {
            jsonReader.h();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new so7(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) list.get(i);
            int i2 = i - 1;
            arrayList.add(new w31(nu4.a((PointF) list.get(i2), (PointF) list3.get(i2)), nu4.a(pointF2, (PointF) list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) list.get(0);
            int i3 = size - 1;
            arrayList.add(new w31(nu4.a((PointF) list.get(i3), (PointF) list3.get(i3)), nu4.a(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new so7(pointF, z, arrayList);
    }
}
