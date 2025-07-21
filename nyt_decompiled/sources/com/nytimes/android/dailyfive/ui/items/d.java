package com.nytimes.android.dailyfive.ui.items;

import android.view.View;
import defpackage.ai6;
import defpackage.kr3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class d extends c {
    private final List f = i.l();
    private final ww8 g = ww8.a;

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.f;
    }

    @Override // defpackage.k80
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void A(kr3 kr3Var, int i) {
        zq3.h(kr3Var, "viewBinding");
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ww8 E() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public kr3 D(View view) {
        zq3.h(view, "view");
        kr3 a = kr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_divider;
    }
}
