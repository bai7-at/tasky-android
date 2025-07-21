package com.nytimes.games.spellingbee.di;

import android.content.Context;
import androidx.preference.g;
import com.nytimes.games.spellingbee.SpellingBeeHostActivity;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.games.spellingbee.di.GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2", f = "GamesHybridDevSettingsModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2 extends SuspendLambda implements it2 {
    final /* synthetic */ String $hybridUrlKey;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2(String str, by0 by0Var) {
        super(3, by0Var);
        this.$hybridUrlKey = str;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Context context, String str, by0 by0Var) {
        GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2 gamesHybridDevSettingsModule$provideHybridGamesDevSettings$2 = new GamesHybridDevSettingsModule$provideHybridGamesDevSettings$2(this.$hybridUrlKey, by0Var);
        gamesHybridDevSettingsModule$provideHybridGamesDevSettings$2.L$0 = context;
        gamesHybridDevSettingsModule$provideHybridGamesDevSettings$2.L$1 = str;
        return gamesHybridDevSettingsModule$provideHybridGamesDevSettings$2.invokeSuspend(ww8.a);
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
        g.b(context).edit().putString(this.$hybridUrlKey, str).commit();
        context.startActivity(SpellingBeeHostActivity.e.a(context, com.nytimes.xwords.hybrid.utils.a.a(str)));
        return ww8.a;
    }
}
