package com.facebook;

import defpackage.m23;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final m23 graphResponse;

    public FacebookGraphResponseException(m23 m23Var, String str) {
        super(str);
        this.graphResponse = m23Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        m23 m23Var = this.graphResponse;
        FacebookRequestError b = m23Var == null ? null : m23Var.b();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        zq3.g(sb, "StringBuilder().append(\"{FacebookGraphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (b != null) {
            sb.append("httpResponseCode: ");
            sb.append(b.f());
            sb.append(", facebookErrorCode: ");
            sb.append(b.b());
            sb.append(", facebookErrorType: ");
            sb.append(b.d());
            sb.append(", message: ");
            sb.append(b.c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
