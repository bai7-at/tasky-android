package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.HasApiKey;

/* loaded from: classes2.dex */
public interface yr7 extends HasApiKey {
    SignInCredential a(Intent intent);

    og8 c(BeginSignInRequest beginSignInRequest);
}
