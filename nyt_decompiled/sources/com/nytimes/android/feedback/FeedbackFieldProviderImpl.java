package com.nytimes.android.feedback;

import com.nytimes.android.utils.AppPreferences;
import defpackage.b05;
import defpackage.by0;
import defpackage.c04;
import defpackage.ed2;
import defpackage.qs2;
import defpackage.qv6;
import defpackage.so1;
import defpackage.tc2;
import defpackage.wc2;
import defpackage.zm2;
import defpackage.zq3;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class FeedbackFieldProviderImpl implements wc2 {
    private final so1 a;
    private final AppPreferences b;
    private final qv6 c;
    private final tc2 d;
    private final ed2 e;
    private final zm2 f;
    private final b05 g;
    private final c04 h;

    public FeedbackFieldProviderImpl(so1 so1Var, AppPreferences appPreferences, qv6 qv6Var, tc2 tc2Var, ed2 ed2Var, zm2 zm2Var, b05 b05Var) {
        zq3.h(so1Var, "deviceConfig");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(tc2Var, "appDependencies");
        zq3.h(ed2Var, "resourceProvider");
        zq3.h(zm2Var, "fontScaleManager");
        zq3.h(b05Var, "clock");
        this.a = so1Var;
        this.b = appPreferences;
        this.c = qv6Var;
        this.d = tc2Var;
        this.e = ed2Var;
        this.f = zm2Var;
        this.g = b05Var;
        this.h = kotlin.c.a(new qs2() { // from class: com.nytimes.android.feedback.FeedbackFieldProviderImpl$formatter$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat mo865invoke() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy h:mm:ss aaa", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat;
            }
        });
    }

    @Override // defpackage.wc2
    public Object a(by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FeedbackFieldProviderImpl$generateFields$2(this, null), by0Var);
    }

    @Override // defpackage.wc2
    public String b() {
        return this.d.k();
    }

    @Override // defpackage.wc2
    public Object c(by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FeedbackFieldProviderImpl$generateEmailBodyFields$2(this, null), by0Var);
    }

    @Override // defpackage.wc2
    public Object d(by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FeedbackFieldProviderImpl$getStatus$2(this, null), by0Var);
    }

    @Override // defpackage.wc2
    public Object e(by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FeedbackFieldProviderImpl$getUserAccount$2(this, null), by0Var);
    }

    @Override // defpackage.wc2
    public String getAppVersion() {
        return this.d.a();
    }

    @Override // defpackage.wc2
    public String getOsVersion() {
        return this.a.h();
    }

    public final String j() {
        long k = this.b.k("FIREBASE_REMOTE_CONFIG_REFRESH_TS_MS", -1L);
        if (k <= 0) {
            return this.e.f();
        }
        return l().format(Long.valueOf(k)) + " " + l().getTimeZone().getID();
    }

    public final String k() {
        return l().format(Long.valueOf(this.g.c())) + " " + l().getTimeZone().getID();
    }

    public final SimpleDateFormat l() {
        return (SimpleDateFormat) this.h.getValue();
    }

    public String m() {
        if (this.f.e()) {
            return this.e.J() + "f (device-selected size)";
        }
        return this.f.c().getScale() + "f (app-selected size)";
    }
}
