package com.nytimes.android.performancetrackerclientphoenix.event.base;

import com.nytimes.android.performancetrackerclientphoenix.monitor.b;
import defpackage.j32;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class AppEventFactory {
    private final Set a;

    public AppEventFactory(Set set) {
        zq3.h(set, "monitors");
        this.a = set;
    }

    public final j32 a(final AppEvent appEvent) {
        zq3.h(appEvent, "event");
        return appEvent.toEventConvertible(new qs2() { // from class: com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory$appPerformanceTrackEvent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Map mo865invoke() {
                if (zq3.c(AppEvent.this.getKind(), "metric")) {
                    return null;
                }
                return this.b();
            }
        });
    }

    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            linkedHashMap.putAll(((b) it2.next()).c());
        }
        return t.v(linkedHashMap);
    }
}
