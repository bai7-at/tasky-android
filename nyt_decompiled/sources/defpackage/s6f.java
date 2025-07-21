package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class s6f {
    private static Logger a = new Logger("GoogleSignInCommon", new String[0]);

    public static k13 a(Intent intent) {
        if (intent == null) {
            return new k13(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new k13(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new k13(null, status);
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static PendingResult c(GoogleApiClient googleApiClient, Context context, boolean z) {
        a.d("Signing out", new Object[0]);
        d(context);
        return z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new v8f(googleApiClient));
    }

    private static void d(Context context) {
        hsf.c(context).a();
        Iterator<GoogleApiClient> it2 = GoogleApiClient.getAllClients().iterator();
        while (it2.hasNext()) {
            it2.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }

    public static Intent e(Context context, GoogleSignInOptions googleSignInOptions) {
        a.d("getFallbackSignInIntent()", new Object[0]);
        Intent b = b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return b;
    }

    public static PendingResult f(GoogleApiClient googleApiClient, Context context, boolean z) {
        a.d("Revoking access", new Object[0]);
        String e = e28.b(context).e();
        d(context);
        return z ? szc.a(e) : googleApiClient.execute(new bdf(googleApiClient));
    }

    public static Intent g(Context context, GoogleSignInOptions googleSignInOptions) {
        a.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent b = b(context, googleSignInOptions);
        b.setAction("com.google.android.gms.auth.NO_IMPL");
        return b;
    }
}
