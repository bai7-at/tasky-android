package androidx.compose.material3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bd8;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dj7;
import defpackage.et0;
import defpackage.eu8;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.it2;
import defpackage.jj7;
import defpackage.ju7;
import defpackage.lj7;
import defpackage.ms1;
import defpackage.nn0;
import defpackage.ns1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ru1;
import defpackage.ss2;
import defpackage.tu1;
import defpackage.vu4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ModalBottomSheet_androidKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.qs2 r44, androidx.compose.ui.Modifier r45, androidx.compose.material3.SheetState r46, float r47, defpackage.no7 r48, long r49, long r51, float r53, long r54, defpackage.gt2 r56, androidx.compose.foundation.layout.o r57, defpackage.vu4 r58, final defpackage.it2 r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.a(qs2, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, no7, long, long, float, long, gt2, androidx.compose.foundation.layout.o, vu4, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(final vu4 vu4Var, final qs2 qs2Var, final o oVar, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(738805080);
        if ((i & 6) == 0) {
            i2 = (h.S(vu4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h.S(oVar) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= h.C(gt2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) == 1170 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(738805080, i3, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) h.m(AndroidCompositionLocals_androidKt.k());
            UUID uuid = (UUID) RememberSaveableKt.b(new Object[0], null, null, new qs2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$id$1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UUID mo865invoke() {
                    return UUID.randomUUID();
                }
            }, h, 3072, 6);
            androidx.compose.runtime.c d = cs0.d(h, 0);
            final x08 o = y.o(gt2Var, h, (i3 >> 9) & 14);
            final LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            h.z(173201889);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            Object obj = A;
            if (A == aVar.a()) {
                ModalBottomSheetWindow modalBottomSheetWindow = new ModalBottomSheetWindow(vu4Var, qs2Var, view, uuid);
                modalBottomSheetWindow.n(d, zr0.c(-114385661, true, new gt2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        gt2 c;
                        if ((i4 & 3) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-114385661, i4, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:452)");
                        }
                        Modifier modifier = Modifier.a;
                        Modifier c2 = WindowInsetsPaddingKt.c(dj7.d(modifier, false, new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1.1
                            public final void b(lj7 lj7Var) {
                                jj7.E(lj7Var);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                b((lj7) obj2);
                                return ww8.a;
                            }
                        }, 1, null), o.this);
                        if (Build.VERSION.SDK_INT >= 33) {
                            modifier = WindowInsetsPadding_androidKt.a(modifier);
                        }
                        Modifier h2 = c2.h(modifier);
                        x08 x08Var = o;
                        composer2.z(733328855);
                        rg4 g = BoxKt.g(Alignment.a.o(), false, composer2, 0);
                        composer2.z(-1323940314);
                        int a2 = cs0.a(composer2, 0);
                        et0 o2 = composer2.o();
                        ComposeUiNode.Companion companion = ComposeUiNode.F;
                        qs2 a3 = companion.a();
                        it2 c3 = LayoutKt.c(h2);
                        if (composer2.j() == null) {
                            cs0.c();
                        }
                        composer2.G();
                        if (composer2.f()) {
                            composer2.D(a3);
                        } else {
                            composer2.p();
                        }
                        Composer a4 = Updater.a(composer2);
                        Updater.c(a4, g, companion.e());
                        Updater.c(a4, o2, companion.g());
                        gt2 b = companion.b();
                        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                            a4.q(Integer.valueOf(a2));
                            a4.v(Integer.valueOf(a2), b);
                        }
                        c3.invoke(ju7.a(ju7.b(composer2)), composer2, 0);
                        composer2.z(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                        c = ModalBottomSheet_androidKt.c(x08Var);
                        c.invoke(composer2, 0);
                        composer2.R();
                        composer2.t();
                        composer2.R();
                        composer2.R();
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }));
                h.q(modalBottomSheetWindow);
                obj = modalBottomSheetWindow;
            }
            final ModalBottomSheetWindow modalBottomSheetWindow2 = (ModalBottomSheetWindow) obj;
            h.R();
            h.z(173202877);
            boolean C = h.C(modalBottomSheetWindow2) | h.S(layoutDirection);
            Object A2 = h.A();
            if (C || A2 == aVar.a()) {
                A2 = new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1

                    public static final class a implements ms1 {
                        final /* synthetic */ ModalBottomSheetWindow a;

                        public a(ModalBottomSheetWindow modalBottomSheetWindow) {
                            this.a = modalBottomSheetWindow;
                        }

                        @Override // defpackage.ms1
                        public void dispose() {
                            this.a.f();
                            this.a.dismiss();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ms1 invoke(ns1 ns1Var) {
                        ModalBottomSheetWindow.this.o();
                        ModalBottomSheetWindow.this.p(layoutDirection);
                        return new a(ModalBottomSheetWindow.this);
                    }
                };
                h.q(A2);
            }
            h.R();
            py1.a(modalBottomSheetWindow2, (ss2) A2, h, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheetPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.b(vu4.this, qs2Var, oVar, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 c(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final long j, final qs2 qs2Var, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer h = composer.h(1053897700);
        if ((i & 6) == 0) {
            i2 = (h.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1053897700, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            if (j != nn0.b.g()) {
                final x08 d = AnimateAsStateKt.d(z ? 1.0f : 0.0f, new eu8(0, 0, null, 7, null), 0.0f, null, null, h, 48, 28);
                h.z(-1858718943);
                if (z) {
                    Modifier.a aVar = Modifier.a;
                    h.z(-1858718859);
                    boolean z2 = (i3 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object A = h.A();
                    if (z2 || A == Composer.a.a()) {
                        A = new ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1(qs2Var, null);
                        h.q(A);
                    }
                    h.R();
                    modifier = dj7.a(bd8.c(aVar, qs2Var, (gt2) A), new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$2
                        public final void b(lj7 lj7Var) {
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((lj7) obj);
                            return ww8.a;
                        }
                    });
                } else {
                    modifier = Modifier.a;
                }
                h.R();
                Modifier h2 = SizeKt.f(Modifier.a, 0.0f, 1, null).h(modifier);
                h.z(-1858718531);
                boolean S = h.S(d) | ((i3 & 14) == 4);
                Object A2 = h.A();
                if (S || A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((fv1) obj);
                            return ww8.a;
                        }

                        public final void invoke(fv1 fv1Var) {
                            float e;
                            long j2 = j;
                            e = ModalBottomSheet_androidKt.e(d);
                            fv1.a0(fv1Var, j2, 0L, 0L, e, null, null, 0, 118, null);
                        }
                    };
                    h.q(A2);
                }
                h.R();
                CanvasKt.a(h2, (ss2) A2, h, 0);
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    ModalBottomSheet_androidKt.d(j, qs2Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(x08 x08Var) {
        return ((Number) x08Var.getValue()).floatValue();
    }

    public static final /* synthetic */ boolean i(View view) {
        ViewSwazzledHooks.OnLongClickListener._preOnLongClick(null, view);
        return l(view);
    }

    private static final boolean l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier m(Modifier modifier, final SheetState sheetState, final float f) {
        return OnRemeasuredModifierKt.a(modifier, new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(final long j) {
                SheetValue sheetValue;
                final float f2 = f;
                final SheetState sheetState2 = SheetState.this;
                ru1 a2 = AnchoredDraggableKt.a(new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetAnchors$1$newAnchors$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(tu1 tu1Var) {
                        tu1Var.a(SheetValue.Hidden, f2);
                        if (hn3.f(j) > f2 / 2 && !sheetState2.i()) {
                            tu1Var.a(SheetValue.PartiallyExpanded, f2 / 2.0f);
                        }
                        if (hn3.f(j) != 0) {
                            tu1Var.a(SheetValue.Expanded, Math.max(0.0f, f2 - hn3.f(j)));
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((tu1) obj);
                        return ww8.a;
                    }
                });
                int i = a.a[((SheetValue) SheetState.this.e().x()).ordinal()];
                if (i == 1) {
                    sheetValue = SheetValue.Hidden;
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sheetValue = SheetValue.PartiallyExpanded;
                    if (!a2.c(sheetValue)) {
                        sheetValue = SheetValue.Expanded;
                        if (!a2.c(sheetValue)) {
                            sheetValue = SheetValue.Hidden;
                        }
                    }
                }
                SheetState.this.e().I(a2, sheetValue);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((hn3) obj).j());
                return ww8.a;
            }
        });
    }

    public static final SheetState n(boolean z, ss2 ss2Var, Composer composer, int i, int i2) {
        composer.z(-1261794383);
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$rememberModalBottomSheetState$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        ss2 ss2Var2 = ss2Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1261794383, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        SheetState c = SheetDefaultsKt.c(z2, ss2Var2, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & ContentType.LONG_FORM_ON_DEMAND), 8);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = a.a[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }
}
