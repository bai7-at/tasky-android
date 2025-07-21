package com.nytimes.android.utils;

import android.app.Application;
import android.content.res.Resources;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.b22;
import defpackage.gk6;
import defpackage.p76;
import defpackage.ss2;
import defpackage.tb1;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.temporal.ChronoUnit;

/* loaded from: classes4.dex */
public class TimeStampUtil {
    private final Application a;
    private final p76 b;
    private final p76 c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private DateTimeFormatter w;
    private DateTimeFormatter x;
    private DateTimeFormatter y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RelativeTimestampType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ RelativeTimestampType[] $VALUES;
        public static final RelativeTimestampType FULL = new RelativeTimestampType("FULL", 0);
        public static final RelativeTimestampType SHORT = new RelativeTimestampType("SHORT", 1);
        public static final RelativeTimestampType A11Y = new RelativeTimestampType("A11Y", 2);

        private static final /* synthetic */ RelativeTimestampType[] $values() {
            return new RelativeTimestampType[]{FULL, SHORT, A11Y};
        }

        static {
            RelativeTimestampType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private RelativeTimestampType(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static RelativeTimestampType valueOf(String str) {
            return (RelativeTimestampType) Enum.valueOf(RelativeTimestampType.class, str);
        }

        public static RelativeTimestampType[] values() {
            return (RelativeTimestampType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[RelativeTimestampType.values().length];
            try {
                iArr2[RelativeTimestampType.A11Y.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RelativeTimestampType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RelativeTimestampType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public TimeStampUtil(Application application, p76 p76Var, p76 p76Var2) {
        zq3.h(application, "context");
        zq3.h(p76Var, "currentDateProvider");
        zq3.h(p76Var2, "zoneIdProvider");
        this.a = application;
        this.b = p76Var;
        this.c = p76Var2;
        Resources resources = application.getResources();
        zq3.g(resources, "getResources(...)");
        Locale locale = application.getResources().getConfiguration().locale;
        zq3.g(locale, "locale");
        I(resources, locale);
    }

    public static /* synthetic */ String B(TimeStampUtil timeStampUtil, Instant instant, RelativeTimestampType relativeTimestampType, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRelativeTimeStampText");
        }
        if ((i & 2) != 0) {
            relativeTimestampType = RelativeTimestampType.FULL;
        }
        return timeStampUtil.A(instant, relativeTimestampType);
    }

    private final String C(LocalDateTime localDateTime, ss2 ss2Var, ss2 ss2Var2, ss2 ss2Var3) {
        DateTimeFormatter dateTimeFormatter;
        String str;
        LocalDateTime ofInstant = LocalDateTime.ofInstant((Instant) this.b.get(), (ZoneId) this.c.get());
        long abs = Math.abs(ChronoUnit.SECONDS.between(localDateTime, ofInstant));
        DateTimeFormatter dateTimeFormatter2 = null;
        String str2 = null;
        if (abs < 60) {
            String str3 = this.d;
            if (str3 == null) {
                zq3.z("secondsFormat");
            } else {
                str2 = str3;
            }
            return p(abs, str2);
        }
        long abs2 = Math.abs(ChronoUnit.MINUTES.between(localDateTime, ofInstant));
        if (abs2 < 60) {
            return (String) ss2Var.invoke(Long.valueOf(abs2));
        }
        long abs3 = Math.abs(ChronoUnit.HOURS.between(localDateTime, ofInstant));
        if (abs3 < 24) {
            return (String) ss2Var2.invoke(Long.valueOf(abs3));
        }
        long abs4 = Math.abs(ChronoUnit.DAYS.between(localDateTime, ofInstant));
        if (abs4 < 7) {
            return (String) ss2Var3.invoke(Long.valueOf(abs4));
        }
        if (Math.abs(ChronoUnit.YEARS.between(localDateTime, ofInstant)) == 0) {
            dateTimeFormatter = this.w;
            if (dateTimeFormatter == null) {
                str = "monthFormat";
                zq3.z(str);
            }
            dateTimeFormatter2 = dateTimeFormatter;
        } else {
            dateTimeFormatter = this.y;
            if (dateTimeFormatter == null) {
                str = "yearFormat";
                zq3.z(str);
            }
            dateTimeFormatter2 = dateTimeFormatter;
        }
        String format = dateTimeFormatter2.format(localDateTime);
        zq3.g(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String D(long j) {
        String str = this.l;
        String str2 = null;
        if (str == null) {
            zq3.z("hourA11yFormat");
            str = null;
        }
        String str3 = this.m;
        if (str3 == null) {
            zq3.z("hourA11yFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(long j) {
        String str = this.r;
        String str2 = null;
        if (str == null) {
            zq3.z("hourA11yFutureFormat");
            str = null;
        }
        String str3 = this.s;
        if (str3 == null) {
            zq3.z("hourA11yFutureFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    private final void F(Resources resources, Locale locale) {
        String string = resources.getString(gk6.dt_just_now);
        zq3.g(string, "getString(...)");
        this.d = string;
        String string2 = resources.getString(gk6.dt_short_minute_ago_format);
        zq3.g(string2, "getString(...)");
        this.t = string2;
        String string3 = resources.getString(gk6.dt_short_hour_ago_format);
        zq3.g(string3, "getString(...)");
        this.u = string3;
        String string4 = resources.getString(gk6.dt_short_day_ago_format);
        zq3.g(string4, "getString(...)");
        this.v = string4;
        String string5 = resources.getString(gk6.dt_minute_ago_format);
        zq3.g(string5, "getString(...)");
        this.e = string5;
        String string6 = resources.getString(gk6.dt_minute_ago_a11y_format);
        zq3.g(string6, "getString(...)");
        this.f = string6;
        String string7 = resources.getString(gk6.dt_minute_ago_a11y_format_plural);
        zq3.g(string7, "getString(...)");
        this.g = string7;
        String string8 = resources.getString(gk6.dt_hour_ago_format);
        zq3.g(string8, "getString(...)");
        this.k = string8;
        String string9 = resources.getString(gk6.dt_hour_ago_a11y_format);
        zq3.g(string9, "getString(...)");
        this.l = string9;
        String string10 = resources.getString(gk6.dt_hour_ago_a11y_format_plural);
        zq3.g(string10, "getString(...)");
        this.m = string10;
        String string11 = resources.getString(gk6.dt_day_ago_format);
        zq3.g(string11, "getString(...)");
        this.h = string11;
        String string12 = resources.getString(gk6.dt_day_ago_a11y_format);
        zq3.g(string12, "getString(...)");
        this.i = string12;
        String string13 = resources.getString(gk6.dt_day_ago_a11y_format_plural);
        zq3.g(string13, "getString(...)");
        this.j = string13;
        String string14 = resources.getString(gk6.dt_minute_a11y_format);
        zq3.g(string14, "getString(...)");
        this.n = string14;
        String string15 = resources.getString(gk6.dt_minute_a11y_format_plural);
        zq3.g(string15, "getString(...)");
        this.o = string15;
        String string16 = resources.getString(gk6.dt_hour_a11y_format);
        zq3.g(string16, "getString(...)");
        this.r = string16;
        String string17 = resources.getString(gk6.dt_hour_a11y_format_plural);
        zq3.g(string17, "getString(...)");
        this.s = string17;
        String string18 = resources.getString(gk6.dt_day_a11y_format);
        zq3.g(string18, "getString(...)");
        this.p = string18;
        String string19 = resources.getString(gk6.dt_day_a11y_format_plural);
        zq3.g(string19, "getString(...)");
        this.q = string19;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(resources.getString(gk6.dt_month_format), locale);
        zq3.g(ofPattern, "ofPattern(...)");
        this.w = ofPattern;
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern(resources.getString(gk6.dt_year_format), locale);
        zq3.g(ofPattern2, "ofPattern(...)");
        this.y = ofPattern2;
        DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern(resources.getString(gk6.dt_short_month_and_day_format), locale);
        zq3.g(ofPattern3, "ofPattern(...)");
        this.x = ofPattern3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String G(long j) {
        String str = this.f;
        String str2 = null;
        if (str == null) {
            zq3.z("minuteA11yFormat");
            str = null;
        }
        String str3 = this.g;
        if (str3 == null) {
            zq3.z("minuteA11yFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String H(long j) {
        String str = this.n;
        String str2 = null;
        if (str == null) {
            zq3.z("minuteA11yFutureFormat");
            str = null;
        }
        String str3 = this.o;
        if (str3 == null) {
            zq3.z("minuteA11yFutureFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n(long j) {
        String str = this.i;
        String str2 = null;
        if (str == null) {
            zq3.z("dayA11yFormat");
            str = null;
        }
        String str3 = this.j;
        if (str3 == null) {
            zq3.z("dayA11yFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o(long j) {
        String str = this.p;
        String str2 = null;
        if (str == null) {
            zq3.z("dayA11yFutureFormat");
            str = null;
        }
        String str3 = this.q;
        if (str3 == null) {
            zq3.z("dayA11yFutureFormatPlural");
        } else {
            str2 = str3;
        }
        return q(j, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(long j, String str) {
        String format = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        zq3.g(format, "format(...)");
        return format;
    }

    private final String q(long j, String str, String str2) {
        if (j != 1) {
            str = str2;
        }
        String format = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        zq3.g(format, "format(...)");
        return format;
    }

    private final Instant u(long j) {
        return v(j, TimeUnit.MILLISECONDS);
    }

    private final Instant v(long j, TimeUnit timeUnit) {
        int i = a.a[timeUnit.ordinal()];
        if (i == 1) {
            Instant ofEpochMilli = Instant.ofEpochMilli(j);
            zq3.g(ofEpochMilli, "ofEpochMilli(...)");
            return ofEpochMilli;
        }
        if (i != 2) {
            throw new RuntimeException("What kind of date are you passing as a long?! Must be SECONDS or MILLIS since the epoch ... and really you should be using ISO 8601 standard anyway!");
        }
        Instant ofEpochSecond = Instant.ofEpochSecond(j);
        zq3.g(ofEpochSecond, "ofEpochSecond(...)");
        return ofEpochSecond;
    }

    private final Instant w(Date date) {
        return u(date.getTime());
    }

    public String A(Instant instant, RelativeTimestampType relativeTimestampType) {
        zq3.h(instant, "instant");
        zq3.h(relativeTimestampType, TransferTable.COLUMN_TYPE);
        LocalDateTime ofInstant = LocalDateTime.ofInstant((Instant) this.b.get(), (ZoneId) this.c.get());
        LocalDateTime ofInstant2 = LocalDateTime.ofInstant(instant, (ZoneId) this.c.get());
        if (ofInstant2.isAfter(ofInstant)) {
            zq3.e(ofInstant2);
            return t(ofInstant2, relativeTimestampType);
        }
        zq3.e(ofInstant2);
        return x(ofInstant2, relativeTimestampType);
    }

    public final void I(Resources resources, Locale locale) {
        zq3.h(resources, "res");
        zq3.h(locale, "locale");
        F(resources, locale);
        tb1.e(locale);
    }

    public final String r(Instant instant) {
        zq3.h(instant, "date");
        LocalDateTime ofInstant = LocalDateTime.ofInstant(instant, (ZoneId) this.c.get());
        DateTimeFormatter dateTimeFormatter = this.x;
        if (dateTimeFormatter == null) {
            zq3.z("shortMonthAndDayFormat");
            dateTimeFormatter = null;
        }
        String format = dateTimeFormatter.format(ofInstant);
        zq3.g(format, "format(...)");
        return format;
    }

    public final String s(Instant instant) {
        zq3.h(instant, "instant");
        String string = this.a.getString(gk6.background_fetch_error, y(instant.toEpochMilli(), TimeUnit.MILLISECONDS));
        zq3.g(string, "getString(...)");
        return string;
    }

    public String t(LocalDateTime localDateTime, RelativeTimestampType relativeTimestampType) {
        zq3.h(localDateTime, "localDate");
        zq3.h(relativeTimestampType, TransferTable.COLUMN_TYPE);
        int i = a.b[relativeTimestampType.ordinal()];
        if (i == 1) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$1
                {
                    super(1);
                }

                public final String b(long j) {
                    String H;
                    H = TimeStampUtil.this.H(j);
                    return H;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$2
                {
                    super(1);
                }

                public final String b(long j) {
                    String E;
                    E = TimeStampUtil.this.E(j);
                    return E;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$3
                {
                    super(1);
                }

                public final String b(long j) {
                    String o;
                    o = TimeStampUtil.this.o(j);
                    return o;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        if (i == 2) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$4
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.t;
                    if (str == null) {
                        zq3.z("shortMinuteFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$5
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.u;
                    if (str == null) {
                        zq3.z("shortHourFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$6
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.v;
                    if (str == null) {
                        zq3.z("shortDayFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        if (i == 3) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$7
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.t;
                    if (str == null) {
                        zq3.z("shortMinuteFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$8
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.u;
                    if (str == null) {
                        zq3.z("shortHourFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getFutureRelativeTimeStampText$9
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.v;
                    if (str == null) {
                        zq3.z("shortDayFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }

    public String x(LocalDateTime localDateTime, RelativeTimestampType relativeTimestampType) {
        zq3.h(localDateTime, "localDate");
        zq3.h(relativeTimestampType, TransferTable.COLUMN_TYPE);
        int i = a.b[relativeTimestampType.ordinal()];
        if (i == 1) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$1
                {
                    super(1);
                }

                public final String b(long j) {
                    String G;
                    G = TimeStampUtil.this.G(j);
                    return G;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$2
                {
                    super(1);
                }

                public final String b(long j) {
                    String D;
                    D = TimeStampUtil.this.D(j);
                    return D;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$3
                {
                    super(1);
                }

                public final String b(long j) {
                    String n;
                    n = TimeStampUtil.this.n(j);
                    return n;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        if (i == 2) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$4
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.e;
                    if (str == null) {
                        zq3.z("minuteFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$5
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.k;
                    if (str == null) {
                        zq3.z("hourFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$6
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.h;
                    if (str == null) {
                        zq3.z("dayFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        if (i == 3) {
            return C(localDateTime, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$7
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.t;
                    if (str == null) {
                        zq3.z("shortMinuteFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$8
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.u;
                    if (str == null) {
                        zq3.z("shortHourFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            }, new ss2() { // from class: com.nytimes.android.utils.TimeStampUtil$getPastRelativeTimeStampText$9
                {
                    super(1);
                }

                public final String b(long j) {
                    String str;
                    String p;
                    TimeStampUtil timeStampUtil = TimeStampUtil.this;
                    str = timeStampUtil.v;
                    if (str == null) {
                        zq3.z("shortDayFormat");
                        str = null;
                    }
                    p = timeStampUtil.p(j, str);
                    return p;
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return b(((Number) obj).longValue());
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }

    public String y(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "timeUnit");
        return B(this, v(j, timeUnit), null, 2, null);
    }

    public String z(Date date, RelativeTimestampType relativeTimestampType) {
        zq3.h(date, "date");
        zq3.h(relativeTimestampType, TransferTable.COLUMN_TYPE);
        return A(w(date), relativeTimestampType);
    }
}
