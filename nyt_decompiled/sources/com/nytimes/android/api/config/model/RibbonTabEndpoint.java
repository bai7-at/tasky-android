package com.nytimes.android.api.config.model;

import com.facebook.AuthenticationTokenClaims;
import defpackage.b22;
import defpackage.c04;
import defpackage.d22;
import defpackage.lk7;
import defpackage.qs2;
import defpackage.zq3;
import java.lang.annotation.Annotation;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@lk7
/* loaded from: classes3.dex */
public final class RibbonTabEndpoint {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ RibbonTabEndpoint[] $VALUES;
    private static final c04 $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final RibbonTabEndpoint GENERIC = new RibbonTabEndpoint("GENERIC", 0);
    public static final RibbonTabEndpoint PERSONALIZED = new RibbonTabEndpoint("PERSONALIZED", 1);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) RibbonTabEndpoint.$cachedSerializer$delegate.getValue();
        }

        public final RibbonTabEndpoint find(String str) {
            RibbonTabEndpoint ribbonTabEndpoint;
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            RibbonTabEndpoint[] values = RibbonTabEndpoint.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ribbonTabEndpoint = null;
                    break;
                }
                ribbonTabEndpoint = values[i];
                String name = ribbonTabEndpoint.name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                String lowerCase2 = str.toLowerCase(locale);
                zq3.g(lowerCase2, "toLowerCase(...)");
                if (zq3.c(lowerCase, lowerCase2)) {
                    break;
                }
                i++;
            }
            return ribbonTabEndpoint == null ? RibbonTabEndpoint.GENERIC : ribbonTabEndpoint;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ RibbonTabEndpoint[] $values() {
        return new RibbonTabEndpoint[]{GENERIC, PERSONALIZED};
    }

    static {
        RibbonTabEndpoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.nytimes.android.api.config.model.RibbonTabEndpoint.Companion.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final KSerializer mo865invoke() {
                return d22.a("com.nytimes.android.api.config.model.RibbonTabEndpoint", RibbonTabEndpoint.values(), new String[]{"generic", "personalized"}, new Annotation[][]{null, null}, null);
            }
        });
    }

    private RibbonTabEndpoint(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static RibbonTabEndpoint valueOf(String str) {
        return (RibbonTabEndpoint) Enum.valueOf(RibbonTabEndpoint.class, str);
    }

    public static RibbonTabEndpoint[] values() {
        return (RibbonTabEndpoint[]) $VALUES.clone();
    }
}
