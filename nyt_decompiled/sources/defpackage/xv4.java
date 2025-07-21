package defpackage;

import com.squareup.moshi.JsonAdapter;

/* loaded from: classes4.dex */
public abstract class xv4 {
    private final JsonAdapter a;

    public xv4(JsonAdapter jsonAdapter) {
        zq3.h(jsonAdapter, "adapter");
        this.a = jsonAdapter;
    }

    public final Object a(String str) {
        if (str != null) {
            return this.a.fromJson(str);
        }
        return null;
    }

    public final String b(Object obj) {
        if (obj != null) {
            return this.a.toJson(obj);
        }
        return null;
    }
}
