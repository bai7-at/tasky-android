package defpackage;

import android.app.Application;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.nytimes.android.logging.NYTLogger;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class xm {
    private final Application a;
    private final oe7 b;

    public xm(Application application, oe7 oe7Var) {
        this.a = application;
        this.b = oe7Var;
    }

    private ShortcutManager c() {
        return (ShortcutManager) this.a.getSystemService(ShortcutManager.class);
    }

    private void d(List list) {
        if (c().setDynamicShortcuts(list)) {
            return;
        }
        NYTLogger.g("Failed to set dynamic shortcuts - could be rate limit", new Object[0]);
    }

    public List a() {
        return Collections.singletonList(b());
    }

    public ShortcutInfo b() {
        return new ShortcutInfo.Builder(this.a, "nyt.shortcut.save.for.later").setIntent(this.b.a(this.a, "App Shortcut").setAction("android.intent.action.VIEW")).setShortLabel("Saved for Later").setIcon(Icon.createWithResource(this.a, pe6.ic_app_shortcut_readinglist)).build();
    }

    public void e() {
        d(a());
    }
}
