package com.nytimes.android.features.notifications.push;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import com.comscore.streaming.ContentType;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionsUtilKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.m76;
import defpackage.o76;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class NotificationsPermissionProviderKt {
    private static final m76 a = CompositionLocalKt.d(null, new qs2() { // from class: com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt$LocalPermissionState$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e mo865invoke() {
            return new e(true, 1.0f);
        }
    }, 1, null);

    public static final void a(final Boolean bool, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(gt2Var, "content");
        Composer h = composer.h(-87151238);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(bool) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                bool = null;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-87151238, i3, -1, "com.nytimes.android.features.notifications.push.NotificationsPermissionProvider (NotificationsPermissionProvider.kt:16)");
            }
            h.z(-2065314720);
            boolean booleanValue = bool != null ? bool.booleanValue() : PermissionsUtilKt.d(PermissionStateKt.a("android.permission.POST_NOTIFICATIONS", null, h, 6, 2).getStatus());
            h.R();
            CompositionLocalKt.a(a.c(new e(booleanValue, e.Companion.a(booleanValue))), zr0.b(h, 1085436090, true, new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt$NotificationsPermissionProvider$1
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
                        androidx.compose.runtime.b.S(1085436090, i5, -1, "com.nytimes.android.features.notifications.push.NotificationsPermissionProvider.<anonymous> (NotificationsPermissionProvider.kt:27)");
                    }
                    gt2.this.invoke(composer2, 0);
                    if (androidx.compose.runtime.b.G()) {
                        androidx.compose.runtime.b.R();
                    }
                }
            }), h, o76.d | 48);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt$NotificationsPermissionProvider$2
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
                    NotificationsPermissionProviderKt.a(bool, gt2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final m76 b() {
        return a;
    }
}
