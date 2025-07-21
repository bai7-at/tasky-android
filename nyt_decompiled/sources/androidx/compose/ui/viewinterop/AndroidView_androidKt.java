package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.aa7;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.d44;
import defpackage.et0;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class AndroidView_androidKt {
    private static final ss2 a = new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        public final void b(View view) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((View) obj);
            return ww8.a;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.ss2 r21, androidx.compose.ui.Modifier r22, defpackage.ss2 r23, defpackage.ss2 r24, defpackage.ss2 r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.a(ss2, androidx.compose.ui.Modifier, ss2, ss2, ss2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final ss2 ss2Var, Modifier modifier, ss2 ss2Var2, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.C(ss2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.C(ss2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                ss2Var2 = a;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:106)");
            }
            a(ss2Var, modifier, null, a, ss2Var2, h, (i3 & 14) | 3072 | (i3 & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 6) & 57344), 4);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final ss2 ss2Var3 = ss2Var2;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    AndroidView_androidKt.b(ss2.this, modifier2, ss2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final qs2 d(final ss2 ss2Var, Composer composer, int i) {
        composer.z(2030558801);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:265)");
        }
        final int a2 = cs0.a(composer, 0);
        final Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        final c d = cs0.d(composer, 0);
        final androidx.compose.runtime.saveable.a aVar = (androidx.compose.runtime.saveable.a) composer.m(SaveableStateRegistryKt.b());
        final View view = (View) composer.m(AndroidCompositionLocals_androidKt.k());
        qs2 qs2Var = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LayoutNode mo865invoke() {
                Context context2 = context;
                ss2 ss2Var2 = ss2Var;
                c cVar = d;
                androidx.compose.runtime.saveable.a aVar2 = aVar;
                int i2 = a2;
                KeyEvent.Callback callback = view;
                zq3.f(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                return new ViewFactoryHolder(context2, ss2Var2, cVar, aVar2, i2, (m) callback).getLayoutNode();
            }
        };
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return qs2Var;
    }

    public static final ss2 e() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewFactoryHolder f(LayoutNode layoutNode) {
        AndroidViewHolder P = layoutNode.P();
        if (P == null) {
            throw new IllegalStateException("Required value was null.");
        }
        zq3.f(P, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (ViewFactoryHolder) P;
    }

    private static final void g(Composer composer, Modifier modifier, int i, fm1 fm1Var, d44 d44Var, aa7 aa7Var, LayoutDirection layoutDirection, et0 et0Var) {
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        Updater.c(composer, et0Var, companion.g());
        Updater.c(composer, modifier, new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            public final void b(LayoutNode layoutNode, Modifier modifier2) {
                ViewFactoryHolder f;
                f = AndroidView_androidKt.f(layoutNode);
                f.setModifier(modifier2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (Modifier) obj2);
                return ww8.a;
            }
        });
        Updater.c(composer, fm1Var, new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            public final void b(LayoutNode layoutNode, fm1 fm1Var2) {
                ViewFactoryHolder f;
                f = AndroidView_androidKt.f(layoutNode);
                f.setDensity(fm1Var2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (fm1) obj2);
                return ww8.a;
            }
        });
        Updater.c(composer, d44Var, new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            public final void b(LayoutNode layoutNode, d44 d44Var2) {
                ViewFactoryHolder f;
                f = AndroidView_androidKt.f(layoutNode);
                f.setLifecycleOwner(d44Var2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (d44) obj2);
                return ww8.a;
            }
        });
        Updater.c(composer, aa7Var, new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            public final void b(LayoutNode layoutNode, aa7 aa7Var2) {
                ViewFactoryHolder f;
                f = AndroidView_androidKt.f(layoutNode);
                f.setSavedStateRegistryOwner(aa7Var2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (aa7) obj2);
                return ww8.a;
            }
        });
        Updater.c(composer, layoutDirection, new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            public final void b(LayoutNode layoutNode, LayoutDirection layoutDirection2) {
                ViewFactoryHolder f;
                f = AndroidView_androidKt.f(layoutNode);
                int i2 = a.a[layoutDirection2.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f.setLayoutDirection(i3);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((LayoutNode) obj, (LayoutDirection) obj2);
                return ww8.a;
            }
        });
        gt2 b = companion.b();
        if (composer.f() || !zq3.c(composer.A(), Integer.valueOf(i))) {
            composer.q(Integer.valueOf(i));
            composer.v(Integer.valueOf(i), b);
        }
    }
}
