package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import defpackage.bd8;
import defpackage.cy4;
import defpackage.cz3;
import defpackage.dj7;
import defpackage.ez3;
import defpackage.fm1;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ExposedDropdownMenu_androidKt {

    public static final class a implements ExposedDropdownMenuBoxScope {
        final /* synthetic */ fm1 a;
        final /* synthetic */ cy4 b;
        final /* synthetic */ cy4 c;

        a(fm1 fm1Var, cy4 cy4Var, cy4 cy4Var2) {
            this.a = fm1Var;
            this.b = cy4Var;
            this.c = cy4Var2;
        }

        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
        public Modifier a(Modifier modifier, boolean z) {
            fm1 fm1Var = this.a;
            cy4 cy4Var = this.b;
            cy4 cy4Var2 = this.c;
            Modifier k = SizeKt.k(modifier, 0.0f, fm1Var.v(ExposedDropdownMenu_androidKt.d(cy4Var)), 1, null);
            return z ? SizeKt.s(k, fm1Var.v(ExposedDropdownMenu_androidKt.b(cy4Var2))) : k;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r19, final defpackage.ss2 r20, androidx.compose.ui.Modifier r21, final defpackage.it2 r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenu_androidKt.a(boolean, ss2, androidx.compose.ui.Modifier, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(cy4 cy4Var) {
        return cy4Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cy4 cy4Var, int i) {
        cy4Var.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(cy4 cy4Var) {
        return cy4Var.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(cy4 cy4Var, int i) {
        cy4Var.f(i);
    }

    private static final Modifier k(Modifier modifier, final qs2 qs2Var, final String str) {
        return dj7.d(bd8.c(modifier, qs2Var, new ExposedDropdownMenu_androidKt$expandable$1(qs2Var, null)), false, new ss2() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(lj7 lj7Var) {
                jj7.O(lj7Var, str);
                final qs2 qs2Var2 = qs2Var;
                jj7.w(lj7Var, null, new qs2() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final Boolean mo865invoke() {
                        qs2.this.mo865invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(View view, cz3 cz3Var, int i, ss2 ss2Var) {
        if (cz3Var == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        ss2Var.invoke(Integer.valueOf(((int) Math.max(ez3.c(cz3Var).l() - rect.top, (rect.bottom - r1) - ez3.c(cz3Var).e())) - i));
    }
}
