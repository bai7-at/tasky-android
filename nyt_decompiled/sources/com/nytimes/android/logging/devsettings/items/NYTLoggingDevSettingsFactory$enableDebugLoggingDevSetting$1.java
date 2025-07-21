package com.nytimes.android.logging.devsettings.items;

import android.content.Context;
import com.comscore.streaming.EventType;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@fc1(c = "com.nytimes.android.logging.devsettings.items.NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1", f = "NYTLoggingDevSettingsFactory.kt", l = {EventType.CDN}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1 extends SuspendLambda implements it2 {
    /* synthetic */ boolean Z$0;
    int label;

    @fc1(c = "com.nytimes.android.logging.devsettings.items.NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1$1", f = "NYTLoggingDevSettingsFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.logging.devsettings.items.NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ boolean $isChecked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, by0 by0Var) {
            super(2, by0Var);
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$isChecked, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.v(this.$isChecked);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1(by0 by0Var) {
        super(3, by0Var);
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1 nYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1 = new NYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1(by0Var);
        nYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1.Z$0 = z;
        return nYTLoggingDevSettingsFactory$enableDebugLoggingDevSetting$1.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            boolean z2 = this.Z$0;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(z2, null);
            this.Z$0 = z2;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
                return h;
            }
            z = z2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            f.b(obj);
        }
        return cc0.a(z);
    }
}
