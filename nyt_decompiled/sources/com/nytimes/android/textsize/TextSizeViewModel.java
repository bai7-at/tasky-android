package com.nytimes.android.textsize;

import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.font.FontScale;
import com.nytimes.android.logging.NYTLogger;
import defpackage.rj8;
import defpackage.wj8;
import defpackage.zm2;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class TextSizeViewModel extends q {
    private final zm2 a;
    private final wj8 b;
    private final rj8 c;
    private final FontScale d;
    private final boolean e;
    private final MutableStateFlow f;
    private final StateFlow g;
    private final FontScale[] h;
    private final MutableStateFlow i;
    private final StateFlow j;

    public TextSizeViewModel(zm2 zm2Var, wj8 wj8Var, rj8 rj8Var) {
        zq3.h(zm2Var, "fontScaleManager");
        zq3.h(wj8Var, "eventSender");
        zq3.h(rj8Var, "applier");
        this.a = zm2Var;
        this.b = wj8Var;
        this.c = rj8Var;
        FontScale c = zm2Var.c();
        this.d = c;
        boolean e = zm2Var.e();
        this.e = e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(c);
        this.f = MutableStateFlow;
        this.g = FlowKt.asStateFlow(MutableStateFlow);
        this.h = FontScale.values();
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(e));
        this.i = MutableStateFlow2;
        this.j = FlowKt.asStateFlow(MutableStateFlow2);
    }

    private final void n(FontScale fontScale) {
        this.a.g(false);
        FontScale c = this.a.c();
        this.a.f(fontScale);
        NYTLogger.l("Font Preference Change: oldScale: " + c + " newScale: " + fontScale, new Object[0]);
    }

    public final FontScale[] f() {
        return this.h;
    }

    public final StateFlow g() {
        return this.g;
    }

    public final StateFlow i() {
        return this.j;
    }

    public final Job j() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new TextSizeViewModel$onCreate$1(this, null), 3, null);
        return launch$default;
    }

    public final void k(FontScale fontScale) {
        zq3.h(fontScale, "fontScale");
        this.f.setValue(fontScale);
        n(fontScale);
        this.c.f();
    }

    public final void l() {
        this.c.d();
        if (this.e != ((Boolean) this.i.getValue()).booleanValue()) {
            this.b.b(((Boolean) this.i.getValue()).booleanValue());
        }
        if (this.d != this.f.getValue()) {
            this.b.c(this.a.c().name());
        }
    }

    public final void m(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
        this.a.g(z);
        FontScale c = this.a.c();
        this.c.f();
        NYTLogger.l("Reset to System pref: oldScale: " + c + " newScale: System", new Object[0]);
    }
}
