package com.nytimes.android.dailyfive.ui.items;

import android.view.View;
import defpackage.ai6;
import defpackage.di0;
import defpackage.it7;
import defpackage.qr3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class e extends c implements it7 {
    private final di0 f;
    private final List g;
    private final ww8 h;

    public e(di0 di0Var) {
        zq3.h(di0Var, "et2CardImpression");
        this.f = di0Var;
        this.g = i.l();
        this.h = ww8.a;
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.g;
    }

    @Override // defpackage.k80
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void A(qr3 qr3Var, int i) {
        zq3.h(qr3Var, "binding");
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ww8 E() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public qr3 D(View view) {
        zq3.h(view, "view");
        qr3 a = qr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.it7
    public di0 h() {
        return this.f;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_salutation_subsequent;
    }
}
