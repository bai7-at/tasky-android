package com.nytimes.android.performancetrackerclientphoenix;

import androidx.lifecycle.l;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import defpackage.cr5;
import defpackage.d44;
import defpackage.ei1;
import defpackage.j32;
import defpackage.yk8;
import defpackage.zo2;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class PerformanceTrackerClientImpl implements cr5, ei1 {
    private final PerformanceTracker a;
    private final Set b;
    private final zo2 c;
    private final Map d;

    public static final class a implements com.nytimes.android.performancetracker.lib.a {
        a() {
        }

        @Override // com.nytimes.android.performancetracker.lib.a
        public void a(PerformanceTracker.a aVar) {
            zq3.h(aVar, "event");
            PerformanceTrackerClientImpl.this.i(aVar);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PerformanceTracker.Kind.values().length];
            try {
                iArr[PerformanceTracker.Kind.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PerformanceTracker.Kind.TRIGGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public PerformanceTrackerClientImpl(PerformanceTracker performanceTracker, Set set, zo2 zo2Var) {
        zq3.h(performanceTracker, "performanceTracker");
        zq3.h(set, "dataConsumers");
        zq3.h(zo2Var, "foregroundState");
        this.a = performanceTracker;
        this.b = set;
        this.c = zo2Var;
        this.d = new LinkedHashMap();
        l.i.a().getLifecycle().a(this);
        f(new String[]{"timeToInteractive"}, "metadata.totalTime");
        performanceTracker.f(new a());
    }

    private final void e(PerformanceTracker.a aVar, Map map) {
        Object obj;
        AppEvent.Aggregate aggregate = (AppEvent.Aggregate) this.d.get((String) i.w0(h.F0(aVar.d(), new String[]{InstructionFileId.DOT}, false, 0, 6, null)));
        if (aggregate == null || (obj = map.get(aggregate.getProperty())) == null) {
            return;
        }
        if (!(obj instanceof Long)) {
            obj = null;
        }
        if (obj != null) {
            aggregate.add(((Long) obj).longValue());
        }
    }

    private final Map g(Object obj, String str, PerformanceTracker.a aVar) {
        kotlin.time.b c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("metadata.kind", obj);
        linkedHashMap.put("metadata.eventName", str);
        linkedHashMap.put("metadata.applicationState", this.c.a() ? Session.APPLICATION_STATE_FOREGROUND : Session.APPLICATION_STATE_BACKGROUND);
        if (aVar.b() == PerformanceTracker.Kind.END && (c = aVar.c()) != null) {
            linkedHashMap.put("metadata.totalTime", Long.valueOf(kotlin.time.b.s(c.N())));
        }
        Map a2 = aVar.a();
        if (a2 != null) {
            Set keySet = a2.keySet();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                if (!h.P((String) obj2, "metadata", false, 2, null)) {
                    arrayList.add(obj2);
                }
            }
            for (String str2 : arrayList) {
                linkedHashMap.put("arguments." + str2, a2.get(str2));
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.cr5
    public void a(PerformanceTracker.b bVar, Map map) {
        zq3.h(bVar, "token");
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((yk8) it2.next()).a(bVar, map);
        }
        this.a.e(bVar, map);
    }

    @Override // defpackage.cr5
    public PerformanceTracker.b b(j32 j32Var) {
        zq3.h(j32Var, "event");
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((yk8) it2.next()).b(j32Var);
        }
        return this.a.c(j32Var);
    }

    @Override // defpackage.cr5
    public void c(String str) {
        zq3.h(str, "message");
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((yk8) it2.next()).c(str);
        }
    }

    @Override // defpackage.cr5
    public void d(j32 j32Var) {
        zq3.h(j32Var, "event");
        this.a.g(j32Var);
    }

    public void f(String[] strArr, String str) {
        zq3.h(strArr, "eventNames");
        zq3.h(str, "property");
        AppEvent.Aggregate aggregate = new AppEvent.Aggregate(strArr, str);
        for (String str2 : strArr) {
            if (!this.d.containsKey(str2)) {
                this.d.put(str2, aggregate);
            }
        }
    }

    public final void i(PerformanceTracker.a aVar) {
        Object obj;
        zq3.h(aVar, "event");
        Map a2 = aVar.a();
        if (a2 == null || (obj = a2.get("metadata.kind")) == null) {
            obj = "normal";
        }
        Map g = g(obj, aVar.d(), aVar);
        int i = b.a[aVar.b().ordinal()];
        if (i == 1 || i == 2) {
            if (zq3.c(obj, "error")) {
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    ((yk8) it2.next()).d(aVar, g);
                }
            } else if (zq3.c(obj, "assertion")) {
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((yk8) it3.next()).e(aVar, g);
                }
            } else {
                for (yk8 yk8Var : this.b) {
                    e(aVar, g);
                    yk8Var.f(aVar, g);
                }
            }
        }
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        for (Map.Entry entry : this.d.entrySet()) {
            ((AppEvent.Aggregate) entry.getValue()).computeMean();
            d(AppEvent.toEventConvertible$default((AppEvent) entry.getValue(), null, 1, null));
        }
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onResume(d44Var);
        Iterator it2 = this.d.entrySet().iterator();
        while (it2.hasNext()) {
            ((AppEvent.Aggregate) ((Map.Entry) it2.next()).getValue()).reset();
        }
    }
}
