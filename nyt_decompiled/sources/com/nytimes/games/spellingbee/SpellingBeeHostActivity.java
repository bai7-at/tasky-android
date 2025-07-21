package com.nytimes.games.spellingbee;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.r;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.xwords.hybrid.GamesHybridManager;
import com.nytimes.xwords.hybrid.utils.ArchivePath;
import com.nytimes.xwords.hybrid.view.spellingbee.SpellingBeeHybridFragment;
import defpackage.du8;
import defpackage.dz1;
import defpackage.e44;
import defpackage.p4;
import defpackage.sb3;
import defpackage.uo6;
import defpackage.uy3;
import defpackage.wu2;
import defpackage.yg6;
import defpackage.z58;
import defpackage.zq3;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@ExperimentalCoroutinesApi
/* loaded from: classes4.dex */
public final class SpellingBeeHostActivity extends com.nytimes.games.spellingbee.a {
    public static final a e = new a(null);
    public AbraManager abraManager;
    public sb3 authEventPublisher;
    public uy3 landingHelper;
    public dz1 sendEmail;
    public z58 subauthClient;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, ArchivePath archivePath, int i, Object obj) {
            if ((i & 2) != 0) {
                archivePath = null;
            }
            return aVar.a(context, archivePath);
        }

        public final Intent a(Context context, ArchivePath archivePath) {
            zq3.h(context, "appContext");
            Intent intent = new Intent(context, (Class<?>) SpellingBeeHostActivity.class);
            if (archivePath != null) {
                intent.putExtra("SBArchivePath", archivePath);
            }
            return intent;
        }

        private a() {
        }
    }

    private final void Q() {
        e44.a(this).b(new SpellingBeeHostActivity$listenForFeedbackEvents$1(this, null));
    }

    private final void R() {
        BuildersKt__Builders_commonKt.launch$default(e44.a(this), null, null, new SpellingBeeHostActivity$listenForSubscriptionButtonEvents$1(this, null), 3, null);
    }

    public final AbraManager M() {
        AbraManager abraManager = this.abraManager;
        if (abraManager != null) {
            return abraManager;
        }
        zq3.z("abraManager");
        return null;
    }

    public final sb3 N() {
        sb3 sb3Var = this.authEventPublisher;
        if (sb3Var != null) {
            return sb3Var;
        }
        zq3.z("authEventPublisher");
        return null;
    }

    public final uy3 O() {
        uy3 uy3Var = this.landingHelper;
        if (uy3Var != null) {
            return uy3Var;
        }
        zq3.z("landingHelper");
        return null;
    }

    public final dz1 P() {
        dz1 dz1Var = this.sendEmail;
        if (dz1Var != null) {
            return dz1Var;
        }
        zq3.z("sendEmail");
        return null;
    }

    public final z58 getSubauthClient() {
        z58 z58Var = this.subauthClient;
        if (z58Var != null) {
            return z58Var;
        }
        zq3.z("subauthClient");
        return null;
    }

    @Override // com.nytimes.games.spellingbee.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p4.a.b(this, yg6.hybrid_container);
        Q();
        R();
        GamesHybridManager gamesHybridManager = GamesHybridManager.a;
        List<AbraTest> allTests = M().getAllTests();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(allTests, 10)), 16));
        for (AbraTest abraTest : allTests) {
            Pair a2 = du8.a(abraTest.getTestName(), abraTest.getAbraMetaData().getAbraVariant());
            linkedHashMap.put(a2.c(), a2.d());
        }
        gamesHybridManager.g(new wu2(null, linkedHashMap, 1, null));
        if (bundle == null) {
            r p = getSupportFragmentManager().p();
            int i = yg6.hybrid_container;
            SpellingBeeHybridFragment.a aVar = SpellingBeeHybridFragment.Z;
            Bundle extras = getIntent().getExtras();
            Serializable serializable = extras != null ? extras.getSerializable("SBArchivePath") : null;
            p.b(i, SpellingBeeHybridFragment.a.b(aVar, serializable instanceof ArchivePath ? (ArchivePath) serializable : null, null, 2, null)).h();
        }
    }
}
