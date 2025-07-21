package com.nytimes.android.devsettings.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.sn1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3", f = "DevSettingTextFieldItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3 extends SuspendLambda implements it2 {
    final /* synthetic */ String $preferenceKey;
    final /* synthetic */ boolean $requestRestart;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3(boolean z, String str, by0 by0Var) {
        super(3, by0Var);
        this.$requestRestart = z;
        this.$preferenceKey = str;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, String str, by0 by0Var) {
        DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3 devSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3 = new DevSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3(this.$requestRestart, this.$preferenceKey, by0Var);
        devSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3.L$0 = context;
        devSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3.L$1 = str;
        return devSettingTextFieldItemKt$DevSettingTextFieldPreferenceItem$3.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        String str = (String) this.L$1;
        SharedPreferences a = ContextUtilsKt.a(context);
        String str2 = this.$preferenceKey;
        SharedPreferences.Editor edit = a.edit();
        zq3.g(edit, "editor");
        edit.putString(str2, str);
        edit.apply();
        if (this.$requestRestart) {
            sn1.a.b();
        }
        return str;
    }
}
