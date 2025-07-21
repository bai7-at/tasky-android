package com.nytimes.android.features.notifications.push;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.notifications.push.items.NotificationsGroupHeaderKt;
import com.nytimes.android.features.notifications.push.items.NotificationsPreferenceItemKt;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.piano.PianoSpacing;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.uk6;
import defpackage.ve0;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public abstract class NotificationsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final List list, gt2 gt2Var, final gt2 gt2Var2, final it2 it2Var, Composer composer, final int i, final int i2) {
        Composer h = composer.h(652477973);
        if ((i2 & 2) != 0) {
            gt2Var = ComposableSingletons$NotificationsScreenKt.a.b();
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(652477973, i, -1, "com.nytimes.android.features.notifications.push.DisplayGroupContent (NotificationsScreen.kt:55)");
        }
        int i3 = i >> 3;
        d(gt2Var, gt2Var2, list, it2Var, h, (i3 & ContentType.LONG_FORM_ON_DEMAND) | (i3 & 14) | 512 | (i & 7168));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final gt2 gt2Var3 = gt2Var;
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$DisplayGroupContent$1
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
                    NotificationsScreenKt.a(list, gt2Var3, gt2Var2, it2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final NotificationsGroupItems notificationsGroupItems, Composer composer, final int i) {
        Composer h = composer.h(1028189749);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1028189749, i, -1, "com.nytimes.android.features.notifications.push.GroupHeader (NotificationsScreen.kt:143)");
        }
        Modifier.a aVar = Modifier.a;
        SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_4.getInDp())), h, 0);
        NotificationsGroupHeaderKt.a(notificationsGroupItems.e(), h, 0);
        SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_2_5.getInDp())), h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$GroupHeader$1
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
                    NotificationsScreenKt.b(NotificationsGroupItems.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final NotificationsGroupItems notificationsGroupItems, final NotificationsChannel notificationsChannel, final it2 it2Var, final boolean z, Composer composer, final int i) {
        Composer h = composer.h(-829297031);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-829297031, i, -1, "com.nytimes.android.features.notifications.push.NotificationGroupChannels (NotificationsScreen.kt:155)");
        }
        Modifier.a aVar = Modifier.a;
        if (!z) {
            PaddingKt.m(aVar, 0.0f, 0.0f, 0.0f, bu1.g(PianoSpacing.spacing_1.getInDp()), 7, null);
        }
        NotificationsPreferenceItemKt.e(aVar, notificationsGroupItems, notificationsChannel, it2Var, h, ((i << 3) & 7168) | 576, 0);
        if (!z) {
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_2_5.getInDp())), h, 0);
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupChannels$1
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
                    NotificationsScreenKt.c(NotificationsGroupItems.this, notificationsChannel, it2Var, z, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final gt2 gt2Var, final gt2 gt2Var2, final List list, final it2 it2Var, Composer composer, final int i) {
        Composer h = composer.h(-1520993903);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1520993903, i, -1, "com.nytimes.android.features.notifications.push.NotificationGroupsAndChannels (NotificationsScreen.kt:126)");
        }
        LazyDslKt.a(null, null, null, false, null, null, null, false, new ss2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                final gt2 gt2Var3 = gt2Var;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-576036315, true, new it2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1.1
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-576036315, i2, -1, "com.nytimes.android.features.notifications.push.NotificationGroupsAndChannels.<anonymous>.<anonymous> (NotificationsScreen.kt:128)");
                        }
                        gt2.this.invoke(composer2, 0);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), 3, null);
                final gt2 gt2Var4 = gt2Var2;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-1764715556, true, new it2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1.2
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i2) {
                        zq3.h(h04Var, "$this$item");
                        if ((i2 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-1764715556, i2, -1, "com.nytimes.android.features.notifications.push.NotificationGroupsAndChannels.<anonymous>.<anonymous> (NotificationsScreen.kt:129)");
                        }
                        gt2.this.invoke(composer2, 0);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }), 3, null);
                List<NotificationsGroupItems> list2 = list;
                final it2 it2Var2 = it2Var;
                for (final NotificationsGroupItems notificationsGroupItems : list2) {
                    LazyListScope.d(lazyListScope, null, null, zr0.c(524750679, true, new it2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1$3$1
                        {
                            super(3);
                        }

                        @Override // defpackage.it2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, Composer composer2, int i2) {
                            zq3.h(h04Var, "$this$item");
                            if ((i2 & 81) == 16 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(524750679, i2, -1, "com.nytimes.android.features.notifications.push.NotificationGroupsAndChannels.<anonymous>.<anonymous>.<anonymous> (NotificationsScreen.kt:132)");
                            }
                            NotificationsScreenKt.b(NotificationsGroupItems.this, composer2, 8);
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    }), 3, null);
                    final List d = notificationsGroupItems.d();
                    lazyListScope.b(d.size(), null, new ss2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1$invoke$lambda$1$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Number) obj).intValue());
                        }

                        public final Object invoke(int i2) {
                            d.get(i2);
                            return null;
                        }
                    }, zr0.c(-1091073711, true, new kt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$1$invoke$lambda$1$$inlined$itemsIndexed$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // defpackage.kt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                            return ww8.a;
                        }

                        public final void invoke(h04 h04Var, int i2, Composer composer2, int i3) {
                            int i4;
                            if ((i3 & 14) == 0) {
                                i4 = (composer2.S(h04Var) ? 4 : 2) | i3;
                            } else {
                                i4 = i3;
                            }
                            if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                                i4 |= composer2.d(i2) ? 32 : 16;
                            }
                            if ((i4 & 731) == 146 && composer2.i()) {
                                composer2.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                            }
                            NotificationsScreenKt.c(notificationsGroupItems, (NotificationsChannel) d.get(i2), it2Var2, i.n(notificationsGroupItems.d()) == i2, composer2, 72);
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    }));
                }
            }
        }, h, 0, 255);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationGroupsAndChannels$2
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
                    NotificationsScreenKt.d(gt2.this, gt2Var2, list, it2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void e(Modifier modifier, final List list, final it2 it2Var, final gt2 gt2Var, gt2 gt2Var2, Composer composer, final int i, final int i2) {
        zq3.h(list, "notificationGroups");
        zq3.h(it2Var, "onSubscriptionChanged");
        zq3.h(gt2Var, "screenHeader");
        Composer h = composer.h(1020276348);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.a : modifier;
        gt2 a = (i2 & 16) != 0 ? ComposableSingletons$NotificationsScreenKt.a.a() : gt2Var2;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1020276348, i, -1, "com.nytimes.android.features.notifications.push.NotificationsScreen (NotificationsScreen.kt:34)");
        }
        Modifier k = PaddingKt.k(SizeKt.f(modifier2, 0.0f, 1, null), bu1.g(PianoSpacing.spacing_2.getInDp()), 0.0f, 2, null);
        h.z(-483455358);
        rg4 a2 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), Alignment.a.k(), h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c = LayoutKt.c(k);
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
        gt2 b = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        a(list, a, gt2Var, it2Var, h, ((i >> 9) & ContentType.LONG_FORM_ON_DEMAND) | 8 | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        h.R();
        h.t();
        h.R();
        h.R();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            final Modifier modifier3 = modifier2;
            final gt2 gt2Var3 = a;
            k2.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$NotificationsScreen$2
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
                    NotificationsScreenKt.e(Modifier.this, list, it2Var, gt2Var, gt2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void f(Composer composer, final int i) {
        Composer composer2;
        Composer h = composer.h(2062710562);
        if (i == 0 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(2062710562, i, -1, "com.nytimes.android.features.notifications.push.OnboardingHeader (NotificationsScreen.kt:107)");
            }
            Modifier.a aVar = Modifier.a;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_3.getInDp())), h, 0);
            String b = k48.b(uk6.notification_onboarding_header_title, h, 0);
            eb5.a aVar2 = eb5.Companion;
            TextKt.c(b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).x0(), h, 0, 0, 65534);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_2.getInDp())), h, 0);
            composer2 = h;
            TextKt.c(k48.b(uk6.notification_onboarding_header_subtitle, h, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).w0(), composer2, 0, 0, 65534);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$OnboardingHeader$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    NotificationsScreenKt.f(composer3, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void g(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "launchSettings");
        Composer h = composer.h(1721255686);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1721255686, i2, -1, "com.nytimes.android.features.notifications.push.SettingsHeader (NotificationsScreen.kt:65)");
            }
            int i3 = ((e) h.m(NotificationsPermissionProviderKt.b())).b() ? wl6.notification_permission_enabled_title : uk6.notification_permission_disabled_title;
            Modifier.a aVar = Modifier.a;
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_3.getInDp())), h, 0);
            String b = k48.b(i3, h, 0);
            eb5.a aVar2 = eb5.Companion;
            int i4 = i2;
            TextKt.c(b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).r0(), h, 0, 0, 65534);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_1.getInDp())), h, 0);
            TextKt.c(k48.b(uk6.notification_permission_disabled_header, h, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.c(h, 8).u0(), h, 0, 0, 65534);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(PianoSpacing.spacing_2.getInDp())), h, 0);
            Modifier h2 = SizeKt.h(aVar, 0.0f, 1, null);
            eb0 a = fb0.a(bu1.g(2), aVar2.a(h, 8).S());
            ve0 j = androidx.compose.material.a.a.j(0L, aVar2.a(h, 8).S(), 0L, h, androidx.compose.material.a.l << 9, 5);
            h.z(-1377103305);
            boolean z = (i4 & 14) == 4;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new qs2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$SettingsHeader$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m418invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m418invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A);
            }
            h.R();
            composer2 = h;
            ButtonKt.a((qs2) A, h2, false, null, null, null, a, j, null, ComposableSingletons$NotificationsScreenKt.a.c(), h, 805306416, 316);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.notifications.push.NotificationsScreenKt$SettingsHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    NotificationsScreenKt.g(qs2.this, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
