package com.nytimes.android.ads.ui.compose.anim;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ShimmerEffectKt {
    public static final Modifier a(Modifier modifier, List list) {
        zq3.h(modifier, "<this>");
        zq3.h(list, "colors");
        return ComposedModifierKt.b(modifier, null, new ShimmerEffectKt$shimmerEffect$1(list), 1, null);
    }
}
