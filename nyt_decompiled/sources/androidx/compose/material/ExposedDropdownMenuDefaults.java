package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ag4;
import defpackage.cc7;
import defpackage.di8;
import defpackage.dj7;
import defpackage.dp;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.lj7;
import defpackage.nn0;
import defpackage.oe3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uv0;
import defpackage.ww8;
import defpackage.x27;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final ExposedDropdownMenuDefaults a = new ExposedDropdownMenuDefaults();
    public static final int b = 0;

    private ExposedDropdownMenuDefaults() {
    }

    public final void a(final boolean z, qs2 qs2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1752693020);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                qs2Var = new qs2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m35invoke() {
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m35invoke();
                        return ww8.a;
                    }
                };
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1752693020, i3, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:294)");
            }
            IconButtonKt.a(qs2Var, dj7.a(Modifier.a, new ss2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$2
                public final void b(lj7 lj7Var) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((lj7) obj);
                    return ww8.a;
                }
            }), false, null, zr0.b(h, -689144648, true, new gt2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.S(-689144648, i5, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.android.kt:300)");
                    }
                    IconKt.a(dp.a(oe3.a.a), "Trailing icon for exposed dropdown menu", x27.a(Modifier.a, z ? 180.0f : 360.0f), 0L, composer2, 48, 8);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, ((i3 >> 3) & 14) | 24576, 12);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final qs2 qs2Var2 = qs2Var;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$TrailingIcon$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    ExposedDropdownMenuDefaults.this.a(z, qs2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public final di8 b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        composer.z(969536191);
        long r = (i4 & 1) != 0 ? nn0.r(((nn0) composer.m(ContentColorKt.a())).B(), ((Number) composer.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long r2 = (i4 & 2) != 0 ? nn0.r(r, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long r3 = (i4 & 4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j23 = (i4 & 8) != 0 ? ag4.a.a(composer, 6).j() : j4;
        long d = (i4 & 16) != 0 ? ag4.a.a(composer, 6).d() : j5;
        long r4 = (i4 & 32) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long r5 = (i4 & 64) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long r6 = (i4 & 128) != 0 ? nn0.r(r5, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long d2 = (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ag4.a.a(composer, 6).d() : j9;
        long r7 = (i4 & 512) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long r8 = (i4 & 1024) != 0 ? nn0.r(r7, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j24 = (i4 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r7 : j12;
        long r9 = (i4 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long r10 = (i4 & 8192) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long r11 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? nn0.r(r9, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long d3 = (32768 & i4) != 0 ? ag4.a.a(composer, 6).d() : j16;
        long r12 = (65536 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long r13 = (131072 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long r14 = (262144 & i4) != 0 ? nn0.r(r13, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long d4 = (524288 & i4) != 0 ? ag4.a.a(composer, 6).d() : j20;
        long r15 = (1048576 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long r16 = (i4 & 2097152) != 0 ? nn0.r(r15, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(969536191, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:390)");
        }
        f fVar = new f(r, r2, j23, d, r4, r5, d2, r6, r7, r8, j24, r9, r10, r11, d3, r3, r12, r13, r14, d4, r15, r16, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return fVar;
    }
}
