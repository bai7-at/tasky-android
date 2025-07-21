package com.nytimes.android.features.settings;

import com.nytimes.android.entitlements.a;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import defpackage.by0;
import defpackage.d54;
import defpackage.fc1;
import defpackage.g05;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.rx2.RxObservableKt;

/* loaded from: classes4.dex */
final class SettingsFragment$setupConnectAccountPreference$1$1 extends Lambda implements qs2 {
    final /* synthetic */ SettingsFragment this$0;

    @fc1(c = "com.nytimes.android.features.settings.SettingsFragment$setupConnectAccountPreference$1$1$1", f = "SettingsFragment.kt", l = {465, 465}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.settings.SettingsFragment$setupConnectAccountPreference$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SettingsFragment settingsFragment, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = settingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ProducerScope producerScope;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                producerScope = (ProducerScope) this.L$0;
                com.nytimes.android.entitlements.a eCommClient = this.this$0.getECommClient();
                androidx.fragment.app.f requireActivity = this.this$0.requireActivity();
                zq3.g(requireActivity, "requireActivity(...)");
                RegiInterface regiInterface = RegiInterface.RegiSettings;
                this.L$0 = producerScope;
                this.label = 1;
                obj = a.b.a(eCommClient, requireActivity, null, regiInterface, null, this, 10, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
                producerScope = (ProducerScope) this.L$0;
                kotlin.f.b(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (producerScope.send(obj, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(ProducerScope producerScope, by0 by0Var) {
            return ((AnonymousClass1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsFragment$setupConnectAccountPreference$1$1(SettingsFragment settingsFragment) {
        super(0);
        this.this$0 = settingsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SettingsFragment settingsFragment, d54 d54Var) {
        zq3.h(settingsFragment, "this$0");
        settingsFragment.getAccountSettingsPresenter().h();
    }

    @Override // defpackage.qs2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo865invoke() {
        m428invoke();
        return ww8.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m428invoke() {
        CompositeDisposable compositeDisposable;
        compositeDisposable = this.this$0.compositeDisposable;
        Observable rxObservable$default = RxObservableKt.rxObservable$default(null, new AnonymousClass1(this.this$0, null), 1, null);
        final SettingsFragment settingsFragment = this.this$0;
        compositeDisposable.add(rxObservable$default.subscribe(new Consumer() { // from class: com.nytimes.android.features.settings.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SettingsFragment$setupConnectAccountPreference$1$1.c(SettingsFragment.this, (d54) obj);
            }
        }, new g05(SettingsFragment.class)));
    }
}
