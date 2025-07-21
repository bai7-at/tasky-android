package com.nytimes.android.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import com.nytimes.android.ads.AdsDevSettings;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.sn1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.ads.AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1", f = "AdsDevSettings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ AdsDevSettings.AdStaleTimers $it;
    final /* synthetic */ MutableStateFlow<String> $itemChosenTitleFlow;
    final /* synthetic */ DevSettingChoiceListPreferenceItem $this_toDevSettingAdStaleTimerSingleOptionExpandable;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1(DevSettingChoiceListPreferenceItem devSettingChoiceListPreferenceItem, AdsDevSettings.AdStaleTimers adStaleTimers, MutableStateFlow mutableStateFlow, by0 by0Var) {
        super(2, by0Var);
        this.$this_toDevSettingAdStaleTimerSingleOptionExpandable = devSettingChoiceListPreferenceItem;
        this.$it = adStaleTimers;
        this.$itemChosenTitleFlow = mutableStateFlow;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, by0 by0Var) {
        return ((AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1) create(context, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1 adsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1 = new AdsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1(this.$this_toDevSettingAdStaleTimerSingleOptionExpandable, this.$it, this.$itemChosenTitleFlow, by0Var);
        adsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1.L$0 = obj;
        return adsDevSettings$toDevSettingAdStaleTimerSingleOptionExpandable$devSettingItems$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Context context = (Context) this.L$0;
        SharedPreferences a = ContextUtilsKt.a(context);
        AdsDevSettings.AdStaleTimers adStaleTimers = this.$it;
        SharedPreferences.Editor edit = a.edit();
        zq3.g(edit, "editor");
        edit.putLong("ad_stale_timer", Long.parseLong(adStaleTimers.getPrefValue()));
        edit.apply();
        gt2 c = this.$this_toDevSettingAdStaleTimerSingleOptionExpandable.c();
        if (c != null) {
            c.invoke(context, this.$it);
        }
        this.$itemChosenTitleFlow.setValue(this.$it.getTitle());
        if (this.$it.getRequestRestart()) {
            sn1.a.b();
        }
        Toast.makeText(context, "Item chosen: " + this.$it.getTitle(), 0).show();
        return ww8.a;
    }
}
