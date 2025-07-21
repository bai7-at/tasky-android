package com.nytimes.android.eventtracker.state;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import defpackage.d44;
import defpackage.ei1;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AppStateObserver implements ei1 {
    private StackPosition a;

    /* JADX WARN: Multi-variable type inference failed */
    public AppStateObserver() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean a() {
        return this.a == StackPosition.FOREGROUND;
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a = StackPosition.BACKGROUND;
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.a = StackPosition.FOREGROUND;
    }

    public AppStateObserver(d44 d44Var) {
        zq3.h(d44Var, "processLifecycleOwner");
        this.a = d44Var.getLifecycle().b().isAtLeast(Lifecycle.State.INITIALIZED) ? StackPosition.FOREGROUND : StackPosition.BACKGROUND;
        d44Var.getLifecycle().a(this);
    }

    public /* synthetic */ AppStateObserver(d44 d44Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l.i.a() : d44Var);
    }
}
