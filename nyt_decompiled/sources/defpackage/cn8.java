package defpackage;

import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import io.embrace.android.embracesdk.Embrace;
import io.opentracing.util.GlobalTracer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class cn8 extends si1 {
    public static final a Companion = new a(null);
    private final AppEventFactory g;
    private final Map h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn8(AppEventFactory appEventFactory) {
        super("TodayTabJourney", "TodayTabJourney", null, appEventFactory.b(), 4, null);
        zq3.h(appEventFactory, "appEventFactory");
        this.g = appEventFactory;
        this.h = new LinkedHashMap();
    }

    public final void i(String str) {
        zq3.h(str, "spanName");
        tx7 tx7Var = (tx7) this.h.get(str);
        if (tx7Var != null) {
            tx7Var.a();
        }
        this.h.remove(str);
        Embrace.getInstance().endMoment(str);
    }

    public final void j(String str) {
        zq3.h(str, "resourceName");
        tx7 start = GlobalTracer.a().I(h()).a(g()).start();
        zq3.e(start);
        ti1.c(start, str);
        ti1.a(start, this.g.b());
        Map map = this.h;
        zq3.e(start);
        map.put(str, start);
        Embrace.getInstance().startMoment(str);
    }
}
