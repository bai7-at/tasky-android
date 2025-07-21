package com.nytimes.android.utils.sectionfrontrefresher;

import android.content.res.Resources;
import defpackage.c04;
import defpackage.qs2;
import defpackage.wk6;
import defpackage.zq3;
import kotlin.c;

/* loaded from: classes4.dex */
public final class SectionFrontResourcesProvider {
    private final Resources a;
    private final c04 b;
    private final c04 c;

    public SectionFrontResourcesProvider(Resources resources) {
        zq3.h(resources, "resources");
        this.a = resources;
        this.b = e(wk6.section_refresh);
        this.c = e(wk6.fail_reload_articles);
    }

    private final String c() {
        return (String) this.c.getValue();
    }

    private final String d() {
        return (String) this.b.getValue();
    }

    private final c04 e(final int i) {
        return c.a(new qs2() { // from class: com.nytimes.android.utils.sectionfrontrefresher.SectionFrontResourcesProvider$load$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                Resources resources;
                resources = SectionFrontResourcesProvider.this.a;
                String string = resources.getString(i);
                zq3.g(string, "getString(...)");
                return string;
            }
        });
    }

    public String b() {
        return c();
    }

    public String f() {
        return d();
    }
}
