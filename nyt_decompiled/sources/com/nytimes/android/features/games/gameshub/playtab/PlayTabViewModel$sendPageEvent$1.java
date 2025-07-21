package com.nytimes.android.features.games.gameshub.playtab;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.b65;
import defpackage.by0;
import defpackage.du8;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.s55;
import defpackage.ue4;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$sendPageEvent$1", f = "PlayTabViewModel.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PlayTabViewModel$sendPageEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ b65 $referringSource;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlayTabViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayTabViewModel$sendPageEvent$1(PlayTabViewModel playTabViewModel, b65 b65Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = playTabViewModel;
        this.$referringSource = b65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PlayTabViewModel$sendPageEvent$1 playTabViewModel$sendPageEvent$1 = new PlayTabViewModel$sendPageEvent$1(this.this$0, this.$referringSource, by0Var);
        playTabViewModel$sendPageEvent$1.L$0 = obj;
        return playTabViewModel$sendPageEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ET2SimpleScope eT2SimpleScope;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            eT2SimpleScope = this.this$0.c;
            s55.h hVar = s55.h.c;
            b65 b65Var = this.$referringSource;
            AnonymousClass1 anonymousClass1 = new qs2() { // from class: com.nytimes.android.features.games.gameshub.playtab.PlayTabViewModel$sendPageEvent$1.1
                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return new ue4(du8.a("canonical_url", "https://www.nytimes.com/crosswords/beta/play"));
                }
            };
            this.label = 1;
            if (ET2SimpleScope.i(eT2SimpleScope, hVar, null, null, b65Var, null, anonymousClass1, null, null, coroutineScope, this, 214, null) == h) {
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

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((PlayTabViewModel$sendPageEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
