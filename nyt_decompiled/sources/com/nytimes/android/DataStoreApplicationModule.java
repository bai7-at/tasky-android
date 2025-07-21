package com.nytimes.android;

import android.app.Application;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import defpackage.ba1;
import defpackage.o16;
import defpackage.qs2;
import defpackage.zq3;
import java.io.File;
import kotlin.collections.b0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes2.dex */
public final class DataStoreApplicationModule {
    public static final DataStoreApplicationModule a = new DataStoreApplicationModule();

    private DataStoreApplicationModule() {
    }

    public final ba1 a(final Application application) {
        zq3.h(application, "app");
        return PreferenceDataStoreFactory.a.a(null, kotlin.collections.i.e(SharedPreferencesMigrationKt.a(application, application.getPackageName() + "_preferences", b0.j("commenterName", "commenterLoc"))), CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), new qs2() { // from class: com.nytimes.android.DataStoreApplicationModule$providePreferenceDataStore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                return o16.a(application, "preferences");
            }
        });
    }
}
