package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import defpackage.e52;
import defpackage.s55;

/* loaded from: classes4.dex */
public final class ev5 {
    private final ET2Scope a;

    public ev5(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a(wt2 wt2Var, CardType cardType) {
        zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
        zq3.h(cardType, "cardType");
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new s42(null, wt2Var.g(), cardType.getId(), null, null, null, null, null, s55.h.c.d(), 249, null), null, null, 12, null);
    }

    public final void b(wt2 wt2Var, CardType cardType) {
        zq3.h(wt2Var, "gameCard");
        zq3.h(cardType, TransferTable.COLUMN_TYPE);
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        s55.h hVar = s55.h.c;
        ET2PageScope.DefaultImpls.a(eT2Scope, eVar, new s42("asset tap", null, cardType.getId(), null, null, null, null, new y32(wt2Var.g(), null, wt2Var.f(), "play-tab", null, null, 50, null), hVar.d(), ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null), new u32(null, hVar.d(), "tap", 1, null), null, 8, null);
    }
}
