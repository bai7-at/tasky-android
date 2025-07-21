package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class pf implements ou5 {
    private final Locale a;

    public pf(Locale locale) {
        this.a = locale;
    }

    @Override // defpackage.ou5
    public String a() {
        return this.a.toLanguageTag();
    }

    public final Locale b() {
        return this.a;
    }
}
