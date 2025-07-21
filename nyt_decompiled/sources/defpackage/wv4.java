package defpackage;

import com.squareup.moshi.JsonAdapter;

/* loaded from: classes4.dex */
public abstract class wv4 {
    public static final sd0 a(JsonAdapter jsonAdapter, Object obj) {
        zq3.h(jsonAdapter, "<this>");
        ad0 ad0Var = new ad0();
        jsonAdapter.toJson((qd0) ad0Var, (ad0) obj);
        return ad0Var;
    }
}
