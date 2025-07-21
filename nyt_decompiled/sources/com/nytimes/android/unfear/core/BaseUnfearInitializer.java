package com.nytimes.android.unfear.core;

import android.content.Context;
import com.nytimes.android.unfear.core.UnfearConverter;
import defpackage.ss2;
import defpackage.uj3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class BaseUnfearInitializer implements uj3 {
    private final ss2 a;
    private final List b;

    public BaseUnfearInitializer(ss2 ss2Var, List list) {
        zq3.h(ss2Var, "onCreateConverter");
        zq3.h(list, "dependencies");
        this.a = ss2Var;
        this.b = list;
    }

    @Override // defpackage.uj3
    public List a() {
        return this.b;
    }

    @Override // defpackage.uj3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Unfear b(Context context) {
        zq3.h(context, "context");
        UnfearConverter.a aVar = UnfearConverter.Companion;
        aVar.b((UnfearConverter) this.a.invoke(aVar.a()));
        return Unfear.a;
    }

    public /* synthetic */ BaseUnfearInitializer(ss2 ss2Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ss2Var, (i & 2) != 0 ? i.l() : list);
    }
}
