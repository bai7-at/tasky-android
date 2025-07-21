package com.nytimes.android.menu.item;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.nytimes.android.features.settings.SettingsActivity;
import com.nytimes.android.menu.MenuData;
import defpackage.by0;
import defpackage.cc0;
import defpackage.eg6;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.lh6;
import defpackage.tr8;
import defpackage.wl6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* loaded from: classes4.dex */
public final class Settings extends MenuData {
    private final Activity a;

    @fc1(c = "com.nytimes.android.menu.item.Settings$1", f = "Settings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.menu.item.Settings$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return Settings.this.new AnonymousClass1(by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(MenuItem menuItem, by0 by0Var) {
            return ((AnonymousClass1) create(menuItem, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            tr8.a(new Intent(Settings.this.a(), (Class<?>) SettingsActivity.class), Settings.this.a());
            return cc0.a(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Settings(Activity activity) {
        super(wl6.action_settings, eg6.action_settings, 1, Integer.valueOf(lh6.main_menu_order_settings), null, 0, null, null, false, null, null, 2000, null);
        zq3.h(activity, "activity");
        this.a = activity;
        setHandler(new AnonymousClass1(null));
    }

    public final Activity a() {
        return this.a;
    }
}
