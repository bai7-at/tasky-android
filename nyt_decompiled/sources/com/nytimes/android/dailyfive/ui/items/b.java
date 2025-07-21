package com.nytimes.android.dailyfive.ui.items;

import android.view.View;
import com.nytimes.android.dailyfive.domain.DailyFiveCompletion;
import defpackage.ai6;
import defpackage.di0;
import defpackage.it7;
import defpackage.jr3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class b extends c implements it7 {
    private final DailyFiveCompletion f;
    private final di0 g;
    private final List h;

    public b(DailyFiveCompletion dailyFiveCompletion, di0 di0Var) {
        zq3.h(dailyFiveCompletion, "content");
        zq3.h(di0Var, "et2CardImpression");
        this.f = dailyFiveCompletion;
        this.g = di0Var;
        this.h = i.l();
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.h;
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public boolean G() {
        return true;
    }

    @Override // defpackage.k80
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void A(jr3 jr3Var, int i) {
        zq3.h(jr3Var, "viewBinding");
        jr3Var.b.setText(E().a());
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public DailyFiveCompletion E() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public jr3 D(View view) {
        zq3.h(view, "view");
        jr3 a = jr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.it7
    public di0 h() {
        return this.g;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_completion;
    }
}
