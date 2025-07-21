package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentContainerView;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.f99;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ss2;
import defpackage.vg6;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class AndroidViewBindingKt {
    /* JADX WARN: Can't wrap try/catch for region: R(40:0|1|(1:3)(2:103|(3:105|(1:107)(1:109)|108)(1:110))|4|(1:6)(2:96|(37:98|(1:100)(1:102)|101|8|(1:10)(2:89|(34:91|(1:93)(1:95)|94|12|(1:14)(2:82|(31:84|(1:86)(1:88)|87|16|(1:18)(2:75|(7:77|(1:79)(1:81)|80|20|(16:(1:32)(1:74)|33|(1:35)(1:73)|(1:37)(1:72)|(1:39)(1:71)|40|(1:42)|43|(4:65|66|67|68)|47|(3:49|(1:63)|53)(1:64)|54|(1:62)|58|(1:60)|61)(1:24)|25|(2:27|28)(1:30)))|19|20|(1:22)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(1:45)|65|66|67|68|47|(0)(0)|54|(1:56)|62|58|(0)|61|25|(0)(0)))|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)))|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)))|7|8|(0)(0)|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|33|(0)(0)|(0)(0)|(0)(0)|40|(0)|43|(0)|65|66|67|68|47|(0)(0)|54|(0)|62|58|(0)|61|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.it2 r16, androidx.compose.ui.Modifier r17, defpackage.ss2 r18, defpackage.ss2 r19, defpackage.ss2 r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewBindingKt.a(it2, androidx.compose.ui.Modifier, ss2, ss2, ss2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final it2 it2Var, Modifier modifier, ss2 ss2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-1985291610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.C(it2Var) ? 4 : 2) | i;
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
            i3 |= h.C(ss2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                ss2Var = new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$1
                    public final void b(f99 f99Var) {
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((f99) obj);
                        return ww8.a;
                    }
                };
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:79)");
            }
            a(it2Var, modifier, null, null, ss2Var, h, (i3 & 14) | 384 | (i3 & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 6) & 57344), 8);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final ss2 ss2Var2 = ss2Var;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$2
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
                    AndroidViewBindingKt.b(it2.this, modifier2, ss2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ViewGroup viewGroup, ss2 ss2Var) {
        if (viewGroup instanceof FragmentContainerView) {
            ss2Var.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt, ss2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f99 g(View view) {
        Object tag = view.getTag(vg6.binding_reference);
        zq3.f(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (f99) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(View view, f99 f99Var) {
        view.setTag(vg6.binding_reference, f99Var);
    }
}
