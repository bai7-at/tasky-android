package com.nytimes.android.features.games.gameshub.configuration;

import android.app.Application;
import android.content.Context;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import defpackage.at3;
import defpackage.dt3;
import defpackage.ju0;
import defpackage.oj6;
import defpackage.ru3;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class DebugGamesConfigurationRepository implements ju0 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private static final at3 c = tt3.b(null, new ss2() { // from class: com.nytimes.android.features.games.gameshub.configuration.DebugGamesConfigurationRepository$Companion$decoder$1
        public final void b(dt3 dt3Var) {
            zq3.h(dt3Var, "$this$Json");
            dt3Var.d(true);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((dt3) obj);
            return ww8.a;
        }
    }, 1, null);
    private final Application a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NytGamesConfiguration a(Context context, boolean z) {
            zq3.h(context, "context");
            if (z) {
                InputStream openRawResource = context.getResources().openRawResource(oj6.playtabconfig_games_entitled);
                zq3.g(openRawResource, "openRawResource(...)");
                at3 at3Var = DebugGamesConfigurationRepository.c;
                at3Var.a();
                return (NytGamesConfiguration) ru3.a(at3Var, NytGamesConfiguration.Companion.serializer(), openRawResource);
            }
            InputStream openRawResource2 = context.getResources().openRawResource(oj6.playtabconfig_non_games_entitled);
            zq3.g(openRawResource2, "openRawResource(...)");
            at3 at3Var2 = DebugGamesConfigurationRepository.c;
            at3Var2.a();
            return (NytGamesConfiguration) ru3.a(at3Var2, NytGamesConfiguration.Companion.serializer(), openRawResource2);
        }

        private a() {
        }
    }

    public DebugGamesConfigurationRepository(Application application) {
        zq3.h(application, "context");
        this.a = application;
    }

    @Override // defpackage.ju0
    public NytGamesConfiguration a(boolean z) {
        return Companion.a(this.a, z);
    }
}
