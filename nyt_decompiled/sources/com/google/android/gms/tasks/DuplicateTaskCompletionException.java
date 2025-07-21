package com.google.android.gms.tasks;

import defpackage.og8;

/* loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(og8 og8Var) {
        if (!og8Var.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l = og8Var.l();
        return new DuplicateTaskCompletionException("Complete with: ".concat(l != null ? "failure" : og8Var.q() ? "result ".concat(String.valueOf(og8Var.m())) : og8Var.o() ? "cancellation" : "unknown issue"), l);
    }
}
