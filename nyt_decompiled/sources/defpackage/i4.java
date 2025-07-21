package defpackage;

import com.nytimes.android.WebActivity;
import com.nytimes.android.analytics.event.messaging.DockMessageAttribute;
import com.nytimes.android.analytics.event.messaging.DockType;
import com.nytimes.android.articlefront.BaseArticleActivity;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.messaging.dock.DockView;
import defpackage.e52;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class i4 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final jc a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i4(jc jcVar) {
        zq3.h(jcVar, "analyticsClient");
        this.a = jcVar;
    }

    private final void a(jk jkVar, int i, String str, String str2, String str3) {
        this.a.q(DockType.STANDARD, i, DockMessageAttribute.SUBSCRIBE);
        EventTracker.a.g(jkVar, new e52.e(), new s42("dock", "AND_SUBSCRIBE_CORE", null, null, str3, str, null, new y32(str2, null, null, null, null, null, 62, null), null, 332, null).a());
    }

    private final void d(jk jkVar, DockView dockView, int i) {
        this.a.r(DockType.STANDARD, i);
        EventTracker.a.g(jkVar, new e52.d(), new s42("dock", "AND_SUBSCRIBE_CORE", null, null, dockView.getCta(), dockView.getLocationLink(), null, null, null, 460, null).a());
    }

    public final void b(WebActivity webActivity, int i, String str, String str2, String str3) {
        zq3.h(webActivity, "webActivity");
        zq3.h(str, "link");
        zq3.h(str3, "cta");
        a(webActivity, i, str, str2, str3);
    }

    public final void c(BaseArticleActivity baseArticleActivity, int i, String str, String str2, String str3) {
        zq3.h(baseArticleActivity, "baseArticleActivity");
        zq3.h(str, "link");
        zq3.h(str3, "cta");
        a(baseArticleActivity, i, str, str2, str3);
    }

    public final void e(WebActivity webActivity, DockView dockView, int i) {
        zq3.h(webActivity, "webActivity");
        zq3.h(dockView, "dockView");
        d(webActivity, dockView, i);
    }

    public final void f(BaseArticleActivity baseArticleActivity, DockView dockView, int i) {
        zq3.h(baseArticleActivity, "baseArticleActivity");
        zq3.h(dockView, "dockView");
        d(baseArticleActivity, dockView, i);
    }
}
