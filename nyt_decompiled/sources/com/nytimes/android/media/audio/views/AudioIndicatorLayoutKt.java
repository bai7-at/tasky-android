package com.nytimes.android.media.audio.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.et0;
import defpackage.fg6;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.pb;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yh6;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public abstract class AudioIndicatorLayoutKt {
    public static final void a(Composer composer, final int i) {
        Composer h = composer.h(1101177855);
        if (i == 0 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1101177855, i, -1, "com.nytimes.android.media.audio.views.AudioIndicatorLayout (AudioIndicatorLayout.kt:19)");
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            DismissState e = SwipeToDismissKt.e(null, new ss2() { // from class: com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt$AudioIndicatorLayout$dismissState$1

                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[DismissValue.values().length];
                        try {
                            iArr[DismissValue.Default.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DismissValue.DismissedToEnd.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DismissValue.DismissedToStart.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        a = iArr;
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(DismissValue dismissValue) {
                    AudioIndicator audioIndicator;
                    zq3.h(dismissValue, "dismissValue");
                    int i2 = a.a[dismissValue.ordinal()];
                    boolean z = true;
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AudioIndicator audioIndicator2 = Ref$ObjectRef.this.element;
                        if (audioIndicator2 == null) {
                            zq3.z("audioIndicator");
                            audioIndicator = null;
                        } else {
                            audioIndicator = audioIndicator2;
                        }
                        audioIndicator.X();
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, h, 0, 1);
            final float a = e.u().a() != 1.0f ? 1.0f - e.u().a() : 1.0f;
            Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
            Alignment f = Alignment.a.f();
            h.z(733328855);
            rg4 g = BoxKt.g(f, false, h, 6);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(h2);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, g, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            SwipeToDismissKt.a(e, null, null, null, ComposableSingletons$AudioIndicatorLayoutKt.a.a(), zr0.b(h, -609103436, true, new it2() { // from class: com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt$AudioIndicatorLayout$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer2, int i2) {
                    zq3.h(m37Var, "$this$SwipeToDismiss");
                    if ((i2 & 81) == 16 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-609103436, i2, -1, "com.nytimes.android.media.audio.views.AudioIndicatorLayout.<anonymous>.<anonymous> (AudioIndicatorLayout.kt:48)");
                    }
                    Modifier a5 = pb.a(Modifier.a, a);
                    final Ref$ObjectRef<AudioIndicator> ref$ObjectRef2 = ref$ObjectRef;
                    AndroidView_androidKt.b(new ss2() { // from class: com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt$AudioIndicatorLayout$1$1.1
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r4v3, types: [T, android.view.View, java.lang.Object] */
                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final FrameLayout invoke(Context context) {
                            zq3.h(context, "context");
                            FrameLayout frameLayout = new FrameLayout(context);
                            Ref$ObjectRef<AudioIndicator> ref$ObjectRef3 = Ref$ObjectRef.this;
                            ?? findViewById = LayoutInflater.from(context).inflate(yh6.audio_layout, (ViewGroup) frameLayout, true).findViewById(fg6.audio_indicator);
                            zq3.g(findViewById, "findViewById(...)");
                            ref$ObjectRef3.element = findViewById;
                            return frameLayout;
                        }
                    }, a5, null, composer2, 0, 4);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, 221184, 14);
            h.R();
            h.t();
            h.R();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.media.audio.views.AudioIndicatorLayoutKt$AudioIndicatorLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    AudioIndicatorLayoutKt.a(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
