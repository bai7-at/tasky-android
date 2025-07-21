package com.apollographql.apollo.exception;

import defpackage.q22;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class ApolloGraphQLException extends ApolloException {
    private final q22 error;
    private final List<q22> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(q22 q22Var) {
        super("GraphQL error: '" + q22Var.b() + '\'', null, 2, null);
        zq3.h(q22Var, "error");
        this.error = q22Var;
        this.errors = i.e(q22Var);
    }
}
