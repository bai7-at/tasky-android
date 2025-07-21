package defpackage;

import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import java.util.Map;

/* loaded from: classes4.dex */
public final class t52 implements s52 {
    @Override // defpackage.s52
    public void a(PageContext pageContext, e52 e52Var, Map map) {
        zq3.h(pageContext, "pageContext");
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        EventTracker.a.h(pageContext, e52Var, map);
    }
}
