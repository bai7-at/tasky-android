package defpackage;

import com.google.gson.GsonBuilder;
import java.util.Date;

/* loaded from: classes4.dex */
public final class b01 {
    public static final b01 a = new b01();

    private b01() {
    }

    public static final GsonBuilder a() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.registerTypeAdapter(Date.class, new sb1());
        gsonBuilder.registerTypeAdapterFactory(new a63());
        return gsonBuilder;
    }
}
