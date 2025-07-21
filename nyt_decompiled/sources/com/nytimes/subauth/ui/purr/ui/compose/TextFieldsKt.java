package com.nytimes.subauth.ui.purr.ui.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.bv8;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.gt2;
import defpackage.k48;
import defpackage.m36;
import defpackage.uh8;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Locale;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class TextFieldsKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r38, final int r39, long r40, androidx.compose.ui.text.j r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt.a(androidx.compose.ui.Modifier, int, long, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(Modifier modifier, final int i, long j, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long j2;
        Modifier modifier3;
        long j3;
        j b;
        int i5;
        Composer h = composer.h(-606963315);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (h.S(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                j2 = j;
                if (h.e(j2)) {
                    i5 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    i4 |= i5;
                }
            } else {
                j2 = j;
            }
            i5 = 128;
            i4 |= i5;
        } else {
            j2 = j;
        }
        if ((i4 & 731) == 146 && h.i()) {
            h.K();
            modifier3 = modifier2;
            j3 = j2;
        } else {
            h.E();
            if ((i2 & 1) == 0 || h.N()) {
                modifier3 = i6 != 0 ? Modifier.a : modifier2;
                if ((i3 & 4) != 0) {
                    j2 = m36.a.a(h, 6).b().l();
                    i4 &= -897;
                }
            } else {
                h.K();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier2;
            }
            int i7 = i4;
            j3 = j2;
            h.u();
            if (b.G()) {
                b.S(-606963315, i7, -1, "com.nytimes.subauth.ui.purr.ui.compose.PrivacySecondaryText (TextFields.kt:97)");
            }
            Modifier k = PaddingKt.k(modifier3, bu1.g(22), 0.0f, 2, null);
            String b2 = k48.b(i, h, (i7 >> 3) & 14);
            b = r8.b((r42 & 1) != 0 ? r8.a.i() : j3, (r42 & 2) != 0 ? r8.a.m() : 0L, (r42 & 4) != 0 ? r8.a.p() : null, (r42 & 8) != 0 ? r8.a.n() : null, (r42 & 16) != 0 ? r8.a.o() : null, (r42 & 32) != 0 ? r8.a.k() : null, (r42 & 64) != 0 ? r8.a.l() : null, (r42 & 128) != 0 ? r8.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r8.a.g() : null, (r42 & 512) != 0 ? r8.a.w() : null, (r42 & 1024) != 0 ? r8.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r8.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r8.a.u() : null, (r42 & 8192) != 0 ? r8.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r8.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r8.b.i()) : null, (r42 & 65536) != 0 ? r8.b.e() : 0L, (r42 & 131072) != 0 ? bv8.d().b.j() : null);
            TextKt.e(b2, k, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b, h, 0, 0, 32764);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final Modifier modifier4 = modifier3;
            final long j4 = j3;
            k2.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt$PrivacySecondaryText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    TextFieldsKt.b(Modifier.this, i, j4, composer2, i2 | 1, i3);
                }
            });
        }
    }

    public static final void c(Modifier modifier, final int i, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        j b;
        Composer composer2;
        Composer h = composer.h(1348312007);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (h.S(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.d(i) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            Modifier modifier3 = i5 != 0 ? Modifier.a : modifier2;
            if (b.G()) {
                b.S(1348312007, i4, -1, "com.nytimes.subauth.ui.purr.ui.compose.PrivacySettingsHeader (TextFields.kt:24)");
            }
            Modifier m = PaddingKt.m(modifier3, bu1.g(20), 0.0f, 0.0f, 0.0f, 14, null);
            String upperCase = k48.b(i, h, (i4 >> 3) & 14).toUpperCase(Locale.ROOT);
            zq3.g(upperCase, "toUpperCase(...)");
            b = r29.b((r42 & 1) != 0 ? r29.a.i() : m36.a.a(h, 6).l(), (r42 & 2) != 0 ? r29.a.m() : 0L, (r42 & 4) != 0 ? r29.a.p() : null, (r42 & 8) != 0 ? r29.a.n() : null, (r42 & 16) != 0 ? r29.a.o() : null, (r42 & 32) != 0 ? r29.a.k() : null, (r42 & 64) != 0 ? r29.a.l() : null, (r42 & 128) != 0 ? r29.a.q() : 0L, (r42 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r29.a.g() : null, (r42 & 512) != 0 ? r29.a.w() : null, (r42 & 1024) != 0 ? r29.a.r() : null, (r42 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r29.a.f() : 0L, (r42 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r29.a.u() : null, (r42 & 8192) != 0 ? r29.a.t() : null, (r42 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? dh8.h(r29.b.h()) : null, (r42 & 32768) != 0 ? uh8.g(r29.b.i()) : null, (r42 & 65536) != 0 ? r29.b.e() : 0L, (r42 & 131072) != 0 ? bv8.a().b.j() : null);
            composer2 = h;
            TextKt.e(upperCase, m, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, b, composer2, 0, 0, 32764);
            if (b.G()) {
                b.R();
            }
            modifier2 = modifier3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt$PrivacySettingsHeader$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i6) {
                    TextFieldsKt.c(Modifier.this, i, composer3, i2 | 1, i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.compose.ui.Modifier r37, final int r38, defpackage.qs2 r39, long r40, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.purr.ui.compose.TextFieldsKt.d(androidx.compose.ui.Modifier, int, qs2, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
