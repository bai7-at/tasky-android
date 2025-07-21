package com.nytimes.android.devsettings.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sn1;
import defpackage.tn1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1", f = "DevSettingChoiceListPreferenceItem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ tn1 $item;
    final /* synthetic */ MutableStateFlow<String> $itemChosenTitleFlow;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DevSettingChoiceListPreferenceItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1(DevSettingChoiceListPreferenceItem devSettingChoiceListPreferenceItem, tn1 tn1Var, MutableStateFlow mutableStateFlow, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = devSettingChoiceListPreferenceItem;
        this.$item = tn1Var;
        this.$itemChosenTitleFlow = mutableStateFlow;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1 devSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1 = new DevSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1(this.this$0, this.$item, this.$itemChosenTitleFlow, by0Var);
        devSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1.L$0 = obj;
        return devSettingChoiceListPreferenceItem$toDevSettingSingleOptionExpandable$devSettingItems$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        SharedPreferences a = ContextUtilsKt.a(context);
        DevSettingChoiceListPreferenceItem devSettingChoiceListPreferenceItem = this.this$0;
        tn1 tn1Var = this.$item;
        SharedPreferences.Editor edit = a.edit();
        zq3.g(edit, "editor");
        edit.putString(devSettingChoiceListPreferenceItem.d(), tn1Var.getPrefValue());
        edit.apply();
        gt2 c = this.this$0.c();
        if (c != null) {
            c.invoke(context, this.$item);
        }
        this.$itemChosenTitleFlow.setValue(this.$item.getTitle());
        if (this.$item.getRequestRestart()) {
            sn1.a.b();
        }
        Toast.makeText(context, "Item chosen: " + this.$item.getPrefValue(), 0).show();
        return ww8.a;
    }
}
