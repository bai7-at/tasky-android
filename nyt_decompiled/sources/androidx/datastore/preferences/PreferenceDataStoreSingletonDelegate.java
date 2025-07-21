package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import com.facebook.AuthenticationTokenClaims;
import defpackage.ba1;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.o16;
import defpackage.qs2;
import defpackage.rx6;
import defpackage.ss2;
import defpackage.zq3;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements hp6 {
    private final String a;
    private final ss2 b;
    private final CoroutineScope c;
    private final Object d;
    private volatile ba1 e;

    public PreferenceDataStoreSingletonDelegate(String str, rx6 rx6Var, ss2 ss2Var, CoroutineScope coroutineScope) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "produceMigrations");
        zq3.h(coroutineScope, "scope");
        this.a = str;
        this.b = ss2Var;
        this.c = coroutineScope;
        this.d = new Object();
    }

    @Override // defpackage.hp6
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ba1 getValue(Context context, iv3 iv3Var) {
        ba1 ba1Var;
        zq3.h(context, "thisRef");
        zq3.h(iv3Var, "property");
        ba1 ba1Var2 = this.e;
        if (ba1Var2 != null) {
            return ba1Var2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    final Context applicationContext = context.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.a;
                    ss2 ss2Var = this.b;
                    zq3.g(applicationContext, "applicationContext");
                    this.e = preferenceDataStoreFactory.a(null, (List) ss2Var.invoke(applicationContext), this.c, new qs2() { // from class: androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final File mo865invoke() {
                            String str;
                            Context context2 = applicationContext;
                            zq3.g(context2, "applicationContext");
                            str = this.a;
                            return o16.a(context2, str);
                        }
                    });
                }
                ba1Var = this.e;
                zq3.e(ba1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ba1Var;
    }
}
