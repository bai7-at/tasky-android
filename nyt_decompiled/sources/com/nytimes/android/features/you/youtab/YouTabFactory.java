package com.nytimes.android.features.you.youtab;

import android.net.Uri;
import androidx.compose.runtime.Composer;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.features.you.youtab.composable.YouTabScreenKt;
import com.nytimes.android.interests.InterestsManager;
import com.nytimes.android.interests.InterestsPreferencesStore;
import com.nytimes.android.utils.AppPreferences;
import defpackage.by0;
import defpackage.cb2;
import defpackage.cc7;
import defpackage.de4;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hf8;
import defpackage.re6;
import defpackage.ww8;
import defpackage.yk6;
import defpackage.z58;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes4.dex */
public final class YouTabFactory implements de4 {
    private final cb2 a;
    private final YouTabPreferencesStore b;
    private final InterestsManager c;
    private final AppPreferences d;
    private final z58 e;
    private final hf8 f;
    private final String g;
    private final Flow h;

    static final class a implements FlowCollector {
        public static final a a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            return ww8.a;
        }
    }

    public YouTabFactory(cb2 cb2Var, YouTabPreferencesStore youTabPreferencesStore, InterestsManager interestsManager, AppPreferences appPreferences, z58 z58Var, CoroutineScope coroutineScope) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(youTabPreferencesStore, "youTabPreferencesStore");
        zq3.h(interestsManager, "interestsManager");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(z58Var, "subauthClient");
        zq3.h(coroutineScope, "scope");
        this.a = cb2Var;
        this.b = youTabPreferencesStore;
        this.c = interestsManager;
        this.d = appPreferences;
        this.e = z58Var;
        this.f = new hf8(Integer.valueOf(re6.ic_account), yk6.you_tab_name, Integer.valueOf(yk6.you_accessibility), "you", null, 16, null);
        this.g = "you tab";
        this.h = FlowKt.combine(youTabPreferencesStore.b(), z58Var.e(), interestsManager.n(ParallelDownloadStrategy.GET, null), FlowKt.stateIn(appPreferences.i("lastSeenUserInterests"), coroutineScope, SharingStarted.Companion.getEagerly(), Long.valueOf(appPreferences.k("lastSeenUserInterests", InterestsPreferencesStore.Companion.a()))), new YouTabFactory$badge$1(this, null));
    }

    @Override // defpackage.de4
    public void a(final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(1622969719);
        if ((i & 14) == 0) {
            i2 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1622969719, i2, -1, "com.nytimes.android.features.you.youtab.YouTabFactory.Content (YouTabFactory.kt:83)");
            }
            ET2CoroutineScopeKt.e(null, new YouTabFactory$Content$1(null), h, 64, 1);
            YouTabScreenKt.a(fe4Var, null, h, fe4.h | (i2 & 14), 2);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.you.youtab.YouTabFactory$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    YouTabFactory.this.a(fe4Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.de4
    public Flow b() {
        return this.h;
    }

    @Override // defpackage.de4
    public String c() {
        return this.g;
    }

    @Override // defpackage.de4
    public Object d(by0 by0Var) {
        Object collect;
        return (this.e.q() && (collect = this.c.n(ParallelDownloadStrategy.FETCH_ALWAYS, null).collect(a.a, by0Var)) == kotlin.coroutines.intrinsics.a.h()) ? collect : ww8.a;
    }

    @Override // defpackage.de4
    public boolean e(Uri uri) {
        zq3.h(uri, "uri");
        return isEnabled() && zq3.c(h(uri), "nytimes://reader/you");
    }

    @Override // defpackage.de4
    public hf8 f() {
        return this.f;
    }

    public String h(Uri uri) {
        return de4.a.a(this, uri);
    }

    @Override // defpackage.de4
    public boolean isEnabled() {
        return this.a.G();
    }
}
