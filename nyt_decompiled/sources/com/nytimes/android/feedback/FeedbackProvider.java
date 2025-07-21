package com.nytimes.android.feedback;

import defpackage.by0;
import java.util.List;

/* loaded from: classes4.dex */
public interface FeedbackProvider {

    public static final class InvalidEmailException extends RuntimeException {
        public InvalidEmailException() {
            super("Email is either null, empty, or invalid format");
        }
    }

    public static final class InvalidSummaryException extends RuntimeException {
        public InvalidSummaryException() {
            super("Summary is either null or empty");
        }
    }

    Object a(String str, String str2, String str3, List list, by0 by0Var);

    void b();
}
