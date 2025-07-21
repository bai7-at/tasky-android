package defpackage;

import com.nytimes.android.eventtracker.buffer.ValidationStatus;

/* loaded from: classes4.dex */
public final class y29 {
    public final String a(ValidationStatus validationStatus) {
        zq3.h(validationStatus, "validatedStatus");
        return validationStatus.name();
    }

    public final ValidationStatus b(String str) {
        zq3.h(str, "value");
        return ValidationStatus.valueOf(str);
    }
}
