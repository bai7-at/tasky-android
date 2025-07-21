package com.nytimes.android.features.games.gameshub.playtab;

import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import defpackage.by0;
import defpackage.ev5;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wt2;
import defpackage.ww8;
import java.util.HashSet;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$sendImpressionEvent$1", f = "PlayTabViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabViewModel$sendImpressionEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ wt2 $game;
    final /* synthetic */ CardType $type;
    int label;
    final /* synthetic */ PlayTabViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabViewModel$sendImpressionEvent$1(PlayTabViewModel playTabViewModel, wt2 wt2Var, CardType cardType, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = playTabViewModel;
        this.$game = wt2Var;
        this.$type = cardType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new PlayTabViewModel$sendImpressionEvent$1(this.this$0, this.$game, this.$type, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HashSet hashSet;
        ev5 ev5Var;
        HashSet hashSet2;
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        hashSet = this.this$0.g;
        if (!hashSet.contains(this.$game.g())) {
            ev5Var = this.this$0.d;
            ev5Var.a(this.$game, this.$type);
            hashSet2 = this.this$0.g;
            hashSet2.add(this.$game.g());
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PlayTabViewModel$sendImpressionEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
