package com.nytimes.android.subauth.core.auth.network.response;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DeleteAccountResponse {
    private final DeleteAccountResponseMeta a;
    private final DeleteAccountResponseData b;

    public DeleteAccountResponse(DeleteAccountResponseMeta deleteAccountResponseMeta, DeleteAccountResponseData deleteAccountResponseData) {
        this.a = deleteAccountResponseMeta;
        this.b = deleteAccountResponseData;
    }

    public final DeleteAccountResponseData a() {
        return this.b;
    }

    public final String b() {
        List a;
        DeleteAccountResponseError deleteAccountResponseError;
        DeleteAccountResponseMeta deleteAccountResponseMeta = this.a;
        if (deleteAccountResponseMeta == null || (a = deleteAccountResponseMeta.a()) == null || (deleteAccountResponseError = (DeleteAccountResponseError) i.m0(a)) == null) {
            return null;
        }
        return deleteAccountResponseError.d();
    }

    public final DeleteAccountResponseMeta c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAccountResponse)) {
            return false;
        }
        DeleteAccountResponse deleteAccountResponse = (DeleteAccountResponse) obj;
        return zq3.c(this.a, deleteAccountResponse.a) && zq3.c(this.b, deleteAccountResponse.b);
    }

    public int hashCode() {
        DeleteAccountResponseMeta deleteAccountResponseMeta = this.a;
        int hashCode = (deleteAccountResponseMeta == null ? 0 : deleteAccountResponseMeta.hashCode()) * 31;
        DeleteAccountResponseData deleteAccountResponseData = this.b;
        return hashCode + (deleteAccountResponseData != null ? deleteAccountResponseData.hashCode() : 0);
    }

    public String toString() {
        return "DeleteAccountResponse(meta=" + this.a + ", data=" + this.b + ")";
    }

    public /* synthetic */ DeleteAccountResponse(DeleteAccountResponseMeta deleteAccountResponseMeta, DeleteAccountResponseData deleteAccountResponseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deleteAccountResponseMeta, (i & 2) != 0 ? null : deleteAccountResponseData);
    }
}
