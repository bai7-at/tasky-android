package com.nytimes.subauth.ui.ui.theme;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ap7;
import defpackage.av8;
import defpackage.b68;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.f68;
import defpackage.gt2;
import defpackage.nn0;
import defpackage.o76;
import defpackage.r81;
import defpackage.ro0;
import defpackage.uh8;
import defpackage.uj1;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.yu8;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class ThemeKt {
    public static final void a(f68 f68Var, boolean z, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        boolean z2;
        f68 f68Var2;
        int i3;
        zq3.h(gt2Var, "content");
        Composer h = composer.h(1340422948);
        int i4 = i2 & 1;
        int i5 = i4 != 0 ? i | 2 : i;
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            if ((i2 & 2) == 0) {
                z2 = z;
                if (h.a(z2)) {
                    i3 = 32;
                    i5 |= i3;
                }
            } else {
                z2 = z;
            }
            i3 = 16;
            i5 |= i3;
        } else {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            i5 |= 384;
        } else if ((i & 896) == 0) {
            i5 |= h.S(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if (i4 == 1 && (i5 & 731) == 146 && h.i()) {
            h.K();
            f68Var2 = f68Var;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                if (i4 != 0) {
                    Resources resources = ((Context) h.m(AndroidCompositionLocals_androidKt.g())).getResources();
                    zq3.g(resources, "getResources(...)");
                    f68Var2 = new uj1(resources, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, 134217726, null).a();
                    i5 &= -15;
                } else {
                    f68Var2 = f68Var;
                }
                if ((i2 & 2) != 0) {
                    z2 = r81.a(h, 0);
                    i5 &= -113;
                }
            } else {
                h.K();
                if (i4 != 0) {
                    i5 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                f68Var2 = f68Var;
            }
            h.u();
            if (b.G()) {
                b.S(1340422948, i5, -1, "com.nytimes.subauth.ui.ui.theme.AndroidSubauthTheme (Theme.kt:50)");
            }
            final b68 c = z2 ? f68Var2.c() : f68Var2.g();
            final ro0 b = z2 ? b(c) : c(c);
            CompositionLocalKt.b(new o76[]{ColorKt.x().c(c)}, zr0.b(h, 800964196, true, new gt2() { // from class: com.nytimes.subauth.ui.ui.theme.ThemeKt$AndroidSubauthTheme$1
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
                    j b2;
                    j b3;
                    j b4;
                    av8 a;
                    if ((i6 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(800964196, i6, -1, "com.nytimes.subauth.ui.ui.theme.AndroidSubauthTheme.<anonymous> (Theme.kt:66)");
                    }
                    ro0 ro0Var = ro0.this;
                    av8 b5 = yu8.b();
                    b2 = r7.b((r42 & 1) != 0 ? r7.a.i() : ColorKt.B(c.w()), (r42 & 2) != 0 ? r7.a.m() : 0L, (r42 & 4) != 0 ? r7.a.p() : null, (r42 & 8) != 0 ? r7.a.n() : null, (r42 & 16) != 0 ? r7.a.o() : null, (r42 & 32) != 0 ? r7.a.k() : null, (r42 & 64) != 0 ? r7.a.l() : null, (r42 & 128) != 0 ? r7.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r7.a.g() : null, (r42 & 512) != 0 ? r7.a.w() : null, (r42 & 1024) != 0 ? r7.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r7.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r7.a.u() : null, (r42 & 8192) != 0 ? r7.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r7.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r7.b.i()) : null, (r42 & 65536) != 0 ? r7.b.e() : 0L, (r42 & 131072) != 0 ? yu8.b().g().b.j() : null);
                    b3 = r8.b((r42 & 1) != 0 ? r8.a.i() : ColorKt.B(c.c()), (r42 & 2) != 0 ? r8.a.m() : 0L, (r42 & 4) != 0 ? r8.a.p() : null, (r42 & 8) != 0 ? r8.a.n() : null, (r42 & 16) != 0 ? r8.a.o() : null, (r42 & 32) != 0 ? r8.a.k() : null, (r42 & 64) != 0 ? r8.a.l() : null, (r42 & 128) != 0 ? r8.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r8.a.g() : null, (r42 & 512) != 0 ? r8.a.w() : null, (r42 & 1024) != 0 ? r8.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r8.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r8.a.u() : null, (r42 & 8192) != 0 ? r8.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r8.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r8.b.i()) : null, (r42 & 65536) != 0 ? r8.b.e() : 0L, (r42 & 131072) != 0 ? yu8.b().c().b.j() : null);
                    b4 = r16.b((r42 & 1) != 0 ? r16.a.i() : ColorKt.B(c.d()), (r42 & 2) != 0 ? r16.a.m() : 0L, (r42 & 4) != 0 ? r16.a.p() : null, (r42 & 8) != 0 ? r16.a.n() : null, (r42 & 16) != 0 ? r16.a.o() : null, (r42 & 32) != 0 ? r16.a.k() : null, (r42 & 64) != 0 ? r16.a.l() : null, (r42 & 128) != 0 ? r16.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r16.a.g() : null, (r42 & 512) != 0 ? r16.a.w() : null, (r42 & 1024) != 0 ? r16.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r16.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r16.a.u() : null, (r42 & 8192) != 0 ? r16.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r16.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r16.b.i()) : null, (r42 & 65536) != 0 ? r16.b.e() : 0L, (r42 & 131072) != 0 ? yu8.b().d().b.j() : null);
                    a = b5.a((r28 & 1) != 0 ? b5.a : b2, (r28 & 2) != 0 ? b5.b : null, (r28 & 4) != 0 ? b5.c : null, (r28 & 8) != 0 ? b5.d : null, (r28 & 16) != 0 ? b5.e : null, (r28 & 32) != 0 ? b5.f : null, (r28 & 64) != 0 ? b5.g : null, (r28 & 128) != 0 ? b5.h : null, (r28 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? b5.i : b3, (r28 & 512) != 0 ? b5.j : b4, (r28 & 1024) != 0 ? b5.k : null, (r28 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? b5.l : null, (r28 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? b5.m : null);
                    MaterialThemeKt.a(ro0Var, a, ap7.a(), gt2Var, composer2, 384, 0);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 56);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            final f68 f68Var3 = f68Var2;
            final boolean z3 = z2;
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.theme.ThemeKt$AndroidSubauthTheme$2
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
                    ThemeKt.a(f68.this, z3, gt2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final ro0 b(b68 b68Var) {
        zq3.h(b68Var, "subauthColors");
        return ColorsKt.d(nn0.b.h(), 0L, ColorKt.B(b68Var.c()), 0L, ColorKt.B(b68Var.b()), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4074, null);
    }

    public static final ro0 c(b68 b68Var) {
        ro0 g;
        zq3.h(b68Var, "subauthColors");
        g = ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : nn0.b.a(), (r43 & 2) != 0 ? wn0.d(4281794739L) : 0L, (r43 & 4) != 0 ? wn0.d(4278442694L) : ColorKt.B(b68Var.c()), (r43 & 8) != 0 ? wn0.d(4278290310L) : 0L, (r43 & 16) != 0 ? nn0.b.h() : ColorKt.B(b68Var.b()), (r43 & 32) != 0 ? nn0.b.h() : 0L, (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : 0L, (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : 0L, (r43 & 512) != 0 ? nn0.b.a() : 0L, (r43 & 1024) != 0 ? nn0.b.a() : 0L, (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
        return g;
    }
}
