package com.nytimes.android.devsettings.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import defpackage.qs2;
import defpackage.y38;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ContextUtilsKt {
    public static final SharedPreferences a(final Context context) {
        zq3.h(context, "<this>");
        Object a = y38.a(new qs2() { // from class: com.nytimes.android.devsettings.utils.ContextUtilsKt$defaultSharedPreferences$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SharedPreferences mo865invoke() {
                return g.b(context);
            }
        });
        zq3.g(a, "allowReads(...)");
        return (SharedPreferences) a;
    }
}
