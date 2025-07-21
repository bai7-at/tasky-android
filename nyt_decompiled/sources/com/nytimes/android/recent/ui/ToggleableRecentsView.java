package com.nytimes.android.recent.ui;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.extensions.ViewExtensions;
import com.nytimes.android.recent.ui.ToggleableRecentsView;
import com.nytimes.android.recent.ui.a;
import defpackage.eg6;
import defpackage.jk;
import defpackage.k19;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class ToggleableRecentsView implements k19 {
    private final ConstraintLayout a;
    private final RecyclerView b;
    private final jk c;
    private final b d;
    private final c e;
    private final CoroutineScope f;

    public ToggleableRecentsView(ConstraintLayout constraintLayout, RecyclerView recyclerView, jk jkVar, b bVar) {
        zq3.h(constraintLayout, "root");
        zq3.h(recyclerView, "elements");
        zq3.h(jkVar, "target");
        zq3.h(bVar, "client");
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = jkVar;
        this.d = bVar;
        this.e = new c();
        this.f = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    private final void g(ConstraintLayout constraintLayout, jk jkVar, a aVar) {
        ViewExtensions.q(constraintLayout, eg6.recents_empty_title).setText(aVar.c());
        ViewExtensions.q(constraintLayout, eg6.recents_empty_desc).setText(aVar.b());
        c cVar = this.e;
        cVar.e(jkVar, aVar.a());
        cVar.c(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ToggleableRecentsView toggleableRecentsView, View view) {
        zq3.h(toggleableRecentsView, "this$0");
        BuildersKt__Builders_commonKt.launch$default(toggleableRecentsView.f, null, null, new ToggleableRecentsView$onUserLoggedOut$1$1$1(toggleableRecentsView, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ToggleableRecentsView toggleableRecentsView, View view) {
        zq3.h(toggleableRecentsView, "this$0");
        BuildersKt__Builders_commonKt.launch$default(toggleableRecentsView.f, null, null, new ToggleableRecentsView$onUserLoggedOut$1$2$1(toggleableRecentsView, null), 3, null);
    }

    @Override // defpackage.k19
    public void a() {
        ViewExtensions.p(this.a, this.b);
    }

    @Override // defpackage.k19
    public void c() {
        ConstraintLayout constraintLayout = this.a;
        g(constraintLayout, this.c, a.C0382a.d);
        ViewExtensions.c(constraintLayout, eg6.recent_login_button).setOnClickListener(new View.OnClickListener() { // from class: fn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToggleableRecentsView.h(ToggleableRecentsView.this, view);
            }
        });
        ViewExtensions.c(constraintLayout, eg6.recent_subscribe_button).setOnClickListener(new View.OnClickListener() { // from class: gn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToggleableRecentsView.i(ToggleableRecentsView.this, view);
            }
        });
        ViewExtensions.p(this.b, this.a);
    }
}
