package com.nytimes.android.dailyfive.ui.items;

import android.view.View;
import defpackage.ai6;
import defpackage.sr3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class f extends c {
    private final String f;
    private final List g;
    private final String h;

    public f(String str) {
        zq3.h(str, "title");
        this.f = str;
        this.g = i.l();
        this.h = str;
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public List F() {
        return this.g;
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    public boolean G() {
        return true;
    }

    @Override // defpackage.k80
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void A(sr3 sr3Var, int i) {
        zq3.h(sr3Var, "viewBinding");
        sr3Var.getRoot().setText(this.f);
    }

    @Override // com.nytimes.android.dailyfive.ui.items.c
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public String E() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public sr3 D(View view) {
        zq3.h(view, "view");
        sr3 a = sr3.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.gr3
    public int o() {
        return ai6.item_title;
    }
}
