package com.nytimes.android.composeui.base;

import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class BasicAppBarKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004d  */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r24, java.lang.String r25, boolean r26, defpackage.qs2 r27, long r28, long r30, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.composeui.base.BasicAppBarKt.a(androidx.compose.ui.Modifier, java.lang.String, boolean, qs2, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final gt2 b(final qs2 qs2Var) {
        return zr0.c(-537109397, true, new gt2() { // from class: com.nytimes.android.composeui.base.BasicAppBarKt$buildBackNavigationIcon$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-537109397, i, -1, "com.nytimes.android.composeui.base.buildBackNavigationIcon.<anonymous> (BasicAppBar.kt:88)");
                }
                composer.z(1777474039);
                boolean S = composer.S(qs2.this);
                final qs2 qs2Var2 = qs2.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new qs2() { // from class: com.nytimes.android.composeui.base.BasicAppBarKt$buildBackNavigationIcon$1$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m320invoke();
                            return ww8.a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m320invoke() {
                            qs2.this.mo865invoke();
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                IconButtonKt.a((qs2) A, null, false, null, ComposableSingletons$BasicAppBarKt.a.a(), composer, 24576, 14);
                if (b.G()) {
                    b.R();
                }
            }
        });
    }

    public static final gt2 c(boolean z, qs2 qs2Var) {
        zq3.h(qs2Var, "onBack");
        if (z) {
            return b(qs2Var);
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
