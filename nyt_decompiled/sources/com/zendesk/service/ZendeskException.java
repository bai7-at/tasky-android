package com.zendesk.service;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.ec5;
import defpackage.y22;

/* loaded from: classes4.dex */
public class ZendeskException extends Exception {
    private final y22 errorResponse;

    @Override // java.lang.Throwable
    public String toString() {
        y22 y22Var = this.errorResponse;
        return String.format("ZendeskException{details=%s,errorResponse=%s,cause=%s}", super.toString(), y22Var == null ? Constants.NULL_VERSION_ID : y22Var.a(), ec5.a(getCause()));
    }
}
