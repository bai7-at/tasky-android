package defpackage;

import android.app.Activity;
import com.nytimes.android.SectionActivity;
import com.nytimes.android.WebActivity;
import com.nytimes.android.articlefront.BaseArticleActivity;
import com.nytimes.android.comments.menu.item.Comments;
import com.nytimes.android.menu.MenuData;
import com.nytimes.android.menu.item.ConnectAccount;
import com.nytimes.android.menu.item.Feedback;
import com.nytimes.android.menu.item.Login;
import com.nytimes.android.menu.item.Notifications;
import com.nytimes.android.menu.item.OpenInBrowser;
import com.nytimes.android.menu.item.Refresh;
import com.nytimes.android.menu.item.Settings;
import com.nytimes.android.menu.item.Subscribe;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class iq4 {
    private final Activity a;
    private final Settings b;
    private final Feedback c;
    private final Login d;
    private final ConnectAccount e;
    private final Subscribe f;
    private final Notifications g;
    private final Comments h;
    private final c87 i;
    private final ox8 j;
    private final lp7 k;
    private final ya8 l;
    private final ex8 m;
    private final OpenInBrowser n;
    private final Refresh o;
    private final up4 p;
    private final cb2 q;

    public iq4(Activity activity, Settings settings, Feedback feedback, Login login, ConnectAccount connectAccount, Subscribe subscribe, Notifications notifications, Comments comments, c87 c87Var, ox8 ox8Var, lp7 lp7Var, ya8 ya8Var, ex8 ex8Var, OpenInBrowser openInBrowser, Refresh refresh, up4 up4Var, cb2 cb2Var) {
        zq3.h(activity, "activity");
        zq3.h(settings, "settings");
        zq3.h(feedback, "feedback");
        zq3.h(login, "login");
        zq3.h(connectAccount, "connectAccount");
        zq3.h(subscribe, "subscribe");
        zq3.h(notifications, "notifications");
        zq3.h(comments, "comments");
        zq3.h(c87Var, "save");
        zq3.h(ox8Var, "unsave");
        zq3.h(lp7Var, "share");
        zq3.h(ya8Var, "subscriberLinkSharing");
        zq3.h(ex8Var, "unlimitedSubscriberSharing");
        zq3.h(openInBrowser, "openInBrowser");
        zq3.h(refresh, "refresh");
        zq3.h(up4Var, "menuDataProvider");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = activity;
        this.b = settings;
        this.c = feedback;
        this.d = login;
        this.e = connectAccount;
        this.f = subscribe;
        this.g = notifications;
        this.h = comments;
        this.i = c87Var;
        this.j = ox8Var;
        this.k = lp7Var;
        this.l = ya8Var;
        this.m = ex8Var;
        this.n = openInBrowser;
        this.o = refresh;
        this.p = up4Var;
        this.q = cb2Var;
    }

    private final void a(Map map) {
        if (this.a instanceof WebActivity) {
            return;
        }
        for (MenuData menuData : this.p.a()) {
            map.put(Integer.valueOf(menuData.getId()), menuData);
        }
    }

    private final Map b(boolean z) {
        Map n = t.n(du8.a(Integer.valueOf(this.b.getId()), this.b), du8.a(Integer.valueOf(this.c.getId()), this.c), du8.a(Integer.valueOf(this.d.getId()), this.d), du8.a(Integer.valueOf(this.e.getId()), this.e), du8.a(Integer.valueOf(this.f.getId()), this.f), du8.a(Integer.valueOf(this.g.getId()), this.g), du8.a(Integer.valueOf(this.n.getId()), this.n), du8.a(Integer.valueOf(this.o.getId()), this.o), du8.a(Integer.valueOf(this.i.getId()), this.i), du8.a(Integer.valueOf(this.j.getId()), this.j), du8.a(Integer.valueOf(this.h.getId()), this.h));
        if (z) {
            n.putAll(t.f(du8.a(Integer.valueOf(this.k.getId()), this.m)));
        } else {
            n.putAll(t.m(du8.a(Integer.valueOf(this.k.getId()), this.k), du8.a(Integer.valueOf(this.l.getId()), this.l)));
        }
        return n;
    }

    private final boolean d(Activity activity) {
        return activity.getIntent().getBooleanExtra("INTENT_EXTRA_KEY_SHOW_SHARING_OPTION", true);
    }

    public final Map c() {
        Map b = b((this.a instanceof BaseArticleActivity) && this.q.E());
        Activity activity = this.a;
        if (activity instanceof WebActivity) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : b.entrySet()) {
                if (((Number) entry.getKey()).intValue() == this.n.getId()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            b = t.x(linkedHashMap);
            if (d(this.a)) {
                b.put(Integer.valueOf(this.k.getId()), this.k);
            }
        } else if (activity instanceof SectionActivity) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : b.entrySet()) {
                if (((Number) entry2.getKey()).intValue() == this.b.getId() || ((Number) entry2.getKey()).intValue() == this.c.getId() || ((Number) entry2.getKey()).intValue() == this.d.getId() || ((Number) entry2.getKey()).intValue() == this.e.getId() || ((Number) entry2.getKey()).intValue() == this.f.getId() || ((Number) entry2.getKey()).intValue() == this.g.getId()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            b = t.x(linkedHashMap2);
        } else {
            b.remove(Integer.valueOf(this.g.getId()));
        }
        a(b);
        return b;
    }
}
