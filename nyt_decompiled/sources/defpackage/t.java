package defpackage;

import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.utilities.TestReporter;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.logging.NYTLogger;
import defpackage.e52;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t implements TestReporter {
    private final boolean a;
    private final Map b = new LinkedHashMap();

    public t(boolean z) {
        this.a = z;
    }

    public final Map a() {
        return kotlin.collections.t.v(this.b);
    }

    @Override // com.nytimes.android.abra.utilities.TestReporter
    public void allocateTest(String str, String str2) {
        TestReporter.DefaultImpls.allocateTest(this, str, str2);
    }

    public final void b(PageContext pageContext, AbraTest abraTest) {
        zq3.h(pageContext, "pageContext");
        zq3.h(abraTest, "abraTest");
        EventTracker.a.h(pageContext, new e52.a(), u.a(abraTest));
    }

    @Override // com.nytimes.android.abra.utilities.TestReporter
    public void exposeTest(String str, String str2) {
        TestReporter.DefaultImpls.exposeTest(this, str, str2);
    }

    @Override // com.nytimes.android.abra.utilities.TestReporter
    public void exposeTest(AbraTest abraTest, Map map) {
        zq3.h(abraTest, "abraTest");
        zq3.h(map, "extra");
        Object obj = map.get("pageContext");
        if (obj instanceof PageContext) {
            b((PageContext) obj, abraTest);
            return;
        }
        NYTLogger.g("Missing page context for expose event", new Object[0]);
        if (this.a) {
            throw new IllegalStateException("Missing page context for expose event");
        }
    }
}
