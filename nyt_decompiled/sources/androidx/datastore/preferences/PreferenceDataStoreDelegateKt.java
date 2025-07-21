package androidx.datastore.preferences;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import defpackage.hp6;
import defpackage.rx6;
import defpackage.ss2;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public abstract class PreferenceDataStoreDelegateKt {
    public static final hp6 a(String str, rx6 rx6Var, ss2 ss2Var, CoroutineScope coroutineScope) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "produceMigrations");
        zq3.h(coroutineScope, "scope");
        return new PreferenceDataStoreSingletonDelegate(str, rx6Var, ss2Var, coroutineScope);
    }

    public static /* synthetic */ hp6 b(String str, rx6 rx6Var, ss2 ss2Var, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            rx6Var = null;
        }
        if ((i & 4) != 0) {
            ss2Var = new ss2() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1
                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final List invoke(Context context) {
                    zq3.h(context, "it");
                    return i.l();
                }
            };
        }
        if ((i & 8) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        }
        return a(str, rx6Var, ss2Var, coroutineScope);
    }
}
