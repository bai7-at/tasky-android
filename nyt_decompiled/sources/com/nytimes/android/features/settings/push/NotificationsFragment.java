package com.nytimes.android.features.settings.push;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.f;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.features.settings.SettingsPageEventSender;
import com.nytimes.android.features.settings.push.NotificationsFragment;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.NotificationsGroupItems;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ba5;
import defpackage.bf5;
import defpackage.c04;
import defpackage.d44;
import defpackage.d5;
import defpackage.ea5;
import defpackage.h5;
import defpackage.ha5;
import defpackage.j5;
import defpackage.k99;
import defpackage.ka5;
import defpackage.la5;
import defpackage.lt2;
import defpackage.ni6;
import defpackage.o33;
import defpackage.ot7;
import defpackage.qs2;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.st2;
import defpackage.t21;
import defpackage.u02;
import defpackage.vc5;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.xk6;
import defpackage.zq3;
import defpackage.zt6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NotificationsFragment extends com.nytimes.android.features.settings.push.a {
    public static final a Companion = new a(null);
    public static final int k = 8;
    private final c04 f;
    private final o33 g;
    private ha5 h;
    private ba5 i;
    private final j5 j;
    public la5 notificationsHelper;
    public SettingsPageEventSender settingsPageEventSender;
    public SharedPreferences sharedPreferences;
    public SnackbarUtil snackbarUtil;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements bf5 {
        b() {
        }

        @Override // defpackage.bf5
        public void a(NotificationsChannel notificationsChannel, boolean z) {
            zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
            NotificationsFragment.this.t1().q(notificationsChannel, z);
        }
    }

    static final class c implements vc5, st2 {
        private final /* synthetic */ ss2 a;

        c(ss2 ss2Var) {
            zq3.h(ss2Var, "function");
            this.a = ss2Var;
        }

        @Override // defpackage.vc5
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        @Override // defpackage.st2
        public final lt2 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof vc5) && (obj instanceof st2)) {
                return zq3.c(b(), ((st2) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public NotificationsFragment() {
        final qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fragment mo865invoke() {
                return Fragment.this;
            }
        };
        final c04 b2 = kotlin.c.b(LazyThreadSafetyMode.NONE, new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final sa9 mo865invoke() {
                return (sa9) qs2.this.mo865invoke();
            }
        });
        final qs2 qs2Var2 = null;
        this.f = FragmentViewModelLazyKt.b(this, zt6.b(NotificationsViewModel.class), new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final u mo865invoke() {
                sa9 c2;
                c2 = FragmentViewModelLazyKt.c(c04.this);
                return c2.getViewModelStore();
            }
        }, new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t21 mo865invoke() {
                sa9 c2;
                t21 t21Var;
                qs2 qs2Var3 = qs2.this;
                if (qs2Var3 != null && (t21Var = (t21) qs2Var3.mo865invoke()) != null) {
                    return t21Var;
                }
                c2 = FragmentViewModelLazyKt.c(b2);
                androidx.lifecycle.d dVar = c2 instanceof androidx.lifecycle.d ? (androidx.lifecycle.d) c2 : null;
                return dVar != null ? dVar.getDefaultViewModelCreationExtras() : t21.a.b;
            }
        }, new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final t.b mo865invoke() {
                sa9 c2;
                t.b defaultViewModelProviderFactory;
                c2 = FragmentViewModelLazyKt.c(b2);
                androidx.lifecycle.d dVar = c2 instanceof androidx.lifecycle.d ? (androidx.lifecycle.d) c2 : null;
                if (dVar != null && (defaultViewModelProviderFactory = dVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                t.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                zq3.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.g = new o33();
        j5 registerForActivityResult = registerForActivityResult(new h5(), new d5() { // from class: fa5
            @Override // defpackage.d5
            public final void a(Object obj) {
                NotificationsFragment.y1(NotificationsFragment.this, ((Boolean) obj).booleanValue());
            }
        });
        zq3.g(registerForActivityResult, "registerForActivityResult(...)");
        this.j = registerForActivityResult;
    }

    private final void i1() {
        if (q1().a()) {
            p1();
        } else {
            o1();
        }
    }

    private final boolean j1(boolean z) {
        if (s1().contains("key_user_adjusted_settings_value")) {
            return s1().getBoolean("key_user_adjusted_settings_value", z);
        }
        s1().edit().putBoolean("key_user_adjusted_settings_value", z).apply();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k1(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NotificationsGroupItems notificationsGroupItems = (NotificationsGroupItems) it2.next();
            List e = i.e(n1(notificationsGroupItems.e()));
            List d = notificationsGroupItems.d();
            ArrayList arrayList2 = new ArrayList(i.w(d, 10));
            Iterator it3 = d.iterator();
            while (it3.hasNext()) {
                arrayList2.add(l1((NotificationsChannel) it3.next()));
            }
            i.B(arrayList, i.F0(e, arrayList2));
        }
        return i.G0(arrayList, m1());
    }

    private final ba5 l1(NotificationsChannel notificationsChannel) {
        ba5 ba5Var = new ba5(notificationsChannel.f(), notificationsChannel.d(), notificationsChannel, q1(), this.j);
        this.i = ba5Var;
        ba5Var.I(new b());
        ba5 ba5Var2 = this.i;
        if (ba5Var2 != null) {
            return ba5Var2;
        }
        zq3.z("item");
        return null;
    }

    private final ea5 m1() {
        String string = getString(wl6.action_settings);
        zq3.g(string, "getString(...)");
        String string2 = getString(wl6.notification_detail);
        zq3.g(string2, "getString(...)");
        return new ea5(string, string2, q1(), new qs2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$createNotificationsFooterViewItem$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m436invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m436invoke() {
                if (zq3.c(NotificationsFragment.this.t1().p().f(), Boolean.TRUE)) {
                    f requireActivity = NotificationsFragment.this.requireActivity();
                    zq3.g(requireActivity, "requireActivity(...)");
                    requireActivity.startActivity(new Intent(requireActivity, (Class<?>) NotificationsSettingsActivity.class));
                }
            }
        });
    }

    private final ka5 n1(String str) {
        return new ka5(str, q1());
    }

    private final void o1() {
        int m = this.g.m();
        for (int i = 0; i < m; i++) {
            Object L = this.g.L(i);
            zq3.f(L, "null cannot be cast to non-null type com.nytimes.android.features.settings.push.items.EnableDisableNotificationsViewItems");
            ((u02) L).c();
        }
    }

    private final void p1() {
        int m = this.g.m();
        for (int i = 0; i < m; i++) {
            Object L = this.g.L(i);
            zq3.f(L, "null cannot be cast to non-null type com.nytimes.android.features.settings.push.items.EnableDisableNotificationsViewItems");
            ((u02) L).d();
        }
        t1().l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationsViewModel t1() {
        return (NotificationsViewModel) this.f.getValue();
    }

    private final void u1(Context context) {
        ot7 m = t1().m();
        d44 viewLifecycleOwner = getViewLifecycleOwner();
        zq3.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m.j(viewLifecycleOwner, new c(new NotificationsFragment$observeNotificationEvents$1(this, context)));
    }

    private final void v1() {
        t1().n().j(getViewLifecycleOwner(), new c(new ss2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$observeNotificationItems$1
            {
                super(1);
            }

            public final void b(List list) {
                o33 o33Var;
                List k1;
                o33Var = NotificationsFragment.this.g;
                NotificationsFragment notificationsFragment = NotificationsFragment.this;
                zq3.e(list);
                k1 = notificationsFragment.k1(list);
                o33Var.W(k1, false);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((List) obj);
                return ww8.a;
            }
        }));
    }

    private final void w1(final Context context) {
        t1().p().j(getViewLifecycleOwner(), new c(new ss2() { // from class: com.nytimes.android.features.settings.push.NotificationsFragment$observeNotificationsGrant$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Boolean bool) {
                ha5 ha5Var;
                ha5 ha5Var2;
                ha5 ha5Var3;
                ha5 ha5Var4;
                ha5 ha5Var5;
                ha5 ha5Var6;
                ha5 ha5Var7;
                ha5 ha5Var8;
                ha5 ha5Var9 = null;
                if (zq3.c(NotificationsFragment.this.t1().p().f(), Boolean.TRUE)) {
                    ha5Var5 = NotificationsFragment.this.h;
                    if (ha5Var5 == null) {
                        zq3.z("binding");
                        ha5Var5 = null;
                    }
                    ha5Var5.e.setVisibility(0);
                    ha5Var6 = NotificationsFragment.this.h;
                    if (ha5Var6 == null) {
                        zq3.z("binding");
                        ha5Var6 = null;
                    }
                    ha5Var6.c.setVisibility(0);
                    ha5Var7 = NotificationsFragment.this.h;
                    if (ha5Var7 == null) {
                        zq3.z("binding");
                        ha5Var7 = null;
                    }
                    ha5Var7.b.setText(context.getString(xk6.notifications_enabled_header));
                    ha5Var8 = NotificationsFragment.this.h;
                    if (ha5Var8 == null) {
                        zq3.z("binding");
                    } else {
                        ha5Var9 = ha5Var8;
                    }
                    ha5Var9.c.setText(context.getString(xk6.notifications_enabled_header_title));
                    return;
                }
                ha5Var = NotificationsFragment.this.h;
                if (ha5Var == null) {
                    zq3.z("binding");
                    ha5Var = null;
                }
                ha5Var.e.setVisibility(0);
                ha5Var2 = NotificationsFragment.this.h;
                if (ha5Var2 == null) {
                    zq3.z("binding");
                    ha5Var2 = null;
                }
                ha5Var2.c.setVisibility(0);
                ha5Var3 = NotificationsFragment.this.h;
                if (ha5Var3 == null) {
                    zq3.z("binding");
                    ha5Var3 = null;
                }
                ha5Var3.b.setText(context.getString(xk6.notification_permission_disabled_header));
                ha5Var4 = NotificationsFragment.this.h;
                if (ha5Var4 == null) {
                    zq3.z("binding");
                } else {
                    ha5Var9 = ha5Var4;
                }
                ha5Var9.c.setText(context.getString(xk6.notification_permission_disabled_title));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Boolean) obj);
                return ww8.a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(NotificationsFragment notificationsFragment, View view) {
        zq3.h(notificationsFragment, "this$0");
        Intent putExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", notificationsFragment.requireActivity().getPackageName());
        zq3.g(putExtra, "putExtra(...)");
        notificationsFragment.startActivity(putExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(NotificationsFragment notificationsFragment, boolean z) {
        zq3.h(notificationsFragment, "this$0");
        if (z) {
            notificationsFragment.r1().a(SettingsPageEventSender.NotificationPermissionEvent.ON);
            SnackbarUtil.g(notificationsFragment.getSnackbarUtil(), wl6.settings_notifications_accepted, wl6.settings_notifications_accepted_message, 0, 4, null);
        } else {
            notificationsFragment.r1().a(SettingsPageEventSender.NotificationPermissionEvent.OFF);
            SnackbarUtil.g(notificationsFragment.getSnackbarUtil(), wl6.settings_notifications_declined, wl6.settings_notifications_declined_message, 0, 4, null);
        }
    }

    private final void z1() {
        t1().o();
        Boolean bool = (Boolean) t1().p().f();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (booleanValue == j1(booleanValue)) {
            return;
        }
        if (booleanValue) {
            SnackbarUtil.g(getSnackbarUtil(), wl6.settings_notifications_accepted, wl6.settings_notifications_accepted_message, 0, 4, null);
        } else {
            SnackbarUtil.g(getSnackbarUtil(), wl6.settings_notifications_declined, wl6.settings_notifications_declined_message, 0, 4, null);
        }
        s1().edit().putBoolean("key_user_adjusted_settings_value", booleanValue).apply();
    }

    public final SnackbarUtil getSnackbarUtil() {
        SnackbarUtil snackbarUtil = this.snackbarUtil;
        if (snackbarUtil != null) {
            return snackbarUtil;
        }
        zq3.z("snackbarUtil");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zq3.h(layoutInflater, "inflater");
        t1().l();
        t1().o();
        return layoutInflater.inflate(ni6.notifications_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ha5 ha5Var = this.h;
        if (ha5Var == null) {
            zq3.z("binding");
            ha5Var = null;
        }
        ha5Var.d.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        i1();
        z1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        zq3.h(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        zq3.g(requireContext, "requireContext(...)");
        ha5 a2 = ha5.a(view);
        zq3.g(a2, "bind(...)");
        this.h = a2;
        ha5 ha5Var = null;
        if (a2 == null) {
            zq3.z("binding");
            a2 = null;
        }
        RecyclerView recyclerView = a2.d;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext));
        recyclerView.setAdapter(this.g);
        recyclerView.addItemDecoration(new NotificationDecoration(requireContext));
        ha5 ha5Var2 = this.h;
        if (ha5Var2 == null) {
            zq3.z("binding");
            ha5Var2 = null;
        }
        k99.z0(ha5Var2.d, false);
        ha5 ha5Var3 = this.h;
        if (ha5Var3 == null) {
            zq3.z("binding");
        } else {
            ha5Var = ha5Var3;
        }
        ha5Var.e.setOnClickListener(new View.OnClickListener() { // from class: ga5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NotificationsFragment.x1(NotificationsFragment.this, view2);
            }
        });
        v1();
        u1(requireContext);
        w1(requireContext);
    }

    public final la5 q1() {
        la5 la5Var = this.notificationsHelper;
        if (la5Var != null) {
            return la5Var;
        }
        zq3.z("notificationsHelper");
        return null;
    }

    public final SettingsPageEventSender r1() {
        SettingsPageEventSender settingsPageEventSender = this.settingsPageEventSender;
        if (settingsPageEventSender != null) {
            return settingsPageEventSender;
        }
        zq3.z("settingsPageEventSender");
        return null;
    }

    public final SharedPreferences s1() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        zq3.z("sharedPreferences");
        return null;
    }
}
