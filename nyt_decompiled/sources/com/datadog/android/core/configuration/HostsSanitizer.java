package com.datadog.android.core.configuration;

import com.datadog.android.api.InternalLogger;
import defpackage.k47;
import defpackage.qs2;
import defpackage.zq3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class HostsSanitizer {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final List a(List list, final String str) {
        zq3.h(list, "hosts");
        zq3.h(str, "feature");
        Regex regex = new Regex("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$");
        Regex regex2 = new Regex("^(http|https)://(.*)");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final String str2 = (String) it2.next();
            if (regex2.d(str2)) {
                try {
                    final URL url = new URL(str2);
                    InternalLogger.b.a(k47.a(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            String format = String.format(Locale.US, "You are using a url \"%s\" instead of a host to setup %s tracking. You should use instead a valid host name: \"%s\"", Arrays.copyOf(new Object[]{str2, str, url.getHost()}, 3));
                            zq3.g(format, "format(...)");
                            return format;
                        }
                    }, null, false, null, 56, null);
                    str2 = url.getHost();
                } catch (MalformedURLException e) {
                    InternalLogger.b.a(k47.a(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            String format = String.format(Locale.US, "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"", Arrays.copyOf(new Object[]{str2, str}, 2));
                            zq3.g(format, "format(...)");
                            return format;
                        }
                    }, e, false, null, 48, null);
                }
            } else if (!regex.d(str2)) {
                Locale locale = Locale.US;
                zq3.g(locale, "US");
                String lowerCase = str2.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                if (!zq3.c(lowerCase, "localhost")) {
                    InternalLogger.b.a(k47.a(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.configuration.HostsSanitizer$sanitizeHosts$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            String format = String.format(Locale.US, "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.", Arrays.copyOf(new Object[]{str2, str}, 2));
                            zq3.g(format, "format(...)");
                            return format;
                        }
                    }, null, false, null, 56, null);
                    str2 = null;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
