package com.nytimes.android.hybrid.bridge;

import android.webkit.WebView;
import defpackage.by0;
import defpackage.gt2;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class SetPTREnabledCommand extends mc0 {
    public static final a Companion = new a(null);
    private final CoroutineDispatcher b;
    private final gt2 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ SetPTREnabledCommand(CoroutineDispatcher coroutineDispatcher, gt2 gt2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getMain() : coroutineDispatcher, gt2Var);
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        return BuildersKt.withContext(this.b, new SetPTREnabledCommand$run$2(this, i, nc0.c(nc0Var, "enabled", false, 2, null), null), by0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPTREnabledCommand(CoroutineDispatcher coroutineDispatcher, gt2 gt2Var) {
        super("setPullToRefreshEnabled");
        zq3.h(coroutineDispatcher, "mainDispatcher");
        zq3.h(gt2Var, "callback");
        this.b = coroutineDispatcher;
        this.c = gt2Var;
    }
}
