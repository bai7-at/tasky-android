package com.datadog.android.core.constraints;

import com.chartbeat.androidsdk.QueryKeys;
import com.datadog.android.api.InternalLogger;
import defpackage.du8;
import defpackage.f91;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.te4;
import defpackage.tj0;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class DatadogDataConstraints implements f91 {
    public static final a c = new a(null);
    private static final Set d = b0.j("host", "device", "source", "service");
    private final InternalLogger a;
    private final List b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DatadogDataConstraints(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
        this.b = i.o(new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                Locale locale = Locale.US;
                zq3.g(locale, "US");
                String lowerCase = str.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                return lowerCase;
            }
        }, new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$2
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                tj0 tj0Var = new tj0('a', 'z');
                Character i1 = h.i1(str, 0);
                if (i1 == null || !tj0Var.o(i1.charValue())) {
                    return null;
                }
                return str;
            }
        }, new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$3
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                return new Regex("[^a-z0-9_:./-]").e(str, QueryKeys.END_MARKER);
            }
        }, new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$4
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (!h.S(str, ':', false, 2, null)) {
                    return str;
                }
                String substring = str.substring(0, h.V(str));
                zq3.g(substring, "substring(...)");
                return substring;
            }
        }, new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$5
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                zq3.h(str, "it");
                if (str.length() <= 200) {
                    return str;
                }
                String substring = str.substring(0, 200);
                zq3.g(substring, "substring(...)");
                return substring;
            }
        }, new ss2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$6
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                boolean f;
                zq3.h(str, "it");
                f = DatadogDataConstraints.this.f(str);
                if (f) {
                    return null;
                }
                return str;
            }
        });
    }

    private final String d(String str, int i) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '.' && (i = i + 1) > 9) {
                charAt = '_';
            }
            arrayList.add(Character.valueOf(charAt));
        }
        return new String(i.S0(arrayList));
    }

    private final String e(String str) {
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            str = str == null ? null : (String) ((ss2) it2.next()).invoke(str);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(String str) {
        int a0 = h.a0(str, ':', 0, false, 6, null);
        if (a0 <= 0) {
            return false;
        }
        String substring = str.substring(0, a0);
        zq3.g(substring, "substring(...)");
        return d.contains(substring);
    }

    private final String g(String str, int i) {
        if (str == null) {
            return "Too many attributes were added, " + i + " had to be discarded.";
        }
        return "Too many attributes were added for [" + str + "], " + i + " had to be discarded.";
    }

    @Override // defpackage.f91
    public Map a(Map map, String str, String str2, Set set) {
        zq3.h(map, "attributes");
        zq3.h(set, "reservedKeys");
        int i = 0;
        if (str != null) {
            int i2 = 0;
            while (i < str.length()) {
                if (str.charAt(i) == '.') {
                    i2++;
                }
                i++;
            }
            i = i2 + 1;
        }
        ArrayList arrayList = new ArrayList();
        for (final Map.Entry entry : map.entrySet()) {
            Pair pair = null;
            if (entry.getKey() == null) {
                InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "\"" + entry + "\" is an invalid attribute, and was ignored.";
                    }
                }, null, false, null, 56, null);
            } else if (set.contains(entry.getKey())) {
                InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "\"" + entry + "\" key was in the reservedKeys set, and was dropped.";
                    }
                }, null, false, null, 56, null);
            } else {
                final String d2 = d((String) entry.getKey(), i);
                if (!zq3.c(d2, entry.getKey())) {
                    InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            String key = entry.getKey();
                            return "Key \"" + ((Object) key) + "\" was modified to \"" + d2 + "\" to match our constraints.";
                        }
                    }, null, false, null, 56, null);
                }
                pair = du8.a(d2, entry.getValue());
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            final String g = g(str2, size);
            InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return g;
                }
            }, null, false, null, 56, null);
        }
        return te4.b(i.P0(arrayList, 128));
    }

    @Override // defpackage.f91
    public List b(List list) {
        zq3.h(list, "tags");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final String str = (String) it2.next();
            final String e = e(str);
            if (e == null) {
                InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$convertedTags$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "\"" + str + "\" is an invalid tag, and was ignored.";
                    }
                }, null, false, null, 56, null);
            } else if (!zq3.c(e, str)) {
                InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$convertedTags$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "tag \"" + str + "\" was modified to \"" + e + "\" to match our constraints.";
                    }
                }, null, true, null, 40, null);
            }
            if (e != null) {
                arrayList.add(e);
            }
        }
        final int size = arrayList.size() - 100;
        if (size > 0) {
            InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "too many tags were added, " + size + " had to be discarded.";
                }
            }, null, false, null, 56, null);
        }
        return i.P0(arrayList, 100);
    }
}
