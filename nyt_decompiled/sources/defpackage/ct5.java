package defpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* loaded from: classes4.dex */
public final class ct5 {
    public static final ct5 a = new ct5();

    private ct5() {
    }

    public static final Gson a() {
        GsonBuilder a2 = b01.a();
        mj.a(a2);
        Gson create = a2.create();
        zq3.g(create, "create(...)");
        return create;
    }
}
