package defpackage;

import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class mj {
    public static void a(GsonBuilder gsonBuilder) {
        b(kj.a(), gsonBuilder);
    }

    private static void b(List list, GsonBuilder gsonBuilder) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it2.next();
            gsonBuilder.registerTypeAdapter((Type) simpleEntry.getKey(), simpleEntry.getValue());
        }
    }
}
