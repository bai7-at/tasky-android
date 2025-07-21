package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class RefreshableContentKt {
    public static final void a(final DownloadState downloadState, final qs2 qs2Var, Modifier modifier, gt2 gt2Var, it2 it2Var, gt2 gt2Var2, boolean z, float f, Alignment alignment, ym5 ym5Var, long j, long j2, kt2 kt2Var, boolean z2, boolean z3, final it2 it2Var2, Composer composer, final int i, final int i2, final int i3) {
        long j3;
        int i4;
        final long j4;
        long j5;
        Alignment alignment2;
        ym5 ym5Var2;
        final long j6;
        kt2 kt2Var2;
        boolean z4;
        zq3.h(downloadState, "downloadState");
        zq3.h(qs2Var, "onRefresh");
        zq3.h(it2Var2, "content");
        Composer h = composer.h(-206208985);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.a : modifier;
        gt2 b = (i3 & 8) != 0 ? zr0.b(h, 1525259434, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt$RefreshableContent$1
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
                if (b.G()) {
                    b.S(1525259434, i5, -1, "com.nytimes.android.designsystem.uicompose.composable.RefreshableContent.<anonymous> (RefreshableContent.kt:30)");
                }
                ((SnackbarUtil) composer2.m(LocalSnackbarKt.a())).i(true, true, qs2.this);
                if (b.G()) {
                    b.R();
                }
            }
        }) : gt2Var;
        it2 b2 = (i3 & 16) != 0 ? zr0.b(h, 1069810876, true, new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt$RefreshableContent$2
            {
                super(3);
            }

            public final void b(DownloadState.b bVar, Composer composer2, int i5) {
                zq3.h(bVar, "it");
                if (b.G()) {
                    b.S(1069810876, i5, -1, "com.nytimes.android.designsystem.uicompose.composable.RefreshableContent.<anonymous> (RefreshableContent.kt:37)");
                }
                SnackbarUtil.j((SnackbarUtil) composer2.m(LocalSnackbarKt.a()), false, true, qs2.this, 1, null);
                if (b.G()) {
                    b.R();
                }
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((DownloadState.b) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }
        }) : it2Var;
        gt2 a = (i3 & 32) != 0 ? ComposableSingletons$RefreshableContentKt.a.a() : gt2Var2;
        boolean z5 = (i3 & 64) != 0 ? true : z;
        float g = (i3 & 128) != 0 ? bu1.g(80) : f;
        Alignment m = (i3 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? Alignment.a.m() : alignment;
        ym5 a2 = (i3 & 512) != 0 ? PaddingKt.a(bu1.g(0)) : ym5Var;
        if ((i3 & 1024) != 0) {
            i4 = i2 & (-15);
            j3 = eb5.Companion.a(h, 6).a();
        } else {
            j3 = j;
            i4 = i2;
        }
        if ((i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
            i4 &= -113;
            j4 = eb5.Companion.a(h, 6).l();
        } else {
            j4 = j2;
        }
        if ((i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
            alignment2 = m;
            ym5Var2 = a2;
            j6 = j3;
            j5 = j4;
            kt2Var2 = zr0.b(h, -2023233876, true, new kt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt$RefreshableContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void b(SwipeRefreshState swipeRefreshState, float f2, Composer composer2, int i5) {
                    int i6;
                    zq3.h(swipeRefreshState, "s");
                    if ((i5 & 14) == 0) {
                        i6 = i5 | (composer2.S(swipeRefreshState) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                        i6 |= composer2.b(f2) ? 32 : 16;
                    }
                    if ((i6 & 731) == 146 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-2023233876, i6, -1, "com.nytimes.android.designsystem.uicompose.composable.RefreshableContent.<anonymous> (RefreshableContent.kt:49)");
                    }
                    SwipeRefreshIndicatorKt.a(swipeRefreshState, f2, null, false, false, false, j6, j4, null, 0.0f, false, 0.0f, composer2, i6 & WebSocketProtocol.PAYLOAD_SHORT, 0, 3900);
                    if (b.G()) {
                        b.R();
                    }
                }

                @Override // defpackage.kt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    b((SwipeRefreshState) obj, ((bu1) obj2).n(), (Composer) obj3, ((Number) obj4).intValue());
                    return ww8.a;
                }
            });
        } else {
            j5 = j4;
            alignment2 = m;
            ym5Var2 = a2;
            j6 = j3;
            kt2Var2 = kt2Var;
        }
        boolean z6 = (i3 & 8192) != 0 ? true : z2;
        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i4 &= -57345;
            z4 = downloadState.b();
        } else {
            z4 = z3;
        }
        if (b.G()) {
            b.S(-206208985, i, i4, "com.nytimes.android.designsystem.uicompose.composable.RefreshableContent (RefreshableContent.kt:59)");
        }
        final gt2 gt2Var3 = b;
        final it2 it2Var3 = b2;
        final gt2 gt2Var4 = a;
        final boolean z7 = z4;
        int i5 = i >> 9;
        int i6 = i4 << 15;
        SwipeRefreshKt.a(SwipeRefreshKt.b(z4, h, (i4 >> 12) & 14), qs2Var, modifier2, z5, g, alignment2, ym5Var2, kt2Var2, z6, zr0.b(h, -1408192208, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt$RefreshableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1408192208, i7, -1, "com.nytimes.android.designsystem.uicompose.composable.RefreshableContent.<anonymous> (RefreshableContent.kt:73)");
                }
                Object a3 = DownloadState.this.a();
                composer2.z(-472281294);
                if (a3 != null) {
                    it2Var2.invoke(a3, composer2, 0);
                    ww8 ww8Var = ww8.a;
                }
                composer2.R();
                DownloadState downloadState2 = DownloadState.this;
                if (downloadState2 instanceof DownloadState.a) {
                    composer2.z(-472281185);
                    gt2Var3.invoke(composer2, 0);
                    composer2.R();
                } else if (downloadState2 instanceof DownloadState.b) {
                    composer2.z(-472281111);
                    it2Var3.invoke(DownloadState.this, composer2, 8);
                    composer2.R();
                } else if (downloadState2 instanceof DownloadState.c) {
                    composer2.z(-472281026);
                    gt2Var4.invoke(composer2, 0);
                    composer2.R();
                } else {
                    composer2.z(-472280994);
                    composer2.R();
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, (i6 & 234881024) | (i & ContentType.LONG_FORM_ON_DEMAND) | 805306368 | (i & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016) | (29360128 & i6), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final gt2 gt2Var5 = b;
            final it2 it2Var4 = b2;
            final gt2 gt2Var6 = a;
            final boolean z8 = z5;
            final float f2 = g;
            final Alignment alignment3 = alignment2;
            final ym5 ym5Var3 = ym5Var2;
            final long j7 = j5;
            final kt2 kt2Var3 = kt2Var2;
            final boolean z9 = z6;
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.RefreshableContentKt$RefreshableContent$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    RefreshableContentKt.a(DownloadState.this, qs2Var, modifier3, gt2Var5, it2Var4, gt2Var6, z8, f2, alignment3, ym5Var3, j6, j7, kt2Var3, z9, z7, it2Var2, composer2, gt6.a(i | 1), gt6.a(i2), i3);
                }
            });
        }
    }
}
