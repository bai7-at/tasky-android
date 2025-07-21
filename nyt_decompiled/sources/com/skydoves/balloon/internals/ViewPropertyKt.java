package com.skydoves.balloon.internals;

import android.view.View;
import defpackage.gb9;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ViewPropertyKt {
    public static final /* synthetic */ gb9 a(final View view, Object obj) {
        zq3.h(view, "<this>");
        return new gb9(obj, new qs2() { // from class: com.skydoves.balloon.internals.ViewPropertyKt$viewProperty$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m859invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m859invoke() {
                view.invalidate();
            }
        });
    }
}
