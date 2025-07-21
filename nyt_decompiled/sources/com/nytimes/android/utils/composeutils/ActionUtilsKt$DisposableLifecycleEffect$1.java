package com.nytimes.android.utils.composeutils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import defpackage.d44;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class ActionUtilsKt$DisposableLifecycleEffect$1 extends Lambda implements ss2 {
    final /* synthetic */ ss2 $block;
    final /* synthetic */ d44 $lifecycleOwner;

    public static final class a implements ms1 {
        final /* synthetic */ d44 a;
        final /* synthetic */ g b;

        public a(d44 d44Var, g gVar) {
            this.a = d44Var;
            this.b = gVar;
        }

        @Override // defpackage.ms1
        public void dispose() {
            this.a.getLifecycle().d(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionUtilsKt$DisposableLifecycleEffect$1(d44 d44Var, ss2 ss2Var) {
        super(1);
        this.$lifecycleOwner = d44Var;
        this.$block = ss2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ss2 ss2Var, d44 d44Var, Lifecycle.Event event) {
        zq3.h(ss2Var, "$block");
        zq3.h(d44Var, "<anonymous parameter 0>");
        zq3.h(event, "event");
        ss2Var.invoke(event);
    }

    @Override // defpackage.ss2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ms1 invoke(ns1 ns1Var) {
        zq3.h(ns1Var, "$this$DisposableEffect");
        final ss2 ss2Var = this.$block;
        g gVar = new g() { // from class: com.nytimes.android.utils.composeutils.b
            @Override // androidx.lifecycle.g
            public final void h(d44 d44Var, Lifecycle.Event event) {
                ActionUtilsKt$DisposableLifecycleEffect$1.d(ss2.this, d44Var, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().a(gVar);
        return new a(this.$lifecycleOwner, gVar);
    }
}
