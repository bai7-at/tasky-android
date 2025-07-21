package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import android.widget.Toast;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.u16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import okhttp3.internal.http.StatusLine;

@fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$15", f = "SubauthUserDevSettingFactory.kt", l = {StatusLine.HTTP_TEMP_REDIRECT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubauthUserDevSettingFactory$userDevSettings$15 extends SuspendLambda implements it2 {
    final /* synthetic */ ba1 $datastore;
    final /* synthetic */ String $overrideTargetingDataContentKey;
    final /* synthetic */ String $overrideTargetingDataKey;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @fc1(c = "com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$15$1", f = "SubauthUserDevSettingFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory$userDevSettings$15$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $overrideTargetingDataContentKey;
        final /* synthetic */ String $overrideTargetingDataKey;
        final /* synthetic */ String $text;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2, String str3, Context context, by0 by0Var) {
            super(2, by0Var);
            this.$overrideTargetingDataKey = str;
            this.$overrideTargetingDataContentKey = str2;
            this.$text = str3;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideTargetingDataKey, this.$overrideTargetingDataContentKey, this.$text, this.$context, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(MutablePreferences mutablePreferences, by0 by0Var) {
            return ((AnonymousClass1) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            Boolean bool = (Boolean) mutablePreferences.c(u16.a(this.$overrideTargetingDataKey));
            if (bool != null ? bool.booleanValue() : false) {
                mutablePreferences.j(u16.f(this.$overrideTargetingDataContentKey), this.$text);
            } else {
                Toast.makeText(this.$context, "You must enable 'Override targeting API data' to change this setting", 0).show();
            }
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubauthUserDevSettingFactory$userDevSettings$15(ba1 ba1Var, String str, String str2, by0 by0Var) {
        super(3, by0Var);
        this.$datastore = ba1Var;
        this.$overrideTargetingDataKey = str;
        this.$overrideTargetingDataContentKey = str2;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, String str, by0 by0Var) {
        SubauthUserDevSettingFactory$userDevSettings$15 subauthUserDevSettingFactory$userDevSettings$15 = new SubauthUserDevSettingFactory$userDevSettings$15(this.$datastore, this.$overrideTargetingDataKey, this.$overrideTargetingDataContentKey, by0Var);
        subauthUserDevSettingFactory$userDevSettings$15.L$0 = context;
        subauthUserDevSettingFactory$userDevSettings$15.L$1 = str;
        return subauthUserDevSettingFactory$userDevSettings$15.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Context context = (Context) this.L$0;
            String str = (String) this.L$1;
            ba1 ba1Var = this.$datastore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$overrideTargetingDataKey, this.$overrideTargetingDataContentKey, str, context, null);
            this.L$0 = null;
            this.label = 1;
            if (PreferencesKt.a(ba1Var, anonymousClass1, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }
}
