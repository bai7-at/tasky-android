package com.nytimes.android.features.notifications.push.items;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.appsflyer.AppsFlyerProperties;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.notifications.push.NotificationsPermissionProviderKt;
import com.nytimes.android.features.notifications.push.e;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.piano.PianoSpacing;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.id8;
import defpackage.it2;
import defpackage.ju7;
import defpackage.m37;
import defpackage.n37;
import defpackage.pb;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class NotificationsPreferenceItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final m37 m37Var, String str, final String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composer2;
        Composer h = composer.h(311389569);
        if ((i & 14) == 0) {
            i2 = (h.S(m37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(str2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        int i3 = i2;
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
            str3 = str;
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(311389569, i3, -1, "com.nytimes.android.features.notifications.push.items.NotificationInfo (NotificationsPreferenceItem.kt:52)");
            }
            float a = ((e) h.m(NotificationsPermissionProviderKt.b())).a();
            Modifier.a aVar = Modifier.a;
            Modifier b = m37.b(m37Var, aVar, 1.0f, false, 2, null);
            h.z(-483455358);
            rg4 a2 = d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c = LayoutKt.c(b);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a4);
            } else {
                h.p();
            }
            Composer a5 = Updater.a(h);
            Updater.c(a5, a2, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b2 = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            Modifier a6 = pb.a(aVar, a);
            eb5.a aVar2 = eb5.Companion;
            str3 = str;
            TextKt.c(str, a6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, aVar2.c(h, 8).s0(), h, (i3 >> 3) & 14, 3072, 57340);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_0_5.getInDp())), h, 0);
            composer2 = h;
            TextKt.c(str2, SizeKt.A(pb.a(aVar, a), null, false, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).t0(), composer2, (i3 >> 6) & 14, 0, 65532);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationInfo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    NotificationsPreferenceItemKt.a(m37.this, str3, str2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final NotificationsGroupItems notificationsGroupItems, final NotificationsChannel notificationsChannel, final it2 it2Var, Composer composer, final int i) {
        Composer h = composer.h(-761856164);
        if (b.G()) {
            b.S(-761856164, i, -1, "com.nytimes.android.features.notifications.push.items.NotificationSwitch (NotificationsPreferenceItem.kt:78)");
        }
        float a = ((e) h.m(NotificationsPermissionProviderKt.b())).a();
        final boolean b = ((e) h.m(NotificationsPermissionProviderKt.b())).b();
        boolean g = notificationsChannel.g();
        h.z(-520828065);
        boolean a2 = h.a(g) | h.a(b);
        Object A = h.A();
        if (a2 || A == Composer.a.a()) {
            A = b0.e(Boolean.valueOf(b ? notificationsChannel.g() : false), null, 2, null);
            h.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        h.R();
        Modifier a3 = pb.a(Modifier.a, a);
        boolean c = c(sy4Var);
        id8 id8Var = id8.a;
        eb5.a aVar = eb5.Companion;
        SwitchKt.a(c, new ss2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationSwitch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                NotificationsPreferenceItemKt.d(sy4Var, z);
                if (b) {
                    it2Var.invoke(notificationsGroupItems, notificationsChannel, Boolean.valueOf(z));
                }
            }
        }, a3, b, null, id8Var.a(aVar.a(h, 8).D(), aVar.a(h, 8).F(), 0.3f, aVar.a(h, 8).E(), aVar.a(h, 8).G(), 1.0f, 0L, 0L, 0L, 0L, h, 196992, id8.b, 960), h, 0, 16);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationSwitch$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    NotificationsPreferenceItemKt.b(NotificationsGroupItems.this, notificationsChannel, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final boolean c(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    public static final void e(Modifier modifier, final NotificationsGroupItems notificationsGroupItems, final NotificationsChannel notificationsChannel, it2 it2Var, Composer composer, final int i, final int i2) {
        zq3.h(notificationsGroupItems, "group");
        zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
        Composer h = composer.h(-122512862);
        if ((i2 & 1) != 0) {
            modifier = Modifier.a;
        }
        final Modifier modifier2 = modifier;
        if ((i2 & 8) != 0) {
            it2Var = new it2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationsPreferenceItem$1
                public final void b(NotificationsGroupItems notificationsGroupItems2, NotificationsChannel notificationsChannel2, boolean z) {
                    zq3.h(notificationsGroupItems2, "<anonymous parameter 0>");
                    zq3.h(notificationsChannel2, "<anonymous parameter 1>");
                    AnonymousClass1 anonymousClass1 = new qs2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationsPreferenceItem$1.1
                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m421invoke() {
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                            m421invoke();
                            return ww8.a;
                        }
                    };
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((NotificationsGroupItems) obj, (NotificationsChannel) obj2, ((Boolean) obj3).booleanValue());
                    return ww8.a;
                }
            };
        }
        final it2 it2Var2 = it2Var;
        if (b.G()) {
            b.S(-122512862, i, -1, "com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItem (NotificationsPreferenceItem.kt:36)");
        }
        Modifier h2 = SizeKt.h(modifier2, 0.0f, 1, null);
        Arrangement.f d = Arrangement.a.d();
        h.z(693286680);
        rg4 a = m.a(d, Alignment.a.l(), h, 6);
        h.z(-1323940314);
        int a2 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a3 = companion.a();
        it2 c = LayoutKt.c(h2);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a3);
        } else {
            h.p();
        }
        Composer a4 = Updater.a(h);
        Updater.c(a4, a, companion.e());
        Updater.c(a4, o, companion.g());
        gt2 b = companion.b();
        if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
            a4.q(Integer.valueOf(a2));
            a4.v(Integer.valueOf(a2), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        a(n37.a, notificationsChannel.f(), notificationsChannel.d(), h, 6);
        SpacerKt.a(SizeKt.s(Modifier.a, bu1.g(PianoSpacing.spacing_2.getInDp())), h, 0);
        b(notificationsGroupItems, notificationsChannel, it2Var2, h, ((i >> 3) & 896) | 72);
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt$NotificationsPreferenceItem$3
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
                    NotificationsPreferenceItemKt.e(Modifier.this, notificationsGroupItems, notificationsChannel, it2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
