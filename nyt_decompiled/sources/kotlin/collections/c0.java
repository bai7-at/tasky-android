package kotlin.collections;

import defpackage.zq3;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c0 {
    public static Set a(Set set) {
        zq3.h(set, "builder");
        return ((SetBuilder) set).a();
    }

    public static Set b() {
        return new SetBuilder();
    }

    public static Set c(int i) {
        return new SetBuilder(i);
    }

    public static Set d(Object obj) {
        Set singleton = Collections.singleton(obj);
        zq3.g(singleton, "singleton(...)");
        return singleton;
    }
}
