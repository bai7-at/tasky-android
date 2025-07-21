package androidx.compose.material;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import defpackage.bd8;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.dj7;
import defpackage.ea7;
import defpackage.eu8;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.jj7;
import defpackage.lj7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class DrawerKt {
    private static final float a;
    private static final float b;
    private static final float c = bu1.g(WindowState.NORMAL);
    private static final eu8 d = new eu8(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 0, null, 6, null);

    static {
        float f = 56;
        a = bu1.g(f);
        b = bu1.g(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.it2 r34, androidx.compose.ui.Modifier r35, androidx.compose.material.DrawerState r36, boolean r37, defpackage.no7 r38, float r39, long r40, long r42, long r44, final defpackage.gt2 r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.a(it2, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, no7, float, long, long, long, gt2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final boolean z, final qs2 qs2Var, final qs2 qs2Var2, final long j, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer h = composer.h(1983403750);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(qs2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.e(j) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i2 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:827)");
            }
            final String a2 = o.a(n.a.a(), h, 6);
            if (z) {
                Modifier.a aVar = Modifier.a;
                h.z(1903601685);
                boolean C = h.C(qs2Var);
                Object A = h.A();
                if (C || A == Composer.a.a()) {
                    A = new DrawerKt$Scrim$dismissDrawer$1$1(qs2Var, null);
                    h.q(A);
                }
                h.R();
                Modifier c2 = bd8.c(aVar, qs2Var, (gt2) A);
                h.z(1903601769);
                boolean S = h.S(a2) | h.C(qs2Var);
                Object A2 = h.A();
                if (S || A2 == Composer.a.a()) {
                    A2 = new ss2() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(lj7 lj7Var) {
                            jj7.O(lj7Var, a2);
                            final qs2 qs2Var3 = qs2Var;
                            jj7.w(lj7Var, null, new qs2() { // from class: androidx.compose.material.DrawerKt$Scrim$dismissDrawer$2$1.1
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
                    };
                    h.q(A2);
                }
                h.R();
                modifier = dj7.c(c2, true, (ss2) A2);
            } else {
                modifier = Modifier.a;
            }
            Modifier h2 = SizeKt.f(Modifier.a, 0.0f, 1, null).h(modifier);
            h.z(1903602010);
            boolean e = h.e(j) | h.C(qs2Var2);
            Object A3 = h.A();
            if (e || A3 == Composer.a.a()) {
                A3 = new ss2() { // from class: androidx.compose.material.DrawerKt$Scrim$1$1
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
                        fv1.a0(fv1Var, j, 0L, 0L, ((Number) qs2Var2.mo865invoke()).floatValue(), null, null, 0, 118, null);
                    }
                };
                h.q(A3);
            }
            h.R();
            CanvasKt.a(h2, (ss2) A3, h, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.DrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    DrawerKt.b(z, qs2Var, qs2Var2, j, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(float f, float f2, float f3) {
        return uo6.l((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    public static final DrawerState j(final DrawerValue drawerValue, final ss2 ss2Var, Composer composer, int i, int i2) {
        composer.z(-1435874229);
        if ((i2 & 2) != 0) {
            ss2Var = new ss2() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:448)");
        }
        Object[] objArr = new Object[0];
        ea7 a2 = DrawerState.c.a(ss2Var);
        composer.z(1903586313);
        boolean S = composer.S(drawerValue) | composer.C(ss2Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new qs2() { // from class: androidx.compose.material.DrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DrawerState mo865invoke() {
                    return new DrawerState(DrawerValue.this, ss2Var);
                }
            };
            composer.q(A);
        }
        composer.R();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.b(objArr, a2, null, (qs2) A, composer, 72, 4);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return drawerState;
    }
}
