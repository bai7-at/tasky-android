package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.l;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.in3;
import defpackage.it2;
import defpackage.qg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.animation.core.Transition r20, final defpackage.ss2 r21, final androidx.compose.ui.Modifier r22, final androidx.compose.animation.c r23, final androidx.compose.animation.e r24, final defpackage.gt2 r25, defpackage.ze5 r26, final defpackage.it2 r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.a(androidx.compose.animation.core.Transition, ss2, androidx.compose.ui.Modifier, androidx.compose.animation.c, androidx.compose.animation.e, gt2, ze5, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gt2 b(x08 x08Var) {
        return (gt2) x08Var.getValue();
    }

    private static final boolean c(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.zo0 r23, final boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.c r26, androidx.compose.animation.e r27, java.lang.String r28, final defpackage.it2 r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.d(zo0, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.c, androidx.compose.animation.e, java.lang.String, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.m37 r23, final boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.c r26, androidx.compose.animation.e r27, java.lang.String r28, final defpackage.it2 r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.e(m37, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.c, androidx.compose.animation.e, java.lang.String, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final boolean r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.c r25, androidx.compose.animation.e r26, java.lang.String r27, final defpackage.it2 r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.f(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.c, androidx.compose.animation.e, java.lang.String, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(final Transition transition, final ss2 ss2Var, final Modifier modifier, final c cVar, final e eVar, final it2 it2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(429978603);
        if ((i & 14) == 0) {
            i2 = (h.S(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(ss2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(modifier) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(cVar) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= h.S(eVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.C(it2Var) ? 131072 : 65536;
        }
        if ((374491 & i2) == 74898 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(429978603, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            h.z(1276591712);
            boolean C = h.C(ss2Var) | h.S(transition);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                A = new it2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final sg4 b(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
                        final l W = qg4Var.W(j);
                        long a = (!fVar.Z() || ((Boolean) ss2.this.invoke(transition.n())).booleanValue()) ? in3.a(W.F0(), W.v0()) : hn3.b.a();
                        return androidx.compose.ui.layout.f.J(fVar, hn3.g(a), hn3.f(a), null, new ss2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            {
                                super(1);
                            }

                            public final void b(l.a aVar) {
                                l.a.f(aVar, l.this, 0, 0, 0.0f, 4, null);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((l.a) obj);
                                return ww8.a;
                            }
                        }, 4, null);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return b((androidx.compose.ui.layout.f) obj, (qg4) obj2, ((fv0) obj3).t());
                    }
                };
                h.q(A);
            }
            h.R();
            a(transition, ss2Var, androidx.compose.ui.layout.d.a(modifier, (it2) A), cVar, eVar, new gt2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                }
            }, null, it2Var, h, 196608 | (i2 & 14) | (i2 & ContentType.LONG_FORM_ON_DEMAND) | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
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
                    AnimatedVisibilityKt.g(Transition.this, ss2Var, modifier, cVar, eVar, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(Transition transition) {
        Object h = transition.h();
        EnterExitState enterExitState = EnterExitState.PostExit;
        return h == enterExitState && transition.n() == enterExitState;
    }

    private static final EnterExitState k(Transition transition, ss2 ss2Var, Object obj, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.z(361571134);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)");
        }
        composer.F(-721835388, transition);
        if (transition.r()) {
            enterExitState = ((Boolean) ss2Var.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) ss2Var.invoke(transition.h())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = b0.e(Boolean.FALSE, null, 2, null);
                composer.q(A);
            }
            composer.R();
            sy4 sy4Var = (sy4) A;
            if (((Boolean) ss2Var.invoke(transition.h())).booleanValue()) {
                sy4Var.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) ss2Var.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) sy4Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        composer.Q();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return enterExitState;
    }
}
