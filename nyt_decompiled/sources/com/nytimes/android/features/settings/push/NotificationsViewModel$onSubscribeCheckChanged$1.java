package com.nytimes.android.features.settings.push;

import com.nytimes.android.features.settings.push.c;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.push.NotificationsChannel;
import com.nytimes.android.push.PushClientManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@fc1(c = "com.nytimes.android.features.settings.push.NotificationsViewModel$onSubscribeCheckChanged$1", f = "NotificationsViewModel.kt", l = {84, 86, 96}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationsViewModel$onSubscribeCheckChanged$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ NotificationsChannel $channel;
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ NotificationsViewModel this$0;

    @fc1(c = "com.nytimes.android.features.settings.push.NotificationsViewModel$onSubscribeCheckChanged$1$1", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.settings.push.NotificationsViewModel$onSubscribeCheckChanged$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ NotificationsChannel $channel;
        int label;
        final /* synthetic */ NotificationsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationsViewModel notificationsViewModel, NotificationsChannel notificationsChannel, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = notificationsViewModel;
            this.$channel = notificationsChannel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.this$0, this.$channel, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.this$0.m().p(new c.b(this.$channel));
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsViewModel$onSubscribeCheckChanged$1(NotificationsChannel notificationsChannel, boolean z, NotificationsViewModel notificationsViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$channel = notificationsChannel;
        this.$isChecked = z;
        this.this$0 = notificationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NotificationsViewModel$onSubscribeCheckChanged$1(this.$channel, this.$isChecked, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PushClientManager pushClientManager;
        PushClientManager pushClientManager2;
        Set set;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
        } catch (Exception e) {
            NYTLogger.h(e);
            this.this$0.r(this.$channel);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channel, null);
            this.label = 3;
            if (BuildersKt.withContext(main, anonymousClass1, this) == h) {
                return h;
            }
        }
        if (i == 0) {
            f.b(obj);
            Set d = b0.d(this.$channel.e());
            if (this.$isChecked) {
                pushClientManager2 = this.this$0.b;
                this.label = 1;
                obj = pushClientManager2.f(d, this);
                if (obj == h) {
                    return h;
                }
                set = (Set) obj;
            } else {
                pushClientManager = this.this$0.b;
                this.label = 2;
                obj = pushClientManager.g(d, this);
                if (obj == h) {
                    return h;
                }
                set = (Set) obj;
            }
        } else if (i == 1) {
            f.b(obj);
            set = (Set) obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            f.b(obj);
            set = (Set) obj;
        }
        if (set != null && this.$isChecked == set.contains(this.$channel.e())) {
            return ww8.a;
        }
        throw new RuntimeException("Changing settings for " + this.$channel.e() + " failed");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NotificationsViewModel$onSubscribeCheckChanged$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
