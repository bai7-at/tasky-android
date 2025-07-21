package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class vhe implements y21 {
    private final Status a;
    private final Credential b;

    public vhe(Status status, Credential credential) {
        this.a = status;
        this.b = credential;
    }

    public static vhe b(Status status) {
        return new vhe(status, null);
    }

    @Override // defpackage.y21
    public final Credential a() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }
}
