package com.nytimes.android.preference;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.fragment.app.Fragment;
import defpackage.m76;
import defpackage.qs2;

/* loaded from: classes4.dex */
public abstract class ComposablePreferenceKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: com.nytimes.android.preference.ComposablePreferenceKt$LocalFragmentForPreference$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment mo865invoke() {
            throw new IllegalStateException("LocalFragmentForPreference should be always available.");
        }
    }, 1, null);

    public static final m76 a() {
        return a;
    }
}
