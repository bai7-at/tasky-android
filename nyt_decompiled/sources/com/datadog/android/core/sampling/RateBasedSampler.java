package com.datadog.android.core.sampling;

import com.datadog.android.api.InternalLogger;
import defpackage.a87;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import java.security.SecureRandom;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class RateBasedSampler implements a87 {
    private static final a c = new a(null);
    private final qs2 a;
    private final c04 b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RateBasedSampler(qs2 qs2Var) {
        zq3.h(qs2Var, "sampleRateProvider");
        this.a = qs2Var;
        this.b = c.a(new qs2() { // from class: com.datadog.android.core.sampling.RateBasedSampler$random$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SecureRandom mo865invoke() {
                return new SecureRandom();
            }
        });
    }

    private final SecureRandom b() {
        return (SecureRandom) this.b.getValue();
    }

    @Override // defpackage.a87
    public boolean a() {
        float floatValue = c().floatValue();
        if (floatValue == 0.0f) {
            return false;
        }
        return floatValue == 100.0f || b().nextFloat() * ((float) 100) <= floatValue;
    }

    public Float c() {
        final float floatValue = ((Number) this.a.mo865invoke()).floatValue();
        float f = 0.0f;
        if (floatValue >= 0.0f) {
            f = 100.0f;
            if (floatValue > 100.0f) {
                InternalLogger.b.a(InternalLogger.a.a(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Sample rate value provided " + floatValue + " is above 100, setting it to 100.";
                    }
                }, null, false, null, 56, null);
            }
            return Float.valueOf(floatValue);
        }
        InternalLogger.b.a(InternalLogger.a.a(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "Sample rate value provided " + floatValue + " is below 0, setting it to 0.";
            }
        }, null, false, null, 56, null);
        floatValue = f;
        return Float.valueOf(floatValue);
    }

    public RateBasedSampler(final float f) {
        this(new qs2() { // from class: com.datadog.android.core.sampling.RateBasedSampler.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                return Float.valueOf(f);
            }
        });
    }
}
