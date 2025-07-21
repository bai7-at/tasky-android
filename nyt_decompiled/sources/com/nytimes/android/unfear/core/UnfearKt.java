package com.nytimes.android.unfear.core;

import androidx.compose.runtime.CompositionLocalKt;
import defpackage.m76;
import defpackage.qs2;

/* loaded from: classes4.dex */
public abstract class UnfearKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: com.nytimes.android.unfear.core.UnfearKt$LocalUnfearConverter$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnfearConverter mo865invoke() {
            return UnfearConverter.Companion.a();
        }
    });

    public static final m76 a() {
        return a;
    }
}
